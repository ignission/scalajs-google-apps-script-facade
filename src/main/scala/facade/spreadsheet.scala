
import scala.scalajs.js
import js.annotation._
import js.|

package facade {

package GoogleAppsScript {

package Spreadsheet {

@js.native
sealed trait AutoFillSeries extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
object AutoFillSeries extends js.Object {
  var DEFAULT_SERIES: AutoFillSeries = js.native
  var ALTERNATE_SERIES: AutoFillSeries = js.native
  @JSBracketAccess
  def apply(value: AutoFillSeries): String = js.native
}

@js.native
trait Banding extends js.Object {
  def copyTo(range: Range): Banding = js.native
  def getFirstColumnColor(): String | Null = js.native
  def getFirstRowColor(): String | Null = js.native
  def getFooterColumnColor(): String | Null = js.native
  def getFooterRowColor(): String | Null = js.native
  def getHeaderColumnColor(): String | Null = js.native
  def getHeaderRowColor(): String | Null = js.native
  def getRange(): Range = js.native
  def getSecondColumnColor(): String | Null = js.native
  def getSecondRowColor(): String | Null = js.native
  def remove(): Unit = js.native
  def setFirstColumnColor(color: String | Null): Banding = js.native
  def setFirstRowColor(color: String | Null): Banding = js.native
  def setFooterColumnColor(color: String | Null): Banding = js.native
  def setFooterRowColor(color: String | Null): Banding = js.native
  def setHeaderColumnColor(color: String | Null): Banding = js.native
  def setHeaderRowColor(color: String | Null): Banding = js.native
  def setRange(range: Range): Banding = js.native
  def setSecondColumnColor(color: String | Null): Banding = js.native
  def setSecondRowColor(color: String | Null): Banding = js.native
}

@js.native
sealed trait BandingTheme extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.BandingTheme")
object BandingTheme extends js.Object {
  var LIGHT_GREY: BandingTheme = js.native
  var CYAN: BandingTheme = js.native
  var GREEN: BandingTheme = js.native
  var YELLOW: BandingTheme = js.native
  var ORANGE: BandingTheme = js.native
  var BLUE: BandingTheme = js.native
  var TEAL: BandingTheme = js.native
  var GREY: BandingTheme = js.native
  var BROWN: BandingTheme = js.native
  var LIGHT_GREEN: BandingTheme = js.native
  var INDIGO: BandingTheme = js.native
  var PINK: BandingTheme = js.native
  @JSBracketAccess
  def apply(value: BandingTheme): String = js.native
}

@js.native
trait BigQueryDataSourceSpec extends js.Object {
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getProjectId(): String = js.native
  def getRawQuery(): String = js.native
  def getType(): DataSourceType = js.native
}

@js.native
trait BigQueryDataSourceSpecBuilder extends js.Object {
  def build(): DataSourceSpec = js.native
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getProjectId(): String = js.native
  def getRawQuery(): String = js.native
  def getType(): DataSourceType = js.native
  def removeAllParameters(): BigQueryDataSourceSpecBuilder = js.native
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder = js.native
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder = js.native
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder = js.native
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder = js.native
}

@js.native
trait BooleanCondition extends js.Object {
  def getBackground(): String | Null = js.native
  def getBold(): Boolean | Null = js.native
  def getCriteriaType(): BooleanCriteria = js.native
  def getCriteriaValues(): js.Array[js.Any] = js.native
  def getFontColor(): String | Null = js.native
  def getItalic(): Boolean | Null = js.native
  def getStrikethrough(): Boolean | Null = js.native
  def getUnderline(): Boolean | Null = js.native
}

@js.native
sealed trait BooleanCriteria extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.BooleanCriteria")
object BooleanCriteria extends js.Object {
  var CELL_EMPTY: BooleanCriteria = js.native
  var CELL_NOT_EMPTY: BooleanCriteria = js.native
  var DATE_AFTER: BooleanCriteria = js.native
  var DATE_BEFORE: BooleanCriteria = js.native
  var DATE_EQUAL_TO: BooleanCriteria = js.native
  var DATE_AFTER_RELATIVE: BooleanCriteria = js.native
  var DATE_BEFORE_RELATIVE: BooleanCriteria = js.native
  var DATE_EQUAL_TO_RELATIVE: BooleanCriteria = js.native
  var NUMBER_BETWEEN: BooleanCriteria = js.native
  var NUMBER_EQUAL_TO: BooleanCriteria = js.native
  var NUMBER_GREATER_THAN: BooleanCriteria = js.native
  var NUMBER_GREATER_THAN_OR_EQUAL_TO: BooleanCriteria = js.native
  var NUMBER_LESS_THAN: BooleanCriteria = js.native
  var NUMBER_LESS_THAN_OR_EQUAL_TO: BooleanCriteria = js.native
  var NUMBER_NOT_BETWEEN: BooleanCriteria = js.native
  var NUMBER_NOT_EQUAL_TO: BooleanCriteria = js.native
  var TEXT_CONTAINS: BooleanCriteria = js.native
  var TEXT_DOES_NOT_CONTAIN: BooleanCriteria = js.native
  var TEXT_EQUAL_TO: BooleanCriteria = js.native
  var TEXT_STARTS_WITH: BooleanCriteria = js.native
  var TEXT_ENDS_WITH: BooleanCriteria = js.native
  var CUSTOM_FORMULA: BooleanCriteria = js.native
  @JSBracketAccess
  def apply(value: BooleanCriteria): String = js.native
}

@js.native
sealed trait BorderStyle extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
object BorderStyle extends js.Object {
  var DOTTED: BorderStyle = js.native
  var DASHED: BorderStyle = js.native
  var SOLID: BorderStyle = js.native
  var SOLID_MEDIUM: BorderStyle = js.native
  var SOLID_THICK: BorderStyle = js.native
  var DOUBLE: BorderStyle = js.native
  @JSBracketAccess
  def apply(value: BorderStyle): String = js.native
}

@js.native
trait Color extends js.Object {
  def asRgbColor(): RgbColor = js.native
  def asThemeColor(): ThemeColor = js.native
  def getColorType(): ColorType = js.native
}

@js.native
trait ColorBuilder extends js.Object {
  def asRgbColor(): RgbColor = js.native
  def asThemeColor(): ThemeColor = js.native
  def build(): Color = js.native
  def getColorType(): ColorType = js.native
  def setRgbColor(cssString: String): ColorBuilder = js.native
  def setThemeColor(themeColorType: ThemeColorType): ColorBuilder = js.native
}

@js.native
trait ConditionalFormatRule extends js.Object {
  def copy(): ConditionalFormatRuleBuilder = js.native
  def getBooleanCondition(): BooleanCondition | Null = js.native
  def getGradientCondition(): GradientCondition | Null = js.native
  def getRanges(): js.Array[Range] = js.native
}

@js.native
trait ConditionalFormatRuleBuilder extends js.Object {
  def build(): ConditionalFormatRule = js.native
  def copy(): ConditionalFormatRuleBuilder = js.native
  def getBooleanCondition(): BooleanCondition | Null = js.native
  def getGradientCondition(): GradientCondition | Null = js.native
  def getRanges(): js.Array[Range] = js.native
  def setBackground(color: String | Null): ConditionalFormatRuleBuilder = js.native
  def setBold(bold: Boolean | Null): ConditionalFormatRuleBuilder = js.native
  def setFontColor(color: String | Null): ConditionalFormatRuleBuilder = js.native
  def setGradientMaxpoint(color: String): ConditionalFormatRuleBuilder = js.native
  def setGradientMaxpointWithValue(color: String, `type`: InterpolationType, value: String): ConditionalFormatRuleBuilder = js.native
  def setGradientMidpointWithValue(color: String, `type`: InterpolationType, value: String): ConditionalFormatRuleBuilder = js.native
  def setGradientMinpoint(color: String): ConditionalFormatRuleBuilder = js.native
  def setGradientMinpointWithValue(color: String, `type`: InterpolationType, value: String): ConditionalFormatRuleBuilder = js.native
  def setItalic(italic: Boolean | Null): ConditionalFormatRuleBuilder = js.native
  def setRanges(ranges: js.Array[Range]): ConditionalFormatRuleBuilder = js.native
  def setStrikethrough(strikethrough: Boolean | Null): ConditionalFormatRuleBuilder = js.native
  def setUnderline(underline: Boolean | Null): ConditionalFormatRuleBuilder = js.native
  def whenCellEmpty(): ConditionalFormatRuleBuilder = js.native
  def whenCellNotEmpty(): ConditionalFormatRuleBuilder = js.native
  def whenDateAfter(date: Date): ConditionalFormatRuleBuilder = js.native
  def whenDateAfter(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  def whenDateBefore(date: Date): ConditionalFormatRuleBuilder = js.native
  def whenDateBefore(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  def whenDateEqualTo(date: Date): ConditionalFormatRuleBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): ConditionalFormatRuleBuilder = js.native
  def whenFormulaSatisfied(formula: String): ConditionalFormatRuleBuilder = js.native
  def whenNumberBetween(start: Double, end: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberGreaterThan(number: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberGreaterThanOrEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberLessThan(number: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberLessThanOrEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberNotBetween(start: Double, end: Double): ConditionalFormatRuleBuilder = js.native
  def whenNumberNotEqualTo(number: Double): ConditionalFormatRuleBuilder = js.native
  def whenTextContains(text: String): ConditionalFormatRuleBuilder = js.native
  def whenTextDoesNotContain(text: String): ConditionalFormatRuleBuilder = js.native
  def whenTextEndsWith(text: String): ConditionalFormatRuleBuilder = js.native
  def whenTextEqualTo(text: String): ConditionalFormatRuleBuilder = js.native
  def whenTextStartsWith(text: String): ConditionalFormatRuleBuilder = js.native
  def withCriteria(criteria: BooleanCriteria, args: js.Array[js.Any]): ConditionalFormatRuleBuilder = js.native
}

@js.native
trait ContainerInfo extends js.Object {
  def getAnchorColumn(): Integer = js.native
  def getAnchorRow(): Integer = js.native
  def getOffsetX(): Integer = js.native
  def getOffsetY(): Integer = js.native
}

@js.native
sealed trait CopyPasteType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
object CopyPasteType extends js.Object {
  var PASTE_NORMAL: CopyPasteType = js.native
  var PASTE_NO_BORDERS: CopyPasteType = js.native
  var PASTE_FORMAT: CopyPasteType = js.native
  var PASTE_FORMULA: CopyPasteType = js.native
  var PASTE_DATA_VALIDATION: CopyPasteType = js.native
  var PASTE_VALUES: CopyPasteType = js.native
  var PASTE_CONDITIONAL_FORMATTING: CopyPasteType = js.native
  var PASTE_COLUMN_WIDTHS: CopyPasteType = js.native
  @JSBracketAccess
  def apply(value: CopyPasteType): String = js.native
}

@js.native
sealed trait DataExecutionErrorCode extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
object DataExecutionErrorCode extends js.Object {
  var DATA_EXECUTION_ERROR_CODE_UNSUPPORTED: DataExecutionErrorCode = js.native
  var NONE: DataExecutionErrorCode = js.native
  var TIME_OUT: DataExecutionErrorCode = js.native
  var TOO_MANY_ROWS: DataExecutionErrorCode = js.native
  var TOO_MANY_CELLS: DataExecutionErrorCode = js.native
  var ENGINE: DataExecutionErrorCode = js.native
  var PARAMETER_INVALID: DataExecutionErrorCode = js.native
  var UNSUPPORTED_DATA_TYPE: DataExecutionErrorCode = js.native
  var DUPLICATE_COLUMN_NAMES: DataExecutionErrorCode = js.native
  var INTERRUPTED: DataExecutionErrorCode = js.native
  var OTHER: DataExecutionErrorCode = js.native
  var TOO_MANY_CHARS_PER_CELL: DataExecutionErrorCode = js.native
  @JSBracketAccess
  def apply(value: DataExecutionErrorCode): String = js.native
}

@js.native
sealed trait DataExecutionState extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionState")
object DataExecutionState extends js.Object {
  var DATA_EXECUTION_STATE_UNSUPPORTED: DataExecutionState = js.native
  var RUNNING: DataExecutionState = js.native
  var SUCCESS: DataExecutionState = js.native
  var ERROR: DataExecutionState = js.native
  var NOT_STARTED: DataExecutionState = js.native
  @JSBracketAccess
  def apply(value: DataExecutionState): String = js.native
}

@js.native
trait DataExecutionStatus extends js.Object {
  def getErrorCode(): DataExecutionErrorCode = js.native
  def getErrorMessage(): String = js.native
  def getExecutionState(): DataExecutionState = js.native
  def getLastRefreshedTime(): Date | Null = js.native
  def isTruncated(): Boolean = js.native
}

@js.native
trait DataSource extends js.Object {
  def getSpec(): DataSourceSpec = js.native
  def updateSpec(spec: DataSourceSpec): DataSource = js.native
}

@js.native
trait DataSourceParameter extends js.Object {
  def getName(): String = js.native
  def getSourceCell(): String | Null = js.native
  def getType(): DataSourceParameterType = js.native
}

@js.native
sealed trait DataSourceParameterType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceParameterType")
object DataSourceParameterType extends js.Object {
  var DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED: DataSourceParameterType = js.native
  var CELL: DataSourceParameterType = js.native
  @JSBracketAccess
  def apply(value: DataSourceParameterType): String = js.native
}

@js.native
trait DataSourceSpec extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpec = js.native
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getType(): DataSourceType = js.native
}

@js.native
trait DataSourceSpecBuilder extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpecBuilder = js.native
  def build(): DataSourceSpec = js.native
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getType(): DataSourceType = js.native
  def removeAllParameters(): DataSourceSpecBuilder = js.native
  def removeParameter(parameterName: String): DataSourceSpecBuilder = js.native
  def setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder = js.native
}

@js.native
trait DataSourceTable extends js.Object {
  def forceRefreshData(): DataSourceTable = js.native
  def getDataSource(): DataSource = js.native
  def getRange(): Range = js.native
  def getStatus(): DataExecutionStatus = js.native
  def refreshData(): DataSourceTable = js.native
  def waitForCompletion(timeoutInSeconds: Integer): DataExecutionStatus = js.native
}

@js.native
sealed trait DataSourceType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
object DataSourceType extends js.Object {
  var DATA_SOURCE_TYPE_UNSUPPORTED: DataSourceType = js.native
  var BIGQUERY: DataSourceType = js.native
  @JSBracketAccess
  def apply(value: DataSourceType): String = js.native
}

@js.native
trait DataValidation extends js.Object {
  def copy(): DataValidationBuilder = js.native
  def getAllowInvalid(): Boolean = js.native
  def getCriteriaType(): DataValidationCriteria = js.native
  def getCriteriaValues(): js.Array[js.Any] = js.native
  def getHelpText(): String = js.native
}

@js.native
trait DataValidationBuilder extends js.Object {
  def build(): DataValidation = js.native
  def copy(): DataValidationBuilder = js.native
  def getAllowInvalid(): Boolean = js.native
  def getCriteriaType(): DataValidationCriteria = js.native
  def getCriteriaValues(): js.Array[js.Any] = js.native
  def getHelpText(): String | Null = js.native
  def requireCheckbox(): DataValidationBuilder = js.native
  def requireCheckbox(checkedValue: js.Any): DataValidationBuilder = js.native
  def requireCheckbox(checkedValue: js.Any, uncheckedValue: js.Any): DataValidationBuilder = js.native
  def requireDate(): DataValidationBuilder = js.native
  def requireDateAfter(date: Date): DataValidationBuilder = js.native
  def requireDateBefore(date: Date): DataValidationBuilder = js.native
  def requireDateBetween(start: Date, end: Date): DataValidationBuilder = js.native
  def requireDateEqualTo(date: Date): DataValidationBuilder = js.native
  def requireDateNotBetween(start: Date, end: Date): DataValidationBuilder = js.native
  def requireDateOnOrAfter(date: Date): DataValidationBuilder = js.native
  def requireDateOnOrBefore(date: Date): DataValidationBuilder = js.native
  def requireFormulaSatisfied(formula: String): DataValidationBuilder = js.native
  def requireNumberBetween(start: Double, end: Double): DataValidationBuilder = js.native
  def requireNumberEqualTo(number: Double): DataValidationBuilder = js.native
  def requireNumberGreaterThan(number: Double): DataValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: Double): DataValidationBuilder = js.native
  def requireNumberLessThan(number: Double): DataValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: Double): DataValidationBuilder = js.native
  def requireNumberNotBetween(start: Double, end: Double): DataValidationBuilder = js.native
  def requireNumberNotEqualTo(number: Double): DataValidationBuilder = js.native
  def requireTextContains(text: String): DataValidationBuilder = js.native
  def requireTextDoesNotContain(text: String): DataValidationBuilder = js.native
  def requireTextEqualTo(text: String): DataValidationBuilder = js.native
  def requireTextIsEmail(): DataValidationBuilder = js.native
  def requireTextIsUrl(): DataValidationBuilder = js.native
  def requireValueInList(values: js.Array[String]): DataValidationBuilder = js.native
  def requireValueInList(values: js.Array[String], showDropdown: Boolean): DataValidationBuilder = js.native
  def requireValueInRange(range: Range): DataValidationBuilder = js.native
  def requireValueInRange(range: Range, showDropdown: Boolean): DataValidationBuilder = js.native
  def setAllowInvalid(allowInvalidData: Boolean): DataValidationBuilder = js.native
  def setHelpText(helpText: String): DataValidationBuilder = js.native
  def withCriteria(criteria: DataValidationCriteria, args: js.Array[js.Any]): DataValidationBuilder = js.native
}

@js.native
sealed trait DataValidationCriteria extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DataValidationCriteria")
object DataValidationCriteria extends js.Object {
  var DATE_AFTER: DataValidationCriteria = js.native
  var DATE_BEFORE: DataValidationCriteria = js.native
  var DATE_BETWEEN: DataValidationCriteria = js.native
  var DATE_EQUAL_TO: DataValidationCriteria = js.native
  var DATE_IS_VALID_DATE: DataValidationCriteria = js.native
  var DATE_NOT_BETWEEN: DataValidationCriteria = js.native
  var DATE_ON_OR_AFTER: DataValidationCriteria = js.native
  var DATE_ON_OR_BEFORE: DataValidationCriteria = js.native
  var NUMBER_BETWEEN: DataValidationCriteria = js.native
  var NUMBER_EQUAL_TO: DataValidationCriteria = js.native
  var NUMBER_GREATER_THAN: DataValidationCriteria = js.native
  var NUMBER_GREATER_THAN_OR_EQUAL_TO: DataValidationCriteria = js.native
  var NUMBER_LESS_THAN: DataValidationCriteria = js.native
  var NUMBER_LESS_THAN_OR_EQUAL_TO: DataValidationCriteria = js.native
  var NUMBER_NOT_BETWEEN: DataValidationCriteria = js.native
  var NUMBER_NOT_EQUAL_TO: DataValidationCriteria = js.native
  var TEXT_CONTAINS: DataValidationCriteria = js.native
  var TEXT_DOES_NOT_CONTAIN: DataValidationCriteria = js.native
  var TEXT_EQUAL_TO: DataValidationCriteria = js.native
  var TEXT_IS_VALID_EMAIL: DataValidationCriteria = js.native
  var TEXT_IS_VALID_URL: DataValidationCriteria = js.native
  var VALUE_IN_LIST: DataValidationCriteria = js.native
  var VALUE_IN_RANGE: DataValidationCriteria = js.native
  var CUSTOM_FORMULA: DataValidationCriteria = js.native
  var CHECKBOX: DataValidationCriteria = js.native
  @JSBracketAccess
  def apply(value: DataValidationCriteria): String = js.native
}

@js.native
trait DeveloperMetadata extends js.Object {
  def getId(): Integer = js.native
  def getKey(): String = js.native
  def getLocation(): DeveloperMetadataLocation = js.native
  def getValue(): String | Null = js.native
  def getVisibility(): DeveloperMetadataVisibility = js.native
  def moveToColumn(column: Range): DeveloperMetadata = js.native
  def moveToRow(row: Range): DeveloperMetadata = js.native
  def moveToSheet(sheet: Sheet): DeveloperMetadata = js.native
  def moveToSpreadsheet(): DeveloperMetadata = js.native
  def remove(): Unit = js.native
  def setKey(key: String): DeveloperMetadata = js.native
  def setValue(value: String): DeveloperMetadata = js.native
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata = js.native
}

@js.native
trait DeveloperMetadataFinder extends js.Object {
  def find(): js.Array[DeveloperMetadata] = js.native
  def onIntersectingLocations(): DeveloperMetadataFinder = js.native
  def withId(id: Integer): DeveloperMetadataFinder = js.native
  def withKey(key: String): DeveloperMetadataFinder = js.native
  def withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder = js.native
  def withValue(value: String): DeveloperMetadataFinder = js.native
  def withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder = js.native
}

@js.native
trait DeveloperMetadataLocation extends js.Object {
  def getColumn(): Range | Null = js.native
  def getLocationType(): DeveloperMetadataLocationType = js.native
  def getRow(): Range | Null = js.native
  def getSheet(): Sheet | Null = js.native
  def getSpreadsheet(): Spreadsheet | Null = js.native
}

@js.native
sealed trait DeveloperMetadataLocationType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
object DeveloperMetadataLocationType extends js.Object {
  var SPREADSHEET: DeveloperMetadataLocationType = js.native
  var SHEET: DeveloperMetadataLocationType = js.native
  var ROW: DeveloperMetadataLocationType = js.native
  var COLUMN: DeveloperMetadataLocationType = js.native
  @JSBracketAccess
  def apply(value: DeveloperMetadataLocationType): String = js.native
}

@js.native
sealed trait DeveloperMetadataVisibility extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility")
object DeveloperMetadataVisibility extends js.Object {
  var DOCUMENT: DeveloperMetadataVisibility = js.native
  var PROJECT: DeveloperMetadataVisibility = js.native
  @JSBracketAccess
  def apply(value: DeveloperMetadataVisibility): String = js.native
}

@js.native
sealed trait Dimension extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
object Dimension extends js.Object {
  var COLUMNS: Dimension = js.native
  var ROWS: Dimension = js.native
  @JSBracketAccess
  def apply(value: Dimension): String = js.native
}

@js.native
sealed trait Direction extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
object Direction extends js.Object {
  var UP: Direction = js.native
  var DOWN: Direction = js.native
  var PREVIOUS: Direction = js.native
  var NEXT: Direction = js.native
  @JSBracketAccess
  def apply(value: Direction): String = js.native
}

@js.native
trait EmbeddedAreaChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedAreaChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedAreaChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedAreaChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedAreaChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedAreaChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPointStyle(style: Charts.PointStyle): EmbeddedAreaChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedAreaChartBuilder = js.native
  def setStacked(): EmbeddedAreaChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedAreaChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedAreaChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedAreaChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedAreaChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedAreaChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedAreaChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedAreaChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedAreaChartBuilder = js.native
  def useLogScale(): EmbeddedAreaChartBuilder = js.native
}

@js.native
trait EmbeddedBarChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedBarChartBuilder = js.native
  def reverseDirection(): EmbeddedBarChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedBarChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedBarChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedBarChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedBarChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedBarChartBuilder = js.native
  def setStacked(): EmbeddedBarChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedBarChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedBarChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedBarChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedBarChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedBarChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedBarChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedBarChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedBarChartBuilder = js.native
  def useLogScale(): EmbeddedBarChartBuilder = js.native
}

@js.native
trait EmbeddedChart extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getChartId(): Integer | Null = js.native
  def getContainerInfo(): ContainerInfo = js.native
  def getHiddenDimensionStrategy(): Charts.ChartHiddenDimensionStrategy = js.native
  def getMergeStrategy(): Charts.ChartMergeStrategy = js.native
  def getNumHeaders(): Integer = js.native
  def getOptions(): Charts.ChartOptions = js.native
  def getRanges(): js.Array[Range] = js.native
  def getTransposeRowsAndColumns(): Boolean = js.native
  def modify(): EmbeddedChartBuilder = js.native
}

