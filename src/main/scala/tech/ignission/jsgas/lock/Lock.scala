package tech.ignission.jsgas.lock

import scala.scalajs.js

@js.native
trait Lock extends js.Object {
  def hasLock(): Boolean = js.native
  def releaseLock(): Unit = js.native
  def tryLock(timeoutInMillis: Integer): Boolean = js.native
  def waitLock(timeoutInMillis: Integer): Unit = js.native
}

@js.native
trait LockService extends js.Object {
  def getDocumentLock(): Lock = js.native
  def getScriptLock(): Lock = js.native
  def getUserLock(): Lock = js.native
}
