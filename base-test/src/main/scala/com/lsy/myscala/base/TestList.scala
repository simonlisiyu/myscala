package com.lsy.myscala.base

import scala.collection.JavaConversions._

/**
  * Created by lisiyu on 2018/7/31.
  */
object TestList {

  def main(args: Array[String]): Unit = {
    val list = Array(1,2,3,4,5)
    val lisr1 = Array(3)
    println(list.last)
    println(list(0))
    println(list.indexOf(lisr1.takeRight(1)(0)))
    val aa = list.drop(2)
    aa
    println(aa.mkString(","))

    val point = new TrailPoint()
    val links = List("168337610")
    point.setLinkIds(links)
    point.setDistanceToStopbar(0)

    val link1 = new Link()
    link1.setLength(10)
    link1.setLinkId("168337720")
    val link2 = new Link()
    link2.setLength(12)
    link2.setLinkId("168337610")
    val link3 = new Link()
    link3.setLength(14)
    link3.setLinkId("168337560")
    println(getDistanceToStopBar(point, null, 0,
      List("168337720", "168337610", "168337560"),
      Map("168337720" -> link1, "168337610" -> link2, "168337560" -> link3)))
  }


  def getDistanceToStopBar(point: TrailPoint, lastPoint: TrailPoint, lastDistance: Int,
                           links: java.util.List[String],linkAttr: java.util.Map[String,Link]): Int = {
    val throughLinkIds = point.getLinkIds

    //判断是否第一个轨迹点
    val x = if(lastPoint == null){    //没有上一个点，就是第一个点
      val currentLinkIndex = links.indexOf(throughLinkIds.takeRight(1)(0))
      val lengthLinkIds = links.drop(currentLinkIndex)
      //第一个点所在的link到停车线间所有link的长度
      var length = 0
      for(id <- lengthLinkIds) {
        length = length + (if(linkAttr.containsKey(id)) linkAttr.get(id).getLength else 0)
      }
      point.getPassLinkDistance - length
    } else {
      //从当前点所通过的所有中间link的长度（不包含最后所在link）
      var middleLength = 0
      for(id <- throughLinkIds.dropRight(1)) {
        middleLength = middleLength + (if(linkAttr.containsKey(id)) linkAttr.get(id).getLength else 0)
      }

      //当前点与上一个点相对距离（只算所在link的距离，忽略了中间经过的距离）
      val lastPointThroughLinkIds = lastPoint.getLinkIds
      val pointAtLinkId = throughLinkIds.takeRight(1)(0)
      val lastPointAtLinkId = lastPointThroughLinkIds.takeRight(1)(0)
      val relativeLength =
        if(pointAtLinkId == lastPointAtLinkId) point.getPassLinkDistance - lastPoint.getPassLinkDistance
        else point.getPassLinkDistance - lastPoint.getPassLinkDistance +
          (if(linkAttr.containsKey(lastPointAtLinkId)) linkAttr.get(lastPointAtLinkId).getLength else 0)

      // 两点间距离
      val length = relativeLength + middleLength

      length + lastDistance
    }
    x
  }

}
