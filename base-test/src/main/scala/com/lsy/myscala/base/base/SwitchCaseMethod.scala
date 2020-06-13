package com.lsy.myscala.base.base

import java.util

/**
  * Created by lisiyu on 2020/5/19.
  */
object SwitchCaseMethod {

  def main(args: Array[String]): Unit = {
    val list = new util.ArrayList[String]()
    list.add("123")
    list.add("222")
    list.add("")
    import scala.collection.JavaConversions._
    val slist = list.toList

    slist match {
      //        case List(_, "String", "")=> row.getAs[String](keyList.get(0))
      case List(_, "222", "") => println("222")
      case _ => println("123")
    }
  }
}
