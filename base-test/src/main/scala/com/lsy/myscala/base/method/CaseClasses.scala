package com.lsy.myscala.base.method

case class ClassA(statDate: String,
                        cityId: Int
                       )
                       (
                         length: Int
                       )

case class ClassB(statDate: String,
                  cityId: Int
                 )

object CaseClasses {
  def main(args: Array[String]): Unit = {
//    val aa = ClassA("2011", 12)
    val bb = ClassB("2011", 12)
    println(bb.cityId)
  }

}
