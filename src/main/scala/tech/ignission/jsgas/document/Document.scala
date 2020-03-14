package tech.ignission.jsgas.document

import tech.ignission.jsgas._
import tech.ignission.jsgas.base.{Blob, BlobSource, Ui, User}

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
sealed trait Attribute extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.Attribute")
object Attribute extends js.Object {
  var BACKGROUND_COLOR: Attribute = js.native
  var BOLD: Attribute = js.native
  var BORDER_COLOR: Attribute = js.native
  var BORDER_WIDTH: Attribute = js.native
  var CODE: Attribute = js.native
  var FONT_FAMILY: Attribute = js.native
  var FONT_SIZE: Attribute = js.native
  var FOREGROUND_COLOR: Attribute = js.native
  var HEADING: Attribute = js.native
  var HEIGHT: Attribute = js.native
  var HORIZONTAL_ALIGNMENT: Attribute = js.native
  var INDENT_END: Attribute = js.native
  var INDENT_FIRST_LINE: Attribute = js.native
  var INDENT_START: Attribute = js.native
  var ITALIC: Attribute = js.native
  var GLYPH_TYPE: Attribute = js.native
  var LEFT_TO_RIGHT: Attribute = js.native
  var LINE_SPACING: Attribute = js.native
  var LINK_URL: Attribute = js.native
  var LIST_ID: Attribute = js.native
  var MARGIN_BOTTOM: Attribute = js.native
  var MARGIN_LEFT: Attribute = js.native
  var MARGIN_RIGHT: Attribute = js.native
  var MARGIN_TOP: Attribute = js.native
  var NESTING_LEVEL: Attribute = js.native
  var MINIMUM_HEIGHT: Attribute = js.native
  var PADDING_BOTTOM: Attribute = js.native
  var PADDING_LEFT: Attribute = js.native
  var PADDING_RIGHT: Attribute = js.native
  var PADDING_TOP: Attribute = js.native
  var PAGE_HEIGHT: Attribute = js.native
  var PAGE_WIDTH: Attribute = js.native
  var SPACING_AFTER: Attribute = js.native
  var SPACING_BEFORE: Attribute = js.native
  var STRIKETHROUGH: Attribute = js.native
  var UNDERLINE: Attribute = js.native
  var VERTICAL_ALIGNMENT: Attribute = js.native
  var WIDTH: Attribute = js.native
  @JSBracketAccess
  def apply(value: Attribute): String = js.native
}

@js.native
trait Body extends Element {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: String): ListItem = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): Body = js.native
  override def copy(): Body = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getHeadingAttributes(paragraphHeading: ParagraphHeading): js.Dynamic = js.native
  def getImages(): js.Array[InlineImage] = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getMarginBottom(): Double = js.native
  def getMarginLeft(): Double = js.native
  def getMarginRight(): Double = js.native
  def getMarginTop(): Double = js.native
  def getNumChildren(): Integer = js.native
  def getPageHeight(): Double = js.native
  def getPageWidth(): Double = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  override def getParent(): ContainerElement = js.native
  def getTables(): js.Array[Table] = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: Integer, text: String): ListItem = js.native
  def insertPageBreak(childIndex: Integer): PageBreak = js.native
  def insertPageBreak(childIndex: Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def insertTable(childIndex: Integer): Table = js.native
  def insertTable(childIndex: Integer, cells: js.Array[js.Array[String]]): Table = js.native
  def insertTable(childIndex: Integer, table: Table): Table = js.native
  def removeChild(child: Element): Body = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): Body = js.native
  def setHeadingAttributes(paragraphHeading: ParagraphHeading, attributes: js.Any): Body = js.native
  def setMarginBottom(marginBottom: Double): Body = js.native
  def setMarginLeft(marginLeft: Double): Body = js.native
  def setMarginRight(marginRight: Double): Body = js.native
  def setMarginTop(marginTop: Double): Body = js.native
  def setPageHeight(pageHeight: Double): Body = js.native
  def setPageWidth(pageWidth: Double): Body = js.native
  def setText(text: String): Body = js.native
  def setTextAlignment(textAlignment: TextAlignment): Body = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  override def getPreviousSibling(): Element = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def setLinkUrl(url: String): Body = js.native
}

@js.native
trait Bookmark extends js.Object {
  def getId(): String = js.native
  def getPosition(): charts.Position = js.native
  def remove(): Unit = js.native
}

@js.native
trait ContainerElement extends Element {
  override def asBody(): Body = js.native
  override def asEquation(): Equation = js.native
  override def asFooterSection(): FooterSection = js.native
  override def asFootnoteSection(): FootnoteSection = js.native
  override def asHeaderSection(): HeaderSection = js.native
  override def asListItem(): ListItem = js.native
  override def asParagraph(): Paragraph = js.native
  override def asTable(): Table = js.native
  override def asTableCell(): TableCell = js.native
  override def asTableOfContents(): TableOfContents = js.native
  override def asTableRow(): TableRow = js.native
  def clear(): ContainerElement = js.native
  override def copy(): ContainerElement = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): ContainerElement = js.native
  override def removeFromParent(): ContainerElement = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): ContainerElement = js.native
  def setLinkUrl(url: String): ContainerElement = js.native
  def setTextAlignment(textAlignment: TextAlignment): ContainerElement = js.native
}

