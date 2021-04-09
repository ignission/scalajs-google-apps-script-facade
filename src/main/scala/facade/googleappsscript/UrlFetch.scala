package facade.googleappsscript.url_fetch

import facade.googleappsscript.base.Blob
import facade.googleappsscript.url_fetch.URL_Fetch.{HttpMethod, Payload}

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobalScope
object Facade extends js.Object {}

@js.native
trait HTTPResponse extends js.Object {
  def getAllHeaders(): js.Object              = js.native
  def getAs(contentType: String): Blob        = js.native
  def getBlob(): Blob                         = js.native
  def getContent(): js.Array[Byte]            = js.native
  def getContentText(): String                = js.native
  def getContentText(charset: String): String = js.native
  def getHeaders(): js.Object                 = js.native
  def getResponseCode(): Integer              = js.native
}

@js.native
trait URLFetchRequest extends URLFetchRequestOptions {
  var url: String = js.native
}

@js.native
trait URLFetchRequestOptions extends js.Object {
  var contentType: String                = js.native
  var headers: HttpHeaders               = js.native
  var method: HttpMethod                 = js.native
  var payload: Payload                   = js.native
  var useIntranet: Boolean               = js.native
  var validateHttpsCertificates: Boolean = js.native
  var followRedirects: Boolean           = js.native
  var muteHttpExceptions: Boolean        = js.native
  var escaping: Boolean                  = js.native
}

@js.native
trait UrlFetchApp extends js.Object {
  def fetch(url: String): HTTPResponse                                               = js.native
  def fetch(url: String, params: URLFetchRequestOptions): HTTPResponse               = js.native
  def fetchAll(requests: js.Array[URLFetchRequest | String]): js.Array[HTTPResponse] = js.native
  def getRequest(url: String): URLFetchRequest                                       = js.native
  def getRequest(url: String, params: URLFetchRequestOptions): URLFetchRequest       = js.native
}

@js.native
trait HttpHeaders extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native
  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}

@js.native
@JSGlobal("GoogleAppsScript.URL_Fetch")
object URL_Fetch extends js.Object {
  type HttpMethod = String
  type Payload    = String | js.Dictionary[js.Any] | Blob
}
