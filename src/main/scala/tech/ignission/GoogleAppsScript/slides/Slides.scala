package tech.ignission.GoogleAppsScript.slides

import tech.ignission.GoogleAppsScript.base.{Blob, BlobSource, ColorType, RgbColor, Ui, User}
import tech.ignission.GoogleAppsScript.spreadsheet.EmbeddedChart

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait AffineTransform extends js.Object {
  def getScaleX(): Double = js.native
  def getScaleY(): Double = js.native
  def getShearX(): Double = js.native
  def getShearY(): Double = js.native
  def getTranslateX(): Double = js.native
  def getTranslateY(): Double = js.native
  def toBuilder(): AffineTransformBuilder = js.native
}

@js.native
trait AffineTransformBuilder extends js.Object {
  def build(): AffineTransform = js.native
  def setScaleX(scaleX: Double): AffineTransformBuilder = js.native
  def setScaleY(scaleY: Double): AffineTransformBuilder = js.native
  def setShearX(shearX: Double): AffineTransformBuilder = js.native
  def setShearY(shearY: Double): AffineTransformBuilder = js.native
  def setTranslateX(translateX: Double): AffineTransformBuilder = js.native
  def setTranslateY(translateY: Double): AffineTransformBuilder = js.native
}

@js.native
sealed trait AlignmentPosition extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
object AlignmentPosition extends js.Object {
  var CENTER: AlignmentPosition = js.native
  var HORIZONTAL_CENTER: AlignmentPosition = js.native
  var VERTICAL_CENTER: AlignmentPosition = js.native
  @JSBracketAccess
  def apply(value: AlignmentPosition): String = js.native
}

@js.native
sealed trait ArrowStyle extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
object ArrowStyle extends js.Object {
  var UNSUPPORTED: ArrowStyle = js.native
  var NONE: ArrowStyle = js.native
  var STEALTH_ARROW: ArrowStyle = js.native
  var FILL_ARROW: ArrowStyle = js.native
  var FILL_CIRCLE: ArrowStyle = js.native
  var FILL_SQUARE: ArrowStyle = js.native
  var FILL_DIAMOND: ArrowStyle = js.native
  var OPEN_ARROW: ArrowStyle = js.native
  var OPEN_CIRCLE: ArrowStyle = js.native
  var OPEN_SQUARE: ArrowStyle = js.native
  var OPEN_DIAMOND: ArrowStyle = js.native
  @JSBracketAccess
  def apply(value: ArrowStyle): String = js.native
}

@js.native
trait AutoText extends js.Object {
  def getAutoTextType(): AutoTextType = js.native
  def getIndex(): Integer = js.native
  def getRange(): TextRange = js.native
}

@js.native
sealed trait AutoTextType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.AutoTextType")
object AutoTextType extends js.Object {
  var UNSUPPORTED: AutoTextType = js.native
  var SLIDE_NUMBER: AutoTextType = js.native
  @JSBracketAccess
  def apply(value: AutoTextType): String = js.native
}

@js.native
trait Border extends js.Object {
  def getDashStyle(): DashStyle = js.native
  def getLineFill(): LineFill = js.native
  def getWeight(): Double = js.native
  def isVisible(): Boolean = js.native
  def setDashStyle(style: DashStyle): Border = js.native
  def setTransparent(): Border = js.native
  def setWeight(points: Double): Border = js.native
}

@js.native
sealed trait CellMergeState extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.CellMergeState")
object CellMergeState extends js.Object {
  var NORMAL: CellMergeState = js.native
  var HEAD: CellMergeState = js.native
  var MERGED: CellMergeState = js.native
  @JSBracketAccess
  def apply(value: CellMergeState): String = js.native
}

@js.native
trait Color extends js.Object {
  def asRgbColor(): RgbColor = js.native
  def asThemeColor(): ThemeColor = js.native
  def getColorType(): ColorType = js.native
}

@js.native
trait ColorScheme extends js.Object {
  def getConcreteColor(theme: ThemeColorType): Color = js.native
  def getThemeColors(): js.Array[ThemeColorType] = js.native
  def setConcreteColor(`type`: ThemeColorType, color: Color): ColorScheme = js.native
  def setConcreteColor(`type`: ThemeColorType, red: Integer, green: Integer, blue: Integer): ColorScheme = js.native
  def setConcreteColor(`type`: ThemeColorType, hexColor: String): ColorScheme = js.native
}

@js.native
trait ConnectionSite extends js.Object {
  def getIndex(): Integer = js.native
  def getPageElement(): PageElement = js.native
}

@js.native
sealed trait ContentAlignment extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
object ContentAlignment extends js.Object {
  var UNSUPPORTED: ContentAlignment = js.native
  var TOP: ContentAlignment = js.native
  var MIDDLE: ContentAlignment = js.native
  var BOTTOM: ContentAlignment = js.native
  @JSBracketAccess
  def apply(value: ContentAlignment): String = js.native
}

@js.native
sealed trait DashStyle extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.DashStyle")
object DashStyle extends js.Object {
  var UNSUPPORTED: DashStyle = js.native
  var SOLID: DashStyle = js.native
  var DOT: DashStyle = js.native
  var DASH: DashStyle = js.native
  var DASH_DOT: DashStyle = js.native
  var LONG_DASH: DashStyle = js.native
  var LONG_DASH_DOT: DashStyle = js.native
  @JSBracketAccess
  def apply(value: DashStyle): String = js.native
}

@js.native
trait Fill extends js.Object {
  def getSolidFill(): SolidFill = js.native
  def getType(): FillType = js.native
  def isVisible(): Boolean = js.native
  def setSolidFill(color: Color): Unit = js.native
  def setSolidFill(color: Color, alpha: Double): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
  def setSolidFill(hexString: String): Unit = js.native
  def setSolidFill(hexString: String, alpha: Double): Unit = js.native
  def setSolidFill(color: ThemeColorType): Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
  def setTransparent(): Unit = js.native
}

@js.native
sealed trait FillType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.FillType")
object FillType extends js.Object {
  var UNSUPPORTED: FillType = js.native
  var NONE: FillType = js.native
  var SOLID: FillType = js.native
  @JSBracketAccess
  def apply(value: FillType): String = js.native
}

@js.native
trait Group extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Group = js.native
  def bringForward(): Group = js.native
  def bringToFront(): Group = js.native
  def duplicate(): PageElement = js.native
  def getChildren(): js.Array[PageElement] = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Group = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): Group = js.native
  def scaleWidth(ratio: Double): Group = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Group = js.native
  def sendToBack(): Group = js.native
  def setDescription(description: String): Group = js.native
  def setHeight(height: Double): Group = js.native
  def setLeft(left: Double): Group = js.native
  def setRotation(angle: Double): Group = js.native
  def setTitle(title: String): Group = js.native
  def setTop(top: Double): Group = js.native
  def setTransform(transform: AffineTransform): Group = js.native
  def setWidth(width: Double): Group = js.native
  def ungroup(): Unit = js.native
}

