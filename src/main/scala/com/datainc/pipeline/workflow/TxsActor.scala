package com.datainc.pipeline.workflow

import akka.actor.{Actor, ActorLogging}

import scala.concurrent.duration.FiniteDuration

/**
  * Created by hdong on 3/1/2016.
  */
abstract class TxsActor (workTimeout: FiniteDuration) extends Actor with ActorLogging {

}
