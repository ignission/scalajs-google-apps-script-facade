package tech.ignission.jsgas.xmlservice

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  def getName(): String                             = js.native
  def getNamespace(): Namespace                     = js.native
  def getValue(): String                            = js.native
  def setName(name: String): Attribute              = js.native
  def setNamespace(namespace: Namespace): Attribute = js.native
  def setValue(value: String): Attribute            = js.native
}

@js.native
trait Cdata extends Content {
  def append(text: String): Text           = js.native
  override def detach(): Content           = js.native
  override def getParentElement(): Element = js.native
  def getText(): String                    = js.native
  override def getValue(): String          = js.native
  def setText(text: String): Text          = js.native
}

@js.native
trait Comment extends Content {
  override def detach(): Content           = js.native
  override def getParentElement(): Element = js.native
  def getText(): String                    = js.native
  override def getValue(): String          = js.native
  def setText(text: String): Comment       = js.native
}

@js.native
trait Content extends js.Object {
  def asCdata(): Cdata                                 = js.native
  def asComment(): Comment                             = js.native
  def asDocType(): DocType                             = js.native
  def asElement(): Element                             = js.native
  def asEntityRef(): EntityRef                         = js.native
  def asProcessingInstruction(): ProcessingInstruction = js.native
  def asText(): Text                                   = js.native
  def detach(): Content                                = js.native
  def getParentElement(): Element                      = js.native
  def getType(): ContentType                           = js.native
  def getValue(): String                               = js.native
}

@js.native
sealed trait ContentType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.XML_Service.ContentType")
object ContentType extends js.Object {
  var CDATA: ContentType                 = js.native
  var COMMENT: ContentType               = js.native
  var DOCTYPE: ContentType               = js.native
  var ELEMENT: ContentType               = js.native
  var ENTITYREF: ContentType             = js.native
  var PROCESSINGINSTRUCTION: ContentType = js.native
  var TEXT: ContentType                  = js.native
  @JSBracketAccess
  def apply(value: ContentType): String = js.native
}

@js.native
trait DocType extends Content {
  override def detach(): Content               = js.native
  def getElementName(): String                 = js.native
  def getInternalSubset(): String              = js.native
  override def getParentElement(): Element     = js.native
  def getPublicId(): String                    = js.native
  def getSystemId(): String                    = js.native
  override def getValue(): String              = js.native
  def setElementName(name: String): DocType    = js.native
  def setInternalSubset(data: String): DocType = js.native
  def setPublicId(id: String): DocType         = js.native
  def setSystemId(id: String): DocType         = js.native
}

@js.native
trait Document extends js.Object {
  def addContent(content: Content): Document                 = js.native
  def addContent(index: Integer, content: Content): Document = js.native
  def cloneContent(): js.Array[Content]                      = js.native
  def detachRootElement(): Element                           = js.native
  def getAllContent(): js.Array[Content]                     = js.native
  def getContent(index: Integer): Content                    = js.native
  def getContentSize(): Integer                              = js.native
  def getDescendants(): js.Array[Content]                    = js.native
  def getDocType(): DocType                                  = js.native
  def getRootElement(): Element                              = js.native
  def hasRootElement(): Boolean                              = js.native
  def removeContent(): js.Array[Content]                     = js.native
  def removeContent(content: Content): Boolean               = js.native
  def removeContent(index: Integer): Content                 = js.native
  def setDocType(docType: DocType): Document                 = js.native
  def setRootElement(element: Element): Document             = js.native
}

