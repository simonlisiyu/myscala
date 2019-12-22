package com.lsy.myscala.base.base

object ControleAndFunctionMethod {

  def main(args: Array[String]): Unit = {

//    readLineMethod

//    forMethod

//    forAdvMethod

//    println(fac(3))

//    println(decorate("word"))
//    println(decorate("word", "<<<", ">>>"))
//    println(decorate("word", right="<<<", left=">>>"))

//    println(sum(1, 2, 3))
//    println(sum(1 to 3: _*))

    // 定义时取值
    val word1 = scala.io.Source.fromFile("/etc/111").mkString
    // 初次使用时取值
    lazy val word2 = scala.io.Source.fromFile("/etc/111").mkString

    def word3 = scala.io.Source.fromFile("/etc/111").mkString

  }

  // 输入和输出,2.10
  def readLineMethod: Unit = {
//    val name = readLine("name: ")
//    print("your age: ")
//    val age = readInt()   //readDouble ..
//    printf("sss, %s! you will be %d.\n", name, age+1)
  }

  // for循环
  def forMethod: Unit = {
    for(i <- 1 to 3) println(i * 10)

    var n = 5
    while(n>0)n-=1
    println(n)

    val s = "hello"
    println("s.length="+s.length)
    var sum = 0
    for(i <- 0 until s.length) {
      print("i="+i+",")
      print("s(i)="+s(i)+",")
      sum+=s(i)
      print("sum="+sum+",")
    }
    println(sum)

    sum = 0
    for(ch <- s) {
      sum+=ch
      print("sum="+sum+",")
    }
    println(sum)
  }

  // 高级for循环
  def forAdvMethod {
    for(i <- 1 to 3; j <- 1 to 3) print(i*j +",")
    println()

    for(i <- 1 to 3; j <- 1 to 3 if i!=j) print(i*j +",")
    println()

    for(i <- 1 to 3; from = 4-i; j <- from to 3) print(i*j +",")
    println()

    println(for(i <- 1 to 10) yield i%3)
    println(for(c <- "hello"; i <- 0 to 1) yield (c+i).toChar)
    println(for(i <- 0 to 1; c <- "hello") yield (c+i).toChar)
  }

  // 递归
  def fac(n: Int) : Int = if(n<=0) 1 else n * fac(n-1)

  // 参数默认值
  def decorate(str:String, left: String = "[", right: String = "]") = left + str + right

  // 参数可变数量
  def sum(args: Int*) = {
    var result = 0
    for(arg <- args) result += arg
    result
  }


}
