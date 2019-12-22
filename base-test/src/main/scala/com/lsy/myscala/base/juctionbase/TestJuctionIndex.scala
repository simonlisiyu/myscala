package com.lsy.myscala.base.juctionbase

import scala.collection.mutable.ArrayBuffer

object TestJuctionIndex {

  def main(args: Array[String]): Unit = {
    getRedOverFlowCellIds(102, 78, 0, 30, 3, 5).foreach(print)
    println()
    getRedOverFlowCellIds(102, 78).foreach(print)
  }

  /**
    * 绿灯持续时间+红灯持续时间+stop_bar(0)+entrace(30)==>红灯溢流区 cellid 列表
    * @param green_duration 绿灯持续时间
    * @param red_duration 红灯持续时间
    * @param stop_bar   计算时间点 default: 0
    * @param entrace    入口距离 default:30
    * @param x_sec_step   时间步长（秒） default:3
    * @param y_dist_step  距离步长（米） default:5
    * @return
    */
  def getRedOverFlowCellIds(green_duration: Int, red_duration: Int,
                            stop_bar: Int = 0, entrace: Int = 30,
                            x_sec_step: Int = 3, y_dist_step: Int = 5): Array[String] = {
    val x_range = (stop_bar+green_duration).to(stop_bar+green_duration+red_duration, x_sec_step)
    val y_range = 0.to(entrace, y_dist_step)
    val array = new ArrayBuffer[String]()
    for (x1 <- x_range; y1 <- y_range) {
      val x2 = x1 + x_sec_step
      val y2 = y1 + y_dist_step
      if(x2 <= stop_bar+green_duration+red_duration && y2 <= entrace) array += "x_"+x1+"_"+x2 + "_y_"+y1+"_"+y2
    }
    array.toArray
  }

}
