package facade.googleappsscript.base

import facade.googleappsscript.html.HtmlOutput

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait Blob extends BlobSource {
  def copyBlob(): Blob                                         = js.native
  override def getAs(contentType: String): Blob                = js.native
  def getBytes(): js.Array[Byte]                               = js.native
  def getContentType(): String                                 = js.native
  def getDataAsString(): String                                = js.native
  def getDataAsString(charset: String): String                 = js.native
  def getName(): String                                        = js.native
  def isGoogleType(): Boolean                                  = js.native
  def setBytes(data: js.Array[Byte]): Blob                     = js.native
  def setContentType(contentType: String): Blob                = js.native
  def setContentTypeFromExtension(): Blob                      = js.native
  def setDataFromString(string: String): Blob                  = js.native
  def setDataFromString(string: String, charset: String): Blob = js.native
  def setName(name: String): Blob                              = js.native
  def getAllBlobs(): js.Array[Blob]                            = js.native
}

@js.native
trait BlobSource extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob                  = js.native
}

@js.native
trait Browser extends js.Object {
  var Buttons: ButtonSet.type                                             = js.native
  def inputBox(prompt: String): String                                    = js.native
  def inputBox(prompt: String, buttons: ButtonSet): String                = js.native
  def inputBox(title: String, prompt: String, buttons: ButtonSet): String = js.native
  def msgBox(prompt: String): String                                      = js.native
  def msgBox(prompt: String, buttons: ButtonSet): String                  = js.native
  def msgBox(title: String, prompt: String, buttons: ButtonSet): String   = js.native
}

@js.native
sealed trait Button extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.facade.googleappsscript.base.Base.facade.googleappsscript.base.Button")
object Button extends js.Object {
  var CLOSE: Button  = js.native
  var OK: Button     = js.native
  var CANCEL: Button = js.native
  var YES: Button    = js.native
  var NO: Button     = js.native
  @JSBracketAccess
  def apply(value: Button): String = js.native
}

@js.native
sealed trait ButtonSet extends js.Object {}

@js.native
@JSGlobal(
  "GoogleAppsScript.facade.googleappsscript.base.Base.facade.googleappsscript.base.ButtonSet"
)
object ButtonSet extends js.Object {
  var OK: ButtonSet            = js.native
  var OK_CANCEL: ButtonSet     = js.native
  var YES_NO: ButtonSet        = js.native
  var YES_NO_CANCEL: ButtonSet = js.native
  @JSBracketAccess
  def apply(value: ButtonSet): String = js.native
}

@js.native
sealed trait ColorType extends js.Object {}

@js.native
@JSGlobal(
  "GoogleAppsScript.facade.googleappsscript.base.Base.facade.googleappsscript.base.ColorType"
)
object ColorType extends js.Object {
  var UNSUPPORTED: ColorType = js.native
  var RGB: ColorType         = js.native
  var THEME: ColorType       = js.native
  @JSBracketAccess
  def apply(value: ColorType): String = js.native
}

@js.native
trait Logger extends js.Object {
  def clear(): Unit                                = js.native
  def getLog(): String                             = js.native
  def log(data: js.Any): Logger                    = js.native
  def log(format: String, values: js.Any*): Logger = js.native
}

@js.native
trait Menu extends js.Object {
  def addItem(caption: String, functionName: String): Menu = js.native
  def addSeparator(): Menu                                 = js.native
  def addSubMenu(menu: Menu): Menu                         = js.native
  def addToUi(): Unit                                      = js.native
}

@js.native
sealed trait MimeType extends js.Object {}