@js.native
trait EmbeddedChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
}

@js.native
trait EmbeddedColumnChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedColumnChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedColumnChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedColumnChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedColumnChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedColumnChartBuilder = js.native
  def setStacked(): EmbeddedColumnChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedColumnChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedColumnChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedColumnChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedColumnChartBuilder = js.native
  def useLogScale(): EmbeddedColumnChartBuilder = js.native
}

@js.native
trait EmbeddedComboChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedComboChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedComboChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedComboChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedComboChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedComboChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedComboChartBuilder = js.native
  def setStacked(): EmbeddedComboChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedComboChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedComboChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedComboChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedComboChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedComboChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedComboChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedComboChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedComboChartBuilder = js.native
  def useLogScale(): EmbeddedComboChartBuilder = js.native
}

@js.native
trait EmbeddedHistogramChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedHistogramChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedHistogramChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedHistogramChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedHistogramChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedHistogramChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedHistogramChartBuilder = js.native
  def setStacked(): EmbeddedHistogramChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedHistogramChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedHistogramChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedHistogramChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedHistogramChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedHistogramChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedHistogramChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedHistogramChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedHistogramChartBuilder = js.native
  def useLogScale(): EmbeddedHistogramChartBuilder = js.native
}

