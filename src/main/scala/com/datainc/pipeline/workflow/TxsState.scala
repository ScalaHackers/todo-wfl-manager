package com.datainc.pipeline.workflow

object TxsState {

  trait BasicState

  case class dataPrep(id: String) extends BasicState

  case class dataValidate(id: String) extends BasicState

  case class dataAnnotate(id: String) extends BasicState

}
