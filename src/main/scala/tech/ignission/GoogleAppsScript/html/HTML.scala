package tech.ignission.GoogleAppsScript.html

import tech.ignission.GoogleAppsScript.base.{Blob, BlobSource}

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait HtmlOutput extends js.Object {
  def addMetaTag(name: String, content: String): HtmlOutput = js.native
  def append(addedContent: String): HtmlOutput = js.native
  def appendUntrusted(addedContent: String): HtmlOutput = js.native
  def asTemplate(): HtmlTemplate = js.native
  def clear(): HtmlOutput = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContent(): String = js.native
  def getFaviconUrl(): String = js.native
  def getHeight(): Integer = js.native
  def getMetaTags(): js.Array[HtmlOutputMetaTag] = js.native
  def getTitle(): String = js.native
  def getWidth(): Integer = js.native
  def setContent(content: String): HtmlOutput = js.native
  def setFaviconUrl(iconUrl: String): HtmlOutput = js.native
  def setHeight(height: Integer): HtmlOutput = js.native
  def setSandboxMode(mode: SandboxMode): HtmlOutput = js.native
  def setTitle(title: String): HtmlOutput = js.native
  def setWidth(width: Integer): HtmlOutput = js.native
  def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput = js.native
}

@js.native
trait HtmlOutputMetaTag extends js.Object {
  def getContent(): String = js.native
  def getName(): String = js.native
}

@js.native
trait HtmlService extends js.Object {
  var SandboxMode: SandboxMode = js.native
  var XFrameOptionsMode: XFrameOptionsMode = js.native
  def createHtmlOutput(): HtmlOutput = js.native
  def createHtmlOutput(blob: BlobSource): HtmlOutput = js.native
  def createHtmlOutput(html: String): HtmlOutput = js.native
  def createHtmlOutputFromFile(filename: String): HtmlOutput = js.native
  def createTemplate(blob: BlobSource): HtmlTemplate = js.native
  def createTemplate(html: String): HtmlTemplate = js.native
  def createTemplateFromFile(filename: String): HtmlTemplate = js.native
  def getUserAgent(): String = js.native
}

@js.native
trait HtmlTemplate extends js.Object {
  def evaluate(): HtmlOutput = js.native
  def getCode(): String = js.native
  def getCodeWithComments(): String = js.native
  def getRawContent(): String = js.native
  @JSBracketAccess
  def apply(propName: String): js.Any = js.native
  @JSBracketAccess
  def update(propName: String, v: js.Any): Unit = js.native
}

@js.native
sealed trait SandboxMode extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.HTML.SandboxMode")
object SandboxMode extends js.Object {
  var EMULATED: SandboxMode = js.native
  var IFRAME: SandboxMode = js.native
  var NATIVE: SandboxMode = js.native
  @JSBracketAccess
  def apply(value: SandboxMode): String = js.native
}

@js.native
sealed trait XFrameOptionsMode extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.HTML.XFrameOptionsMode")
object XFrameOptionsMode extends js.Object {
  var ALLOWALL: XFrameOptionsMode = js.native
  var DEFAULT: XFrameOptionsMode = js.native
  @JSBracketAccess
  def apply(value: XFrameOptionsMode): String = js.native
}
