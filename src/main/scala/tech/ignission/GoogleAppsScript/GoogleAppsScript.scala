package tech.ignission.GoogleAppsScript

import tech.ignission.GoogleAppsScript.base.{Browser, DateConstructor, Logger, Session, console}
import tech.ignission.GoogleAppsScript.charts.Charts
import tech.ignission.GoogleAppsScript.document.DocumentApp
import tech.ignission.GoogleAppsScript.drive.DriveApp
import tech.ignission.GoogleAppsScript.forms.FormApp
import tech.ignission.GoogleAppsScript.html.HtmlService
import tech.ignission.GoogleAppsScript.script.ScriptApp
import tech.ignission.GoogleAppsScript.spreadsheet.SpreadsheetApp

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobalScope

@js.native
@JSGlobalScope
object GoogleAppsScript extends js.Object {
  type BigNumber = js.Any
  type Byte = Double
  type Integer = Double
  type Char = String
  type JdbcSQL_XML = js.Any

  var Browser: Browser = js.native
  var Charts: Charts = js.native
  var FormApp: FormApp = js.native
  var DocumentApp: DocumentApp = js.native
  var DriveApp: DriveApp = js.native
  var Logger: Logger = js.native
  var Session: Session = js.native
  var console: console = js.native
  var Date2: DateConstructor = js.native
  var HtmlService: HtmlService = js.native
  var ScriptApp: ScriptApp = js.native
  var SpreadsheetApp: SpreadsheetApp = js.native
}
