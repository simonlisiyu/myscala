package com.lsy.myscala.base.base

import scala.util.Random

object NumberMethod {

  def main(args: Array[String]): Unit = {
    var s = math.sqrt(3)
    s = s*s
    println(s)

    println(10 max 2)

    println("ttt" * 5)

    println(BigInt(2).pow(10))
    import scala.math._
    println(sqrt(2))
    println(pow(2,4))
    println(min(2,Pi))


    println(Random.nextInt(10))

    import scala.math.BigInt._
    println(probablePrime(100, Random)) //素数

    // 创建随机文件的方式之一是生成一个随机的BigInt，然后将它转换成三十六进制，输出类似
    // "qsnvbevtomcj38o06kul"这样的字符串
//    scala.math.BigInt(scala.util.Random.nextInt).toString(36)
    println(Random.nextInt.toString(36))

    //获取首字符
    println("hello"(0))
    println("hello".take(1))
    //获取尾字符
    println("hello".reverse(0))
    println("hello".takeRight(1))


    println(randomNewList(10))
    println(randomNewListByIndex(10))


  }


  /**
    * 生成随机数集合
    * @param n
    * @return
    */
  def randomNewList(n:Int)={
    var resultList:List[Int]=Nil
    while(resultList.length<n){
      val randomNum=(new Random).nextInt(20)
      if(!resultList.exists(s=>s==randomNum)){
        resultList=resultList:::List(randomNum)
      }
    }
    resultList
  }

  def randomNewListByIndex(n:Int)={
    var arr= 0 to 20 toArray
    var outList:List[Int]=Nil
    var border=arr.length//随机数范围
    for(i<-0 to n-1){//生成n个数
    val index=(new Random).nextInt(border)
//      println(index)
      outList=outList:::List(arr(index))
      arr(index)=arr.last//将最后一个元素换到刚取走的位置
      arr=arr.dropRight(1)//去除最后一个元素
      border-=1
    }
    outList
  }
}