@js.native
trait Image extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Image = js.native
  def bringForward(): Image = js.native
  def bringToFront(): Image = js.native
  def duplicate(): PageElement = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getContentUrl(): String = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getSourceUrl(): String = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Image = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def replace(blobSource: BlobSource): Image = js.native
  def replace(blobSource: BlobSource, crop: Boolean): Image = js.native
  def replace(imageUrl: String): Image = js.native
  def replace(imageUrl: String, crop: Boolean): Image = js.native
  def scaleHeight(ratio: Double): Image = js.native
  def scaleWidth(ratio: Double): Image = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Image = js.native
  def sendToBack(): Image = js.native
  def setDescription(description: String): Image = js.native
  def setHeight(height: Double): Image = js.native
  def setLeft(left: Double): Image = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): Image = js.native
  def setTitle(title: String): Image = js.native
  def setTop(top: Double): Image = js.native
  def setTransform(transform: AffineTransform): Image = js.native
  def setWidth(width: Double): Image = js.native
}

@js.native
trait Layout extends js.Object {
  def getBackground(): PageBackground = js.native
  def getColorScheme(): ColorScheme = js.native
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLayoutName(): String = js.native
  def getLines(): js.Array[Line] = js.native
  def getMaster(): Master = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPageType(): PageType = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def group(pageElements: js.Array[PageElement]): Group = js.native
  def insertGroup(group: Group): Group = js.native
  def insertImage(blobSource: BlobSource): Image = js.native
  def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertImage(image: Image): Image = js.native
  def insertImage(imageUrl: String): Image = js.native
  def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertLine(line: Line): Line = js.native
  def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): Line = js.native
  def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Line = js.native
  def insertPageElement(pageElement: PageElement): PageElement = js.native
  def insertShape(shape: Shape): Shape = js.native
  def insertShape(shapeType: ShapeType): Shape = js.native
  def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): SheetsChart = js.native
  def insertSheetsChart(sheetsChart: SheetsChart): SheetsChart = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertTable(numRows: Integer, numColumns: Integer): Table = js.native
  def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): Table = js.native
  def insertTable(table: Table): Table = js.native
  def insertTextBox(text: String): Shape = js.native
  def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertVideo(videoUrl: String): Video = js.native
  def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): Video = js.native
  def insertVideo(video: Video): Video = js.native
  def insertWordArt(wordArt: WordArt): WordArt = js.native
  def remove(): Unit = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def selectAsCurrentPage(): Unit = js.native
}

@js.native
trait Line extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Line = js.native
  def bringForward(): Line = js.native
  def bringToFront(): Line = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDashStyle(): DashStyle = js.native
  def getDescription(): String = js.native
  def getEnd(): Point = js.native
  def getEndArrow(): ArrowStyle = js.native
  def getEndConnection(): ConnectionSite = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLineCategory(): LineCategory = js.native
  def getLineFill(): LineFill = js.native
  def getLineType(): LineType = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getStart(): Point = js.native
  def getStartArrow(): ArrowStyle = js.native
  def getStartConnection(): ConnectionSite = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWeight(): Double = js.native
  def getWidth(): Double = js.native
  def isConnector(): Boolean = js.native
  def preconcatenateTransform(transform: AffineTransform): Line = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def reroute(): Line = js.native
  def scaleHeight(ratio: Double): Line = js.native
  def scaleWidth(ratio: Double): Line = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Line = js.native
  def sendToBack(): Line = js.native
  def setDashStyle(style: DashStyle): Line = js.native
  def setDescription(description: String): Line = js.native
  def setEnd(left: Double, top: Double): Line = js.native
  def setEnd(point: Point): Line = js.native
  def setEndArrow(style: ArrowStyle): Line = js.native
  def setEndConnection(connectionSite: ConnectionSite): Line = js.native
  def setHeight(height: Double): Line = js.native
  def setLeft(left: Double): Line = js.native
  def setLineCategory(lineCategory: LineCategory): Line = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): Line = js.native
  def setStart(left: Double, top: Double): Line = js.native
  def setStart(point: Point): Line = js.native
  def setStartArrow(style: ArrowStyle): Line = js.native
  def setStartConnection(connectionSite: ConnectionSite): Line = js.native
  def setTitle(title: String): Line = js.native
  def setTop(top: Double): Line = js.native
  def setTransform(transform: AffineTransform): Line = js.native
  def setWeight(points: Double): Line = js.native
  def setWidth(width: Double): Line = js.native
}

@js.native
sealed trait LineCategory extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.LineCategory")
object LineCategory extends js.Object {
  var UNSUPPORTED: LineCategory = js.native
  var STRAIGHT: LineCategory = js.native
  var BENT: LineCategory = js.native
  var CURVED: LineCategory = js.native
  @JSBracketAccess
  def apply(value: LineCategory): String = js.native
}

@js.native
trait LineFill extends js.Object {
  def getFillType(): LineFillType = js.native
  def getSolidFill(): SolidFill = js.native
  def setSolidFill(color: Color): Unit = js.native
  def setSolidFill(color: Color, alpha: Double): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
  def setSolidFill(hexString: String): Unit = js.native
  def setSolidFill(hexString: String, alpha: Double): Unit = js.native
  def setSolidFill(color: ThemeColorType): Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
}

@js.native
sealed trait LineFillType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.LineFillType")
object LineFillType extends js.Object {
  var UNSUPPORTED: LineFillType = js.native
  var NONE: LineFillType = js.native
  var SOLID: LineFillType = js.native
  @JSBracketAccess
  def apply(value: LineFillType): String = js.native
}

@js.native
sealed trait LineType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.LineType")
object LineType extends js.Object {
  var UNSUPPORTED: LineType = js.native
  var STRAIGHT_CONNECTOR_1: LineType = js.native
  var BENT_CONNECTOR_2: LineType = js.native
  var BENT_CONNECTOR_3: LineType = js.native
  var BENT_CONNECTOR_4: LineType = js.native
  var BENT_CONNECTOR_5: LineType = js.native
  var CURVED_CONNECTOR_2: LineType = js.native
  var CURVED_CONNECTOR_3: LineType = js.native
  var CURVED_CONNECTOR_4: LineType = js.native
  var CURVED_CONNECTOR_5: LineType = js.native
  var STRAIGHT_LINE: LineType = js.native
  @JSBracketAccess
  def apply(value: LineType): String = js.native
}

@js.native
trait Link extends js.Object {
  def getLinkType(): LinkType = js.native
  def getLinkedSlide(): Slide = js.native
  def getSlideId(): String = js.native
  def getSlideIndex(): Integer = js.native
  def getSlidePosition(): SlidePosition = js.native
  def getUrl(): String = js.native
}

@js.native
sealed trait LinkType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.LinkType")
object LinkType extends js.Object {
  var UNSUPPORTED: LinkType = js.native
  var URL: LinkType = js.native
  var SLIDE_POSITION: LinkType = js.native
  var SLIDE_ID: LinkType = js.native
  var SLIDE_INDEX: LinkType = js.native
  @JSBracketAccess
  def apply(value: LinkType): String = js.native
}

@js.native
trait List extends js.Object {
  def getListId(): String = js.native
  def getListParagraphs(): js.Array[Paragraph] = js.native
}