@js.native
@JSGlobal("MimeType")
object MimeType extends js.Object {
  var GOOGLE_APPS_SCRIPT: MimeType          = js.native
  var GOOGLE_DRAWINGS: MimeType             = js.native
  var GOOGLE_DOCS: MimeType                 = js.native
  var GOOGLE_FORMS: MimeType                = js.native
  var GOOGLE_SHEETS: MimeType               = js.native
  var GOOGLE_SITES: MimeType                = js.native
  var GOOGLE_SLIDES: MimeType               = js.native
  var FOLDER: MimeType                      = js.native
  var BMP: MimeType                         = js.native
  var GIF: MimeType                         = js.native
  var JPEG: MimeType                        = js.native
  var PNG: MimeType                         = js.native
  var SVG: MimeType                         = js.native
  var PDF: MimeType                         = js.native
  var CSS: MimeType                         = js.native
  var CSV: MimeType                         = js.native
  var HTML: MimeType                        = js.native
  var JAVASCRIPT: MimeType                  = js.native
  var PLAIN_TEXT: MimeType                  = js.native
  var RTF: MimeType                         = js.native
  var OPENDOCUMENT_GRAPHICS: MimeType       = js.native
  var OPENDOCUMENT_PRESENTATION: MimeType   = js.native
  var OPENDOCUMENT_SPREADSHEET: MimeType    = js.native
  var OPENDOCUMENT_TEXT: MimeType           = js.native
  var MICROSOFT_EXCEL: MimeType             = js.native
  var MICROSOFT_EXCEL_LEGACY: MimeType      = js.native
  var MICROSOFT_POWERPOINT: MimeType        = js.native
  var MICROSOFT_POWERPOINT_LEGACY: MimeType = js.native
  var MICROSOFT_WORD: MimeType              = js.native
  var MICROSOFT_WORD_LEGACY: MimeType       = js.native
  var ZIP: MimeType                         = js.native
  @JSBracketAccess
  def apply(value: MimeType): String = js.native
}

@js.native
sealed trait Month extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.facade.googleappsscript.base.Base.facade.googleappsscript.base.Month")
object Month extends js.Object {
  var JANUARY: Month   = js.native
  var FEBRUARY: Month  = js.native
  var MARCH: Month     = js.native
  var APRIL: Month     = js.native
  var MAY: Month       = js.native
  var JUNE: Month      = js.native
  var JULY: Month      = js.native
  var AUGUST: Month    = js.native
  var SEPTEMBER: Month = js.native
  var OCTOBER: Month   = js.native
  var NOVEMBER: Month  = js.native
  var DECEMBER: Month  = js.native
  @JSBracketAccess
  def apply(value: Month): String = js.native
}

@js.native
trait PromptResponse extends js.Object {
  def getResponseText(): String   = js.native
  def getSelectedButton(): Button = js.native
}

@js.native
trait RgbColor extends js.Object {
  def asHexString(): String     = js.native
  def getBlue(): Integer        = js.native
  def getColorType(): ColorType = js.native
  def getGreen(): Integer       = js.native
  def getRed(): Integer         = js.native
}

@js.native
trait Session extends js.Object {
  def getActiveUser(): User               = js.native
  def getActiveUserLocale(): String       = js.native
  def getEffectiveUser(): User            = js.native
  def getScriptTimeZone(): String         = js.native
  def getTemporaryActiveUserKey(): String = js.native
  def getTimeZone(): String               = js.native
  def getUser(): User                     = js.native
}

@js.native
trait Ui extends js.Object {
  var Button: Button                                                            = js.native
  var ButtonSet: ButtonSet                                                      = js.native
  def alert(prompt: String): Button                                             = js.native
  def alert(prompt: String, buttons: ButtonSet): Button                         = js.native
  def alert(title: String, prompt: String, buttons: ButtonSet): Button          = js.native
  def createAddonMenu(): Menu                                                   = js.native
  def createMenu(caption: String): Menu                                         = js.native
  def prompt(prompt: String): PromptResponse                                    = js.native
  def prompt(prompt: String, buttons: ButtonSet): PromptResponse                = js.native
  def prompt(title: String, prompt: String, buttons: ButtonSet): PromptResponse = js.native
  def showModalDialog(userInterface: HtmlOutput, title: String): Unit           = js.native
  def showModelessDialog(userInterface: HtmlOutput, title: String): Unit        = js.native
  def showSidebar(userInterface: HtmlOutput): Unit                              = js.native
  def showDialog(userInterface: HtmlOutput): Unit                               = js.native
}

@js.native
trait User extends js.Object {
  def getEmail(): String       = js.native
  def getUserLoginId(): String = js.native
}

@js.native
sealed trait Weekday extends js.Object {}

@js.native
@JSGlobal(
  "GoogleAppsScript.facade.googleappsscript.base.Base.facade.googleappsscript.base.Weekday"
)
object Weekday extends js.Object {
  var SUNDAY: Weekday    = js.native
  var MONDAY: Weekday    = js.native
  var TUESDAY: Weekday   = js.native
  var WEDNESDAY: Weekday = js.native
  var THURSDAY: Weekday  = js.native
  var FRIDAY: Weekday    = js.native
  var SATURDAY: Weekday  = js.native
  @JSBracketAccess
  def apply(value: Weekday): String = js.native
}

