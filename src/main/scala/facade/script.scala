
import scala.scalajs.js
import js.annotation._
import js.|

package facade {

package GoogleAppsScript {

package Script {

@js.native
sealed trait AuthMode extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Script.AuthMode")
object AuthMode extends js.Object {
  var NONE: AuthMode = js.native
  var CUSTOM_FUNCTION: AuthMode = js.native
  var LIMITED: AuthMode = js.native
  var FULL: AuthMode = js.native
  @JSBracketAccess
  def apply(value: AuthMode): String = js.native
}

@js.native
trait AuthorizationInfo extends js.Object {
  def getAuthorizationStatus(): AuthorizationStatus = js.native
  def getAuthorizationUrl(): String = js.native
}

@js.native
sealed trait AuthorizationStatus extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Script.AuthorizationStatus")
object AuthorizationStatus extends js.Object {
  var REQUIRED: AuthorizationStatus = js.native
  var NOT_REQUIRED: AuthorizationStatus = js.native
  @JSBracketAccess
  def apply(value: AuthorizationStatus): String = js.native
}

@js.native
trait CalendarTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onEventUpdated(): CalendarTriggerBuilder = js.native
}

@js.native
trait ClockTriggerBuilder extends js.Object {
  def after(durationMilliseconds: Integer): ClockTriggerBuilder = js.native
  def at(date: Date): ClockTriggerBuilder = js.native
  def atDate(year: Integer, month: Integer, day: Integer): ClockTriggerBuilder = js.native
  def atHour(hour: Integer): ClockTriggerBuilder = js.native
  def create(): Trigger = js.native
  def everyDays(n: Integer): ClockTriggerBuilder = js.native
  def everyHours(n: Integer): ClockTriggerBuilder = js.native
  def everyMinutes(n: Integer): ClockTriggerBuilder = js.native
  def everyWeeks(n: Integer): ClockTriggerBuilder = js.native
  def inTimezone(timezone: String): ClockTriggerBuilder = js.native
  def nearMinute(minute: Integer): ClockTriggerBuilder = js.native
  def onMonthDay(day: Integer): ClockTriggerBuilder = js.native
  def onWeekDay(day: Weekday): ClockTriggerBuilder = js.native
}

@js.native
trait DocumentTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onOpen(): DocumentTriggerBuilder = js.native
}

@js.native
sealed trait EventType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Script.EventType")
object EventType extends js.Object {
  var CLOCK: EventType = js.native
  var ON_OPEN: EventType = js.native
  var ON_EDIT: EventType = js.native
  var ON_FORM_SUBMIT: EventType = js.native
  var ON_CHANGE: EventType = js.native
  var ON_EVENT_UPDATED: EventType = js.native
  @JSBracketAccess
  def apply(value: EventType): String = js.native
}

@js.native
trait FormTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onFormSubmit(): FormTriggerBuilder = js.native
  def onOpen(): FormTriggerBuilder = js.native
}

@js.native
sealed trait InstallationSource extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Script.InstallationSource")
object InstallationSource extends js.Object {
  var APPS_MARKETPLACE_DOMAIN_ADD_ON: InstallationSource = js.native
  var NONE: InstallationSource = js.native
  var WEB_STORE_ADD_ON: InstallationSource = js.native
  @JSBracketAccess
  def apply(value: InstallationSource): String = js.native
}

@js.native
trait ScriptApp extends js.Object {
  var AuthMode: AuthMode.type = js.native
  var AuthorizationStatus: AuthorizationStatus.type = js.native
  var EventType: EventType.type = js.native
  var InstallationSource: InstallationSource.type = js.native
  var TriggerSource: TriggerSource.type = js.native
  var WeekDay: Weekday.type = js.native
  def deleteTrigger(trigger: Trigger): Unit = js.native
  def getAuthorizationInfo(authMode: AuthMode): AuthorizationInfo = js.native
  def getIdentityToken(): String = js.native
  def getInstallationSource(): InstallationSource = js.native
  def getOAuthToken(): String = js.native
  def getProjectTriggers(): js.Array[Trigger] = js.native
  def getScriptId(): String = js.native
  def getService(): Service = js.native
  def getUserTriggers(document: Document.Document): js.Array[Trigger] = js.native
  def getUserTriggers(form: Forms.Form): js.Array[Trigger] = js.native
  def getUserTriggers(spreadsheet: Spreadsheet.Spreadsheet): js.Array[Trigger] = js.native
  def invalidateAuth(): Unit = js.native
  def newStateToken(): StateTokenBuilder = js.native
  def newTrigger(functionName: String): TriggerBuilder = js.native
  def getProjectKey(): String = js.native
  def getScriptTriggers(): js.Array[Trigger] = js.native
}

@js.native
trait Service extends js.Object {
  def getUrl(): String = js.native
  def isEnabled(): Boolean = js.native
  def disable(): Unit = js.native
}

@js.native
trait SpreadsheetTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onChange(): SpreadsheetTriggerBuilder = js.native
  def onEdit(): SpreadsheetTriggerBuilder = js.native
  def onFormSubmit(): SpreadsheetTriggerBuilder = js.native
  def onOpen(): SpreadsheetTriggerBuilder = js.native
}

@js.native
trait StateTokenBuilder extends js.Object {
  def createToken(): String = js.native
  def withArgument(name: String, value: String): StateTokenBuilder = js.native
  def withMethod(method: String): StateTokenBuilder = js.native
  def withTimeout(seconds: Integer): StateTokenBuilder = js.native
}

@js.native
trait Trigger extends js.Object {
  def getEventType(): EventType = js.native
  def getHandlerFunction(): String = js.native
  def getTriggerSource(): TriggerSource = js.native
  def getTriggerSourceId(): String = js.native
  def getUniqueId(): String = js.native
}

@js.native
trait TriggerBuilder extends js.Object {
  def forDocument(document: Document.Document): DocumentTriggerBuilder = js.native
  def forDocument(key: String): DocumentTriggerBuilder = js.native
  def forForm(form: Forms.Form): FormTriggerBuilder = js.native
  def forForm(key: String): FormTriggerBuilder = js.native
  def forSpreadsheet(sheet: Spreadsheet.Spreadsheet): SpreadsheetTriggerBuilder = js.native
  def forSpreadsheet(key: String): SpreadsheetTriggerBuilder = js.native
  def forUserCalendar(emailId: String): CalendarTriggerBuilder = js.native
  def timeBased(): ClockTriggerBuilder = js.native
}

@js.native
sealed trait TriggerSource extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Script.TriggerSource")
object TriggerSource extends js.Object {
  var SPREADSHEETS: TriggerSource = js.native
  var CLOCK: TriggerSource = js.native
  var FORMS: TriggerSource = js.native
  var DOCUMENTS: TriggerSource = js.native
  var CALENDAR: TriggerSource = js.native
  @JSBracketAccess
  def apply(value: TriggerSource): String = js.native
}

}

}

@js.native
@JSGlobalScope
object Facade extends js.Object {
  var ScriptApp: GoogleAppsScript.Script.ScriptApp = js.native
}

}