@js.native
sealed trait ListPreset extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.ListPreset")
object ListPreset extends js.Object {
  var DISC_CIRCLE_SQUARE: ListPreset = js.native
  var DIAMONDX_ARROW3D_SQUARE: ListPreset = js.native
  var CHECKBOX: ListPreset = js.native
  var ARROW_DIAMOND_DISC: ListPreset = js.native
  var STAR_CIRCLE_SQUARE: ListPreset = js.native
  var ARROW3D_CIRCLE_SQUARE: ListPreset = js.native
  var LEFTTRIANGLE_DIAMOND_DISC: ListPreset = js.native
  var DIAMONDX_HOLLOWDIAMOND_SQUARE: ListPreset = js.native
  var DIAMOND_CIRCLE_SQUARE: ListPreset = js.native
  var DIGIT_ALPHA_ROMAN: ListPreset = js.native
  var DIGIT_ALPHA_ROMAN_PARENS: ListPreset = js.native
  var DIGIT_NESTED: ListPreset = js.native
  var UPPERALPHA_ALPHA_ROMAN: ListPreset = js.native
  var UPPERROMAN_UPPERALPHA_DIGIT: ListPreset = js.native
  var ZERODIGIT_ALPHA_ROMAN: ListPreset = js.native
  @JSBracketAccess
  def apply(value: ListPreset): String = js.native
}

@js.native
trait ListStyle extends js.Object {
  def applyListPreset(listPreset: ListPreset): ListStyle = js.native
  def getGlyph(): String = js.native
  def getList(): List = js.native
  def getNestingLevel(): Integer = js.native
  def isInList(): Boolean = js.native
  def removeFromList(): ListStyle = js.native
}

@js.native
trait Master extends js.Object {
  def getBackground(): PageBackground = js.native
  def getColorScheme(): ColorScheme = js.native
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLayouts(): js.Array[Layout] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPageType(): PageType = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def group(pageElements: js.Array[PageElement]): Group = js.native
  def insertGroup(group: Group): Group = js.native
  def insertImage(blobSource: BlobSource): Image = js.native
  def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertImage(image: Image): Image = js.native
  def insertImage(imageUrl: String): Image = js.native
  def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertLine(line: Line): Line = js.native
  def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): Line = js.native
  def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Line = js.native
  def insertPageElement(pageElement: PageElement): PageElement = js.native
  def insertShape(shape: Shape): Shape = js.native
  def insertShape(shapeType: ShapeType): Shape = js.native
  def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): SheetsChart = js.native
  def insertSheetsChart(sheetsChart: SheetsChart): SheetsChart = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertTable(numRows: Integer, numColumns: Integer): Table = js.native
  def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): Table = js.native
  def insertTable(table: Table): Table = js.native
  def insertTextBox(text: String): Shape = js.native
  def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertVideo(videoUrl: String): Video = js.native
  def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): Video = js.native
  def insertVideo(video: Video): Video = js.native
  def insertWordArt(wordArt: WordArt): WordArt = js.native
  def remove(): Unit = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def selectAsCurrentPage(): Unit = js.native
}

@js.native
trait NotesMaster extends js.Object {
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
}

@js.native
trait NotesPage extends js.Object {
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getSpeakerNotesShape(): Shape = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
}

@js.native
trait Page extends js.Object {
  def asLayout(): Layout = js.native
  def asMaster(): Master = js.native
  def asSlide(): Slide = js.native
  def getBackground(): PageBackground = js.native
  def getColorScheme(): ColorScheme = js.native
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLines(): js.Array[Line] = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPageType(): PageType = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def group(pageElements: js.Array[PageElement]): Group = js.native
  def insertGroup(group: Group): Group = js.native
  def insertImage(blobSource: BlobSource): Image = js.native
  def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertImage(image: Image): Image = js.native
  def insertImage(imageUrl: String): Image = js.native
  def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertLine(line: Line): Line = js.native
  def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): Line = js.native
  def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Line = js.native
  def insertPageElement(pageElement: PageElement): PageElement = js.native
  def insertShape(shape: Shape): Shape = js.native
  def insertShape(shapeType: ShapeType): Shape = js.native
  def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): SheetsChart = js.native
  def insertSheetsChart(sheetsChart: SheetsChart): SheetsChart = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertTable(numRows: Integer, numColumns: Integer): Table = js.native
  def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): Table = js.native
  def insertTable(table: Table): Table = js.native
  def insertTextBox(text: String): Shape = js.native
  def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertVideo(videoUrl: String): Video = js.native
  def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): Video = js.native
  def insertVideo(video: Video): Video = js.native
  def insertWordArt(wordArt: WordArt): WordArt = js.native
  def remove(): Unit = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def selectAsCurrentPage(): Unit = js.native
}

@js.native
trait PageBackground extends js.Object {
  def getPictureFill(): PictureFill = js.native
  def getSolidFill(): SolidFill = js.native
  def getType(): PageBackgroundType = js.native
  def isVisible(): Boolean = js.native
  def setPictureFill(blobSource: BlobSource): Unit = js.native
  def setPictureFill(imageUrl: String): Unit = js.native
  def setSolidFill(color: Color): Unit = js.native
  def setSolidFill(color: Color, alpha: Double): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
  def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
  def setSolidFill(hexString: String): Unit = js.native
  def setSolidFill(hexString: String, alpha: Double): Unit = js.native
  def setSolidFill(color: ThemeColorType): Unit = js.native
  def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
  def setTransparent(): Unit = js.native
}

@js.native
sealed trait PageBackgroundType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
object PageBackgroundType extends js.Object {
  var UNSUPPORTED: PageBackgroundType = js.native
  var NONE: PageBackgroundType = js.native
  var SOLID: PageBackgroundType = js.native
  var PICTURE: PageBackgroundType = js.native
  @JSBracketAccess
  def apply(value: PageBackgroundType): String = js.native
}

@js.native
trait PageElement extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): PageElement = js.native
  def asGroup(): Group = js.native
  def asImage(): Image = js.native
  def asLine(): Line = js.native
  def asShape(): Shape = js.native
  def asSheetsChart(): SheetsChart = js.native
  def asTable(): Table = js.native
  def asVideo(): Video = js.native
  def asWordArt(): WordArt = js.native
  def bringForward(): PageElement = js.native
  def bringToFront(): PageElement = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): PageElement = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): PageElement = js.native
  def scaleWidth(ratio: Double): PageElement = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): PageElement = js.native
  def sendToBack(): PageElement = js.native
  def setDescription(description: String): PageElement = js.native
  def setHeight(height: Double): PageElement = js.native
  def setLeft(left: Double): PageElement = js.native
  def setRotation(angle: Double): PageElement = js.native
  def setTitle(title: String): PageElement = js.native
  def setTop(top: Double): PageElement = js.native
  def setTransform(transform: AffineTransform): PageElement = js.native
  def setWidth(width: Double): PageElement = js.native
}

@js.native
trait PageElementRange extends js.Object {
  def getPageElements(): js.Array[PageElement] = js.native
}

@js.native
sealed trait PageElementType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.PageElementType")
object PageElementType extends js.Object {
  var UNSUPPORTED: PageElementType = js.native
  var SHAPE: PageElementType = js.native
  var IMAGE: PageElementType = js.native
  var VIDEO: PageElementType = js.native
  var TABLE: PageElementType = js.native
  var GROUP: PageElementType = js.native
  var LINE: PageElementType = js.native
  var WORD_ART: PageElementType = js.native
  var SHEETS_CHART: PageElementType = js.native
  @JSBracketAccess
  def apply(value: PageElementType): String = js.native
}

@js.native
trait PageRange extends js.Object {
  def getPages(): js.Array[Page] = js.native
}

