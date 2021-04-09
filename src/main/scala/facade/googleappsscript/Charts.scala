package facade.googleappsscript.charts

import facade.googleappsscript.base.Blob

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobalScope
object Facade extends js.Object {}

@js.native
trait AreaChartBuilder extends js.Object {
  def build(): Chart                                                                  = js.native
  def reverseCategories(): AreaChartBuilder                                           = js.native
  def setBackgroundColor(cssValue: String): AreaChartBuilder                          = js.native
  def setColors(cssValues: js.Array[String]): AreaChartBuilder                        = js.native
  def setDataSourceUrl(url: String): AreaChartBuilder                                 = js.native
  def setDataTable(tableBuilder: DataTableBuilder): AreaChartBuilder                  = js.native
  def setDataTable(table: DataTableSource): AreaChartBuilder                          = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): AreaChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): AreaChartBuilder                = js.native
  def setLegendPosition(position: Position): AreaChartBuilder                         = js.native
  def setLegendTextStyle(textStyle: TextStyle): AreaChartBuilder                      = js.native
  def setOption(option: String, value: js.Any): AreaChartBuilder                      = js.native
  def setPointStyle(style: PointStyle): AreaChartBuilder                              = js.native
  def setRange(start: Double, end: Double): AreaChartBuilder                          = js.native
  def setStacked(): AreaChartBuilder                                                  = js.native
  def setTitle(chartTitle: String): AreaChartBuilder                                  = js.native
  def setTitleTextStyle(textStyle: TextStyle): AreaChartBuilder                       = js.native
  def setXAxisTextStyle(textStyle: TextStyle): AreaChartBuilder                       = js.native
  def setXAxisTitle(title: String): AreaChartBuilder                                  = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder                  = js.native
  def setYAxisTextStyle(textStyle: TextStyle): AreaChartBuilder                       = js.native
  def setYAxisTitle(title: String): AreaChartBuilder                                  = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder                  = js.native
  def useLogScale(): AreaChartBuilder                                                 = js.native
}

@js.native
trait BarChartBuilder extends js.Object {
  def build(): Chart                                                                 = js.native
  def reverseCategories(): BarChartBuilder                                           = js.native
  def reverseDirection(): BarChartBuilder                                            = js.native
  def setBackgroundColor(cssValue: String): BarChartBuilder                          = js.native
  def setColors(cssValues: js.Array[String]): BarChartBuilder                        = js.native
  def setDataSourceUrl(url: String): BarChartBuilder                                 = js.native
  def setDataTable(tableBuilder: DataTableBuilder): BarChartBuilder                  = js.native
  def setDataTable(table: DataTableSource): BarChartBuilder                          = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): BarChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): BarChartBuilder                = js.native
  def setLegendPosition(position: Position): BarChartBuilder                         = js.native
  def setLegendTextStyle(textStyle: TextStyle): BarChartBuilder                      = js.native
  def setOption(option: String, value: js.Any): BarChartBuilder                      = js.native
  def setRange(start: Double, end: Double): BarChartBuilder                          = js.native
  def setStacked(): BarChartBuilder                                                  = js.native
  def setTitle(chartTitle: String): BarChartBuilder                                  = js.native
  def setTitleTextStyle(textStyle: TextStyle): BarChartBuilder                       = js.native
  def setXAxisTextStyle(textStyle: TextStyle): BarChartBuilder                       = js.native
  def setXAxisTitle(title: String): BarChartBuilder                                  = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder                  = js.native
  def setYAxisTextStyle(textStyle: TextStyle): BarChartBuilder                       = js.native
  def setYAxisTitle(title: String): BarChartBuilder                                  = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder                  = js.native
  def useLogScale(): BarChartBuilder                                                 = js.native
}

@js.native
trait Chart extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob                  = js.native
  def getOptions(): ChartOptions       = js.native
}

@js.native
sealed trait ChartHiddenDimensionStrategy extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.ChartHiddenDimensionStrategy")
object ChartHiddenDimensionStrategy extends js.Object {
  var IGNORE_BOTH: ChartHiddenDimensionStrategy    = js.native
  var IGNORE_ROWS: ChartHiddenDimensionStrategy    = js.native
  var IGNORE_COLUMNS: ChartHiddenDimensionStrategy = js.native
  var SHOW_BOTH: ChartHiddenDimensionStrategy      = js.native
  @JSBracketAccess
  def apply(value: ChartHiddenDimensionStrategy): String = js.native
}

@js.native
sealed trait ChartMergeStrategy extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
object ChartMergeStrategy extends js.Object {
  var MERGE_COLUMNS: ChartMergeStrategy = js.native
  var MERGE_ROWS: ChartMergeStrategy    = js.native
  @JSBracketAccess
  def apply(value: ChartMergeStrategy): String = js.native
}