@js.native
trait Document extends js.Object {
  def addBookmark(position: charts.Position): Bookmark = js.native
  def addEditor(emailAddress: String): Document = js.native
  def addEditor(user: User): Document = js.native
  def addEditors(emailAddresses: js.Array[String]): Document = js.native
  def addFooter(): FooterSection = js.native
  def addHeader(): HeaderSection = js.native
  def addNamedRange(name: String, range: Range): NamedRange = js.native
  def addViewer(emailAddress: String): Document = js.native
  def addViewer(user: User): Document = js.native
  def addViewers(emailAddresses: js.Array[String]): Document = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getBody(): Body = js.native
  def getBookmark(id: String): Bookmark = js.native
  def getBookmarks(): js.Array[Bookmark] = js.native
  def getCursor(): charts.Position = js.native
  def getEditors(): js.Array[User] = js.native
  def getFooter(): FooterSection = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getHeader(): HeaderSection = js.native
  def getId(): String = js.native
  def getLanguage(): String = js.native
  def getName(): String = js.native
  def getNamedRangeById(id: String): NamedRange = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getNamedRanges(name: String): js.Array[NamedRange] = js.native
  def getSelection(): Range = js.native
  def getSupportedLanguageCodes(): js.Array[String] = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def newPosition(element: Element, offset: Integer): charts.Position = js.native
  def newRange(): RangeBuilder = js.native
  def removeEditor(emailAddress: String): Document = js.native
  def removeEditor(user: User): Document = js.native
  def removeViewer(emailAddress: String): Document = js.native
  def removeViewer(user: User): Document = js.native
  def saveAndClose(): Unit = js.native
  def setCursor(position: charts.Position): Document = js.native
  def setLanguage(languageCode: String): Document = js.native
  def setName(name: String): Document = js.native
  def setSelection(range: Range): Document = js.native
}

@js.native
trait DocumentApp extends js.Object {
  var attribute: Attribute = js.native
  var elementType: ElementType = js.native
  var glyphType: GlyphType = js.native
  var horizontalAlignment: HorizontalAlignment = js.native
  var paragraphHeading: ParagraphHeading = js.native
  var positionedLayout: PositionedLayout = js.native
  var textAlignment: TextAlignment = js.native
  var verticalAlignment: VerticalAlignment = js.native
  def create(name: String): Document = js.native
  def getActiveDocument(): Document = js.native
  def getUi(): Ui = js.native
  def openById(id: String): Document = js.native
  def openByUrl(url: String): Document = js.native
  var fontFamily: FontFamily = js.native
}

@js.native
trait Element extends js.Object {
  def asBody(): Body = js.native
  def asEquation(): Equation = js.native
  def asEquationFunction(): EquationFunction = js.native
  def asEquationFunctionArgumentSeparator(): EquationFunctionArgumentSeparator = js.native
  def asEquationSymbol(): EquationSymbol = js.native
  def asFooterSection(): FooterSection = js.native
  def asFootnote(): Footnote = js.native
  def asFootnoteSection(): FootnoteSection = js.native
  def asHeaderSection(): HeaderSection = js.native
  def asHorizontalRule(): HorizontalRule = js.native
  def asInlineDrawing(): InlineDrawing = js.native
  def asInlineImage(): InlineImage = js.native
  def asListItem(): ListItem = js.native
  def asPageBreak(): PageBreak = js.native
  def asParagraph(): Paragraph = js.native
  def asTable(): Table = js.native
  def asTableCell(): TableCell = js.native
  def asTableOfContents(): TableOfContents = js.native
  def asTableRow(): TableRow = js.native
  def asText(): Text = js.native
  def copy(): Element = js.native
  def getAttributes(): js.Dynamic = js.native
  def getNextSibling(): Element = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getType(): ElementType = js.native
  def isAtDocumentEnd(): Boolean = js.native
  def merge(): Element = js.native
  def removeFromParent(): Element = js.native
  def setAttributes(attributes: js.Any): Element = js.native
}

