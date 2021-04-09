package example


import facade.googleappsscript.GoogleAppsScript
import facade.googleappsscript.html.HtmlOutput
import facade.googleappsscript.url_fetch.URLFetchRequestOptions

import scalajs.js.annotation._
import scala.scalajs.js
import scala.scalajs.js.Dynamic

object Main {

  @JSExportTopLevel("doGet")
  def doGet(): HtmlOutput = {
    val response = try {
      GoogleAppsScript.UrlFetchApp.fetch(
        url = "https://typetalk.com/api/v1/topics/123456789",
        params = Dynamic.literal(
          headers = new js.Object {
            val `X-TYPETALK-TOKEN` = "xxxxxxxxxxx"
          },
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
