package com.datainc.pipeline.workflow

import akka.actor.{Actor, ActorLogging}

import scala.concurrent.duration.FiniteDuration

/**
  * Created by hdong on 3/1/2016.
  */
class TxsActor (workTimeout: FiniteDuration) extends Actor with ActorLogging {
  var workers = Map[String, WorkState]()

  override def receive: Receive = {
    case workerMap: Map[String, WorkState] =>
      //save workers in memory
      workers = workersMap
      sender() ! TodoManagerActor.Ack(work.workId)

    case add: TodoManager.Add =>
      notifyWorkers()

    case workRsp:
      //forward to master
  }

}
