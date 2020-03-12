package tech.ignission.GoogleAppsScript.cache

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Cache extends js.Object {
  def get(key: String): String | Null = js.native
  def getAll(keys: js.Array[String]): js.Dictionary[js.Any] = js.native
  def put(key: String, value: String): Unit = js.native
  def put(key: String, value: String, expirationInSeconds: Integer): Unit = js.native
  def putAll(values: js.Dictionary[js.Any]): Unit = js.native
  def putAll(values: js.Dictionary[js.Any], expirationInSeconds: Integer): Unit = js.native
  def remove(key: String): Unit = js.native
  def removeAll(keys: js.Array[String]): Unit = js.native
}

@js.native
trait CacheService extends js.Object {
  def getDocumentCache(): Cache | Null = js.native
  def getScriptCache(): Cache | Null = js.native
  def getUserCache(): Cache | Null = js.native
}
