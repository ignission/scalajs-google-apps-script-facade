package example

import facade.googleappsscript.GoogleAppsScript
import facade.googleappsscript.html.HtmlOutput
import facade.googleappsscript.url_fetch.URLFetchRequestOptions

import scala.scalajs.js
import scala.scalajs.js.Dynamic
import scala.scalajs.js.annotation._

object Main {

  val headers: (String, js.Any) = "X-TYPETALK-TOKEN" -> "xxxxxxxxxxx"

  @JSExportTopLevel("doGet")
  def doGet(): HtmlOutput = {
    val response = try {
      GoogleAppsScript.UrlFetchApp.fetch(
        url = "https://typetalk.com/api/v1/topics/123456789",
        params = Dynamic.literal(
          headers = Dynamic.literal(headers),
          method = "POST",
          payload = "message=Hello, Scala.js!"
        ).asInstanceOf[URLFetchRequestOptions])
      "<h1>success</h1>"
    } catch {
      case e: Throwable => e.getMessage
    }
    GoogleAppsScript.HtmlService.createHtmlOutput(response)
  }
}