@js.native
sealed trait PageType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.PageType")
object PageType extends js.Object {
  var UNSUPPORTED: PageType = js.native
  var SLIDE: PageType = js.native
  var LAYOUT: PageType = js.native
  var MASTER: PageType = js.native
  @JSBracketAccess
  def apply(value: PageType): String = js.native
}

@js.native
trait Paragraph extends js.Object {
  def getIndex(): Integer = js.native
  def getRange(): TextRange = js.native
}

@js.native
sealed trait ParagraphAlignment extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
object ParagraphAlignment extends js.Object {
  var UNSUPPORTED: ParagraphAlignment = js.native
  var START: ParagraphAlignment = js.native
  var CENTER: ParagraphAlignment = js.native
  var END: ParagraphAlignment = js.native
  var JUSTIFIED: ParagraphAlignment = js.native
  @JSBracketAccess
  def apply(value: ParagraphAlignment): String = js.native
}

@js.native
trait ParagraphStyle extends js.Object {
  def getIndentEnd(): Double = js.native
  def getIndentFirstLine(): Double = js.native
  def getIndentStart(): Double = js.native
  def getLineSpacing(): Double = js.native
  def getParagraphAlignment(): ParagraphAlignment = js.native
  def getSpaceAbove(): Double = js.native
  def getSpaceBelow(): Double = js.native
  def getSpacingMode(): SpacingMode = js.native
  def getTextDirection(): TextDirection = js.native
  def setIndentEnd(indent: Double): ParagraphStyle = js.native
  def setIndentFirstLine(indent: Double): ParagraphStyle = js.native
  def setIndentStart(indent: Double): ParagraphStyle = js.native
  def setLineSpacing(spacing: Double): ParagraphStyle = js.native
  def setParagraphAlignment(alignment: ParagraphAlignment): ParagraphStyle = js.native
  def setSpaceAbove(space: Double): ParagraphStyle = js.native
  def setSpaceBelow(space: Double): ParagraphStyle = js.native
  def setSpacingMode(mode: SpacingMode): ParagraphStyle = js.native
  def setTextDirection(direction: TextDirection): ParagraphStyle = js.native
}

@js.native
trait PictureFill extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContentUrl(): String = js.native
  def getSourceUrl(): String = js.native
}

@js.native
sealed trait PlaceholderType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
object PlaceholderType extends js.Object {
  var UNSUPPORTED: PlaceholderType = js.native
  var NONE: PlaceholderType = js.native
  var BODY: PlaceholderType = js.native
  var CHART: PlaceholderType = js.native
  var CLIP_ART: PlaceholderType = js.native
  var CENTERED_TITLE: PlaceholderType = js.native
  var DIAGRAM: PlaceholderType = js.native
  var DATE_AND_TIME: PlaceholderType = js.native
  var FOOTER: PlaceholderType = js.native
  var HEADER: PlaceholderType = js.native
  var MEDIA: PlaceholderType = js.native
  var OBJECT: PlaceholderType = js.native
  var PICTURE: PlaceholderType = js.native
  var SLIDE_NUMBER: PlaceholderType = js.native
  var SUBTITLE: PlaceholderType = js.native
  var TABLE: PlaceholderType = js.native
  var TITLE: PlaceholderType = js.native
  var SLIDE_IMAGE: PlaceholderType = js.native
  @JSBracketAccess
  def apply(value: PlaceholderType): String = js.native
}

@js.native
trait Point extends js.Object {
  def getX(): Double = js.native
  def getY(): Double = js.native
}

@js.native
sealed trait PredefinedLayout extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.PredefinedLayout")
object PredefinedLayout extends js.Object {
  var UNSUPPORTED: PredefinedLayout = js.native
  var BLANK: PredefinedLayout = js.native
  var CAPTION_ONLY: PredefinedLayout = js.native
  var TITLE: PredefinedLayout = js.native
  var TITLE_AND_BODY: PredefinedLayout = js.native
  var TITLE_AND_TWO_COLUMNS: PredefinedLayout = js.native
  var TITLE_ONLY: PredefinedLayout = js.native
  var SECTION_HEADER: PredefinedLayout = js.native
  var SECTION_TITLE_AND_DESCRIPTION: PredefinedLayout = js.native
  var ONE_COLUMN_TEXT: PredefinedLayout = js.native
  var MAIN_POINT: PredefinedLayout = js.native
  var BIG_NUMBER: PredefinedLayout = js.native
  @JSBracketAccess
  def apply(value: PredefinedLayout): String = js.native
}

@js.native
trait Presentation extends js.Object {
  def addEditor(emailAddress: String): Presentation = js.native
  def addEditor(user: User): Presentation = js.native
  def addEditors(emailAddresses: js.Array[String]): Presentation = js.native
  def addViewer(emailAddress: String): Presentation = js.native
  def addViewer(user: User): Presentation = js.native
  def addViewers(emailAddresses: js.Array[String]): Presentation = js.native
  def appendSlide(): Slide = js.native
  def appendSlide(layout: Layout): Slide = js.native
  def appendSlide(predefinedLayout: PredefinedLayout): Slide = js.native
  def appendSlide(slide: Slide): Slide = js.native
  def appendSlide(slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
  def getEditors(): js.Array[User] = js.native
  def getId(): String = js.native
  def getLayouts(): js.Array[Layout] = js.native
  def getMasters(): js.Array[Master] = js.native
  def getName(): String = js.native
  def getNotesMaster(): NotesMaster = js.native
  def getNotesPageHeight(): Double = js.native
  def getNotesPageWidth(): Double = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageHeight(): Double = js.native
  def getPageWidth(): Double = js.native
  def getSelection(): Selection = js.native
  def getSlideById(id: String): Slide = js.native
  def getSlides(): js.Array[Slide] = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def insertSlide(insertionIndex: Integer): Slide = js.native
  def insertSlide(insertionIndex: Integer, layout: Layout): Slide = js.native
  def insertSlide(insertionIndex: Integer, predefinedLayout: PredefinedLayout): Slide = js.native
  def insertSlide(insertionIndex: Integer, slide: Slide): Slide = js.native
  def insertSlide(insertionIndex: Integer, slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
  def removeEditor(emailAddress: String): Presentation = js.native
  def removeEditor(user: User): Presentation = js.native
  def removeViewer(emailAddress: String): Presentation = js.native
  def removeViewer(user: User): Presentation = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def saveAndClose(): Unit = js.native
  def setName(name: String): Unit = js.native
}

@js.native
trait Selection extends js.Object {
  def getCurrentPage(): Page = js.native
  def getPageElementRange(): PageElementRange = js.native
  def getPageRange(): PageRange = js.native
  def getSelectionType(): SelectionType = js.native
  def getTableCellRange(): TableCellRange = js.native
  def getTextRange(): TextRange = js.native
}

@js.native
sealed trait SelectionType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.SelectionType")
object SelectionType extends js.Object {
  var UNSUPPORTED: SelectionType = js.native
  var NONE: SelectionType = js.native
  var TEXT: SelectionType = js.native
  var TABLE_CELL: SelectionType = js.native
  var PAGE: SelectionType = js.native
  var PAGE_ELEMENT: SelectionType = js.native
  var CURRENT_PAGE: SelectionType = js.native
  @JSBracketAccess
  def apply(value: SelectionType): String = js.native
}

@js.native
trait Shape extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Shape = js.native
  def bringForward(): Shape = js.native
  def bringToFront(): Shape = js.native
  def duplicate(): PageElement = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getContentAlignment(): ContentAlignment = js.native
  def getDescription(): String = js.native
  def getFill(): Fill = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getParentPlaceholder(): PageElement = js.native
  def getPlaceholderIndex(): Integer = js.native
  def getPlaceholderType(): PlaceholderType = js.native
  def getRotation(): Double = js.native
  def getShapeType(): ShapeType = js.native
  def getText(): TextRange = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Shape = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def replaceWithImage(blobSource: BlobSource): Image = js.native
  def replaceWithImage(blobSource: BlobSource, crop: Boolean): Image = js.native
  def replaceWithImage(imageUrl: String): Image = js.native
  def replaceWithImage(imageUrl: String, crop: Boolean): Image = js.native
  def replaceWithSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def replaceWithSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def scaleHeight(ratio: Double): Shape = js.native
  def scaleWidth(ratio: Double): Shape = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Shape = js.native
  def sendToBack(): Shape = js.native
  def setContentAlignment(contentAlignment: ContentAlignment): Shape = js.native
  def setDescription(description: String): Shape = js.native
  def setHeight(height: Double): Shape = js.native
  def setLeft(left: Double): Shape = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): Shape = js.native
  def setTitle(title: String): Shape = js.native
  def setTop(top: Double): Shape = js.native
  def setTransform(transform: AffineTransform): Shape = js.native
  def setWidth(width: Double): Shape = js.native
}