@js.native
sealed trait ElementType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.ElementType")
object ElementType extends js.Object {
  var BODY_SECTION: ElementType = js.native
  var COMMENT_SECTION: ElementType = js.native
  var DOCUMENT: ElementType = js.native
  var EQUATION: ElementType = js.native
  var EQUATION_FUNCTION: ElementType = js.native
  var EQUATION_FUNCTION_ARGUMENT_SEPARATOR: ElementType = js.native
  var EQUATION_SYMBOL: ElementType = js.native
  var FOOTER_SECTION: ElementType = js.native
  var FOOTNOTE: ElementType = js.native
  var FOOTNOTE_SECTION: ElementType = js.native
  var HEADER_SECTION: ElementType = js.native
  var HORIZONTAL_RULE: ElementType = js.native
  var INLINE_DRAWING: ElementType = js.native
  var INLINE_IMAGE: ElementType = js.native
  var LIST_ITEM: ElementType = js.native
  var PAGE_BREAK: ElementType = js.native
  var PARAGRAPH: ElementType = js.native
  var TABLE: ElementType = js.native
  var TABLE_CELL: ElementType = js.native
  var TABLE_OF_CONTENTS: ElementType = js.native
  var TABLE_ROW: ElementType = js.native
  var TEXT: ElementType = js.native
  var UNSUPPORTED: ElementType = js.native
  @JSBracketAccess
  def apply(value: ElementType): String = js.native
}

@js.native
trait Equation extends Element {
  def clear(): Equation = js.native
  override def copy(): Equation = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): Equation = js.native
  override def removeFromParent(): Equation = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): Equation = js.native
  def setLinkUrl(url: String): Equation = js.native
  def setTextAlignment(textAlignment: TextAlignment): Equation = js.native
}

@js.native
trait EquationFunction extends Element {
  def clear(): EquationFunction = js.native
  override def copy(): EquationFunction = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getCode(): String = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): EquationFunction = js.native
  override def removeFromParent(): EquationFunction = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): EquationFunction = js.native
  def setLinkUrl(url: String): EquationFunction = js.native
  def setTextAlignment(textAlignment: TextAlignment): EquationFunction = js.native
}

@js.native
trait EquationFunctionArgumentSeparator extends Element {
  override def copy(): EquationFunctionArgumentSeparator = js.native
  override def getAttributes(): js.Dynamic = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): EquationFunctionArgumentSeparator = js.native
  override def removeFromParent(): EquationFunctionArgumentSeparator = js.native
  override def setAttributes(attributes: js.Any): EquationFunctionArgumentSeparator = js.native
}

@js.native
trait EquationSymbol extends Element {
  override def copy(): EquationSymbol = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getCode(): String = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): EquationSymbol = js.native
  override def removeFromParent(): EquationSymbol = js.native
  override def setAttributes(attributes: js.Any): EquationSymbol = js.native
}

@js.native
sealed trait FontFamily extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.FontFamily")
object FontFamily extends js.Object {
  var AMARANTH: FontFamily = js.native
  var ARIAL: FontFamily = js.native
  var ARIAL_BLACK: FontFamily = js.native
  var ARIAL_NARROW: FontFamily = js.native
  var ARVO: FontFamily = js.native
  var CALIBRI: FontFamily = js.native
  var CAMBRIA: FontFamily = js.native
  var COMIC_SANS_MS: FontFamily = js.native
  var CONSOLAS: FontFamily = js.native
  var CORSIVA: FontFamily = js.native
  var COURIER_NEW: FontFamily = js.native
  var DANCING_SCRIPT: FontFamily = js.native
  var DROID_SANS: FontFamily = js.native
  var DROID_SERIF: FontFamily = js.native
  var GARAMOND: FontFamily = js.native
  var GEORGIA: FontFamily = js.native
  var GLORIA_HALLELUJAH: FontFamily = js.native
  var GREAT_VIBES: FontFamily = js.native
  var LOBSTER: FontFamily = js.native
  var MERRIWEATHER: FontFamily = js.native
  var PACIFICO: FontFamily = js.native
  var PHILOSOPHER: FontFamily = js.native
  var POIRET_ONE: FontFamily = js.native
  var QUATTROCENTO: FontFamily = js.native
  var ROBOTO: FontFamily = js.native
  var SHADOWS_INTO_LIGHT: FontFamily = js.native
  var SYNCOPATE: FontFamily = js.native
  var TAHOMA: FontFamily = js.native
  var TIMES_NEW_ROMAN: FontFamily = js.native
  var TREBUCHET_MS: FontFamily = js.native
  var UBUNTU: FontFamily = js.native
  var VERDANA: FontFamily = js.native
  @JSBracketAccess
  def apply(value: FontFamily): String = js.native
}

@js.native
trait FooterSection extends Element {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: String): ListItem = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): FooterSection = js.native
  override def copy(): FooterSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getImages(): js.Array[InlineImage] = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getNumChildren(): Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  override def getParent(): ContainerElement = js.native
  def getTables(): js.Array[Table] = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: Integer, text: String): ListItem = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def insertTable(childIndex: Integer): Table = js.native
  def insertTable(childIndex: Integer, cells: js.Array[js.Array[String]]): Table = js.native
  def insertTable(childIndex: Integer, table: Table): Table = js.native
  def removeChild(child: Element): FooterSection = js.native
  override def removeFromParent(): FooterSection = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): FooterSection = js.native
  def setText(text: String): FooterSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): FooterSection = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  override def getPreviousSibling(): Element = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def setLinkUrl(url: String): FooterSection = js.native
}