@js.native
trait ChartOptions extends js.Object {
  def get(option: String): js.Dynamic = js.native
}

@js.native
sealed trait ChartType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.ChartType")
object ChartType extends js.Object {
  var TIMELINE: ChartType     = js.native
  var AREA: ChartType         = js.native
  var BAR: ChartType          = js.native
  var BUBBLE: ChartType       = js.native
  var CANDLESTICK: ChartType  = js.native
  var COLUMN: ChartType       = js.native
  var COMBO: ChartType        = js.native
  var GAUGE: ChartType        = js.native
  var GEO: ChartType          = js.native
  var HISTOGRAM: ChartType    = js.native
  var RADAR: ChartType        = js.native
  var LINE: ChartType         = js.native
  var ORG: ChartType          = js.native
  var PIE: ChartType          = js.native
  var SCATTER: ChartType      = js.native
  var SPARKLINE: ChartType    = js.native
  var STEPPED_AREA: ChartType = js.native
  var TABLE: ChartType        = js.native
  var TREEMAP: ChartType      = js.native
  var WATERFALL: ChartType    = js.native
  @JSBracketAccess
  def apply(value: ChartType): String = js.native
}

@js.native
trait Charts extends js.Object {
  var ChartHiddenDimensionStrategy: ChartHiddenDimensionStrategy = js.native
  var ChartMergeStrategy: ChartMergeStrategy                     = js.native
  var ChartType: ChartType                                       = js.native
  var ColumnType: ColumnType                                     = js.native
  var CurveStyle: CurveStyle                                     = js.native
  var PointStyle: PointStyle                                     = js.native
  var Position: Position                                         = js.native
  def newAreaChart(): AreaChartBuilder                           = js.native
  def newBarChart(): BarChartBuilder                             = js.native
  def newColumnChart(): ColumnChartBuilder                       = js.native
  def newDataTable(): DataTableBuilder                           = js.native
  def newDataViewDefinition(): DataViewDefinitionBuilder         = js.native
  def newLineChart(): LineChartBuilder                           = js.native
  def newPieChart(): PieChartBuilder                             = js.native
  def newScatterChart(): ScatterChartBuilder                     = js.native
  def newTableChart(): TableChartBuilder                         = js.native
  def newTextStyle(): TextStyleBuilder                           = js.native
}

@js.native
trait ColumnChartBuilder extends js.Object {
  def build(): Chart                                                                    = js.native
  def reverseCategories(): ColumnChartBuilder                                           = js.native
  def setBackgroundColor(cssValue: String): ColumnChartBuilder                          = js.native
  def setColors(cssValues: js.Array[String]): ColumnChartBuilder                        = js.native
  def setDataSourceUrl(url: String): ColumnChartBuilder                                 = js.native
  def setDataTable(tableBuilder: DataTableBuilder): ColumnChartBuilder                  = js.native
  def setDataTable(table: DataTableSource): ColumnChartBuilder                          = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ColumnChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): ColumnChartBuilder                = js.native
  def setLegendPosition(position: Position): ColumnChartBuilder                         = js.native
  def setLegendTextStyle(textStyle: TextStyle): ColumnChartBuilder                      = js.native
  def setOption(option: String, value: js.Any): ColumnChartBuilder                      = js.native
  def setRange(start: Double, end: Double): ColumnChartBuilder                          = js.native
  def setStacked(): ColumnChartBuilder                                                  = js.native
  def setTitle(chartTitle: String): ColumnChartBuilder                                  = js.native
  def setTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder                       = js.native
  def setXAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder                       = js.native
  def setXAxisTitle(title: String): ColumnChartBuilder                                  = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder                  = js.native
  def setYAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder                       = js.native
  def setYAxisTitle(title: String): ColumnChartBuilder                                  = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder                  = js.native
  def useLogScale(): ColumnChartBuilder                                                 = js.native
}

@js.native
sealed trait ColumnType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.ColumnType")
object ColumnType extends js.Object {
  var DATE: ColumnType   = js.native
  var NUMBER: ColumnType = js.native
  var STRING: ColumnType = js.native
  @JSBracketAccess
  def apply(value: ColumnType): String = js.native
}

@js.native
sealed trait CurveStyle extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.CurveStyle")
object CurveStyle extends js.Object {
  var NORMAL: CurveStyle = js.native
  var SMOOTH: CurveStyle = js.native
  @JSBracketAccess
  def apply(value: CurveStyle): String = js.native
}

@js.native
trait DataTable extends js.Object {}

@js.native
trait DataTableBuilder extends js.Object {
  def addColumn(`type`: ColumnType, label: String): DataTableBuilder           = js.native
  def addRow(values: js.Array[js.Any]): DataTableBuilder                       = js.native
  def build(): DataTable                                                       = js.native
  def setValue(row: Integer, column: Integer, value: js.Any): DataTableBuilder = js.native
}

