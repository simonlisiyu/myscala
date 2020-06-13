package com.lsy.myscala.base.yaml

import java.io.{File, FileInputStream}

import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor

/**
  * Created by lisiyu on 2020/5/18.
  */
object TestScalaRead {

  def main(args: Array[String]): Unit = {
    // internal
    //    val stream = getClass.getResourceAsStream("/test.yaml")

    // external
    val filename = "/Users/didi/IdeaProjects/dcp-knowledgebase/dcp-knowledgebase-dataprocess/dcp-knowledgebase-sparkprocess/src/main/resources/test.yaml"
    // hdfs
    //    val conf = new Configuration
    //    val fs = FileSystem.get(URI.create(filename), conf)
    //    val stream = fs.open(new Path(filename))
    // file
    val f = new File(filename)
    val in = new FileInputStream(f)

    val yaml = new Yaml(new Constructor(classOf[TestObj]))
    val config: TestObj = yaml.load(in).asInstanceOf[TestObj]
    println(s"${config.getName}, ${config.getAge}, ${config.getCity}")
    println(config.getDetails)
  }

}
