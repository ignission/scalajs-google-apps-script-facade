package facade.googleappsscript.properties

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Properties extends js.Object {
  def deleteAllProperties(): Properties                            = js.native
  def deleteProperty(key: String): Properties                      = js.native
  def getKeys(): js.Array[String]                                  = js.native
  def getProperties(): js.Dictionary[String]                       = js.native
  def getProperty(key: String): String | Null                      = js.native
  def setProperties(properties: js.Dictionary[String]): Properties = js.native
  def setProperties(properties: js.Dictionary[String], deleteAllOthers: Boolean): Properties =
    js.native
  def setProperty(key: String, value: String): Properties = js.native
}

@js.native
trait PropertiesService extends js.Object {
  def getDocumentProperties(): Properties = js.native
  def getScriptProperties(): Properties   = js.native
  def getUserProperties(): Properties     = js.native
}

@js.native
trait ScriptProperties extends js.Object {
  def deleteAllProperties(): ScriptProperties                            = js.native
  def deleteProperty(key: String): ScriptProperties                      = js.native
  def getKeys(): js.Array[String]                                        = js.native
  def getProperties(): js.Dictionary[String]                             = js.native
  def getProperty(key: String): String | Null                            = js.native
  def setProperties(properties: js.Dictionary[String]): ScriptProperties = js.native
  def setProperties(
      properties: js.Dictionary[String],
      deleteAllOthers: Boolean
  ): ScriptProperties                                           = js.native
  def setProperty(key: String, value: String): ScriptProperties = js.native
}

@js.native
trait UserProperties extends js.Object {
  def deleteAllProperties(): UserProperties                            = js.native
  def deleteProperty(key: String): UserProperties                      = js.native
  def getKeys(): js.Array[String]                                      = js.native
  def getProperties(): js.Dictionary[String]                           = js.native
  def getProperty(key: String): String | Null                          = js.native
  def setProperties(properties: js.Dictionary[String]): UserProperties = js.native
  def setProperties(properties: js.Dictionary[String], deleteAllOthers: Boolean): UserProperties =
    js.native
  def setProperty(key: String, value: String): UserProperties = js.native
}
