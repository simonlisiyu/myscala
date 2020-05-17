package com.lsy.myscala.base.base

import java.io.FileReader

import scala.collection.mutable
import scala.collection.mutable.Map
import util.control.Breaks._

/**
  * Created by lisiyu on 2020/5/10.
  */
object TryCatchMethod {

  def main(args: Array[String]): Unit = {
    val map: mutable.Map[String, AnyRef] = Map("long" -> "123123")
    try {
      val f = new FileReader("input.txt")
      println(map.get("ddd"))
    } catch {
      case ex: Exception =>
        //        ex.printStackTrace()
        throw new Exception(ex.getStackTrace.mkString(", ")+"，err=" + map.mkString)
    }



  }

  @throws[Exception]
  def tryWithBreak(map: Map[String, AnyRef]): String = {
    try {
      map.foreach(t => {
        breakable{
          val k = t._1 match {
            case "to_obj_id" => break()
            case "obj_kg_id" => break()
            case _ => t._1
          }

          t._2 match {
            case null => ""
            case "" => ""
            case "null" => ""
            case "NULL" => ""
            case _ => ""
          }
        }


      })
    } catch {
      case ex: Exception =>
        //        ex.printStackTrace()
        throw new Exception(ex+": "+ex.getStackTrace.mkString(", ")+".  map=" + map.mkString)
    }
    "done"
  }


}