@js.native
trait Footnote extends Element {
  override def copy(): Footnote = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getFootnoteContents(): FootnoteSection = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def removeFromParent(): Footnote = js.native
  override def setAttributes(attributes: js.Any): Footnote = js.native
}

@js.native
trait FootnoteSection extends Element {
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def clear(): FootnoteSection = js.native
  override def copy(): FootnoteSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def removeChild(child: Element): FootnoteSection = js.native
  override def removeFromParent(): FootnoteSection = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): FootnoteSection = js.native
  def setText(text: String): FootnoteSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): FootnoteSection = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getLinkUrl(): String = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def setLinkUrl(url: String): FootnoteSection = js.native
}

@js.native
sealed trait GlyphType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.GlyphType")
object GlyphType extends js.Object {
  var BULLET: GlyphType = js.native
  var HOLLOW_BULLET: GlyphType = js.native
  var SQUARE_BULLET: GlyphType = js.native
  var NUMBER: GlyphType = js.native
  var LATIN_UPPER: GlyphType = js.native
  var LATIN_LOWER: GlyphType = js.native
  var ROMAN_UPPER: GlyphType = js.native
  var ROMAN_LOWER: GlyphType = js.native
  @JSBracketAccess
  def apply(value: GlyphType): String = js.native
}

@js.native
trait HeaderSection extends Element {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: String): ListItem = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): HeaderSection = js.native
  override def copy(): HeaderSection = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getImages(): js.Array[InlineImage] = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getNumChildren(): Integer = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  override def getParent(): ContainerElement = js.native
  def getTables(): js.Array[Table] = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: Integer, text: String): ListItem = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def insertTable(childIndex: Integer): Table = js.native
  def insertTable(childIndex: Integer, cells: js.Array[js.Array[String]]): Table = js.native
  def insertTable(childIndex: Integer, table: Table): Table = js.native
  def removeChild(child: Element): HeaderSection = js.native
  override def removeFromParent(): HeaderSection = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): HeaderSection = js.native
  def setText(text: String): HeaderSection = js.native
  def setTextAlignment(textAlignment: TextAlignment): HeaderSection = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  override def getPreviousSibling(): Element = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def setLinkUrl(url: String): HeaderSection = js.native
}

@js.native
sealed trait HorizontalAlignment extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.HorizontalAlignment")
object HorizontalAlignment extends js.Object {
  var LEFT: HorizontalAlignment = js.native
  var CENTER: HorizontalAlignment = js.native
  var RIGHT: HorizontalAlignment = js.native
  var JUSTIFY: HorizontalAlignment = js.native
  @JSBracketAccess
  def apply(value: HorizontalAlignment): String = js.native
}

@js.native
trait HorizontalRule extends Element {
  override def copy(): HorizontalRule = js.native
  override def getAttributes(): js.Dynamic = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def removeFromParent(): HorizontalRule = js.native
  override def setAttributes(attributes: js.Any): HorizontalRule = js.native
}

@js.native
trait InlineDrawing extends Element {
  override def copy(): InlineDrawing = js.native
  def getAltDescription(): String = js.native
  def getAltTitle(): String = js.native
  override def getAttributes(): js.Dynamic = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): InlineDrawing = js.native
  override def removeFromParent(): InlineDrawing = js.native
  def setAltDescription(description: String): InlineDrawing = js.native
  def setAltTitle(title: String): InlineDrawing = js.native
  override def setAttributes(attributes: js.Any): InlineDrawing = js.native
}

@js.native
trait InlineImage extends Element {
  override def copy(): InlineImage = js.native
  def getAltDescription(): String = js.native
  def getAltTitle(): String = js.native
  def getAs(contentType: String): Blob = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getBlob(): Blob = js.native
  def getHeight(): Integer = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  def getWidth(): Integer = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): InlineImage = js.native
  override def removeFromParent(): InlineImage = js.native
  def setAltDescription(description: String): InlineImage = js.native
  def setAltTitle(title: String): InlineImage = js.native
  override def setAttributes(attributes: js.Any): InlineImage = js.native
  def setHeight(height: Integer): InlineImage = js.native
  def setLinkUrl(url: String): InlineImage = js.native
  def setWidth(width: Integer): InlineImage = js.native
}