@js.native
sealed trait ShapeType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.ShapeType")
object ShapeType extends js.Object {
  var UNSUPPORTED: ShapeType = js.native
  var TEXT_BOX: ShapeType = js.native
  var RECTANGLE: ShapeType = js.native
  var ROUND_RECTANGLE: ShapeType = js.native
  var ELLIPSE: ShapeType = js.native
  var ARC: ShapeType = js.native
  var BENT_ARROW: ShapeType = js.native
  var BENT_UP_ARROW: ShapeType = js.native
  var BEVEL: ShapeType = js.native
  var BLOCK_ARC: ShapeType = js.native
  var BRACE_PAIR: ShapeType = js.native
  var BRACKET_PAIR: ShapeType = js.native
  var CAN: ShapeType = js.native
  var CHEVRON: ShapeType = js.native
  var CHORD: ShapeType = js.native
  var CLOUD: ShapeType = js.native
  var CORNER: ShapeType = js.native
  var CUBE: ShapeType = js.native
  var CURVED_DOWN_ARROW: ShapeType = js.native
  var CURVED_LEFT_ARROW: ShapeType = js.native
  var CURVED_RIGHT_ARROW: ShapeType = js.native
  var CURVED_UP_ARROW: ShapeType = js.native
  var DECAGON: ShapeType = js.native
  var DIAGONAL_STRIPE: ShapeType = js.native
  var DIAMOND: ShapeType = js.native
  var DODECAGON: ShapeType = js.native
  var DONUT: ShapeType = js.native
  var DOUBLE_WAVE: ShapeType = js.native
  var DOWN_ARROW: ShapeType = js.native
  var DOWN_ARROW_CALLOUT: ShapeType = js.native
  var FOLDED_CORNER: ShapeType = js.native
  var FRAME: ShapeType = js.native
  var HALF_FRAME: ShapeType = js.native
  var HEART: ShapeType = js.native
  var HEPTAGON: ShapeType = js.native
  var HEXAGON: ShapeType = js.native
  var HOME_PLATE: ShapeType = js.native
  var HORIZONTAL_SCROLL: ShapeType = js.native
  var IRREGULAR_SEAL_1: ShapeType = js.native
  var IRREGULAR_SEAL_2: ShapeType = js.native
  var LEFT_ARROW: ShapeType = js.native
  var LEFT_ARROW_CALLOUT: ShapeType = js.native
  var LEFT_BRACE: ShapeType = js.native
  var LEFT_BRACKET: ShapeType = js.native
  var LEFT_RIGHT_ARROW: ShapeType = js.native
  var LEFT_RIGHT_ARROW_CALLOUT: ShapeType = js.native
  var LEFT_RIGHT_UP_ARROW: ShapeType = js.native
  var LEFT_UP_ARROW: ShapeType = js.native
  var LIGHTNING_BOLT: ShapeType = js.native
  var MATH_DIVIDE: ShapeType = js.native
  var MATH_EQUAL: ShapeType = js.native
  var MATH_MINUS: ShapeType = js.native
  var MATH_MULTIPLY: ShapeType = js.native
  var MATH_NOT_EQUAL: ShapeType = js.native
  var MATH_PLUS: ShapeType = js.native
  var MOON: ShapeType = js.native
  var NO_SMOKING: ShapeType = js.native
  var NOTCHED_RIGHT_ARROW: ShapeType = js.native
  var OCTAGON: ShapeType = js.native
  var PARALLELOGRAM: ShapeType = js.native
  var PENTAGON: ShapeType = js.native
  var PIE: ShapeType = js.native
  var PLAQUE: ShapeType = js.native
  var PLUS: ShapeType = js.native
  var QUAD_ARROW: ShapeType = js.native
  var QUAD_ARROW_CALLOUT: ShapeType = js.native
  var RIBBON: ShapeType = js.native
  var RIBBON_2: ShapeType = js.native
  var RIGHT_ARROW: ShapeType = js.native
  var RIGHT_ARROW_CALLOUT: ShapeType = js.native
  var RIGHT_BRACE: ShapeType = js.native
  var RIGHT_BRACKET: ShapeType = js.native
  var ROUND_1_RECTANGLE: ShapeType = js.native
  var ROUND_2_DIAGONAL_RECTANGLE: ShapeType = js.native
  var ROUND_2_SAME_RECTANGLE: ShapeType = js.native
  var RIGHT_TRIANGLE: ShapeType = js.native
  var SMILEY_FACE: ShapeType = js.native
  var SNIP_1_RECTANGLE: ShapeType = js.native
  var SNIP_2_DIAGONAL_RECTANGLE: ShapeType = js.native
  var SNIP_2_SAME_RECTANGLE: ShapeType = js.native
  var SNIP_ROUND_RECTANGLE: ShapeType = js.native
  var STAR_10: ShapeType = js.native
  var STAR_12: ShapeType = js.native
  var STAR_16: ShapeType = js.native
  var STAR_24: ShapeType = js.native
  var STAR_32: ShapeType = js.native
  var STAR_4: ShapeType = js.native
  var STAR_5: ShapeType = js.native
  var STAR_6: ShapeType = js.native
  var STAR_7: ShapeType = js.native
  var STAR_8: ShapeType = js.native
  var STRIPED_RIGHT_ARROW: ShapeType = js.native
  var SUN: ShapeType = js.native
  var TRAPEZOID: ShapeType = js.native
  var TRIANGLE: ShapeType = js.native
  var UP_ARROW: ShapeType = js.native
  var UP_ARROW_CALLOUT: ShapeType = js.native
  var UP_DOWN_ARROW: ShapeType = js.native
  var UTURN_ARROW: ShapeType = js.native
  var VERTICAL_SCROLL: ShapeType = js.native
  var WAVE: ShapeType = js.native
  var WEDGE_ELLIPSE_CALLOUT: ShapeType = js.native
  var WEDGE_RECTANGLE_CALLOUT: ShapeType = js.native
  var WEDGE_ROUND_RECTANGLE_CALLOUT: ShapeType = js.native
  var FLOW_CHART_ALTERNATE_PROCESS: ShapeType = js.native
  var FLOW_CHART_COLLATE: ShapeType = js.native
  var FLOW_CHART_CONNECTOR: ShapeType = js.native
  var FLOW_CHART_DECISION: ShapeType = js.native
  var FLOW_CHART_DELAY: ShapeType = js.native
  var FLOW_CHART_DISPLAY: ShapeType = js.native
  var FLOW_CHART_DOCUMENT: ShapeType = js.native
  var FLOW_CHART_EXTRACT: ShapeType = js.native
  var FLOW_CHART_INPUT_OUTPUT: ShapeType = js.native
  var FLOW_CHART_INTERNAL_STORAGE: ShapeType = js.native
  var FLOW_CHART_MAGNETIC_DISK: ShapeType = js.native
  var FLOW_CHART_MAGNETIC_DRUM: ShapeType = js.native
  var FLOW_CHART_MAGNETIC_TAPE: ShapeType = js.native
  var FLOW_CHART_MANUAL_INPUT: ShapeType = js.native
  var FLOW_CHART_MANUAL_OPERATION: ShapeType = js.native
  var FLOW_CHART_MERGE: ShapeType = js.native
  var FLOW_CHART_MULTIDOCUMENT: ShapeType = js.native
  var FLOW_CHART_OFFLINE_STORAGE: ShapeType = js.native
  var FLOW_CHART_OFFPAGE_CONNECTOR: ShapeType = js.native
  var FLOW_CHART_ONLINE_STORAGE: ShapeType = js.native
  var FLOW_CHART_OR: ShapeType = js.native
  var FLOW_CHART_PREDEFINED_PROCESS: ShapeType = js.native
  var FLOW_CHART_PREPARATION: ShapeType = js.native
  var FLOW_CHART_PROCESS: ShapeType = js.native
  var FLOW_CHART_PUNCHED_CARD: ShapeType = js.native
  var FLOW_CHART_PUNCHED_TAPE: ShapeType = js.native
  var FLOW_CHART_SORT: ShapeType = js.native
  var FLOW_CHART_SUMMING_JUNCTION: ShapeType = js.native
  var FLOW_CHART_TERMINATOR: ShapeType = js.native
  var ARROW_EAST: ShapeType = js.native
  var ARROW_NORTH_EAST: ShapeType = js.native
  var ARROW_NORTH: ShapeType = js.native
  var SPEECH: ShapeType = js.native
  var STARBURST: ShapeType = js.native
  var TEARDROP: ShapeType = js.native
  var ELLIPSE_RIBBON: ShapeType = js.native
  var ELLIPSE_RIBBON_2: ShapeType = js.native
  var CLOUD_CALLOUT: ShapeType = js.native
  var CUSTOM: ShapeType = js.native
  @JSBracketAccess
  def apply(value: ShapeType): String = js.native
}

