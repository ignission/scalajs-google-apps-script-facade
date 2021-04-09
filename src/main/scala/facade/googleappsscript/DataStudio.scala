package facade.googleappsscript.data_studio

import facade.googleappsscript.data_studio.Data_Studio.{NumericOperator, RegexpOperator}

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSGlobalScope
object Facade extends js.Object {}

@js.native
sealed trait AggregationType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Data_Studio.AggregationType")
object AggregationType extends js.Object {
  var AVG: AggregationType            = js.native
  var COUNT: AggregationType          = js.native
  var COUNT_DISTINCT: AggregationType = js.native
  var MAX: AggregationType            = js.native
  var MIN: AggregationType            = js.native
  var SUM: AggregationType            = js.native
  var AUTO: AggregationType           = js.native
  var NO_AGGREGATION: AggregationType = js.native
  @JSBracketAccess
  def apply(value: AggregationType): String = js.native
}

@js.native
sealed trait AuthType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Data_Studio.AuthType")
object AuthType extends js.Object {
  var NONE: AuthType       = js.native
  var OAUTH2: AuthType     = js.native
  var USER_PASS: AuthType  = js.native
  var KEY: AuthType        = js.native
  var USER_TOKEN: AuthType = js.native
  @JSBracketAccess
  def apply(value: AuthType): String = js.native
}

@js.native
trait BigQueryConfig extends js.Object {
  def addQueryParameter(
      name: String,
      `type`: BigQueryParameterType,
      value: String
  ): BigQueryConfig                                                 = js.native
  def build(): Config                                               = js.native
  def printJson(): String                                           = js.native
  def setAccessToken(accessToken: String): BigQueryConfig           = js.native
  def setBillingProjectId(billingProjectId: String): BigQueryConfig = js.native
  def setQuery(query: String): BigQueryConfig                       = js.native
  def setUseStandardSql(useStandardSql: Boolean): BigQueryConfig    = js.native
}

@js.native
sealed trait BigQueryParameterType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Data_Studio.BigQueryParameterType")
object BigQueryParameterType extends js.Object {
  var STRING: BigQueryParameterType  = js.native
  var INT64: BigQueryParameterType   = js.native
  var BOOL: BigQueryParameterType    = js.native
  var FLOAT64: BigQueryParameterType = js.native
  @JSBracketAccess
  def apply(value: BigQueryParameterType): String = js.native
}

@js.native
trait Checkbox extends js.Object {
  def setAllowOverride(allowOverride: Boolean): Checkbox = js.native
  def setHelpText(helpText: String): Checkbox            = js.native
  def setId(id: String): Checkbox                        = js.native
  def setIsDynamic(isDynamic: Boolean): Checkbox         = js.native
  def setName(name: String): Checkbox                    = js.native
}

@js.native
trait CommunityConnector extends js.Object {
  var AggregationType: AggregationType                    = js.native
  var AuthType: AuthType                                  = js.native
  var BigQueryParameterType: BigQueryParameterType        = js.native
  var FieldType: FieldType                                = js.native
  def getConfig(): Config                                 = js.native
  def getFields(): Fields                                 = js.native
  def newAuthTypeResponse(): GetAuthTypeResponse          = js.native
  def newBigQueryConfig(): BigQueryConfig                 = js.native
  def newDebugError(): DebugError                         = js.native
  def newGetDataResponse(): GetDataResponse               = js.native
  def newGetSchemaResponse(): GetSchemaResponse           = js.native
  def newSetCredentialsResponse(): SetCredentialsResponse = js.native
  def newUserError(): UserError                           = js.native
}

@js.native
trait Config extends js.Object {
  def build(): Config                                          = js.native
  def newCheckbox(): Checkbox                                  = js.native
  def newInfo(): Info                                          = js.native
  def newOptionBuilder(): OptionBuilder                        = js.native
  def newSelectMultiple(): SelectMultiple                      = js.native
  def newSelectSingle(): SelectSingle                          = js.native
  def newTextArea(): TextArea                                  = js.native
  def newTextInput(): TextInput                                = js.native
  def printJson(): String                                      = js.native
  def setDateRangeRequired(dateRangeRequired: Boolean): Config = js.native
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config     = js.native
}