@js.native
trait ListItem extends Element {
  def addPositionedImage(image: BlobSource): PositionedImage = js.native
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendInlineImage(image: BlobSource): InlineImage = js.native
  def appendInlineImage(image: InlineImage): InlineImage = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendText(text: String): Text = js.native
  def appendText(text: Text): Text = js.native
  def clear(): ListItem = js.native
  override def copy(): ListItem = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAlignment(): HorizontalAlignment = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getGlyphType(): GlyphType = js.native
  def getHeading(): ParagraphHeading = js.native
  def getIndentEnd(): Double = js.native
  def getIndentFirstLine(): Double = js.native
  def getIndentStart(): Double = js.native
  def getLineSpacing(): Double = js.native
  def getLinkUrl(): String = js.native
  def getListId(): String = js.native
  def getNestingLevel(): Integer = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  def getPositionedImage(id: String): PositionedImage = js.native
  def getPositionedImages(): js.Array[PositionedImage] = js.native
  override def getPreviousSibling(): Element = js.native
  def getSpacingAfter(): Double = js.native
  def getSpacingBefore(): Double = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertInlineImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertInlineImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertPageBreak(childIndex: Integer): PageBreak = js.native
  def insertPageBreak(childIndex: Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertText(childIndex: Integer, text: String): Text = js.native
  def insertText(childIndex: Integer, text: Text): Text = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def isLeftToRight(): Boolean = js.native
  override def merge(): ListItem = js.native
  def removeChild(child: Element): ListItem = js.native
  override def removeFromParent(): ListItem = js.native
  def removePositionedImage(id: String): Boolean = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAlignment(alignment: HorizontalAlignment): ListItem = js.native
  override def setAttributes(attributes: js.Any): ListItem = js.native
  def setGlyphType(glyphType: GlyphType): ListItem = js.native
  def setHeading(heading: ParagraphHeading): ListItem = js.native
  def setIndentEnd(indentEnd: Double): ListItem = js.native
  def setIndentFirstLine(indentFirstLine: Double): ListItem = js.native
  def setIndentStart(indentStart: Double): ListItem = js.native
  def setLeftToRight(leftToRight: Boolean): ListItem = js.native
  def setLineSpacing(multiplier: Double): ListItem = js.native
  def setLinkUrl(url: String): ListItem = js.native
  def setListId(listItem: ListItem): ListItem = js.native
  def setNestingLevel(nestingLevel: Integer): ListItem = js.native
  def setSpacingAfter(spacingAfter: Double): ListItem = js.native
  def setSpacingBefore(spacingBefore: Double): ListItem = js.native
  def setText(text: String): Unit = js.native
  def setTextAlignment(textAlignment: TextAlignment): ListItem = js.native
}

@js.native
trait NamedRange extends js.Object {
  def getId(): String = js.native
  def getName(): String = js.native
  def getRange(): Range = js.native
  def remove(): Unit = js.native
}

@js.native
trait PageBreak extends Element {
  override def copy(): PageBreak = js.native
  override def getAttributes(): js.Dynamic = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def removeFromParent(): PageBreak = js.native
  override def setAttributes(attributes: js.Any): PageBreak = js.native
}

@js.native
trait Paragraph extends Element {
  def addPositionedImage(image: BlobSource): PositionedImage = js.native
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendInlineImage(image: BlobSource): InlineImage = js.native
  def appendInlineImage(image: InlineImage): InlineImage = js.native
  def appendPageBreak(): PageBreak = js.native
  def appendPageBreak(pageBreak: PageBreak): PageBreak = js.native
  def appendText(text: String): Text = js.native
  def appendText(text: Text): Text = js.native
  def clear(): Paragraph = js.native
  override def copy(): Paragraph = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  def getAlignment(): HorizontalAlignment = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getHeading(): ParagraphHeading = js.native
  def getIndentEnd(): Double = js.native
  def getIndentFirstLine(): Double = js.native
  def getIndentStart(): Double = js.native
  def getLineSpacing(): Double = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  def getPositionedImage(id: String): PositionedImage = js.native
  def getPositionedImages(): js.Array[PositionedImage] = js.native
  override def getPreviousSibling(): Element = js.native
  def getSpacingAfter(): Double = js.native
  def getSpacingBefore(): Double = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertInlineImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertInlineImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertPageBreak(childIndex: Integer): PageBreak = js.native
  def insertPageBreak(childIndex: Integer, pageBreak: PageBreak): PageBreak = js.native
  def insertText(childIndex: Integer, text: String): Text = js.native
  def insertText(childIndex: Integer, text: Text): Text = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def isLeftToRight(): Boolean = js.native
  override def merge(): Paragraph = js.native
  def removeChild(child: Element): Paragraph = js.native
  override def removeFromParent(): Paragraph = js.native
  def removePositionedImage(id: String): Boolean = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAlignment(alignment: HorizontalAlignment): Paragraph = js.native
  override def setAttributes(attributes: js.Any): Paragraph = js.native
  def setHeading(heading: ParagraphHeading): Paragraph = js.native
  def setIndentEnd(indentEnd: Double): Paragraph = js.native
  def setIndentFirstLine(indentFirstLine: Double): Paragraph = js.native
  def setIndentStart(indentStart: Double): Paragraph = js.native
  def setLeftToRight(leftToRight: Boolean): Paragraph = js.native
  def setLineSpacing(multiplier: Double): Paragraph = js.native
  def setLinkUrl(url: String): Paragraph = js.native
  def setSpacingAfter(spacingAfter: Double): Paragraph = js.native
  def setSpacingBefore(spacingBefore: Double): Paragraph = js.native
  def setText(text: String): Unit = js.native
  def setTextAlignment(textAlignment: TextAlignment): Paragraph = js.native
}

@js.native
sealed trait ParagraphHeading extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.ParagraphHeading")
object ParagraphHeading extends js.Object {
  var NORMAL: ParagraphHeading = js.native
  var HEADING1: ParagraphHeading = js.native
  var HEADING2: ParagraphHeading = js.native
  var HEADING3: ParagraphHeading = js.native
  var HEADING4: ParagraphHeading = js.native
  var HEADING5: ParagraphHeading = js.native
  var HEADING6: ParagraphHeading = js.native
  var TITLE: ParagraphHeading = js.native
  var SUBTITLE: ParagraphHeading = js.native
  @JSBracketAccess
  def apply(value: ParagraphHeading): String = js.native
}

@js.native
trait Position extends js.Object {
  def getElement(): Element = js.native
  def getOffset(): Integer = js.native
  def getSurroundingText(): Text = js.native
  def getSurroundingTextOffset(): Integer = js.native
  def insertBookmark(): Bookmark = js.native
  def insertInlineImage(image: BlobSource): InlineImage = js.native
  def insertText(text: String): Text = js.native
}

@js.native
trait PositionedImage extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getHeight(): Integer = js.native
  def getId(): String = js.native
  def getLayout(): PositionedLayout = js.native
  def getLeftOffset(): Double = js.native
  def getParagraph(): Paragraph = js.native
  def getTopOffset(): Double = js.native
  def getWidth(): Integer = js.native
  def setHeight(height: Integer): PositionedImage = js.native
  def setLayout(layout: PositionedLayout): PositionedImage = js.native
  def setLeftOffset(offset: Double): PositionedImage = js.native
  def setTopOffset(offset: Double): PositionedImage = js.native
  def setWidth(width: Integer): PositionedImage = js.native
}