@js.native
trait Element extends Content {
  def addContent(content: Content): Element                                    = js.native
  def addContent(index: Integer, content: Content): Element                    = js.native
  def cloneContent(): js.Array[Content]                                        = js.native
  override def detach(): Content                                               = js.native
  def getAllContent(): js.Array[Content]                                       = js.native
  def getAttribute(name: String): Attribute                                    = js.native
  def getAttribute(name: String, namespace: Namespace): Attribute              = js.native
  def getAttributes(): js.Array[Attribute]                                     = js.native
  def getChild(name: String): Element                                          = js.native
  def getChild(name: String, namespace: Namespace): Element                    = js.native
  def getChildText(name: String): String                                       = js.native
  def getChildText(name: String, namespace: Namespace): String                 = js.native
  def getChildren(): js.Array[Element]                                         = js.native
  def getChildren(name: String): js.Array[Element]                             = js.native
  def getChildren(name: String, namespace: Namespace): js.Array[Element]       = js.native
  def getContent(index: Integer): Content                                      = js.native
  def getContentSize(): Integer                                                = js.native
  def getDescendants(): js.Array[Content]                                      = js.native
  def getDocument(): Document                                                  = js.native
  def getName(): String                                                        = js.native
  def getNamespace(): Namespace                                                = js.native
  def getNamespace(prefix: String): Namespace                                  = js.native
  override def getParentElement(): Element                                     = js.native
  def getQualifiedName(): String                                               = js.native
  def getText(): String                                                        = js.native
  override def getValue(): String                                              = js.native
  def isAncestorOf(other: Element): Boolean                                    = js.native
  def isRootElement(): Boolean                                                 = js.native
  def removeAttribute(attribute: Attribute): Boolean                           = js.native
  def removeAttribute(attributeName: String): Boolean                          = js.native
  def removeAttribute(attributeName: String, namespace: Namespace): Boolean    = js.native
  def removeContent(): js.Array[Content]                                       = js.native
  def removeContent(content: Content): Boolean                                 = js.native
  def removeContent(index: Integer): Content                                   = js.native
  def setAttribute(attribute: Attribute): Element                              = js.native
  def setAttribute(name: String, value: String): Element                       = js.native
  def setAttribute(name: String, value: String, namespace: Namespace): Element = js.native
  def setName(name: String): Element                                           = js.native
  def setNamespace(namespace: Namespace): Element                              = js.native
  def setText(text: String): Element                                           = js.native
}

@js.native
trait EntityRef extends Content {
  override def detach(): Content           = js.native
  def getName(): String                    = js.native
  override def getParentElement(): Element = js.native
  def getPublicId(): String                = js.native
  def getSystemId(): String                = js.native
  override def getValue(): String          = js.native
  def setName(name: String): EntityRef     = js.native
  def setPublicId(id: String): EntityRef   = js.native
  def setSystemId(id: String): EntityRef   = js.native
}

@js.native
trait Format extends js.Object {
  def format(document: Document): String                   = js.native
  def format(element: Element): String                     = js.native
  def setEncoding(encoding: String): Format                = js.native
  def setIndent(indent: String): Format                    = js.native
  def setLineSeparator(separator: String): Format          = js.native
  def setOmitDeclaration(omitDeclaration: Boolean): Format = js.native
  def setOmitEncoding(omitEncoding: Boolean): Format       = js.native
}

@js.native
trait Namespace extends js.Object {
  def getPrefix(): String = js.native
  def getURI(): String    = js.native
}

@js.native
trait ProcessingInstruction extends Content {
  override def detach(): Content           = js.native
  def getData(): String                    = js.native
  override def getParentElement(): Element = js.native
  def getTarget(): String                  = js.native
  override def getValue(): String          = js.native
}

@js.native
trait Text extends Content {
  def append(text: String): Text           = js.native
  override def detach(): Content           = js.native
  override def getParentElement(): Element = js.native
  def getText(): String                    = js.native
  override def getValue(): String          = js.native
  def setText(text: String): Text          = js.native
}

@js.native
trait XmlService extends js.Object {
  var ContentTypes: ContentType                                                       = js.native
  def createCdata(text: String): Cdata                                                = js.native
  def createComment(text: String): Comment                                            = js.native
  def createDocType(elementName: String): DocType                                     = js.native
  def createDocType(elementName: String, systemId: String): DocType                   = js.native
  def createDocType(elementName: String, publicId: String, systemId: String): DocType = js.native
  def createDocument(): Document                                                      = js.native
  def createDocument(rootElement: Element): Document                                  = js.native
  def createElement(name: String): Element                                            = js.native
  def createElement(name: String, namespace: Namespace): Element                      = js.native
  def createText(text: String): Text                                                  = js.native
  def getCompactFormat(): Format                                                      = js.native
  def getNamespace(uri: String): Namespace                                            = js.native
  def getNamespace(prefix: String, uri: String): Namespace                            = js.native
  def getNoNamespace(): Namespace                                                     = js.native
  def getPrettyFormat(): Format                                                       = js.native
  def getRawFormat(): Format                                                          = js.native
  def getXmlNamespace(): Namespace                                                    = js.native
  def parse(xml: String): Document                                                    = js.native
}
