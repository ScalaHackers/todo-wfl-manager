package com.datainc.pipeline.workflow

import akka.actor.ActorLogging
import akka.persistence.PersistentActor

import scala.concurrent.duration.FiniteDuration

/**
  * Created by hdong on 3/1/2016.
  */
class FSMActor (workTimeout: FiniteDuration) extends PersistentActor with ActorLogging {
  override def receiveRecover: Receive = ???

  override def receiveCommand: Receive = ???

  override def persistenceId: String = ???
}