@js.native
trait DataStudioApp extends js.Object {
  def createCommunityConnector(): CommunityConnector = js.native
}

@js.native
trait DebugError extends js.Object {
  def printJson(): String               = js.native
  def setText(text: String): DebugError = js.native
  def throwException(): Nothing         = js.native
}

@js.native
trait Field extends js.Object {
  def getAggregation(): AggregationType | Null              = js.native
  def getDescription(): String | Null                       = js.native
  def getFormula(): String | Null                           = js.native
  def getGroup(): String | Null                             = js.native
  def getId(): String | Null                                = js.native
  def getIsReaggregatable(): Boolean | Null                 = js.native
  def getName(): String | Null                              = js.native
  def getType(): FieldType | Null                           = js.native
  def isDefault(): Boolean                                  = js.native
  def isDimension(): Boolean                                = js.native
  def isHidden(): Boolean                                   = js.native
  def isMetric(): Boolean                                   = js.native
  def setAggregation(aggregation: AggregationType): Field   = js.native
  def setDescription(description: String): Field            = js.native
  def setFormula(formula: String): Field                    = js.native
  def setGroup(group: String): Field                        = js.native
  def setId(id: String): Field                              = js.native
  def setIsHidden(isHidden: Boolean): Field                 = js.native
  def setIsReaggregatable(isReaggregatable: Boolean): Field = js.native
  def setName(name: String): Field                          = js.native
  def setType(`type`: FieldType): Field                     = js.native
}

