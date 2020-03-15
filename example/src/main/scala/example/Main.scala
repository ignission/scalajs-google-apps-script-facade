package example

import tech.ignission.jsgas.GoogleAppsScript

import scalajs.js.annotation._
import tech.ignission.jsgas.html.HtmlOutput
import tech.ignission.jsgas.urlfetch.URLFetchRequestOptions

import scala.scalajs.js
import scala.scalajs.js.Dynamic

object Main {

  @JSExportTopLevel("doGet")
  def doGet(): HtmlOutput = {
    val response = try {
      GoogleAppsScript.UrlFetchApp.fetch(
        url = "https://typetalk.com/api/v1/topics/19880416",
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
