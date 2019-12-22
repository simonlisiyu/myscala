package com.lsy.myscala.base.method

object StripMargin {

  def main(args: Array[String]): Unit = {
    val foo = """This is
                |a scala multiline
                |String"""
    println(foo)
    println(foo.stripMargin)
  }

}