@js.native
trait SheetsChart extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): SheetsChart = js.native
  def asImage(): Image = js.native
  def bringForward(): SheetsChart = js.native
  def bringToFront(): SheetsChart = js.native
  def duplicate(): PageElement = js.native
  def getChartId(): Integer = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getEmbedType(): SheetsChartEmbedType = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getSpreadsheetId(): String = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): SheetsChart = js.native
  def refresh(): Unit = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def scaleHeight(ratio: Double): SheetsChart = js.native
  def scaleWidth(ratio: Double): SheetsChart = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): SheetsChart = js.native
  def sendToBack(): SheetsChart = js.native
  def setDescription(description: String): SheetsChart = js.native
  def setHeight(height: Double): SheetsChart = js.native
  def setLeft(left: Double): SheetsChart = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): SheetsChart = js.native
  def setTitle(title: String): SheetsChart = js.native
  def setTop(top: Double): SheetsChart = js.native
  def setTransform(transform: AffineTransform): SheetsChart = js.native
  def setWidth(width: Double): SheetsChart = js.native
}

@js.native
sealed trait SheetsChartEmbedType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
object SheetsChartEmbedType extends js.Object {
  var UNSUPPORTED: SheetsChartEmbedType = js.native
  var IMAGE: SheetsChartEmbedType = js.native
  @JSBracketAccess
  def apply(value: SheetsChartEmbedType): String = js.native
}

@js.native
trait Slide extends js.Object {
  def duplicate(): Slide = js.native
  def getBackground(): PageBackground = js.native
  def getColorScheme(): ColorScheme = js.native
  def getGroups(): js.Array[Group] = js.native
  def getImages(): js.Array[Image] = js.native
  def getLayout(): Layout = js.native
  def getLines(): js.Array[Line] = js.native
  def getNotesPage(): NotesPage = js.native
  def getObjectId(): String = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageElements(): js.Array[PageElement] = js.native
  def getPageType(): PageType = js.native
  def getPlaceholder(placeholderType: PlaceholderType): PageElement = js.native
  def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): PageElement = js.native
  def getPlaceholders(): js.Array[PageElement] = js.native
  def getShapes(): js.Array[Shape] = js.native
  def getSheetsCharts(): js.Array[SheetsChart] = js.native
  def getSlideLinkingMode(): SlideLinkingMode = js.native
  def getSourcePresentationId(): String = js.native
  def getSourceSlideObjectId(): String = js.native
  def getTables(): js.Array[Table] = js.native
  def getVideos(): js.Array[Video] = js.native
  def getWordArts(): js.Array[WordArt] = js.native
  def group(pageElements: js.Array[PageElement]): Group = js.native
  def insertGroup(group: Group): Group = js.native
  def insertImage(blobSource: BlobSource): Image = js.native
  def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertImage(image: Image): Image = js.native
  def insertImage(imageUrl: String): Image = js.native
  def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertLine(line: Line): Line = js.native
  def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): Line = js.native
  def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): Line = js.native
  def insertPageElement(pageElement: PageElement): PageElement = js.native
  def insertShape(shape: Shape): Shape = js.native
  def insertShape(shapeType: ShapeType): Shape = js.native
  def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart): SheetsChart = js.native
  def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): SheetsChart = js.native
  def insertSheetsChart(sheetsChart: SheetsChart): SheetsChart = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart): Image = js.native
  def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): Image = js.native
  def insertTable(numRows: Integer, numColumns: Integer): Table = js.native
  def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): Table = js.native
  def insertTable(table: Table): Table = js.native
  def insertTextBox(text: String): Shape = js.native
  def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): Shape = js.native
  def insertVideo(videoUrl: String): Video = js.native
  def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): Video = js.native
  def insertVideo(video: Video): Video = js.native
  def insertWordArt(wordArt: WordArt): WordArt = js.native
  def move(index: Integer): Unit = js.native
  def refreshSlide(): Unit = js.native
  def remove(): Unit = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def selectAsCurrentPage(): Unit = js.native
  def unlink(): Unit = js.native
}

@js.native
sealed trait SlideLinkingMode extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
object SlideLinkingMode extends js.Object {
  var UNSUPPORTED: SlideLinkingMode = js.native
  var LINKED: SlideLinkingMode = js.native
  var NOT_LINKED: SlideLinkingMode = js.native
  @JSBracketAccess
  def apply(value: SlideLinkingMode): String = js.native
}