@js.native
sealed trait PositionedLayout extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.PositionedLayout")
object PositionedLayout extends js.Object {
  var ABOVE_TEXT: PositionedLayout = js.native
  var BREAK_BOTH: PositionedLayout = js.native
  var BREAK_LEFT: PositionedLayout = js.native
  var BREAK_RIGHT: PositionedLayout = js.native
  var WRAP_TEXT: PositionedLayout = js.native
  @JSBracketAccess
  def apply(value: PositionedLayout): String = js.native
}

@js.native
trait Range extends js.Object {
  def getRangeElements(): js.Array[RangeElement] = js.native
  def getSelectedElements(): js.Array[RangeElement] = js.native
}

@js.native
trait RangeBuilder extends js.Object {
  def addElement(element: Element): RangeBuilder = js.native
  def addElement(textElement: Text, startOffset: Integer, endOffsetInclusive: Integer): RangeBuilder = js.native
  def addElementsBetween(startElement: Element, endElementInclusive: Element): RangeBuilder = js.native
  def addElementsBetween(startTextElement: Text, startOffset: Integer, endTextElementInclusive: Text, endOffsetInclusive: Integer): RangeBuilder = js.native
  def addRange(range: Range): RangeBuilder = js.native
  def build(): Range = js.native
  def getRangeElements(): js.Array[RangeElement] = js.native
  def getSelectedElements(): js.Array[RangeElement] = js.native
}

@js.native
trait RangeElement extends js.Object {
  def getElement(): Element = js.native
  def getEndOffsetInclusive(): Integer = js.native
  def getStartOffset(): Integer = js.native
  def isPartial(): Boolean = js.native
}

@js.native
trait Table extends Element {
  def appendTableRow(): TableRow = js.native
  def appendTableRow(tableRow: TableRow): TableRow = js.native
  def clear(): Table = js.native
  override def copy(): Table = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getBorderColor(): String = js.native
  def getBorderWidth(): Double = js.native
  def getCell(rowIndex: Integer, cellIndex: Integer): TableCell = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getColumnWidth(columnIndex: Integer): Double = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getNumRows(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getRow(rowIndex: Integer): TableRow = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertTableRow(childIndex: Integer): TableRow = js.native
  def insertTableRow(childIndex: Integer, tableRow: TableRow): TableRow = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def removeChild(child: Element): Table = js.native
  override def removeFromParent(): Table = js.native
  def removeRow(rowIndex: Integer): TableRow = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): Table = js.native
  def setBorderColor(color: String): Table = js.native
  def setBorderWidth(width: Double): Table = js.native
  def setColumnWidth(columnIndex: Integer, width: Double): Table = js.native
  def setLinkUrl(url: String): Table = js.native
  def setTextAlignment(textAlignment: TextAlignment): Table = js.native
}

