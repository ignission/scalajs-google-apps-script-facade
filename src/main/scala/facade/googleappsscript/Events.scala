package facade.googleappsscript

import scala.scalajs.js
import js.annotation._

@js.native
trait AppsScriptEvent extends js.Object {
  var authMode: script.AuthMode = js.native
  var triggerUid: String        = js.native
  var user: base.User           = js.native
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
  var source: spreadsheet.Spreadsheet = js.native
}

@js.native
trait SheetsOnChange extends AppsScriptEvent {
  var changeType: Events.SheetsOnChangeChangeType = js.native
}

@js.native
trait SheetsOnEdit extends AppsScriptEvent {
  var oldValue: String                = js.native
  var range: spreadsheet.Range        = js.native
  var source: spreadsheet.Spreadsheet = js.native
  var value: String                   = js.native
}

@js.native
trait SheetsOnFormSubmit extends AppsScriptEvent {
  var namedValues: SheetsOnFormSubmit.NamedValues = js.native
  var range: spreadsheet.Range                    = js.native
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
  var response: forms.FormResponse = js.native
  var source: forms.Form           = js.native
}

@js.native
trait DocsOnOpen extends AppsScriptEvent {
  var source: document.Document = js.native
}

@js.native
trait SlidesOnOpen extends AppsScriptEvent {
  var source: slides.Presentation = js.native
}

@js.native
trait FormsOnOpen extends AppsScriptEvent {
  var source: forms.Form = js.native
}

@js.native
trait CalendarEventUpdated extends AppsScriptEvent {
  var calendarId: String = js.native
}

@js.native
trait AddonOnInstall extends js.Object {
  var authMode: script.AuthMode = js.native
}

@js.native
trait DoGet extends AppsScriptHttpRequestEvent {}

@js.native
trait DoPost extends AppsScriptHttpRequestEvent {
  var postData: AppsScriptHttpRequestEventPostData = js.native
}

@js.native
trait TimeDriven extends js.Object {
  var authMode: script.AuthMode = js.native
  var year: Double              = js.native
  var month: Double             = js.native
  var `week-of-year`: Double    = js.native
  var `day-of-month`: Double    = js.native
  var `day-of-week`: Double     = js.native
  var hour: Double              = js.native
  var minute: Double            = js.native
  var second: Double            = js.native
  var timezone: String          = js.native
  var triggerUid: String        = js.native
}

@js.native
@JSGlobal("GoogleAppsScript.Events")
object Events extends js.Object {
  type SheetsOnChangeChangeType = String
}