@js.native
trait DataTableSource extends js.Object {
  def getDataTable(): DataTable = js.native
}

@js.native
trait DataViewDefinition extends js.Object {}

@js.native
trait DataViewDefinitionBuilder extends js.Object {
  def build(): DataViewDefinition                                      = js.native
  def setColumns(columns: js.Array[js.Any]): DataViewDefinitionBuilder = js.native
}

@js.native
trait LineChartBuilder extends js.Object {
  def build(): Chart                                                                  = js.native
  def reverseCategories(): LineChartBuilder                                           = js.native
  def setBackgroundColor(cssValue: String): LineChartBuilder                          = js.native
  def setColors(cssValues: js.Array[String]): LineChartBuilder                        = js.native
  def setCurveStyle(style: CurveStyle): LineChartBuilder                              = js.native
  def setDataSourceUrl(url: String): LineChartBuilder                                 = js.native
  def setDataTable(tableBuilder: DataTableBuilder): LineChartBuilder                  = js.native
  def setDataTable(table: DataTableSource): LineChartBuilder                          = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): LineChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): LineChartBuilder                = js.native
  def setLegendPosition(position: Position): LineChartBuilder                         = js.native
  def setLegendTextStyle(textStyle: TextStyle): LineChartBuilder                      = js.native
  def setOption(option: String, value: js.Any): LineChartBuilder                      = js.native
  def setPointStyle(style: PointStyle): LineChartBuilder                              = js.native
  def setRange(start: Double, end: Double): LineChartBuilder                          = js.native
  def setTitle(chartTitle: String): LineChartBuilder                                  = js.native
  def setTitleTextStyle(textStyle: TextStyle): LineChartBuilder                       = js.native
  def setXAxisTextStyle(textStyle: TextStyle): LineChartBuilder                       = js.native
  def setXAxisTitle(title: String): LineChartBuilder                                  = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder                  = js.native
  def setYAxisTextStyle(textStyle: TextStyle): LineChartBuilder                       = js.native
  def setYAxisTitle(title: String): LineChartBuilder                                  = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder                  = js.native
  def useLogScale(): LineChartBuilder                                                 = js.native
}

@js.native
sealed trait MatchType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.MatchType")
object MatchType extends js.Object {
  var EXACT: MatchType  = js.native
  var PREFIX: MatchType = js.native
  var ANY: MatchType    = js.native
  @JSBracketAccess
  def apply(value: MatchType): String = js.native
}

@js.native
trait NumberRangeFilterBuilder extends js.Object {
  def setMaxValue(maxValue: Integer): NumberRangeFilterBuilder               = js.native
  def setMinValue(minValue: Integer): NumberRangeFilterBuilder               = js.native
  def setOrientation(orientation: Orientation): NumberRangeFilterBuilder     = js.native
  def setShowRangeValues(showRangeValues: Boolean): NumberRangeFilterBuilder = js.native
  def setTicks(ticks: Integer): NumberRangeFilterBuilder                     = js.native
}

@js.native
sealed trait Orientation extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.Orientation")
object Orientation extends js.Object {
  var HORIZONTAL: Orientation = js.native
  var VERTICAL: Orientation   = js.native
  @JSBracketAccess
  def apply(value: Orientation): String = js.native
}

@js.native
sealed trait PickerValuesLayout extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.PickerValuesLayout")
object PickerValuesLayout extends js.Object {
  var ASIDE: PickerValuesLayout          = js.native
  var BELOW: PickerValuesLayout          = js.native
  var BELOW_WRAPPING: PickerValuesLayout = js.native
  var BELOW_STACKED: PickerValuesLayout  = js.native
  @JSBracketAccess
  def apply(value: PickerValuesLayout): String = js.native
}

@js.native
trait PieChartBuilder extends js.Object {
  def build(): Chart                                                                 = js.native
  def reverseCategories(): PieChartBuilder                                           = js.native
  def set3D(): PieChartBuilder                                                       = js.native
  def setBackgroundColor(cssValue: String): PieChartBuilder                          = js.native
  def setColors(cssValues: js.Array[String]): PieChartBuilder                        = js.native
  def setDataSourceUrl(url: String): PieChartBuilder                                 = js.native
  def setDataTable(tableBuilder: DataTableBuilder): PieChartBuilder                  = js.native
  def setDataTable(table: DataTableSource): PieChartBuilder                          = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): PieChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): PieChartBuilder                = js.native
  def setLegendPosition(position: Position): PieChartBuilder                         = js.native
  def setLegendTextStyle(textStyle: TextStyle): PieChartBuilder                      = js.native
  def setOption(option: String, value: js.Any): PieChartBuilder                      = js.native
  def setTitle(chartTitle: String): PieChartBuilder                                  = js.native
  def setTitleTextStyle(textStyle: TextStyle): PieChartBuilder                       = js.native
}

