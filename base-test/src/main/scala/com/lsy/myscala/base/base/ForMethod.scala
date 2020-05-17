package com.lsy.myscala.base.base

import scala.util.control.Breaks.{break, breakable}

/**
  * Created by lisiyu on 2020/5/10.
  */
object ForMethod {

  def main(args: Array[String]): Unit = {


    /**
      * 在Scala中实现break和continue
      */
    // break
    breakable {
      for (i <- 1 to 10) {
        if (i == 2) break() else println(i)
      }
    }

    //continue
    for (i <- 1 to 10) {
      breakable {
        if (i == 2) break() else println(i)
      }
    }
  }

}
