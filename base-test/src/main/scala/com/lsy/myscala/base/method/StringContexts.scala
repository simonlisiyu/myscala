package com.lsy.myscala.base.method

object StringContexts {

  def main(args: Array[String]): Unit = {
    val name = "James"
    println(s"who is $name")
    println(s"who is ${name}ss")

    val person = new Person("Unmi")
    println(s"Hello ${person.name}, ${person.say(person.word)}")   //Hello Unmi, say Unmi, 这个比较复杂

    // f 字符串插值器
    // 它除 s 的功能外(不指定格式就和 s 一样)，还能进行格式化输出，
    // 在变量后用 % 指定输出格式，格式的说明参照 Java 的 Formatter javadoc。
    // 实际调用的是  StringContext 中的  f 方法。
    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall") // James is 1.90 meters tall

    // raw 字符串插值
    // raw 能让字符串原原本本的输出来，
    // 而不是产生控制效果，如对 \n ，\t 等的输出。
    // 实际调用的是  StringContext 中的  raw 方法。看这个例子就知道了：
    println("a\nb\tc")
    println(raw"a\nb\tc")
  }

  class Person(val name: String, val word:String = "something"){
    def say(what: String) = s"say $what"
  }

}