@js.native
trait EmbeddedLineChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedLineChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedLineChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedLineChartBuilder = js.native
  def setCurveStyle(style: Charts.CurveStyle): EmbeddedLineChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedLineChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPointStyle(style: Charts.PointStyle): EmbeddedLineChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedLineChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedLineChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedLineChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedLineChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def useLogScale(): EmbeddedLineChartBuilder = js.native
}

@js.native
trait EmbeddedPieChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedPieChartBuilder = js.native
  def set3D(): EmbeddedPieChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedPieChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedPieChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedPieChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedPieChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedPieChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedPieChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
}

@js.native
trait EmbeddedScatterChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedScatterChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedScatterChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Charts.Position): EmbeddedScatterChartBuilder = js.native
  def setLegendTextStyle(textStyle: Charts.TextStyle): EmbeddedScatterChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPointStyle(style: Charts.PointStyle): EmbeddedScatterChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedScatterChartBuilder = js.native
  def setTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedScatterChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisLogScale(): EmbeddedScatterChartBuilder = js.native
  def setXAxisRange(start: Double, end: Double): EmbeddedScatterChartBuilder = js.native
  def setXAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedScatterChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedScatterChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedScatterChartBuilder = js.native
  def setYAxisLogScale(): EmbeddedScatterChartBuilder = js.native
  def setYAxisRange(start: Double, end: Double): EmbeddedScatterChartBuilder = js.native
  def setYAxisTextStyle(textStyle: Charts.TextStyle): EmbeddedScatterChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedScatterChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: Charts.TextStyle): EmbeddedScatterChartBuilder = js.native
}

@js.native
trait EmbeddedTableChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def enablePaging(enablePaging: Boolean): EmbeddedTableChartBuilder = js.native
  def enablePaging(pageSize: Integer): EmbeddedTableChartBuilder = js.native
  def enablePaging(pageSize: Integer, startPage: Integer): EmbeddedTableChartBuilder = js.native
  def enableRtlTable(rtlEnabled: Boolean): EmbeddedTableChartBuilder = js.native
  def enableSorting(enableSorting: Boolean): EmbeddedTableChartBuilder = js.native
  def getChartType(): Charts.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def setChartType(`type`: Charts.ChartType): EmbeddedChartBuilder = js.native
  def setFirstRowNumber(number: Integer): EmbeddedTableChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: Charts.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setInitialSortingAscending(column: Integer): EmbeddedTableChartBuilder = js.native
  def setInitialSortingDescending(column: Integer): EmbeddedTableChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: Charts.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def showRowNumberColumn(showRowNumber: Boolean): EmbeddedTableChartBuilder = js.native
  def useAlternatingRowStyle(alternate: Boolean): EmbeddedTableChartBuilder = js.native
}

@js.native
trait Filter extends js.Object {
  def getColumnFilterCriteria(columnPosition: Integer): FilterCriteria | Null = js.native
  def getRange(): Range = js.native
  def remove(): Unit = js.native
  def removeColumnFilterCriteria(columnPosition: Integer): Filter = js.native
  def setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria | Null): Filter = js.native
  def sort(columnPosition: Integer, ascending: Boolean): Filter = js.native
}

@js.native
trait FilterCriteria extends js.Object {
  def copy(): FilterCriteriaBuilder = js.native
  def getCriteriaType(): BooleanCriteria = js.native
  def getCriteriaValues(): js.Array[js.Any] = js.native
  def getHiddenValues(): js.Array[String] = js.native
  def getVisibleValues(): js.Array[String] = js.native
}

@js.native
trait FilterCriteriaBuilder extends js.Object {
  def build(): FilterCriteria = js.native
  def copy(): FilterCriteriaBuilder = js.native
  def getCriteriaType(): BooleanCriteria = js.native
  def getCriteriaValues(): js.Array[js.Any] = js.native
  def getHiddenValues(): js.Array[String] = js.native
  def getVisibleValues(): js.Array[String] = js.native
  def setHiddenValues(values: js.Array[String]): FilterCriteriaBuilder = js.native
  def setVisibleValues(values: js.Array[String]): FilterCriteriaBuilder = js.native
  def whenCellEmpty(): FilterCriteriaBuilder = js.native
  def whenCellNotEmpty(): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: Date): FilterCriteriaBuilder = js.native
  def whenDateAfter(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: Date): FilterCriteriaBuilder = js.native
  def whenDateBefore(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: Date): FilterCriteriaBuilder = js.native
  def whenDateEqualTo(date: RelativeDate): FilterCriteriaBuilder = js.native
  def whenFormulaSatisfied(formula: String): FilterCriteriaBuilder = js.native
  def whenNumberBetween(start: Double, end: Double): FilterCriteriaBuilder = js.native
  def whenNumberEqualTo(number: Double): FilterCriteriaBuilder = js.native
  def whenNumberGreaterThan(number: Double): FilterCriteriaBuilder = js.native
  def whenNumberGreaterThanOrEqualTo(number: Double): FilterCriteriaBuilder = js.native
  def whenNumberLessThan(number: Double): FilterCriteriaBuilder = js.native
  def whenNumberLessThanOrEqualTo(number: Double): FilterCriteriaBuilder = js.native
  def whenNumberNotBetween(start: Double, end: Double): FilterCriteriaBuilder = js.native
  def whenNumberNotEqualTo(number: Double): FilterCriteriaBuilder = js.native
  def whenTextContains(text: String): FilterCriteriaBuilder = js.native
  def whenTextDoesNotContain(text: String): FilterCriteriaBuilder = js.native
  def whenTextEndsWith(text: String): FilterCriteriaBuilder = js.native
  def whenTextEqualTo(text: String): FilterCriteriaBuilder = js.native
  def whenTextStartsWith(text: String): FilterCriteriaBuilder = js.native
  def withCriteria(criteria: BooleanCriteria, args: js.Array[js.Any]): FilterCriteriaBuilder = js.native
}