@js.native
trait console extends js.Object {
  def error(): Unit                                                    = js.native
  def error(formatOrObject: js.Object | String, values: js.Any*): Unit = js.native
  def info(): Unit                                                     = js.native
  def info(formatOrObject: js.Object | String, values: js.Any*): Unit  = js.native
  def log(): Unit                                                      = js.native
  def log(formatOrObject: js.Object | String, values: js.Any*): Unit   = js.native
  def time(label: String): Unit                                        = js.native
  def timeEnd(label: String): Unit                                     = js.native
  def warn(): Unit                                                     = js.native
  def warn(formatOrObject: js.Object | String, values: js.Any*): Unit  = js.native
}

@js.native
trait Date extends js.Object {
  override def toString(): String                                             = js.native
  def toDateString(): String                                                  = js.native
  def toTimeString(): String                                                  = js.native
  override def toLocaleString(): String                                       = js.native
  def toLocaleDateString(): String                                            = js.native
  def toLocaleTimeString(): String                                            = js.native
  override def valueOf(): Double                                              = js.native
  def getTime(): Double                                                       = js.native
  def getFullYear(): Double                                                   = js.native
  def getUTCFullYear(): Double                                                = js.native
  def getMonth(): Double                                                      = js.native
  def getUTCMonth(): Double                                                   = js.native
  def getDate(): Double                                                       = js.native
  def getUTCDate(): Double                                                    = js.native
  def getDay(): Double                                                        = js.native
  def getUTCDay(): Double                                                     = js.native
  def getHours(): Double                                                      = js.native
  def getUTCHours(): Double                                                   = js.native
  def getMinutes(): Double                                                    = js.native
  def getUTCMinutes(): Double                                                 = js.native
  def getSeconds(): Double                                                    = js.native
  def getUTCSeconds(): Double                                                 = js.native
  def getMilliseconds(): Double                                               = js.native
  def getUTCMilliseconds(): Double                                            = js.native
  def getTimezoneOffset(): Double                                             = js.native
  def setTime(time: Double): Double                                           = js.native
  def setMilliseconds(ms: Double): Double                                     = js.native
  def setUTCMilliseconds(ms: Double): Double                                  = js.native
  def setSeconds(sec: Double, ms: Double = ???): Double                       = js.native
  def setUTCSeconds(sec: Double, ms: Double = ???): Double                    = js.native
  def setMinutes(min: Double, sec: Double = ???, ms: Double = ???): Double    = js.native
  def setUTCMinutes(min: Double, sec: Double = ???, ms: Double = ???): Double = js.native
  def setHours(hours: Double, min: Double = ???, sec: Double = ???, ms: Double = ???): Double =
    js.native
  def setUTCHours(hours: Double, min: Double = ???, sec: Double = ???, ms: Double = ???): Double =
    js.native
  def setDate(date: Double): Double                                                 = js.native
  def setUTCDate(date: Double): Double                                              = js.native
  def setMonth(month: Double, date: Double = ???): Double                           = js.native
  def setUTCMonth(month: Double, date: Double = ???): Double                        = js.native
  def setFullYear(year: Double, month: Double = ???, date: Double = ???): Double    = js.native
  def setUTCFullYear(year: Double, month: Double = ???, date: Double = ???): Double = js.native
  def toUTCString(): String                                                         = js.native
  def toISOString(): String                                                         = js.native
  def toJSON(key: js.Any = ???): String                                             = js.native
}

@js.native
trait DateConstructor extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(facade.googleappsscript.base.Date),List())))) */
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(value),false,Some(UnionType(TypeRef(CoreType(number),List()),TypeRef(CoreType(string),List()))))),Some(TypeRef(TypeName(facade.googleappsscript.base.Date),List())))) */
  /* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(year),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(month),false,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(date),true,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(hours),true,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(minutes),true,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(seconds),true,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(ms),true,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(facade.googleappsscript.base.Date),List())))) */
  def apply(): String          = js.native
  def parse(s: String): Double = js.native
  def UTC(
      year: Double,
      month: Double,
      date: Double = ???,
      hours: Double = ???,
      minutes: Double = ???,
      seconds: Double = ???,
      ms: Double = ???
  ): Double = js.native
  def now(): Double = js.native
}

@js.native
@JSGlobal("GoogleAppsScript.facade.googleappsscript.base.Base")
object Base extends js.Object {
  val Date: DateConstructor = js.native
}