@js.native
sealed trait FieldType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Data_Studio.FieldType")
object FieldType extends js.Object {
  var YEAR: FieldType                  = js.native
  var YEAR_QUARTER: FieldType          = js.native
  var YEAR_MONTH: FieldType            = js.native
  var YEAR_WEEK: FieldType             = js.native
  var YEAR_MONTH_DAY: FieldType        = js.native
  var YEAR_MONTH_DAY_HOUR: FieldType   = js.native
  var YEAR_MONTH_DAY_SECOND: FieldType = js.native
  var QUARTER: FieldType               = js.native
  var MONTH: FieldType                 = js.native
  var WEEK: FieldType                  = js.native
  var MONTH_DAY: FieldType             = js.native
  var DAY_OF_WEEK: FieldType           = js.native
  var DAY: FieldType                   = js.native
  var HOUR: FieldType                  = js.native
  var MINUTE: FieldType                = js.native
  var DURATION: FieldType              = js.native
  var COUNTRY: FieldType               = js.native
  var COUNTRY_CODE: FieldType          = js.native
  var CONTINENT: FieldType             = js.native
  var CONTINENT_CODE: FieldType        = js.native
  var SUB_CONTINENT: FieldType         = js.native
  var SUB_CONTINENT_CODE: FieldType    = js.native
  var REGION: FieldType                = js.native
  var REGION_CODE: FieldType           = js.native
  var CITY: FieldType                  = js.native
  var CITY_CODE: FieldType             = js.native
  var METRO: FieldType                 = js.native
  var METRO_CODE: FieldType            = js.native
  var LATITUDE_LONGITUDE: FieldType    = js.native
  var NUMBER: FieldType                = js.native
  var PERCENT: FieldType               = js.native
  var TEXT: FieldType                  = js.native
  var BOOLEAN: FieldType               = js.native
  var URL: FieldType                   = js.native
  var HYPERLINK: FieldType             = js.native
  var IMAGE: FieldType                 = js.native
  var IMAGE_LINK: FieldType            = js.native
  var CURRENCY_AED: FieldType          = js.native
  var CURRENCY_ALL: FieldType          = js.native
  var CURRENCY_ARS: FieldType          = js.native
  var CURRENCY_AUD: FieldType          = js.native
  var CURRENCY_BDT: FieldType          = js.native
  var CURRENCY_BGN: FieldType          = js.native
  var CURRENCY_BOB: FieldType          = js.native
  var CURRENCY_BRL: FieldType          = js.native
  var CURRENCY_CAD: FieldType          = js.native
  var CURRENCY_CDF: FieldType          = js.native
  var CURRENCY_CHF: FieldType          = js.native
  var CURRENCY_CLP: FieldType          = js.native
  var CURRENCY_CNY: FieldType          = js.native
  var CURRENCY_COP: FieldType          = js.native
  var CURRENCY_CRC: FieldType          = js.native
  var CURRENCY_CZK: FieldType          = js.native
  var CURRENCY_DKK: FieldType          = js.native
  var CURRENCY_DOP: FieldType          = js.native
  var CURRENCY_EGP: FieldType          = js.native
  var CURRENCY_ETB: FieldType          = js.native
  var CURRENCY_EUR: FieldType          = js.native
  var CURRENCY_GBP: FieldType          = js.native
  var CURRENCY_HKD: FieldType          = js.native
  var CURRENCY_HRK: FieldType          = js.native
  var CURRENCY_HUF: FieldType          = js.native
  var CURRENCY_IDR: FieldType          = js.native
  var CURRENCY_ILS: FieldType          = js.native
  var CURRENCY_INR: FieldType          = js.native
  var CURRENCY_IRR: FieldType          = js.native
  var CURRENCY_ISK: FieldType          = js.native
  var CURRENCY_JMD: FieldType          = js.native
  var CURRENCY_JPY: FieldType          = js.native
  var CURRENCY_KRW: FieldType          = js.native
  var CURRENCY_LKR: FieldType          = js.native
  var CURRENCY_LTL: FieldType          = js.native
  var CURRENCY_MNT: FieldType          = js.native
  var CURRENCY_MVR: FieldType          = js.native
  var CURRENCY_MXN: FieldType          = js.native
  var CURRENCY_MYR: FieldType          = js.native
  var CURRENCY_NOK: FieldType          = js.native
  var CURRENCY_NZD: FieldType          = js.native
  var CURRENCY_PAB: FieldType          = js.native
  var CURRENCY_PEN: FieldType          = js.native
  var CURRENCY_PHP: FieldType          = js.native
  var CURRENCY_PKR: FieldType          = js.native
  var CURRENCY_PLN: FieldType          = js.native
  var CURRENCY_RON: FieldType          = js.native
  var CURRENCY_RSD: FieldType          = js.native
  var CURRENCY_RUB: FieldType          = js.native
  var CURRENCY_SAR: FieldType          = js.native
  var CURRENCY_SEK: FieldType          = js.native
  var CURRENCY_SGD: FieldType          = js.native
  var CURRENCY_THB: FieldType          = js.native
  var CURRENCY_TRY: FieldType          = js.native
  var CURRENCY_TWD: FieldType          = js.native
  var CURRENCY_TZS: FieldType          = js.native
  var CURRENCY_UAH: FieldType          = js.native
  var CURRENCY_USD: FieldType          = js.native
  var CURRENCY_UYU: FieldType          = js.native
  var CURRENCY_VEF: FieldType          = js.native
  var CURRENCY_VND: FieldType          = js.native
  var CURRENCY_YER: FieldType          = js.native
  var CURRENCY_ZAR: FieldType          = js.native
  @JSBracketAccess
  def apply(value: FieldType): String = js.native
}

@js.native
trait Fields extends js.Object {
  def asArray(): js.Array[Field]                  = js.native
  def build(): js.Array[js.Any]                   = js.native
  def forIds(ids: js.Array[String]): Fields       = js.native
  def getDefaultDimension(): Field | Null         = js.native
  def getDefaultMetric(): Field | Null            = js.native
  def getFieldById(fieldId: String): Field | Null = js.native
  def newDimension(): Field                       = js.native
  def newMetric(): Field                          = js.native
  def setDefaultDimension(fieldId: String): Unit  = js.native
  def setDefaultMetric(fieldId: String): Unit     = js.native
}

@js.native
trait GetAuthTypeResponse extends js.Object {
  def build(): GetAuthTypeResponse                         = js.native
  def printJson(): String                                  = js.native
  def setAuthType(authType: AuthType): GetAuthTypeResponse = js.native
  def setHelpUrl(helpUrl: String): GetAuthTypeResponse     = js.native
}