@js.native
sealed trait SlidePosition extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.SlidePosition")
object SlidePosition extends js.Object {
  var NEXT_SLIDE: SlidePosition = js.native
  var PREVIOUS_SLIDE: SlidePosition = js.native
  var FIRST_SLIDE: SlidePosition = js.native
  var LAST_SLIDE: SlidePosition = js.native
  @JSBracketAccess
  def apply(value: SlidePosition): String = js.native
}

@js.native
trait SlidesApp extends js.Object {
  var AlignmentPosition: AlignmentPosition = js.native
  var ArrowStyle: ArrowStyle = js.native
  var AutoTextType: AutoTextType = js.native
  var CellMergeState: CellMergeState = js.native
  var ColorType: ColorType = js.native
  var ContentAlignment: ContentAlignment = js.native
  var DashStyle: DashStyle = js.native
  var FillType: FillType = js.native
  var LineCategory: LineCategory = js.native
  var LineFillType: LineFillType = js.native
  var LineType: LineType = js.native
  var LinkType: LinkType = js.native
  var ListPreset: ListPreset = js.native
  var PageBackgroundType: PageBackgroundType = js.native
  var PageElementType: PageElementType = js.native
  var PageType: PageType = js.native
  var ParagraphAlignment: ParagraphAlignment = js.native
  var PlaceholderType: PlaceholderType = js.native
  var PredefinedLayout: PredefinedLayout = js.native
  var SelectionType: SelectionType = js.native
  var ShapeType: ShapeType = js.native
  var SheetsChartEmbedType: SheetsChartEmbedType = js.native
  var SlideLinkingMode: SlideLinkingMode = js.native
  var SlidePosition: SlidePosition = js.native
  var SpacingMode: SpacingMode = js.native
  var TextBaselineOffset: TextBaselineOffset = js.native
  var TextDirection: TextDirection = js.native
  var ThemeColorType: ThemeColorType = js.native
  var VideoSourceType: VideoSourceType = js.native
  def create(name: String): Presentation = js.native
  def getActivePresentation(): Presentation = js.native
  def getUi(): Ui = js.native
  def newAffineTransformBuilder(): AffineTransformBuilder = js.native
  def openById(id: String): Presentation = js.native
  def openByUrl(url: String): Presentation = js.native
}

@js.native
trait SolidFill extends js.Object {
  def getAlpha(): Double = js.native
  def getColor(): Color = js.native
}

@js.native
sealed trait SpacingMode extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.SpacingMode")
object SpacingMode extends js.Object {
  var UNSUPPORTED: SpacingMode = js.native
  var NEVER_COLLAPSE: SpacingMode = js.native
  var COLLAPSE_LISTS: SpacingMode = js.native
  @JSBracketAccess
  def apply(value: SpacingMode): String = js.native
}

@js.native
trait Table extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Table = js.native
  def appendColumn(): TableColumn = js.native
  def appendRow(): TableRow = js.native
  def bringForward(): Table = js.native
  def bringToFront(): Table = js.native
  def duplicate(): PageElement = js.native
  def getCell(rowIndex: Integer, columnIndex: Integer): TableCell = js.native
  def getColumn(columnIndex: Integer): TableColumn = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getNumColumns(): Integer = js.native
  def getNumRows(): Integer = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getRow(rowIndex: Integer): TableRow = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def insertColumn(index: Integer): TableColumn = js.native
  def insertRow(index: Integer): TableRow = js.native
  def preconcatenateTransform(transform: AffineTransform): Table = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): Table = js.native
  def scaleWidth(ratio: Double): Table = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Table = js.native
  def sendToBack(): Table = js.native
  def setDescription(description: String): Table = js.native
  def setHeight(height: Double): Table = js.native
  def setLeft(left: Double): Table = js.native
  def setRotation(angle: Double): Table = js.native
  def setTitle(title: String): Table = js.native
  def setTop(top: Double): Table = js.native
  def setTransform(transform: AffineTransform): Table = js.native
  def setWidth(width: Double): Table = js.native
}

@js.native
trait TableCell extends js.Object {
  def getColumnIndex(): Integer = js.native
  def getColumnSpan(): Integer = js.native
  def getContentAlignment(): ContentAlignment = js.native
  def getFill(): Fill = js.native
  def getHeadCell(): TableCell = js.native
  def getMergeState(): CellMergeState = js.native
  def getParentColumn(): TableColumn = js.native
  def getParentRow(): TableRow = js.native
  def getParentTable(): Table = js.native
  def getRowIndex(): Integer = js.native
  def getRowSpan(): Integer = js.native
  def getText(): TextRange = js.native
  def setContentAlignment(contentAlignment: ContentAlignment): TableCell = js.native
}

@js.native
trait TableCellRange extends js.Object {
  def getTableCells(): js.Array[TableCell] = js.native
}

@js.native
trait TableColumn extends js.Object {
  def getCell(cellIndex: Integer): TableCell = js.native
  def getIndex(): Integer = js.native
  def getNumCells(): Integer = js.native
  def getParentTable(): Table = js.native
  def getWidth(): Double = js.native
  def remove(): Unit = js.native
}

@js.native
trait TableRow extends js.Object {
  def getCell(cellIndex: Integer): TableCell = js.native
  def getIndex(): Integer = js.native
  def getMinimumHeight(): Double = js.native
  def getNumCells(): Integer = js.native
  def getParentTable(): Table = js.native
  def remove(): Unit = js.native
}

@js.native
sealed trait TextBaselineOffset extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
object TextBaselineOffset extends js.Object {
  var UNSUPPORTED: TextBaselineOffset = js.native
  var NONE: TextBaselineOffset = js.native
  var SUPERSCRIPT: TextBaselineOffset = js.native
  var SUBSCRIPT: TextBaselineOffset = js.native
  @JSBracketAccess
  def apply(value: TextBaselineOffset): String = js.native
}

@js.native
sealed trait TextDirection extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.TextDirection")
object TextDirection extends js.Object {
  var UNSUPPORTED: TextDirection = js.native
  var LEFT_TO_RIGHT: TextDirection = js.native
  var RIGHT_TO_LEFT: TextDirection = js.native
  @JSBracketAccess
  def apply(value: TextDirection): String = js.native
}