@js.native
trait TableCell extends Element {
  def appendHorizontalRule(): HorizontalRule = js.native
  def appendImage(image: BlobSource): InlineImage = js.native
  def appendImage(image: InlineImage): InlineImage = js.native
  def appendListItem(listItem: ListItem): ListItem = js.native
  def appendListItem(text: String): ListItem = js.native
  def appendParagraph(paragraph: Paragraph): Paragraph = js.native
  def appendParagraph(text: String): Paragraph = js.native
  def appendTable(): Table = js.native
  def appendTable(cells: js.Array[js.Array[String]]): Table = js.native
  def appendTable(table: Table): Table = js.native
  def clear(): TableCell = js.native
  override def copy(): TableCell = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getBackgroundColor(): String = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getColSpan(): Integer = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  def getPaddingBottom(): Double = js.native
  def getPaddingLeft(): Double = js.native
  def getPaddingRight(): Double = js.native
  def getPaddingTop(): Double = js.native
  override def getParent(): ContainerElement = js.native
  def getParentRow(): TableRow = js.native
  def getParentTable(): Table = js.native
  override def getPreviousSibling(): Element = js.native
  def getRowSpan(): Integer = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def getVerticalAlignment(): VerticalAlignment = js.native
  def getWidth(): Double = js.native
  def insertHorizontalRule(childIndex: Integer): HorizontalRule = js.native
  def insertImage(childIndex: Integer, image: BlobSource): InlineImage = js.native
  def insertImage(childIndex: Integer, image: InlineImage): InlineImage = js.native
  def insertListItem(childIndex: Integer, listItem: ListItem): ListItem = js.native
  def insertListItem(childIndex: Integer, text: String): ListItem = js.native
  def insertParagraph(childIndex: Integer, paragraph: Paragraph): Paragraph = js.native
  def insertParagraph(childIndex: Integer, text: String): Paragraph = js.native
  def insertTable(childIndex: Integer): Table = js.native
  def insertTable(childIndex: Integer, cells: js.Array[js.Array[String]]): Table = js.native
  def insertTable(childIndex: Integer, table: Table): Table = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): TableCell = js.native
  def removeChild(child: Element): TableCell = js.native
  override def removeFromParent(): TableCell = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): TableCell = js.native
  def setBackgroundColor(color: String): TableCell = js.native
  def setLinkUrl(url: String): TableCell = js.native
  def setPaddingBottom(paddingBottom: Double): TableCell = js.native
  def setPaddingLeft(paddingLeft: Double): TableCell = js.native
  def setPaddingRight(paddingTop: Double): TableCell = js.native
  def setPaddingTop(paddingTop: Double): TableCell = js.native
  def setText(text: String): TableCell = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableCell = js.native
  def setVerticalAlignment(alignment: VerticalAlignment): TableCell = js.native
  def setWidth(width: Double): TableCell = js.native
}

@js.native
trait TableOfContents extends Element {
  def clear(): TableOfContents = js.native
  override def copy(): TableOfContents = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  override def getNextSibling(): Element = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def removeFromParent(): TableOfContents = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): TableOfContents = js.native
  def setLinkUrl(url: String): TableOfContents = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableOfContents = js.native
}

@js.native
trait TableRow extends Element {
  def appendTableCell(): TableCell = js.native
  def appendTableCell(textContents: String): TableCell = js.native
  def appendTableCell(tableCell: TableCell): TableCell = js.native
  def clear(): TableRow = js.native
  override def copy(): TableRow = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getCell(cellIndex: Integer): TableCell = js.native
  def getChild(childIndex: Integer): Element = js.native
  def getChildIndex(child: Element): Integer = js.native
  def getLinkUrl(): String = js.native
  def getMinimumHeight(): Double = js.native
  override def getNextSibling(): Element = js.native
  def getNumCells(): Integer = js.native
  def getNumChildren(): Integer = js.native
  override def getParent(): ContainerElement = js.native
  def getParentTable(): Table = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  override def getType(): ElementType = js.native
  def insertTableCell(childIndex: Integer): TableCell = js.native
  def insertTableCell(childIndex: Integer, textContents: String): TableCell = js.native
  def insertTableCell(childIndex: Integer, tableCell: TableCell): TableCell = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): TableRow = js.native
  def removeCell(cellIndex: Integer): TableCell = js.native
  def removeChild(child: Element): TableRow = js.native
  override def removeFromParent(): TableRow = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  override def setAttributes(attributes: js.Any): TableRow = js.native
  def setLinkUrl(url: String): TableRow = js.native
  def setMinimumHeight(minHeight: Double): TableRow = js.native
  def setTextAlignment(textAlignment: TextAlignment): TableRow = js.native
}