@js.native
trait GetDataResponse extends js.Object {
  def addAllRows(rows: js.Array[js.Array[String]]): GetDataResponse = js.native
  def addRow(row: js.Array[String]): GetDataResponse                = js.native
  def build(): js.Dynamic                                           = js.native
  def setFields(fields: Fields): GetDataResponse                    = js.native
  def setFiltersApplied(filtersApplied: Boolean): GetDataResponse   = js.native
}

@js.native
trait GetSchemaResponse extends js.Object {
  def build(): js.Dynamic                          = js.native
  def printJson(): String                          = js.native
  def setFields(fields: Fields): GetSchemaResponse = js.native
}

@js.native
trait Info extends js.Object {
  def setId(id: String): Info     = js.native
  def setText(text: String): Info = js.native
}

@js.native
trait OptionBuilder extends js.Object {
  def setLabel(label: String): OptionBuilder = js.native
  def setValue(value: String): OptionBuilder = js.native
}

@js.native
trait SelectMultiple extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectMultiple  = js.native
  def setAllowOverride(allowOverride: Boolean): SelectMultiple = js.native
  def setHelpText(helpText: String): SelectMultiple            = js.native
  def setId(id: String): SelectMultiple                        = js.native
  def setIsDynamic(isDynamic: Boolean): SelectMultiple         = js.native
  def setName(name: String): SelectMultiple                    = js.native
}

@js.native
trait SelectSingle extends js.Object {
  def addOption(optionBuilder: OptionBuilder): SelectSingle  = js.native
  def setAllowOverride(allowOverride: Boolean): SelectSingle = js.native
  def setHelpText(helpText: String): SelectSingle            = js.native
  def setId(id: String): SelectSingle                        = js.native
  def setIsDynamic(isDynamic: Boolean): SelectSingle         = js.native
  def setName(name: String): SelectSingle                    = js.native
}

@js.native
trait SetCredentialsResponse extends js.Object {
  def build(): js.Dynamic                                  = js.native
  def printJson(): String                                  = js.native
  def setIsValid(isValid: Boolean): SetCredentialsResponse = js.native
}

@js.native
trait TextArea extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextArea = js.native
  def setHelpText(helpText: String): TextArea            = js.native
  def setId(id: String): TextArea                        = js.native
  def setIsDynamic(isDynamic: Boolean): TextArea         = js.native
  def setName(name: String): TextArea                    = js.native
  def setPlaceholder(placeholder: String): TextArea      = js.native
}

@js.native
trait TextInput extends js.Object {
  def setAllowOverride(allowOverride: Boolean): TextInput = js.native
  def setHelpText(helpText: String): TextInput            = js.native
  def setId(id: String): TextInput                        = js.native
  def setIsDynamic(isDynamic: Boolean): TextInput         = js.native
  def setName(name: String): TextInput                    = js.native
  def setPlaceholder(placeholder: String): TextInput      = js.native
}

@js.native
trait UserError extends js.Object {
  def printJson(): String                   = js.native
  def setDebugText(text: String): UserError = js.native
  def setText(text: String): UserError      = js.native
  def throwException(): Nothing             = js.native
}

@js.native
trait Request[T] extends js.Object {
  var configParams: T                                          = js.native
  var scriptParams: ScriptParams                               = js.native
  var dateRange: DateRange                                     = js.native
  var fields: js.Array[js.Any]                                 = js.native
  var dimensionsFilters: js.Array[js.Array[DimensionsFilters]] = js.native
}

@js.native
trait DateRange extends js.Object {
  var startDate: String = js.native
  var endDate: String   = js.native
}

@js.native
trait ScriptParams extends js.Object {
  var sampleExtraction: Boolean = js.native
  var lastRefresh: String       = js.native
}

@js.native
trait DimensionsFilters extends js.Object {
  var fieldName: String                                   = js.native
  var values: js.Array[String]                            = js.native
  var `type`: String                                      = js.native
  var operator: String | RegexpOperator | NumericOperator = js.native
}

@js.native
@JSGlobal("GoogleAppsScript.Data_Studio")
object Data_Studio extends js.Object {
  type RegexpOperator  = String
  type NumericOperator = String
}