@js.native
trait TextRange extends js.Object {
  def appendParagraph(text: String): Paragraph = js.native
  def appendRange(textRange: TextRange): TextRange = js.native
  def appendRange(textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
  def appendText(text: String): TextRange = js.native
  def asRenderedString(): String = js.native
  def asString(): String = js.native
  def clear(): Unit = js.native
  def clear(startOffset: Integer, endOffset: Integer): Unit = js.native
  def find(pattern: String): js.Array[TextRange] = js.native
  def find(pattern: String, startOffset: Integer): js.Array[TextRange] = js.native
  def getAutoTexts(): js.Array[AutoText] = js.native
  def getEndIndex(): Integer = js.native
  def getLength(): Integer = js.native
  def getLinks(): js.Array[TextRange] = js.native
  def getListParagraphs(): js.Array[Paragraph] = js.native
  def getListStyle(): ListStyle = js.native
  def getParagraphStyle(): ParagraphStyle = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getRange(startOffset: Integer, endOffset: Integer): TextRange = js.native
  def getRuns(): js.Array[TextRange] = js.native
  def getStartIndex(): Integer = js.native
  def getTextStyle(): TextStyle = js.native
  def insertParagraph(startOffset: Integer, text: String): Paragraph = js.native
  def insertRange(startOffset: Integer, textRange: TextRange): TextRange = js.native
  def insertRange(startOffset: Integer, textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
  def insertText(startOffset: Integer, text: String): TextRange = js.native
  def isEmpty(): Boolean = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def select(): Unit = js.native
  def setText(newText: String): TextRange = js.native
}

@js.native
trait TextStyle extends js.Object {
  def getBackgroundColor(): Color = js.native
  def getBaselineOffset(): TextBaselineOffset = js.native
  def getFontFamily(): String = js.native
  def getFontSize(): Double = js.native
  def getFontWeight(): Integer = js.native
  def getForegroundColor(): Color = js.native
  def getLink(): Link = js.native
  def hasLink(): Boolean = js.native
  def isBackgroundTransparent(): Boolean = js.native
  def isBold(): Boolean = js.native
  def isItalic(): Boolean = js.native
  def isSmallCaps(): Boolean = js.native
  def isStrikethrough(): Boolean = js.native
  def isUnderline(): Boolean = js.native
  def removeLink(): TextStyle = js.native
  def setBackgroundColor(color: Color): TextStyle = js.native
  def setBackgroundColor(red: Integer, green: Integer, blue: Integer): TextStyle = js.native
  def setBackgroundColor(hexColor: String): TextStyle = js.native
  def setBackgroundColor(color: ThemeColorType): TextStyle = js.native
  def setBackgroundColorTransparent(): TextStyle = js.native
  def setBaselineOffset(offset: TextBaselineOffset): TextStyle = js.native
  def setBold(bold: Boolean): TextStyle = js.native
  def setFontFamily(fontFamily: String): TextStyle = js.native
  def setFontFamilyAndWeight(fontFamily: String, fontWeight: Integer): TextStyle = js.native
  def setFontSize(fontSize: Double): TextStyle = js.native
  def setForegroundColor(foregroundColor: Color): TextStyle = js.native
  def setForegroundColor(red: Integer, green: Integer, blue: Integer): TextStyle = js.native
  def setForegroundColor(hexColor: String): TextStyle = js.native
  def setForegroundColor(color: ThemeColorType): TextStyle = js.native
  def setItalic(italic: Boolean): TextStyle = js.native
  def setLinkSlide(slideIndex: Integer): TextStyle = js.native
  def setLinkSlide(slide: Slide): TextStyle = js.native
  def setLinkSlide(slidePosition: SlidePosition): TextStyle = js.native
  def setLinkUrl(url: String): TextStyle = js.native
  def setSmallCaps(smallCaps: Boolean): TextStyle = js.native
  def setStrikethrough(strikethrough: Boolean): TextStyle = js.native
  def setUnderline(underline: Boolean): TextStyle = js.native
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
@JSGlobal("GoogleAppsScript.Slides.ThemeColorType")
object ThemeColorType extends js.Object {
  var UNSUPPORTED: ThemeColorType = js.native
  var DARK1: ThemeColorType = js.native
  var LIGHT1: ThemeColorType = js.native
  var DARK2: ThemeColorType = js.native
  var LIGHT2: ThemeColorType = js.native
  var ACCENT1: ThemeColorType = js.native
  var ACCENT2: ThemeColorType = js.native
  var ACCENT3: ThemeColorType = js.native
  var ACCENT4: ThemeColorType = js.native
  var ACCENT5: ThemeColorType = js.native
  var ACCENT6: ThemeColorType = js.native
  var HYPERLINK: ThemeColorType = js.native
  var FOLLOWED_HYPERLINK: ThemeColorType = js.native
  @JSBracketAccess
  def apply(value: ThemeColorType): String = js.native
}

@js.native
trait Video extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): Video = js.native
  def bringForward(): Video = js.native
  def bringToFront(): Video = js.native
  def duplicate(): PageElement = js.native
  def getBorder(): Border = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRotation(): Double = js.native
  def getSource(): VideoSourceType = js.native
  def getThumbnailUrl(): String = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getUrl(): String = js.native
  def getVideoId(): String = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): Video = js.native
  def remove(): Unit = js.native
  def scaleHeight(ratio: Double): Video = js.native
  def scaleWidth(ratio: Double): Video = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): Video = js.native
  def sendToBack(): Video = js.native
  def setDescription(description: String): Video = js.native
  def setHeight(height: Double): Video = js.native
  def setLeft(left: Double): Video = js.native
  def setRotation(angle: Double): Video = js.native
  def setTitle(title: String): Video = js.native
  def setTop(top: Double): Video = js.native
  def setTransform(transform: AffineTransform): Video = js.native
  def setWidth(width: Double): Video = js.native
}

@js.native
sealed trait VideoSourceType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
object VideoSourceType extends js.Object {
  var UNSUPPORTED: VideoSourceType = js.native
  var YOUTUBE: VideoSourceType = js.native
  @JSBracketAccess
  def apply(value: VideoSourceType): String = js.native
}

@js.native
trait WordArt extends js.Object {
  def alignOnPage(alignmentPosition: AlignmentPosition): WordArt = js.native
  def bringForward(): WordArt = js.native
  def bringToFront(): WordArt = js.native
  def duplicate(): PageElement = js.native
  def getConnectionSites(): js.Array[ConnectionSite] = js.native
  def getDescription(): String = js.native
  def getHeight(): Double = js.native
  def getInherentHeight(): Double = js.native
  def getInherentWidth(): Double = js.native
  def getLeft(): Double = js.native
  def getLink(): Link = js.native
  def getObjectId(): String = js.native
  def getPageElementType(): PageElementType = js.native
  def getParentGroup(): Group = js.native
  def getParentPage(): Page = js.native
  def getRenderedText(): String = js.native
  def getRotation(): Double = js.native
  def getTitle(): String = js.native
  def getTop(): Double = js.native
  def getTransform(): AffineTransform = js.native
  def getWidth(): Double = js.native
  def preconcatenateTransform(transform: AffineTransform): WordArt = js.native
  def remove(): Unit = js.native
  def removeLink(): Unit = js.native
  def scaleHeight(ratio: Double): WordArt = js.native
  def scaleWidth(ratio: Double): WordArt = js.native
  def select(): Unit = js.native
  def select(replace: Boolean): Unit = js.native
  def sendBackward(): WordArt = js.native
  def sendToBack(): WordArt = js.native
  def setDescription(description: String): WordArt = js.native
  def setHeight(height: Double): WordArt = js.native
  def setLeft(left: Double): WordArt = js.native
  def setLinkSlide(slideIndex: Integer): Link = js.native
  def setLinkSlide(slide: Slide): Link = js.native
  def setLinkSlide(slidePosition: SlidePosition): Link = js.native
  def setLinkUrl(url: String): Link = js.native
  def setRotation(angle: Double): WordArt = js.native
  def setTitle(title: String): WordArt = js.native
  def setTop(top: Double): WordArt = js.native
  def setTransform(transform: AffineTransform): WordArt = js.native
  def setWidth(width: Double): WordArt = js.native
}
