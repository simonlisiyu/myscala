package com.lsy.myscala.base.base

import scala.collection.mutable
import scala.collection.mutable.Map

/**
  * Created by lisiyu on 2020/5/10.
  */
object MapMethod {

  def main(args: Array[String]): Unit = {
    val map: mutable.Map[String, AnyRef] = Map("long" -> "123123")
    map += ("aa" -> "dd")
    println(map.get("long").getClass)
    println(map.getOrElse("long", "").getClass)
    println(map.get("long"))
    println(map.getOrElse("long", ""))
    println(map.getOrElse("long", "").asInstanceOf[String])
    println(map.getOrElse("long", "").toString)
    println(map.getOrElse("long", "").toString.toLong)
  }

}
