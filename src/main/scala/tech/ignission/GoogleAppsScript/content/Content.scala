package tech.ignission.GoogleAppsScript.content

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait ContentService extends js.Object {
  var MimeType: MimeType = js.native
  def createTextOutput(): TextOutput = js.native
  def createTextOutput(content: String): TextOutput = js.native
}

@js.native
sealed trait MimeType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Content.MimeType")
object MimeType extends js.Object {
  var ATOM: MimeType = js.native
  var CSV: MimeType = js.native
  var ICAL: MimeType = js.native
  var JAVASCRIPT: MimeType = js.native
  var JSON: MimeType = js.native
  var RSS: MimeType = js.native
  var TEXT: MimeType = js.native
  var VCARD: MimeType = js.native
  var XML: MimeType = js.native
  @JSBracketAccess
  def apply(value: MimeType): String = js.native
}

@js.native
trait TextOutput extends js.Object {
  def append(addedContent: String): TextOutput = js.native
  def clear(): TextOutput = js.native
  def downloadAsFile(filename: String): TextOutput = js.native
  def getContent(): String = js.native
  def getFileName(): String = js.native
  def getMimeType(): MimeType = js.native
  def setContent(content: String): TextOutput = js.native
  def setMimeType(mimeType: MimeType): TextOutput = js.native
}
