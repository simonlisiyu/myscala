package com.lsy.myscala.base.yaml

import java.util

import scala.beans.BeanProperty

/**
  * Created by lisiyu on 2020/5/18.
  */
class TestObj extends Serializable {
  @BeanProperty var name: String = "Unknown name"
  @BeanProperty var age: Int = -1
  @BeanProperty var city: String = "Unknown city"
  @BeanProperty var height: Float = 0
  @BeanProperty var details: util.HashMap[String, Object] = null
}
