package tech.ignission.jsgas.events

import tech.ignission.jsgas.base.User
import tech.ignission.jsgas.document
import tech.ignission.jsgas.document.Document
import tech.ignission.jsgas.forms.{Form, FormResponse}
import tech.ignission.jsgas.script.AuthMode
import tech.ignission.jsgas.slides.Presentation
import tech.ignission.jsgas.spreadsheet.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait AppsScriptEvent extends js.Object {
  var AuthMode: AuthMode = js.native
  var TriggerUid: String = js.native
  var User: User         = js.native
}

@js.native
trait AppsScriptHttpRequestEvent extends js.Object {
  var parameter: js.Object  = js.native
  var contextPath: String   = js.native
  var contentLength: Double = js.native
  var queryString: String   = js.native
  var parameters: js.Object = js.native
}

@js.native
trait AppsScriptHttpRequestEventPostData extends js.Object {
  var length: Double   = js.native
  var `type`: String   = js.native
  var contents: String = js.native
  var name: String     = js.native
}

@js.native
trait SheetsOnOpen extends AppsScriptEvent {
  var source: Spreadsheet = js.native
}

@js.native
sealed trait SheetsOnChangeChangeType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Events.SheetsOnChangeChangeType")
object SheetsOnChangeChangeType extends js.Object {
  var EDIT: SheetsOnChangeChangeType          = js.native
  var INSERT_ROW: SheetsOnChangeChangeType    = js.native
  var INSERT_COLUMN: SheetsOnChangeChangeType = js.native
  var REMOVE_ROW: SheetsOnChangeChangeType    = js.native
  var REMOVE_COLUMN: SheetsOnChangeChangeType = js.native
  var INSERT_GRID: SheetsOnChangeChangeType   = js.native
  var REMOVE_GRID: SheetsOnChangeChangeType   = js.native
  var FORMAT: SheetsOnChangeChangeType        = js.native
  var OTHER: SheetsOnChangeChangeType         = js.native
  @JSBracketAccess
  def apply(value: SheetsOnChangeChangeType): String = js.native
}

@js.native
trait SheetsOnChange extends AppsScriptEvent {
  var changeType: SheetsOnChangeChangeType = js.native
}

@js.native
trait SheetsOnEdit extends AppsScriptEvent {
  var oldValue: String      = js.native
  var range: document.Range = js.native
  var source: Spreadsheet   = js.native
  var value: String         = js.native
}

@js.native
trait SheetsOnFormSubmit extends AppsScriptEvent {
  var namedValues: SheetsOnFormSubmit.NamedValues = js.native
  var range: document.Range                       = js.native
  var values: js.Array[String]                    = js.native
}

object SheetsOnFormSubmit {

  @js.native
  trait NamedValues extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Array[String] = js.native
    @JSBracketAccess
    def update(key: String, v: js.Array[String]): Unit = js.native
  }
}

@js.native
trait FormsOnFormSubmit extends AppsScriptEvent {
  var response: FormResponse = js.native
  var source: Form           = js.native
}

@js.native
trait DocsOnOpen extends AppsScriptEvent {
  var source: Document = js.native
}

@js.native
trait SlidesOnOpen extends AppsScriptEvent {
  var source: Presentation = js.native
}

@js.native
trait FormsOnOpen extends AppsScriptEvent {
  var source: Form = js.native
}

@js.native
trait CalendarEventUpdated extends AppsScriptEvent {
  var calendarId: String = js.native
}

@js.native
trait AddonOnInstall extends js.Object {
  var authMode: AuthMode = js.native
}

@js.native
trait DoGet extends AppsScriptHttpRequestEvent {}

@js.native
trait DoPost extends AppsScriptHttpRequestEvent {
  var postData: AppsScriptHttpRequestEventPostData = js.native
}
