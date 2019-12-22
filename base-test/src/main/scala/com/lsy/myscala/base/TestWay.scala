package com.lsy.myscala.base

import scala.collection.mutable.ArrayBuffer

object TestWay {

  def getRedOverFlowCellIds(green_duration: Int, red_duration: Int,
                            stop_bar: Int, entrace: Int, x_step: Int, y_step: Int): Array[String] = {
    val x_range = (stop_bar+green_duration).to(stop_bar+green_duration+red_duration, x_step)
    val y_range = 0.to(entrace, y_step)
    val array = new ArrayBuffer[String]()
    for (x1 <- x_range; y1 <- y_range) {
      //      println(s1+"_"+s2)
      val x2 = x1 + x_step
      val y2 = y1 + y_step
      if(x2 <= stop_bar+green_duration+red_duration && y2 <= entrace) array += "x_"+x1+"_"+x2 + "_y_"+y1+"_"+y2
    }
    array.toArray
  }

  def main(args: Array[String]): Unit = {
    var green_duration = 102
    var red_duration = 78
    var stop_bar = 0
    var entrace = 30
    var x_step = 3
    var y_step = 5

    println(102.to(180,3))
    println(0.to(30,5))
    val x_range = (stop_bar+green_duration).to(stop_bar+green_duration+red_duration, x_step)
    val y_range = 0.to(entrace, y_step)
    println(x_range)
    println(y_range)
    println(x_range.union(y_range))

    val array = new ArrayBuffer[String]()
    for (x1 <- x_range; y1 <- y_range) {
//      println(s1+"_"+s2)
      val x2 = x1 + x_step
      val y2 = y1 + y_step
      if(x2 <= stop_bar+green_duration+red_duration && y2 <= entrace) array += "x_"+x1+"_"+x2 + "_y_"+y1+"_"+y2
    }
    println(array)

//    val conf=new SparkConf().setAppName("Test").setMaster("local")
//    val sc = new SparkContext(conf)
//    val data1=sc.parallelize(List(1,2,3))//并行化，因为笛卡尔积是操作在RDD上的，所以必须是RDD的数据。
//    val data2=sc.parallelize(List(4,5,6))
//    data1.cartesian(data2).foreach(println)


    //    println(generateCityIds(test))
  }

//  def desCarts(range1: Range, range2: Range) : Range = {
//    var range;
//    for(var i = 0;i<range1.size;i+=1){
//
//    }
//
//  }

  def generateCityIds(path: String): Array[String] = {
    path.split(" ")
  }

}