@js.native
trait GradientCondition extends js.Object {
  def getMaxColor(): String = js.native
  def getMaxType(): InterpolationType | Null = js.native
  def getMaxValue(): String = js.native
  def getMidColor(): String = js.native
  def getMidType(): InterpolationType | Null = js.native
  def getMidValue(): String = js.native
  def getMinColor(): String = js.native
  def getMinType(): InterpolationType | Null = js.native
  def getMinValue(): String = js.native
}

@js.native
trait Group extends js.Object {
  def collapse(): Group = js.native
  def expand(): Group = js.native
  def getControlIndex(): Integer = js.native
  def getDepth(): Integer = js.native
  def getRange(): Range = js.native
  def isCollapsed(): Boolean = js.native
  def remove(): Unit = js.native
}

@js.native
sealed trait GroupControlTogglePosition extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
object GroupControlTogglePosition extends js.Object {
  var BEFORE: GroupControlTogglePosition = js.native
  var AFTER: GroupControlTogglePosition = js.native
  @JSBracketAccess
  def apply(value: GroupControlTogglePosition): String = js.native
}

@js.native
sealed trait InterpolationType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
object InterpolationType extends js.Object {
  var NUMBER: InterpolationType = js.native
  var PERCENT: InterpolationType = js.native
  var PERCENTILE: InterpolationType = js.native
  var MIN: InterpolationType = js.native
  var MAX: InterpolationType = js.native
  @JSBracketAccess
  def apply(value: InterpolationType): String = js.native
}

@js.native
trait NamedRange extends js.Object {
  def getName(): String = js.native
  def getRange(): Range = js.native
  def remove(): Unit = js.native
  def setName(name: String): NamedRange = js.native
  def setRange(range: Range): NamedRange = js.native
}

@js.native
trait OverGridImage extends js.Object {
  def assignScript(functionName: String): OverGridImage = js.native
  def getAltTextDescription(): String = js.native
  def getAltTextTitle(): String = js.native
  def getAnchorCell(): Range = js.native
  def getAnchorCellXOffset(): Integer = js.native
  def getAnchorCellYOffset(): Integer = js.native
  def getHeight(): Integer = js.native
  def getInherentHeight(): Integer = js.native
  def getInherentWidth(): Integer = js.native
  def getScript(): String = js.native
  def getSheet(): Sheet = js.native
  def getUrl(): String | Null = js.native
  def getWidth(): Integer = js.native
  def remove(): Unit = js.native
  def replace(blob: BlobSource): OverGridImage = js.native
  def replace(url: String): OverGridImage = js.native
  def resetSize(): OverGridImage = js.native
  def setAltTextDescription(description: String): OverGridImage = js.native
  def setAltTextTitle(title: String): OverGridImage = js.native
  def setAnchorCell(cell: Range): OverGridImage = js.native
  def setAnchorCellXOffset(offset: Integer): OverGridImage = js.native
  def setAnchorCellYOffset(offset: Integer): OverGridImage = js.native
  def setHeight(height: Integer): OverGridImage = js.native
  def setWidth(width: Integer): OverGridImage = js.native
}

@js.native
trait PageProtection extends js.Object {
  def addUser(email: String): Unit = js.native
  def getUsers(): js.Array[String] = js.native
  def isProtected(): Boolean = js.native
  def removeUser(user: String): Unit = js.native
  def setProtected(protection: Boolean): Unit = js.native
}

@js.native
trait PivotFilter extends js.Object {
  def getFilterCriteria(): FilterCriteria = js.native
  def getPivotTable(): PivotTable = js.native
  def getSourceDataColumn(): Integer = js.native
  def remove(): Unit = js.native
  def setFilterCriteria(filterCriteria: FilterCriteria): PivotFilter = js.native
}

@js.native
trait PivotGroup extends js.Object {
  def addManualGroupingRule(groupName: String, groupMembers: js.Array[js.Any]): PivotGroup = js.native
  def areLabelsRepeated(): Boolean = js.native
  def clearGroupingRule(): PivotGroup = js.native
  def clearSort(): PivotGroup = js.native
  def getDimension(): Dimension = js.native
  def getIndex(): Integer = js.native
  def getPivotTable(): PivotTable = js.native
  def getSourceDataColumn(): Integer = js.native
  def hideRepeatedLabels(): PivotGroup = js.native
  def isSortAscending(): Boolean = js.native
  def moveToIndex(index: Integer): PivotGroup = js.native
  def remove(): Unit = js.native
  def removeManualGroupingRule(groupName: String): PivotGroup = js.native
  def resetDisplayName(): PivotGroup = js.native
  def setDisplayName(name: String): PivotGroup = js.native
  def setHistogramGroupingRule(minValue: Integer, maxValue: Integer, intervalSize: Integer): PivotGroup = js.native
  def showRepeatedLabels(): PivotGroup = js.native
  def showTotals(showTotals: Boolean): PivotGroup = js.native
  def sortAscending(): PivotGroup = js.native
  def sortBy(value: PivotValue, oppositeGroupValues: js.Array[js.Any]): PivotGroup = js.native
  def sortDescending(): PivotGroup = js.native
  def totalsAreShown(): Boolean = js.native
}

@js.native
trait PivotTable extends js.Object {
  def addCalculatedPivotValue(name: String, formula: String): PivotValue = js.native
  def addColumnGroup(sourceDataColumn: Integer): PivotGroup = js.native
  def addFilter(sourceDataColumn: Integer, filterCriteria: FilterCriteria): PivotFilter = js.native
  def addPivotValue(sourceDataColumn: Integer, summarizeFunction: PivotTableSummarizeFunction): PivotValue = js.native
  def addRowGroup(sourceDataColumn: Integer): PivotGroup = js.native
  def getAnchorCell(): Range = js.native
  def getColumnGroups(): js.Array[PivotGroup] = js.native
  def getFilters(): js.Array[PivotFilter] = js.native
  def getPivotValues(): js.Array[PivotValue] = js.native
  def getRowGroups(): js.Array[PivotGroup] = js.native
  def getValuesDisplayOrientation(): Dimension = js.native
  def remove(): Unit = js.native
  def setValuesDisplayOrientation(dimension: Dimension): PivotTable = js.native
}

@js.native
sealed trait PivotTableSummarizeFunction extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction")
object PivotTableSummarizeFunction extends js.Object {
  var CUSTOM: PivotTableSummarizeFunction = js.native
  var SUM: PivotTableSummarizeFunction = js.native
  var COUNTA: PivotTableSummarizeFunction = js.native
  var COUNT: PivotTableSummarizeFunction = js.native
  var COUNTUNIQUE: PivotTableSummarizeFunction = js.native
  var AVERAGE: PivotTableSummarizeFunction = js.native
  var MAX: PivotTableSummarizeFunction = js.native
  var MIN: PivotTableSummarizeFunction = js.native
  var MEDIAN: PivotTableSummarizeFunction = js.native
  var PRODUCT: PivotTableSummarizeFunction = js.native
  var STDEV: PivotTableSummarizeFunction = js.native
  var STDEVP: PivotTableSummarizeFunction = js.native
  var VAR: PivotTableSummarizeFunction = js.native
  var VARP: PivotTableSummarizeFunction = js.native
  @JSBracketAccess
  def apply(value: PivotTableSummarizeFunction): String = js.native
}

@js.native
trait PivotValue extends js.Object {
  def getDisplayType(): PivotValueDisplayType = js.native
  def getFormula(): String | Null = js.native
  def getPivotTable(): PivotTable = js.native
  def getSummarizedBy(): PivotTableSummarizeFunction = js.native
  def setDisplayName(name: String): PivotValue = js.native
  def setFormula(formula: String): PivotValue = js.native
  def showAs(displayType: PivotValueDisplayType): PivotValue = js.native
  def summarizeBy(summarizeFunction: PivotTableSummarizeFunction): PivotValue = js.native
}

@js.native
sealed trait PivotValueDisplayType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
object PivotValueDisplayType extends js.Object {
  var DEFAULT: PivotValueDisplayType = js.native
  var PERCENT_OF_ROW_TOTAL: PivotValueDisplayType = js.native
  var PERCENT_OF_COLUMN_TOTAL: PivotValueDisplayType = js.native
  var PERCENT_OF_GRAND_TOTAL: PivotValueDisplayType = js.native
  @JSBracketAccess
  def apply(value: PivotValueDisplayType): String = js.native
}

@js.native
trait Protection extends js.Object {
  def addEditor(emailAddress: String): Protection = js.native
  def addEditor(user: User): Protection = js.native
  def addEditors(emailAddresses: js.Array[String]): Protection = js.native
  def canDomainEdit(): Boolean = js.native
  def canEdit(): Boolean = js.native
  def getDescription(): String = js.native
  def getEditors(): js.Array[User] = js.native
  def getProtectionType(): ProtectionType = js.native
  def getRange(): Range = js.native
  def getRangeName(): String | Null = js.native
  def getUnprotectedRanges(): js.Array[Range] = js.native
  def isWarningOnly(): Boolean = js.native
  def remove(): Unit = js.native
  def removeEditor(emailAddress: String): Protection = js.native
  def removeEditor(user: User): Protection = js.native
  def removeEditors(emailAddresses: js.Array[String]): Protection = js.native
  def removeEditors(users: js.Array[User]): Protection = js.native
  def setDescription(description: String): Protection = js.native
  def setDomainEdit(editable: Boolean): Protection = js.native
  def setNamedRange(namedRange: NamedRange): Protection = js.native
  def setRange(range: Range): Protection = js.native
  def setRangeName(rangeName: String): Protection = js.native
  def setUnprotectedRanges(ranges: js.Array[Range]): Protection = js.native
  def setWarningOnly(warningOnly: Boolean): Protection = js.native
}

@js.native
sealed trait ProtectionType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.ProtectionType")
object ProtectionType extends js.Object {
  var RANGE: ProtectionType = js.native
  var SHEET: ProtectionType = js.native
  @JSBracketAccess
  def apply(value: ProtectionType): String = js.native
}