@js.native
sealed trait PointStyle extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.PointStyle")
object PointStyle extends js.Object {
  var NONE: PointStyle   = js.native
  var TINY: PointStyle   = js.native
  var MEDIUM: PointStyle = js.native
  var LARGE: PointStyle  = js.native
  var HUGE: PointStyle   = js.native
  @JSBracketAccess
  def apply(value: PointStyle): String = js.native
}

@js.native
sealed trait Position extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Charts.Position")
object Position extends js.Object {
  var TOP: Position    = js.native
  var RIGHT: Position  = js.native
  var BOTTOM: Position = js.native
  var NONE: Position   = js.native
  @JSBracketAccess
  def apply(value: Position): String = js.native
}

@js.native
trait ScatterChartBuilder extends js.Object {
  def build(): Chart                                                    = js.native
  def setBackgroundColor(cssValue: String): ScatterChartBuilder         = js.native
  def setColors(cssValues: js.Array[String]): ScatterChartBuilder       = js.native
  def setDataSourceUrl(url: String): ScatterChartBuilder                = js.native
  def setDataTable(tableBuilder: DataTableBuilder): ScatterChartBuilder = js.native
  def setDataTable(table: DataTableSource): ScatterChartBuilder         = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ScatterChartBuilder =
    js.native
  def setDimensions(width: Integer, height: Integer): ScatterChartBuilder = js.native
  def setLegendPosition(position: Position): ScatterChartBuilder          = js.native
  def setLegendTextStyle(textStyle: TextStyle): ScatterChartBuilder       = js.native
  def setOption(option: String, value: js.Any): ScatterChartBuilder       = js.native
  def setPointStyle(style: PointStyle): ScatterChartBuilder               = js.native
  def setTitle(chartTitle: String): ScatterChartBuilder                   = js.native
  def setTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder        = js.native
  def setXAxisLogScale(): ScatterChartBuilder                             = js.native
  def setXAxisRange(start: Double, end: Double): ScatterChartBuilder      = js.native
  def setXAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder        = js.native
  def setXAxisTitle(title: String): ScatterChartBuilder                   = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder   = js.native
  def setYAxisLogScale(): ScatterChartBuilder                             = js.native
  def setYAxisRange(start: Double, end: Double): ScatterChartBuilder      = js.native
  def setYAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder        = js.native
  def setYAxisTitle(title: String): ScatterChartBuilder                   = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder   = js.native
}

@js.native
trait StringFilterBuilder extends js.Object {
  def setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder     = js.native
  def setMatchType(matchType: MatchType): StringFilterBuilder           = js.native
  def setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder = js.native
}

@js.native
trait TableChartBuilder extends js.Object {
  def build(): Chart                                                                   = js.native
  def enablePaging(enablePaging: Boolean): TableChartBuilder                           = js.native
  def enablePaging(pageSize: Integer): TableChartBuilder                               = js.native
  def enablePaging(pageSize: Integer, startPage: Integer): TableChartBuilder           = js.native
  def enableRtlTable(rtlEnabled: Boolean): TableChartBuilder                           = js.native
  def enableSorting(enableSorting: Boolean): TableChartBuilder                         = js.native
  def setDataSourceUrl(url: String): TableChartBuilder                                 = js.native
  def setDataTable(tableBuilder: DataTableBuilder): TableChartBuilder                  = js.native
  def setDataTable(table: DataTableSource): TableChartBuilder                          = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): TableChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): TableChartBuilder                = js.native
  def setFirstRowNumber(number: Integer): TableChartBuilder                            = js.native
  def setInitialSortingAscending(column: Integer): TableChartBuilder                   = js.native
  def setInitialSortingDescending(column: Integer): TableChartBuilder                  = js.native
  def setOption(option: String, value: js.Any): TableChartBuilder                      = js.native
  def showRowNumberColumn(showRowNumber: Boolean): TableChartBuilder                   = js.native
  def useAlternatingRowStyle(alternate: Boolean): TableChartBuilder                    = js.native
}

@js.native
trait TextStyle extends js.Object {
  def getColor(): String    = js.native
  def getFontName(): String = js.native
  def getFontSize(): Double = js.native
}

@js.native
trait TextStyleBuilder extends js.Object {
  def build(): TextStyle                              = js.native
  def setColor(cssValue: String): TextStyleBuilder    = js.native
  def setFontName(fontName: String): TextStyleBuilder = js.native
  def setFontSize(fontSize: Double): TextStyleBuilder = js.native
}