@js.native
trait Text extends Element {
  def appendText(text: String): Text = js.native
  override def copy(): Text = js.native
  def deleteText(startOffset: Integer, endOffsetInclusive: Integer): Text = js.native
  def editAsText(): Text = js.native
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  def getAttributes(offset: Integer): js.Dynamic = js.native
  def getBackgroundColor(): String = js.native
  def getBackgroundColor(offset: Integer): String = js.native
  def getFontFamily(): String = js.native
  def getFontFamily(offset: Integer): String = js.native
  def getFontSize(): Integer = js.native
  def getFontSize(offset: Integer): Integer = js.native
  def getForegroundColor(): String = js.native
  def getForegroundColor(offset: Integer): String = js.native
  def getLinkUrl(): String = js.native
  def getLinkUrl(offset: Integer): String = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  def getText(): String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getTextAlignment(offset: Integer): TextAlignment = js.native
  def getTextAttributeIndices(): js.Array[Integer] = js.native
  override def getType(): ElementType = js.native
  def insertText(offset: Integer, text: String): Text = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  def isBold(): Boolean = js.native
  def isBold(offset: Integer): Boolean = js.native
  def isItalic(): Boolean = js.native
  def isItalic(offset: Integer): Boolean = js.native
  def isStrikethrough(): Boolean = js.native
  def isStrikethrough(offset: Integer): Boolean = js.native
  def isUnderline(): Boolean = js.native
  def isUnderline(offset: Integer): Boolean = js.native
  override def merge(): Text = js.native
  override def removeFromParent(): Text = js.native
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  def setAttributes(startOffset: Integer, endOffsetInclusive: Integer, attributes: js.Any): Text = js.native
  override def setAttributes(attributes: js.Any): Text = js.native
  def setBackgroundColor(startOffset: Integer, endOffsetInclusive: Integer, color: String): Text = js.native
  def setBackgroundColor(color: String): Text = js.native
  def setBold(bold: Boolean): Text = js.native
  def setBold(startOffset: Integer, endOffsetInclusive: Integer, bold: Boolean): Text = js.native
  def setFontFamily(startOffset: Integer, endOffsetInclusive: Integer, fontFamilyName: String): Text = js.native
  def setFontFamily(fontFamilyName: String): Text = js.native
  def setFontSize(size: Integer): Text = js.native
  def setFontSize(startOffset: Integer, endOffsetInclusive: Integer, size: Integer): Text = js.native
  def setForegroundColor(startOffset: Integer, endOffsetInclusive: Integer, color: String): Text = js.native
  def setForegroundColor(color: String): Text = js.native
  def setItalic(italic: Boolean): Text = js.native
  def setItalic(startOffset: Integer, endOffsetInclusive: Integer, italic: Boolean): Text = js.native
  def setLinkUrl(startOffset: Integer, endOffsetInclusive: Integer, url: String): Text = js.native
  def setLinkUrl(url: String): Text = js.native
  def setStrikethrough(strikethrough: Boolean): Text = js.native
  def setStrikethrough(startOffset: Integer, endOffsetInclusive: Integer, strikethrough: Boolean): Text = js.native
  def setText(text: String): Text = js.native
  def setTextAlignment(startOffset: Integer, endOffsetInclusive: Integer, textAlignment: TextAlignment): Text = js.native
  def setTextAlignment(textAlignment: TextAlignment): Text = js.native
  def setUnderline(underline: Boolean): Text = js.native
  def setUnderline(startOffset: Integer, endOffsetInclusive: Integer, underline: Boolean): Text = js.native
}

@js.native
sealed trait TextAlignment extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.TextAlignment")
object TextAlignment extends js.Object {
  var NORMAL: TextAlignment = js.native
  var SUPERSCRIPT: TextAlignment = js.native
  var SUBSCRIPT: TextAlignment = js.native
  @JSBracketAccess
  def apply(value: TextAlignment): String = js.native
}

@js.native
trait UnsupportedElement extends Element {
  override def copy(): UnsupportedElement = js.native
  override def getAttributes(): js.Dynamic = js.native
  override def getNextSibling(): Element = js.native
  override def getParent(): ContainerElement = js.native
  override def getPreviousSibling(): Element = js.native
  override def getType(): ElementType = js.native
  override def isAtDocumentEnd(): Boolean = js.native
  override def merge(): UnsupportedElement = js.native
  override def removeFromParent(): UnsupportedElement = js.native
  override def setAttributes(attributes: js.Any): UnsupportedElement = js.native
}

@js.native
sealed trait VerticalAlignment extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Document.VerticalAlignment")
object VerticalAlignment extends js.Object {
  var BOTTOM: VerticalAlignment = js.native
  var CENTER: VerticalAlignment = js.native
  var TOP: VerticalAlignment = js.native
  @JSBracketAccess
  def apply(value: VerticalAlignment): String = js.native
}
