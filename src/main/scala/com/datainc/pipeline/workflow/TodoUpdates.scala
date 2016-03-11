package com.datainc.pipeline.workflow

/**
  * Created by hdong on 2/26/2016.
  */
//??? what is this for???
case class TodoUpdate(state: Option[Int], completed: Option[Boolean], path: Option[String])