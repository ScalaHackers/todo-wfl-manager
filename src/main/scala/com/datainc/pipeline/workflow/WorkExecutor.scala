package com.datainc.pipeline.workflow

import scala.sys.process._
import akka.actor.Actor

class WorkExecutor extends Actor {

  def receive = {
    case dataPrep: Int =>
      val cmd = "ls -al"
      val result = cmd.!!
      //println(result)
      sender() ! TodoWorker.WorkComplete(result)
    case _ =>
      println("undefined!")
  }

}