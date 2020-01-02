package com.lsy.myscala.base.dtspark

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Created by root on 11/13/15.
  */
object FileOps {

  def main(args: Array[String]) {
    val filel = Source.fromFile("/Users/lsy/aaa")

    for(line <- filel.getLines()){
      println(line)
    }

    filel.close

//    val file = Source.fromURL("http://spark.apache.org/")
//    file.foreach(print)
//
//    file.close

    val writer = new PrintWriter(new File("scalaFile.txt"))
    for(i <- 1 to 100) writer.println(i)
    writer.close

    print("Please enter your input : ")
    val line = Console.readLine
//    val line = readLine
    println("Thanks, you just typed : "+line)


  }
}