@js.native
trait Range extends js.Object {
  def activate(): Range = js.native
  def activateAsCurrentCell(): Range = js.native
  def addDeveloperMetadata(key: String): Range = js.native
  def addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Range = js.native
  def addDeveloperMetadata(key: String, value: String): Range = js.native
  def addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Range = js.native
  def applyColumnBanding(): Banding = js.native
  def applyColumnBanding(bandingTheme: BandingTheme): Banding = js.native
  def applyColumnBanding(bandingTheme: BandingTheme, showHeader: Boolean, showFooter: Boolean): Banding = js.native
  def applyRowBanding(): Banding = js.native
  def applyRowBanding(bandingTheme: BandingTheme): Banding = js.native
  def applyRowBanding(bandingTheme: BandingTheme, showHeader: Boolean, showFooter: Boolean): Banding = js.native
  def autoFill(destination: Range, series: AutoFillSeries): Unit = js.native
  def autoFillToNeighbor(series: AutoFillSeries): Unit = js.native
  def breakApart(): Range = js.native
  def canEdit(): Boolean = js.native
  def check(): Range = js.native
  def clear(): Range = js.native
  def clear(options: js.Any): Range = js.native
  def clearContent(): Range = js.native
  def clearDataValidations(): Range = js.native
  def clearFormat(): Range = js.native
  def clearNote(): Range = js.native
  def collapseGroups(): Range = js.native
  def copyFormatToRange(gridId: Integer, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  def copyFormatToRange(sheet: Sheet, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  def copyTo(destination: Range): Unit = js.native
  def copyTo(destination: Range, copyPasteType: CopyPasteType, transposed: Boolean): Unit = js.native
  def copyTo(destination: Range, options: js.Any): Unit = js.native
  def copyValuesToRange(gridId: Integer, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  def copyValuesToRange(sheet: Sheet, column: Integer, columnEnd: Integer, row: Integer, rowEnd: Integer): Unit = js.native
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  def createFilter(): Filter = js.native
  def createPivotTable(sourceData: Range): PivotTable = js.native
  def createTextFinder(findText: String): TextFinder = js.native
  def deleteCells(shiftDimension: Dimension): Unit = js.native
  def expandGroups(): Range = js.native
  def getA1Notation(): String = js.native
  def getBackground(): String = js.native
  def getBackgrounds(): js.Array[js.Array[String]] = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getCell(row: Integer, column: Integer): Range = js.native
  def getColumn(): Integer = js.native
  def getDataRegion(): Range = js.native
  def getDataRegion(dimension: Dimension): Range = js.native
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  def getDataSourceUrl(): String = js.native
  def getDataTable(): Charts.DataTable = js.native
  def getDataTable(firstRowIsHeader: Boolean): Charts.DataTable = js.native
  def getDataValidation(): DataValidation | Null = js.native
  def getDataValidations(): js.Array[js.Array[DataValidation | Null]] = js.native
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  def getDisplayValue(): String = js.native
  def getDisplayValues(): js.Array[js.Array[String]] = js.native
  def getFilter(): Filter | Null = js.native
  def getFontColor(): String = js.native
  def getFontColors(): js.Array[js.Array[String]] = js.native
  def getFontFamilies(): js.Array[js.Array[String]] = js.native
  def getFontFamily(): String = js.native
  def getFontLine(): FontLine = js.native
  def getFontLines(): js.Array[js.Array[FontLine]] = js.native
  def getFontSize(): Integer = js.native
  def getFontSizes(): js.Array[js.Array[Integer]] = js.native
  def getFontStyle(): FontStyle = js.native
  def getFontStyles(): js.Array[js.Array[FontStyle]] = js.native
  def getFontWeight(): FontWeight = js.native
  def getFontWeights(): js.Array[js.Array[FontWeight]] = js.native
  def getFormula(): String = js.native
  def getFormulaR1C1(): String | Null = js.native
  def getFormulas(): js.Array[js.Array[String]] = js.native
  def getFormulasR1C1(): js.Array[js.Array[String | Null]] = js.native
  def getGridId(): Integer = js.native
  def getHeight(): Integer = js.native
  def getHorizontalAlignment(): String = js.native
  def getHorizontalAlignments(): js.Array[js.Array[String]] = js.native
  def getLastColumn(): Integer = js.native
  def getLastRow(): Integer = js.native
  def getMergedRanges(): js.Array[Range] = js.native
  def getNextDataCell(direction: Direction): Range = js.native
  def getNote(): String = js.native
  def getNotes(): js.Array[js.Array[String]] = js.native
  def getNumColumns(): Integer = js.native
  def getNumRows(): Integer = js.native
  def getNumberFormat(): String = js.native
  def getNumberFormats(): js.Array[js.Array[String]] = js.native
  def getRichTextValue(): RichTextValue | Null = js.native
  def getRichTextValues(): js.Array[js.Array[RichTextValue | Null]] = js.native
  def getRow(): Integer = js.native
  def getRowIndex(): Integer = js.native
  def getSheet(): Sheet = js.native
  def getTextDirection(): TextDirection | Null = js.native
  def getTextDirections(): js.Array[js.Array[TextDirection | Null]] = js.native
  def getTextRotation(): TextRotation = js.native
  def getTextRotations(): js.Array[js.Array[TextRotation]] = js.native
  def getTextStyle(): TextStyle = js.native
  def getTextStyles(): js.Array[js.Array[TextStyle]] = js.native
  def getValue(): js.Dynamic = js.native
  def getValues(): js.Array[js.Array[js.Any]] = js.native
  def getVerticalAlignment(): String = js.native
  def getVerticalAlignments(): js.Array[js.Array[String]] = js.native
  def getWidth(): Integer = js.native
  def getWrap(): Boolean = js.native
  def getWrapStrategies(): js.Array[js.Array[WrapStrategy]] = js.native
  def getWrapStrategy(): WrapStrategy = js.native
  def getWraps(): js.Array[js.Array[Boolean]] = js.native
  def insertCells(shiftDimension: Dimension): Range = js.native
  def insertCheckboxes(): Range = js.native
  def insertCheckboxes(checkedValue: js.Any): Range = js.native
  def insertCheckboxes(checkedValue: js.Any, uncheckedValue: js.Any): Range = js.native
  def isBlank(): Boolean = js.native
  def isChecked(): Boolean | Null = js.native
  def isEndColumnBounded(): Boolean = js.native
  def isEndRowBounded(): Boolean = js.native
  def isPartOfMerge(): Boolean = js.native
  def isStartColumnBounded(): Boolean = js.native
  def isStartRowBounded(): Boolean = js.native
  def merge(): Range = js.native
  def mergeAcross(): Range = js.native
  def mergeVertically(): Range = js.native
  def moveTo(target: Range): Unit = js.native
  def offset(rowOffset: Integer, columnOffset: Integer): Range = js.native
  def offset(rowOffset: Integer, columnOffset: Integer, numRows: Integer): Range = js.native
  def offset(rowOffset: Integer, columnOffset: Integer, numRows: Integer, numColumns: Integer): Range = js.native
  def protect(): Protection = js.native
  def randomize(): Range = js.native
  def removeCheckboxes(): Range = js.native
  def removeDuplicates(): Range = js.native
  def removeDuplicates(columnsToCompare: js.Array[Integer]): Range = js.native
  def setBackground(color: String | Null): Range = js.native
  def setBackgroundRGB(red: Integer, green: Integer, blue: Integer): Range = js.native
  def setBackgrounds(color: js.Array[js.Array[String | Null]]): Range = js.native
  def setBorder(top: Boolean | Null, left: Boolean | Null, bottom: Boolean | Null, right: Boolean | Null, vertical: Boolean | Null, horizontal: Boolean | Null): Range = js.native
  def setBorder(top: Boolean | Null, left: Boolean | Null, bottom: Boolean | Null, right: Boolean | Null, vertical: Boolean | Null, horizontal: Boolean | Null, color: String | Null, style: BorderStyle | Null): Range = js.native
  def setDataValidation(rule: DataValidation | Null): Range = js.native
  def setDataValidations(rules: js.Array[js.Array[DataValidation | Null]]): Range = js.native
  def setFontColor(color: String | Null): Range = js.native
  def setFontColors(colors: js.Array[js.Array[js.Any]]): Range = js.native
  def setFontFamilies(fontFamilies: js.Array[js.Array[String | Null]]): Range = js.native
  def setFontFamily(fontFamily: String | Null): Range = js.native
  def setFontLine(fontLine: FontLine | Null): Range = js.native
  def setFontLines(fontLines: js.Array[js.Array[FontLine | Null]]): Range = js.native
  def setFontSize(size: Integer): Range = js.native
  def setFontSizes(sizes: js.Array[js.Array[Integer]]): Range = js.native
  def setFontStyle(fontStyle: FontStyle | Null): Range = js.native
  def setFontStyles(fontStyles: js.Array[js.Array[FontStyle | Null]]): Range = js.native
  def setFontWeight(fontWeight: FontWeight | Null): Range = js.native
  def setFontWeights(fontWeights: js.Array[js.Array[FontWeight | Null]]): Range = js.native
  def setFormula(formula: String): Range = js.native
  def setFormulaR1C1(formula: String): Range = js.native
  def setFormulas(formulas: js.Array[js.Array[String]]): Range = js.native
  def setFormulasR1C1(formulas: js.Array[js.Array[String]]): Range = js.native
  def setHorizontalAlignment(alignment: String | Null): Range = js.native
  def setHorizontalAlignments(alignments: js.Array[js.Array[String | Null]]): Range = js.native
  def setNote(note: String | Null): Range = js.native
  def setNotes(notes: js.Array[js.Array[String | Null]]): Range = js.native
  def setNumberFormat(numberFormat: String): Range = js.native
  def setNumberFormats(numberFormats: js.Array[js.Array[String]]): Range = js.native
  def setRichTextValue(value: RichTextValue): Range = js.native
  def setRichTextValues(values: js.Array[js.Array[RichTextValue]]): Range = js.native
  def setShowHyperlink(showHyperlink: Boolean): Range = js.native
  def setTextDirection(direction: TextDirection | Null): Range = js.native
  def setTextDirections(directions: js.Array[js.Array[TextDirection | Null]]): Range = js.native
  def setTextRotation(degrees: Integer): Range = js.native
  def setTextRotation(rotation: TextRotation): Range = js.native
  def setTextRotations(rotations: js.Array[js.Array[TextRotation]]): Range = js.native
  def setTextStyle(style: TextStyle): Range = js.native
  def setTextStyles(styles: js.Array[js.Array[TextStyle]]): Range = js.native
  def setValue(value: js.Any): Range = js.native
  def setValues(values: js.Array[js.Array[js.Any]]): Range = js.native
  def setVerticalAlignment(alignment: String | Null): Range = js.native
  def setVerticalAlignments(alignments: js.Array[js.Array[String | Null]]): Range = js.native
  def setVerticalText(isVertical: Boolean): Range = js.native
  def setWrap(isWrapEnabled: Boolean): Range = js.native
  def setWrapStrategies(strategies: js.Array[js.Array[WrapStrategy]]): Range = js.native
  def setWrapStrategy(strategy: WrapStrategy): Range = js.native
  def setWraps(isWrapEnabled: js.Array[js.Array[Boolean]]): Range = js.native
  def shiftColumnGroupDepth(delta: Integer): Range = js.native
  def shiftRowGroupDepth(delta: Integer): Range = js.native
  def sort(sortSpecObj: js.Any): Range = js.native
  def splitTextToColumns(): Unit = js.native
  def splitTextToColumns(delimiter: String): Unit = js.native
  def splitTextToColumns(delimiter: TextToColumnsDelimiter): Unit = js.native
  def trimWhitespace(): Range = js.native
  def uncheck(): Range = js.native
}

@js.native
trait RangeList extends js.Object {
  def activate(): RangeList = js.native
  def breakApart(): RangeList = js.native
  def check(): RangeList = js.native
  def clear(): RangeList = js.native
  def clear(options: js.Any): RangeList = js.native
  def clearContent(): RangeList = js.native
  def clearDataValidations(): RangeList = js.native
  def clearFormat(): RangeList = js.native
  def clearNote(): RangeList = js.native
  def getRanges(): js.Array[Range] = js.native
  def insertCheckboxes(): RangeList = js.native
  def insertCheckboxes(checkedValue: js.Any): RangeList = js.native
  def insertCheckboxes(checkedValue: js.Any, uncheckedValue: js.Any): RangeList = js.native
  def removeCheckboxes(): RangeList = js.native
  def setBackground(color: String | Null): RangeList = js.native
  def setBackgroundRGB(red: Integer, green: Integer, blue: Integer): RangeList = js.native
  def setBorder(top: Boolean | Null, left: Boolean | Null, bottom: Boolean | Null, right: Boolean | Null, vertical: Boolean | Null, horizontal: Boolean | Null): RangeList = js.native
  def setBorder(top: Boolean | Null, left: Boolean | Null, bottom: Boolean | Null, right: Boolean | Null, vertical: Boolean | Null, horizontal: Boolean | Null, color: String | Null, style: BorderStyle | Null): RangeList = js.native
  def setFontColor(color: String | Null): RangeList = js.native
  def setFontFamily(fontFamily: String | Null): RangeList = js.native
  def setFontLine(fontLine: FontLine | Null): RangeList = js.native
  def setFontSize(size: Integer): RangeList = js.native
  def setFontStyle(fontStyle: FontStyle | Null): RangeList = js.native
  def setFontWeight(fontWeight: FontWeight | Null): RangeList = js.native
  def setFormula(formula: String): RangeList = js.native
  def setFormulaR1C1(formula: String): RangeList = js.native
  def setHorizontalAlignment(alignment: String | Null): RangeList = js.native
  def setNote(note: String | Null): RangeList = js.native
  def setNumberFormat(numberFormat: String): RangeList = js.native
  def setShowHyperlink(showHyperlink: Boolean): RangeList = js.native
  def setTextDirection(direction: TextDirection | Null): RangeList = js.native
  def setTextRotation(degrees: Integer): RangeList = js.native
  def setValue(value: js.Any): RangeList = js.native
  def setVerticalAlignment(alignment: String | Null): RangeList = js.native
  def setVerticalText(isVertical: Boolean): RangeList = js.native
  def setWrap(isWrapEnabled: Boolean): RangeList = js.native
  def setWrapStrategy(strategy: WrapStrategy): RangeList = js.native
  def trimWhitespace(): RangeList = js.native
  def uncheck(): RangeList = js.native
}

@js.native
sealed trait RecalculationInterval extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
object RecalculationInterval extends js.Object {
  var ON_CHANGE: RecalculationInterval = js.native
  var MINUTE: RecalculationInterval = js.native
  var HOUR: RecalculationInterval = js.native
  @JSBracketAccess
  def apply(value: RecalculationInterval): String = js.native
}

@js.native
sealed trait RelativeDate extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.RelativeDate")
object RelativeDate extends js.Object {
  var TODAY: RelativeDate = js.native
  var TOMORROW: RelativeDate = js.native
  var YESTERDAY: RelativeDate = js.native
  var PAST_WEEK: RelativeDate = js.native
  var PAST_MONTH: RelativeDate = js.native
  var PAST_YEAR: RelativeDate = js.native
  @JSBracketAccess
  def apply(value: RelativeDate): String = js.native
}

@js.native
trait RichTextValue extends js.Object {
  def copy(): RichTextValueBuilder = js.native
  def getEndIndex(): Integer = js.native
  def getRuns(): js.Array[RichTextValue] = js.native
  def getStartIndex(): Integer = js.native
  def getText(): String = js.native
  def getTextStyle(): TextStyle = js.native
  def getTextStyle(startOffset: Integer, endOffset: Integer): TextStyle = js.native
}

@js.native
trait RichTextValueBuilder extends js.Object {
  def build(): RichTextValue = js.native
  def setText(text: String): RichTextValueBuilder = js.native
  def setTextStyle(startOffset: Integer, endOffset: Integer, textStyle: TextStyle | Null): RichTextValueBuilder = js.native
  def setTextStyle(textStyle: TextStyle | Null): RichTextValueBuilder = js.native
}

@js.native
trait Selection extends js.Object {
  def getActiveRange(): Range | Null = js.native
  def getActiveRangeList(): RangeList | Null = js.native
  def getActiveSheet(): Sheet = js.native
  def getCurrentCell(): Range | Null = js.native
  def getNextDataRange(direction: Direction): Range | Null = js.native
}

@js.native
trait Sheet extends js.Object {
  def activate(): Sheet = js.native
  def addDeveloperMetadata(key: String): Sheet = js.native
  def addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Sheet = js.native
  def addDeveloperMetadata(key: String, value: String): Sheet = js.native
  def addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Sheet = js.native
  def appendRow(rowContents: js.Array[js.Any]): Sheet = js.native
  def autoResizeColumn(columnPosition: Integer): Sheet = js.native
  def autoResizeColumns(startColumn: Integer, numColumns: Integer): Sheet = js.native
  def autoResizeRows(startRow: Integer, numRows: Integer): Sheet = js.native
  def clear(): Sheet = js.native
  def clear(options: js.Any): Sheet = js.native
  def clearConditionalFormatRules(): Unit = js.native
  def clearContents(): Sheet = js.native
  def clearFormats(): Sheet = js.native
  def clearNotes(): Sheet = js.native
  def collapseAllColumnGroups(): Sheet = js.native
  def collapseAllRowGroups(): Sheet = js.native
  def copyTo(spreadsheet: Spreadsheet): Sheet = js.native
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  def createTextFinder(findText: String): TextFinder = js.native
  def deleteColumn(columnPosition: Integer): Sheet = js.native
  def deleteColumns(columnPosition: Integer, howMany: Integer): Unit = js.native
  def deleteRow(rowPosition: Integer): Sheet = js.native
  def deleteRows(rowPosition: Integer, howMany: Integer): Unit = js.native
  def expandAllColumnGroups(): Sheet = js.native
  def expandAllRowGroups(): Sheet = js.native
  def expandColumnGroupsUpToDepth(groupDepth: Integer): Sheet = js.native
  def expandRowGroupsUpToDepth(groupDepth: Integer): Sheet = js.native
  def getActiveCell(): Range = js.native
  def getActiveRange(): Range | Null = js.native
  def getActiveRangeList(): RangeList | Null = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getCharts(): js.Array[EmbeddedChart] = js.native
  def getColumnGroup(columnIndex: Integer, groupDepth: Integer): Group | Null = js.native
  def getColumnGroupControlPosition(): GroupControlTogglePosition = js.native
  def getColumnGroupDepth(columnIndex: Integer): Integer = js.native
  def getColumnWidth(columnPosition: Integer): Integer = js.native
  def getConditionalFormatRules(): js.Array[ConditionalFormatRule] = js.native
  def getCurrentCell(): Range | Null = js.native
  def getDataRange(): Range = js.native
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  def getFilter(): Filter | Null = js.native
  def getFormUrl(): String | Null = js.native
  def getFrozenColumns(): Integer = js.native
  def getFrozenRows(): Integer = js.native
  def getImages(): js.Array[OverGridImage] = js.native
  def getIndex(): Integer = js.native
  def getLastColumn(): Integer = js.native
  def getLastRow(): Integer = js.native
  def getMaxColumns(): Integer = js.native
  def getMaxRows(): Integer = js.native
  def getName(): String = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getParent(): Spreadsheet = js.native
  def getPivotTables(): js.Array[PivotTable] = js.native
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  def getRange(row: Integer, column: Integer): Range = js.native
  def getRange(row: Integer, column: Integer, numRows: Integer): Range = js.native
  def getRange(row: Integer, column: Integer, numRows: Integer, numColumns: Integer): Range = js.native
  def getRange(a1Notation: String): Range = js.native
  def getRangeList(a1Notations: js.Array[String]): RangeList = js.native
  def getRowGroup(rowIndex: Integer, groupDepth: Integer): Group | Null = js.native
  def getRowGroupControlPosition(): GroupControlTogglePosition = js.native
  def getRowGroupDepth(rowIndex: Integer): Integer = js.native
  def getRowHeight(rowPosition: Integer): Integer = js.native
  def getSelection(): Selection = js.native
  def getSheetId(): Integer = js.native
  def getSheetName(): String = js.native
  def getSheetValues(startRow: Integer, startColumn: Integer, numRows: Integer, numColumns: Integer): js.Array[js.Array[js.Any]] = js.native
  def getSlicers(): js.Array[Slicer] = js.native
  def getTabColor(): String | Null = js.native
  def getType(): SheetType = js.native
  def hasHiddenGridlines(): Boolean = js.native
  def hideColumn(column: Range): Unit = js.native
  def hideColumns(columnIndex: Integer): Unit = js.native
  def hideColumns(columnIndex: Integer, numColumns: Integer): Unit = js.native
  def hideRow(row: Range): Unit = js.native
  def hideRows(rowIndex: Integer): Unit = js.native
  def hideRows(rowIndex: Integer, numRows: Integer): Unit = js.native
  def hideSheet(): Sheet = js.native
  def insertChart(chart: EmbeddedChart): Unit = js.native
  def insertColumnAfter(afterPosition: Integer): Sheet = js.native
  def insertColumnBefore(beforePosition: Integer): Sheet = js.native
  def insertColumns(columnIndex: Integer): Unit = js.native
  def insertColumns(columnIndex: Integer, numColumns: Integer): Unit = js.native
  def insertColumnsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  def insertColumnsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertRowAfter(afterPosition: Integer): Sheet = js.native
  def insertRowBefore(beforePosition: Integer): Sheet = js.native
  def insertRows(rowIndex: Integer): Unit = js.native
  def insertRows(rowIndex: Integer, numRows: Integer): Unit = js.native
  def insertRowsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  def insertRowsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  def insertSlicer(range: Range, anchorRowPos: Integer, anchorColPos: Integer): Slicer = js.native
  def insertSlicer(range: Range, anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer = js.native
  def isColumnHiddenByUser(columnPosition: Integer): Boolean = js.native
  def isRightToLeft(): Boolean = js.native
  def isRowHiddenByFilter(rowPosition: Integer): Boolean = js.native
  def isRowHiddenByUser(rowPosition: Integer): Boolean = js.native
  def isSheetHidden(): Boolean = js.native
  def moveColumns(columnSpec: Range, destinationIndex: Integer): Unit = js.native
  def moveRows(rowSpec: Range, destinationIndex: Integer): Unit = js.native
  def newChart(): EmbeddedChartBuilder = js.native
  def protect(): Protection = js.native
  def removeChart(chart: EmbeddedChart): Unit = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSelection(range: Range): Range = js.native
  def setActiveSelection(a1Notation: String): Range = js.native
  def setColumnGroupControlPosition(position: GroupControlTogglePosition): Sheet = js.native
  def setColumnWidth(columnPosition: Integer, width: Integer): Sheet = js.native
  def setColumnWidths(startColumn: Integer, numColumns: Integer, width: Integer): Sheet = js.native
  def setConditionalFormatRules(rules: js.Array[ConditionalFormatRule]): Unit = js.native
  def setCurrentCell(cell: Range): Range = js.native
  def setFrozenColumns(columns: Integer): Unit = js.native
  def setFrozenRows(rows: Integer): Unit = js.native
  def setHiddenGridlines(hideGridlines: Boolean): Sheet = js.native
  def setName(name: String): Sheet = js.native
  def setRightToLeft(rightToLeft: Boolean): Sheet = js.native
  def setRowGroupControlPosition(position: GroupControlTogglePosition): Sheet = js.native
  def setRowHeight(rowPosition: Integer, height: Integer): Sheet = js.native
  def setRowHeights(startRow: Integer, numRows: Integer, height: Integer): Sheet = js.native
  def setTabColor(color: String | Null): Sheet = js.native
  def showColumns(columnIndex: Integer): Unit = js.native
  def showColumns(columnIndex: Integer, numColumns: Integer): Unit = js.native
  def showRows(rowIndex: Integer): Unit = js.native
  def showRows(rowIndex: Integer, numRows: Integer): Unit = js.native
  def showSheet(): Sheet = js.native
  def sort(columnPosition: Integer): Sheet = js.native
  def sort(columnPosition: Integer, ascending: Boolean): Sheet = js.native
  def unhideColumn(column: Range): Unit = js.native
  def unhideRow(row: Range): Unit = js.native
  def updateChart(chart: EmbeddedChart): Unit = js.native
  def getSheetProtection(): PageProtection = js.native
  def setSheetProtection(permissions: PageProtection): Unit = js.native
}

@js.native
sealed trait SheetType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
object SheetType extends js.Object {
  var GRID: SheetType = js.native
  var OBJECT: SheetType = js.native
  @JSBracketAccess
  def apply(value: SheetType): String = js.native
}

@js.native
trait Slicer extends js.Object {
  def getBackgroundColor(): String | Null = js.native
  def getColumnPosition(): Integer | Null = js.native
  def getContainerInfo(): ContainerInfo = js.native
  def getFilterCriteria(): FilterCriteria | Null = js.native
  def getRange(): Range = js.native
  def getTitle(): String = js.native
  def getTitleHorizontalAlignment(): String = js.native
  def getTitleTextStyle(): TextStyle = js.native
  def isAppliedToPivotTables(): Boolean = js.native
  def remove(): Unit = js.native
  def setApplyToPivotTables(applyToPivotTables: Boolean): Slicer = js.native
  def setBackgroundColor(color: String | Null): Slicer = js.native
  def setColumnFilterCriteria(columnPosition: Integer, filterCriteria: FilterCriteria | Null): Slicer = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Slicer = js.native
  def setRange(rangeApi: Range): Slicer = js.native
  def setTitle(title: String): Slicer = js.native
  def setTitleHorizontalAlignment(horizontalAlignment: String | Null): Slicer = js.native
  def setTitleTextStyle(textStyle: TextStyle): Slicer = js.native
}

@js.native
trait Spreadsheet extends js.Object {
  def addDeveloperMetadata(key: String): Spreadsheet = js.native
  def addDeveloperMetadata(key: String, visibility: DeveloperMetadataVisibility): Spreadsheet = js.native
  def addDeveloperMetadata(key: String, value: String): Spreadsheet = js.native
  def addDeveloperMetadata(key: String, value: String, visibility: DeveloperMetadataVisibility): Spreadsheet = js.native
  def addEditor(emailAddress: String): Spreadsheet = js.native
  def addEditor(user: User): Spreadsheet = js.native
  def addEditors(emailAddresses: js.Array[String]): Spreadsheet = js.native
  def addMenu(name: String, subMenus: js.Array[js.Any | Null]): Unit = js.native
  def addViewer(emailAddress: String): Spreadsheet = js.native
  def addViewer(user: User): Spreadsheet = js.native
  def addViewers(emailAddresses: js.Array[String]): Spreadsheet = js.native
  def appendRow(rowContents: js.Array[js.Any]): Sheet = js.native
  def autoResizeColumn(columnPosition: Integer): Sheet = js.native
  def copy(name: String): Spreadsheet = js.native
  def createDeveloperMetadataFinder(): DeveloperMetadataFinder = js.native
  def createTextFinder(findText: String): TextFinder = js.native
  def deleteActiveSheet(): Sheet = js.native
  def deleteColumn(columnPosition: Integer): Sheet = js.native
  def deleteColumns(columnPosition: Integer, howMany: Integer): Unit = js.native
  def deleteRow(rowPosition: Integer): Sheet = js.native
  def deleteRows(rowPosition: Integer, howMany: Integer): Unit = js.native
  def deleteSheet(sheet: Sheet): Unit = js.native
  def duplicateActiveSheet(): Sheet = js.native
  def getActiveCell(): Range = js.native
  def getActiveRange(): Range | Null = js.native
  def getActiveRangeList(): RangeList | Null = js.native
  def getActiveSheet(): Sheet = js.native
  def getAs(contentType: String): Blob = js.native
  def getBandings(): js.Array[Banding] = js.native
  def getBlob(): Blob = js.native
  def getColumnWidth(columnPosition: Integer): Integer = js.native
  def getCurrentCell(): Range | Null = js.native
  def getDataRange(): Range = js.native
  def getDataSourceTables(): js.Array[DataSourceTable] = js.native
  def getDeveloperMetadata(): js.Array[DeveloperMetadata] = js.native
  def getEditors(): js.Array[User] = js.native
  def getFormUrl(): String | Null = js.native
  def getFrozenColumns(): Integer = js.native
  def getFrozenRows(): Integer = js.native
  def getId(): String = js.native
  def getImages(): js.Array[OverGridImage] = js.native
  def getIterativeCalculationConvergenceThreshold(): Double = js.native
  def getLastColumn(): Integer = js.native
  def getLastRow(): Integer = js.native
  def getMaxIterativeCalculationCycles(): Integer = js.native
  def getName(): String = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getNumSheets(): Integer = js.native
  def getOwner(): User | Null = js.native
  def getPredefinedSpreadsheetThemes(): js.Array[SpreadsheetTheme] = js.native
  def getProtections(`type`: ProtectionType): js.Array[Protection] = js.native
  def getRange(a1Notation: String): Range = js.native
  def getRangeByName(name: String): Range | Null = js.native
  def getRangeList(a1Notations: js.Array[String]): RangeList = js.native
  def getRecalculationInterval(): RecalculationInterval = js.native
  def getRowHeight(rowPosition: Integer): Integer = js.native
  def getSelection(): Selection = js.native
  def getSheetByName(name: String): Sheet | Null = js.native
  def getSheetId(): Integer = js.native
  def getSheetName(): String = js.native
  def getSheetValues(startRow: Integer, startColumn: Integer, numRows: Integer, numColumns: Integer): js.Array[js.Array[js.Any]] = js.native
  def getSheets(): js.Array[Sheet] = js.native
  def getSpreadsheetLocale(): String = js.native
  def getSpreadsheetTheme(): SpreadsheetTheme | Null = js.native
  def getSpreadsheetTimeZone(): String = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def hideColumn(column: Range): Unit = js.native
  def hideRow(row: Range): Unit = js.native
  def insertColumnAfter(afterPosition: Integer): Sheet = js.native
  def insertColumnBefore(beforePosition: Integer): Sheet = js.native
  def insertColumnsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  def insertColumnsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(blobSource: BlobSource, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer): OverGridImage = js.native
  def insertImage(url: String, column: Integer, row: Integer, offsetX: Integer, offsetY: Integer): OverGridImage = js.native
  def insertRowAfter(afterPosition: Integer): Sheet = js.native
  def insertRowBefore(beforePosition: Integer): Sheet = js.native
  def insertRowsAfter(afterPosition: Integer, howMany: Integer): Sheet = js.native
  def insertRowsBefore(beforePosition: Integer, howMany: Integer): Sheet = js.native
  def insertSheet(): Sheet = js.native
  def insertSheet(sheetIndex: Integer): Sheet = js.native
  def insertSheet(sheetIndex: Integer, options: js.Any): Sheet = js.native
  def insertSheet(options: js.Any): Sheet = js.native
  def insertSheet(sheetName: String): Sheet = js.native
  def insertSheet(sheetName: String, sheetIndex: Integer): Sheet = js.native
  def insertSheet(sheetName: String, sheetIndex: Integer, options: js.Any): Sheet = js.native
  def insertSheet(sheetName: String, options: js.Any): Sheet = js.native
  def insertSheetWithDataSourceTable(spec: DataSourceSpec): Sheet = js.native
  def isColumnHiddenByUser(columnPosition: Integer): Boolean = js.native
  def isIterativeCalculationEnabled(): Boolean = js.native
  def isRowHiddenByFilter(rowPosition: Integer): Boolean = js.native
  def isRowHiddenByUser(rowPosition: Integer): Boolean = js.native
  def moveActiveSheet(pos: Integer): Unit = js.native
  def moveChartToObjectSheet(chart: EmbeddedChart): Sheet = js.native
  def removeEditor(emailAddress: String): Spreadsheet = js.native
  def removeEditor(user: User): Spreadsheet = js.native
  def removeMenu(name: String): Unit = js.native
  def removeNamedRange(name: String): Unit = js.native
  def removeViewer(emailAddress: String): Spreadsheet = js.native
  def removeViewer(user: User): Spreadsheet = js.native
  def rename(newName: String): Unit = js.native
  def renameActiveSheet(newName: String): Unit = js.native
  def resetSpreadsheetTheme(): SpreadsheetTheme = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSelection(range: Range): Range = js.native
  def setActiveSelection(a1Notation: String): Range = js.native
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet = js.native
  def setColumnWidth(columnPosition: Integer, width: Integer): Sheet = js.native
  def setCurrentCell(cell: Range): Range = js.native
  def setFrozenColumns(columns: Integer): Unit = js.native
  def setFrozenRows(rows: Integer): Unit = js.native
  def setIterativeCalculationConvergenceThreshold(minThreshold: Double): Spreadsheet = js.native
  def setIterativeCalculationEnabled(isEnabled: Boolean): Spreadsheet = js.native
  def setMaxIterativeCalculationCycles(maxIterations: Integer): Spreadsheet = js.native
  def setNamedRange(name: String, range: Range): Unit = js.native
  def setRecalculationInterval(recalculationInterval: RecalculationInterval): Spreadsheet = js.native
  def setRowHeight(rowPosition: Integer, height: Integer): Sheet = js.native
  def setSpreadsheetLocale(locale: String): Unit = js.native
  def setSpreadsheetTheme(theme: SpreadsheetTheme): SpreadsheetTheme = js.native
  def setSpreadsheetTimeZone(timezone: String): Unit = js.native
  def show(userInterface: HTML.HtmlOutput): Unit = js.native
  def sort(columnPosition: Integer): Sheet = js.native
  def sort(columnPosition: Integer, ascending: Boolean): Sheet = js.native
  def toast(msg: String): Unit = js.native
  def toast(msg: String, title: String): Unit = js.native
  def toast(msg: String, title: String, timeoutSeconds: Double | Null): Unit = js.native
  def unhideColumn(column: Range): Unit = js.native
  def unhideRow(row: Range): Unit = js.native
  def updateMenu(name: String, subMenus: js.Array[js.Any]): Unit = js.native
  def getSheetProtection(): PageProtection = js.native
  def isAnonymousView(): Boolean = js.native
  def isAnonymousWrite(): Boolean = js.native
  def setAnonymousAccess(anonymousReadAllowed: Boolean, anonymousWriteAllowed: Boolean): Unit = js.native
  def setSheetProtection(permissions: PageProtection): Unit = js.native
}

@js.native
trait SpreadsheetApp extends js.Object {
  var AutoFillSeries: AutoFillSeries.type = js.native
  var BandingTheme: BandingTheme.type = js.native
  var BooleanCriteria: BooleanCriteria.type = js.native
  var BorderStyle: BorderStyle.type = js.native
  var ColorType: ColorType.type = js.native
  var CopyPasteType: CopyPasteType.type = js.native
  var DataExecutionErrorCode: DataExecutionErrorCode.type = js.native
  var DataExecutionState: DataExecutionState.type = js.native
  var DataSourceParameterType: DataSourceParameterType.type = js.native
  var DataSourceType: DataSourceType.type = js.native
  var DataValidationCriteria: DataValidationCriteria.type = js.native
  var DeveloperMetadataLocationType: DeveloperMetadataLocationType.type = js.native
  var DeveloperMetadataVisibility: DeveloperMetadataVisibility.type = js.native
  var Dimension: Dimension.type = js.native
  var Direction: Direction.type = js.native
  var GroupControlTogglePosition: GroupControlTogglePosition.type = js.native
  var InterpolationType: InterpolationType.type = js.native
  var PivotTableSummarizeFunction: PivotTableSummarizeFunction.type = js.native
  var PivotValueDisplayType: PivotValueDisplayType.type = js.native
  var ProtectionType: ProtectionType.type = js.native
  var RecalculationInterval: RecalculationInterval.type = js.native
  var RelativeDate: RelativeDate.type = js.native
  var SheetType: SheetType.type = js.native
  var TextDirection: TextDirection.type = js.native
  var TextToColumnsDelimiter: TextToColumnsDelimiter.type = js.native
  var ThemeColorType: ThemeColorType.type = js.native
  var WrapStrategy: WrapStrategy.type = js.native
  def create(name: String): Spreadsheet = js.native
  def create(name: String, rows: Integer, columns: Integer): Spreadsheet = js.native
  def enableAllDataSourcesExecution(): Unit = js.native
  def enableBigQueryExecution(): Unit = js.native
  def flush(): Unit = js.native
  def getActive(): Spreadsheet = js.native
  def getActiveRange(): Range = js.native
  def getActiveRangeList(): RangeList = js.native
  def getActiveSheet(): Sheet = js.native
  def getActiveSpreadsheet(): Spreadsheet = js.native
  def getCurrentCell(): Range = js.native
  def getSelection(): Selection = js.native
  def getUi(): Ui = js.native
  def newColor(): ColorBuilder = js.native
  def newConditionalFormatRule(): ConditionalFormatRuleBuilder = js.native
  def newDataSourceSpec(): DataSourceSpecBuilder = js.native
  def newDataValidation(): DataValidationBuilder = js.native
  def newFilterCriteria(): FilterCriteriaBuilder = js.native
  def newRichTextValue(): RichTextValueBuilder = js.native
  def newTextStyle(): TextStyleBuilder = js.native
  def open(file: Drive.File): Spreadsheet = js.native
  def openById(id: String): Spreadsheet = js.native
  def openByUrl(url: String): Spreadsheet = js.native
  def setActiveRange(range: Range): Range = js.native
  def setActiveRangeList(rangeList: RangeList): RangeList = js.native
  def setActiveSheet(sheet: Sheet): Sheet = js.native
  def setActiveSheet(sheet: Sheet, restoreSelection: Boolean): Sheet = js.native
  def setActiveSpreadsheet(newActiveSpreadsheet: Spreadsheet): Unit = js.native
  def setCurrentCell(cell: Range): Range = js.native
}

@js.native
trait SpreadsheetTheme extends js.Object {
  def getConcreteColor(themeColorType: ThemeColorType): Color = js.native
  def getFontFamily(): String | Null = js.native
  def getThemeColors(): js.Array[ThemeColorType] = js.native
  def setConcreteColor(themeColorType: ThemeColorType, color: Color): SpreadsheetTheme = js.native
  def setConcreteColor(themeColorType: ThemeColorType, red: Integer, green: Integer, blue: Integer): SpreadsheetTheme = js.native
  def setFontFamily(fontFamily: String): SpreadsheetTheme = js.native
}

@js.native
sealed trait TextDirection extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.TextDirection")
object TextDirection extends js.Object {
  var LEFT_TO_RIGHT: TextDirection = js.native
  var RIGHT_TO_LEFT: TextDirection = js.native
  @JSBracketAccess
  def apply(value: TextDirection): String = js.native
}

@js.native
trait TextFinder extends js.Object {
  def findAll(): js.Array[Range] = js.native
  def findNext(): Range | Null = js.native
  def findPrevious(): Range | Null = js.native
  def getCurrentMatch(): Range | Null = js.native
  def ignoreDiacritics(ignoreDiacritics: Boolean): TextFinder = js.native
  def matchCase(matchCase: Boolean): TextFinder = js.native
  def matchEntireCell(matchEntireCell: Boolean): TextFinder = js.native
  def matchFormulaText(matchFormulaText: Boolean): TextFinder = js.native
  def replaceAllWith(replaceText: String): Integer = js.native
  def replaceWith(replaceText: String): Integer = js.native
  def startFrom(startRange: Range): TextFinder = js.native
  def useRegularExpression(useRegEx: Boolean): TextFinder = js.native
}

@js.native
trait TextRotation extends js.Object {
  def getDegrees(): Integer = js.native
  def isVertical(): Boolean = js.native
}

@js.native
trait TextStyle extends js.Object {
  def copy(): TextStyleBuilder = js.native
  def getFontFamily(): String | Null = js.native
  def getFontSize(): Integer | Null = js.native
  def getForegroundColor(): String | Null = js.native
  def isBold(): Boolean | Null = js.native
  def isItalic(): Boolean | Null = js.native
  def isStrikethrough(): Boolean | Null = js.native
  def isUnderline(): Boolean | Null = js.native
}

@js.native
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle = js.native
  def setBold(bold: Boolean): TextStyleBuilder = js.native
  def setFontFamily(fontFamily: String): TextStyleBuilder = js.native
  def setFontSize(fontSize: Integer): TextStyleBuilder = js.native
  def setForegroundColor(cssString: String): TextStyleBuilder = js.native
  def setItalic(italic: Boolean): TextStyleBuilder = js.native
  def setStrikethrough(strikethrough: Boolean): TextStyleBuilder = js.native
  def setUnderline(underline: Boolean): TextStyleBuilder = js.native
}

@js.native
sealed trait TextToColumnsDelimiter extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
object TextToColumnsDelimiter extends js.Object {
  var COMMA: TextToColumnsDelimiter = js.native
  var SEMICOLON: TextToColumnsDelimiter = js.native
  var PERIOD: TextToColumnsDelimiter = js.native
  var SPACE: TextToColumnsDelimiter = js.native
  @JSBracketAccess
  def apply(value: TextToColumnsDelimiter): String = js.native
}

@js.native
trait ThemeColor extends js.Object {
  def getColorType(): ColorType = js.native
  def getThemeColorType(): ThemeColorType = js.native
}

@js.native
sealed trait ThemeColorType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.ThemeColorType")
object ThemeColorType extends js.Object {
  var UNSUPPORTED: ThemeColorType = js.native
  var TEXT: ThemeColorType = js.native
  var BACKGROUND: ThemeColorType = js.native
  var ACCENT1: ThemeColorType = js.native
  var ACCENT2: ThemeColorType = js.native
  var ACCENT3: ThemeColorType = js.native
  var ACCENT4: ThemeColorType = js.native
  var ACCENT5: ThemeColorType = js.native
  var ACCENT6: ThemeColorType = js.native
  var HYPERLINK: ThemeColorType = js.native
  @JSBracketAccess
  def apply(value: ThemeColorType): String = js.native
}

@js.native
sealed trait WrapStrategy extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
object WrapStrategy extends js.Object {
  var WRAP: WrapStrategy = js.native
  var OVERFLOW: WrapStrategy = js.native
  var CLIP: WrapStrategy = js.native
  @JSBracketAccess
  def apply(value: WrapStrategy): String = js.native
}

@js.native
@JSGlobal("GoogleAppsScript.Spreadsheet")
object Spreadsheet extends js.Object {
  type FontLine = String
  type FontStyle = String
  type FontWeight = String
}

}

}

@js.native
@JSGlobalScope
object Facade extends js.Object {
  var SpreadsheetApp: GoogleAppsScript.Spreadsheet.SpreadsheetApp = js.native
}

}
