
import scala.scalajs.js
import js.annotation._
import js.|

package facade {

package GoogleAppsScript {

package Conference_Data {

@js.native
trait ConferenceData extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait ConferenceDataBuilder extends js.Object {
  def addConferenceParameter(conferenceParameter: ConferenceParameter): ConferenceDataBuilder = js.native
  def addEntryPoint(entryPoint: EntryPoint): ConferenceDataBuilder = js.native
  def build(): ConferenceData = js.native
  def setConferenceId(conferenceId: String): ConferenceDataBuilder = js.native
  def setConferenceSolutionId(conferenceSolutionId: String): ConferenceDataBuilder = js.native
  def setError(conferenceError: ConferenceError): ConferenceDataBuilder = js.native
  def setNotes(notes: String): ConferenceDataBuilder = js.native
}

@js.native
trait ConferenceDataService extends js.Object {
  var ConferenceErrorType: ConferenceErrorType.type = js.native
  var EntryPointFeature: EntryPointFeature.type = js.native
  var EntryPointType: EntryPointType.type = js.native
  def newConferenceDataBuilder(): ConferenceDataBuilder = js.native
  def newConferenceError(): ConferenceError = js.native
  def newConferenceParameter(): ConferenceParameter = js.native
  def newEntryPoint(): EntryPoint = js.native
}

@js.native
trait ConferenceError extends js.Object {
  def setAuthenticationUrl(authenticationUrl: String): ConferenceError = js.native
  def setConferenceErrorType(conferenceErrorType: ConferenceErrorType): ConferenceError = js.native
}

@js.native
sealed trait ConferenceErrorType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Conference_Data.ConferenceErrorType")
object ConferenceErrorType extends js.Object {
  var AUTHENTICATION: ConferenceErrorType = js.native
  var CONFERENCE_SOLUTION_FORBIDDEN: ConferenceErrorType = js.native
  var PERMANENT: ConferenceErrorType = js.native
  var PERMISSION_DENIED: ConferenceErrorType = js.native
  var TEMPORARY: ConferenceErrorType = js.native
  var UNKNOWN: ConferenceErrorType = js.native
  @JSBracketAccess
  def apply(value: ConferenceErrorType): String = js.native
}

@js.native
trait ConferenceParameter extends js.Object {
  def setKey(key: String): ConferenceParameter = js.native
  def setValue(value: String): ConferenceParameter = js.native
}

@js.native
trait EntryPoint extends js.Object {
  def addFeature(feature: EntryPointFeature): EntryPoint = js.native
  def setAccessCode(accessCode: String): EntryPoint = js.native
  def setEntryPointType(entryPointType: EntryPointType): EntryPoint = js.native
  def setMeetingCode(meetingCode: String): EntryPoint = js.native
  def setPasscode(passcode: String): EntryPoint = js.native
  def setPassword(password: String): EntryPoint = js.native
  def setPin(pin: String): EntryPoint = js.native
  def setRegionCode(regionCode: String): EntryPoint = js.native
  def setUri(uri: String): EntryPoint = js.native
}

@js.native
sealed trait EntryPointFeature extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Conference_Data.EntryPointFeature")
object EntryPointFeature extends js.Object {
  var UNKNOWN_FEATURE: EntryPointFeature = js.native
  var TOLL: EntryPointFeature = js.native
  var TOLL_FREE: EntryPointFeature = js.native
  @JSBracketAccess
  def apply(value: EntryPointFeature): String = js.native
}

@js.native
sealed trait EntryPointType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Conference_Data.EntryPointType")
object EntryPointType extends js.Object {
  var VIDEO: EntryPointType = js.native
  var PHONE: EntryPointType = js.native
  var MORE: EntryPointType = js.native
  var SIP: EntryPointType = js.native
  @JSBracketAccess
  def apply(value: EntryPointType): String = js.native
}

}

}

@js.native
@JSGlobalScope
object Facade extends js.Object {
  var ConferenceDataService: GoogleAppsScript.Conference_Data.ConferenceDataService = js.native
}

}
