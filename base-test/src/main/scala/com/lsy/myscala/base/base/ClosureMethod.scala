package com.lsy.myscala.base.base

/**
  * Created by lisiyu on 2020/5/10.
  */
object ClosureMethod {

  def main(args: Array[String]) {
    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
  }
  var factor = 3
  val multiplier = (i:Int) => i * factor
}
