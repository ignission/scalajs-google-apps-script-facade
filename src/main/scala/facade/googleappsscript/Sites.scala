package facade.googleappsscript.sites

import facade.googleappsscript.base._

import scala.scalajs.js
import scala.scalajs.js.annotation._


@js.native
trait Attachment extends js.Object {
  def deleteAttachment(): Unit = js.native
  def getAs(contentType: String): Blob = js.native
  def getAttachmentType(): AttachmentType = js.native
  def getBlob(): Blob = js.native
  def getContentType(): String = js.native
  def getDatePublished(): Date = js.native
  def getDescription(): String = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def setContentType(contentType: String): Attachment = js.native
  def setDescription(description: String): Attachment = js.native
  def setFrom(blob: BlobSource): Attachment = js.native
  def setParent(parent: Page): Attachment = js.native
  def setTitle(title: String): Attachment = js.native
  def setUrl(url: String): Attachment = js.native
}

@js.native
sealed trait AttachmentType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Sites.AttachmentType")
object AttachmentType extends js.Object {
  var WEB: AttachmentType = js.native
  var HOSTED: AttachmentType = js.native
  @JSBracketAccess
  def apply(value: AttachmentType): String = js.native
}

@js.native
trait Column extends js.Object {
  def deleteColumn(): Unit = js.native
  def getName(): String = js.native
  def getParent(): Page = js.native
  def setName(name: String): Column = js.native
}

@js.native
trait Comment extends js.Object {
  def deleteComment(): Unit = js.native
  def getAuthorEmail(): String = js.native
  def getAuthorName(): String = js.native
  def getContent(): String = js.native
  def getDatePublished(): Date = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def setContent(content: String): Comment = js.native
  def setParent(parent: Page): Comment = js.native
}

@js.native
trait ListItem extends js.Object {
  def deleteListItem(): Unit = js.native
  def getDatePublished(): Date = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def getValueByIndex(index: Integer): String = js.native
  def getValueByName(name: String): String = js.native
  def setParent(parent: Page): ListItem = js.native
  def setValueByIndex(index: Integer, value: String): ListItem = js.native
  def setValueByName(name: String, value: String): ListItem = js.native
}

@js.native
trait PageAdvancedParameters extends js.Object {
  var `type`: js.Array[PageType] = js.native
  var start: Integer = js.native
  var max: Integer = js.native
  var includeDrafts: Boolean = js.native
  var includeDeleted: Boolean = js.native
  var search: String = js.native
}

@js.native
trait Page extends js.Object {
  def addColumn(name: String): Column = js.native
  def addHostedAttachment(blob: BlobSource): Attachment = js.native
  def addHostedAttachment(blob: BlobSource, description: String): Attachment = js.native
  def addListItem(values: js.Array[String]): ListItem = js.native
  def addWebAttachment(title: String, description: String, url: String): Attachment = js.native
  def createAnnouncement(title: String, html: String): Page = js.native
  def createAnnouncement(title: String, html: String, asDraft: Boolean): Page = js.native
  def createAnnouncementsPage(title: String, name: String, html: String): Page = js.native
  def createFileCabinetPage(title: String, name: String, html: String): Page = js.native
  def createListPage(title: String, name: String, html: String, columnNames: js.Array[String]): Page = js.native
  def createPageFromTemplate(title: String, name: String, template: Page): Page = js.native
  def createWebPage(title: String, name: String, html: String): Page = js.native
  def deletePage(): Unit = js.native
  def getAllDescendants(): js.Array[Page] = js.native
  def getAllDescendants(options: PageAdvancedParameters): js.Array[Page] = js.native
  def getAnnouncements(): js.Array[Page] = js.native
  def getAnnouncements(optOptions: PageAdvancedParameters): js.Array[Page] = js.native
  def getAttachments(): js.Array[Attachment] = js.native
  def getAttachments(optOptions: js.Any): js.Array[Attachment] = js.native
  def getAuthors(): js.Array[String] = js.native
  def getChildByName(name: String): Page = js.native
  def getChildren(): js.Array[Page] = js.native
  def getChildren(options: PageAdvancedParameters): js.Array[Page] = js.native
  def getColumns(): js.Array[Column] = js.native
  def getDatePublished(): Date = js.native
  def getHtmlContent(): String = js.native
  def getIsDraft(): Boolean = js.native
  def getLastEdited(): Date = js.native
  def getLastUpdated(): Date = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getListItems(optOptions: js.Any): js.Array[ListItem] = js.native
  def getName(): String = js.native
  def getPageType(): PageType = js.native
  def getParent(): Page = js.native
  def getTextContent(): String = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def isDeleted(): Boolean = js.native
  def isTemplate(): Boolean = js.native
  def publishAsTemplate(name: String): Page = js.native
  def search(query: String): js.Array[Page] = js.native
  def search(query: String, options: PageAdvancedParameters): js.Array[Page] = js.native
  def setHtmlContent(html: String): Page = js.native
  def setIsDraft(draft: Boolean): Page = js.native
  def setName(name: String): Page = js.native
  def setParent(parent: Page): Page = js.native
  def setTitle(title: String): Page = js.native
  def addComment(content: String): Comment = js.native
  def getComments(): js.Array[Comment] = js.native
  def getComments(optOptions: js.Any): js.Array[Comment] = js.native
  def getPageName(): String = js.native
  def getSelfLink(): String = js.native
}

@js.native
sealed trait PageType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Sites.PageType")
object PageType extends js.Object {
  var WEB_PAGE: PageType = js.native
  var LIST_PAGE: PageType = js.native
  var ANNOUNCEMENT: PageType = js.native
  var ANNOUNCEMENTS_PAGE: PageType = js.native
  var FILE_CABINET_PAGE: PageType = js.native
  @JSBracketAccess
  def apply(value: PageType): String = js.native
}

@js.native
trait Site extends js.Object {
  def addEditor(emailAddress: String): Site = js.native
  def addEditor(user: User): Site = js.native
  def addEditors(emailAddresses: js.Array[String]): Site = js.native
  def addOwner(email: String): Site = js.native
  def addOwner(user: User): Site = js.native
  def addViewer(emailAddress: String): Site = js.native
  def addViewer(user: User): Site = js.native
  def addViewers(emailAddresses: js.Array[String]): Site = js.native
  def createAnnouncementsPage(title: String, name: String, html: String): Page = js.native
  def createFileCabinetPage(title: String, name: String, html: String): Page = js.native
  def createListPage(title: String, name: String, html: String, columnNames: js.Array[String]): Page = js.native
  def createPageFromTemplate(title: String, name: String, template: Page): Page = js.native
  def createWebPage(title: String, name: String, html: String): Page = js.native
  def getAllDescendants(): js.Array[Page] = js.native
  def getAllDescendants(options: PageAdvancedParameters): js.Array[Page] = js.native
  def getChildByName(name: String): Page = js.native
  def getChildren(): js.Array[Page] = js.native
  def getChildren(options: PageAdvancedParameters): js.Array[Page] = js.native
  def getEditors(): js.Array[User] = js.native
  def getName(): String = js.native
  def getOwners(): js.Array[User] = js.native
  def getSummary(): String = js.native
  def getTemplates(): js.Array[Page] = js.native
  def getTheme(): String = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def removeEditor(emailAddress: String): Site = js.native
  def removeEditor(user: User): Site = js.native
  def removeOwner(email: String): Site = js.native
  def removeOwner(user: User): Site = js.native
  def removeViewer(emailAddress: String): Site = js.native
  def removeViewer(user: User): Site = js.native
  def search(query: String): js.Array[Page] = js.native
  def search(query: String, options: PageAdvancedParameters): js.Array[Page] = js.native
  def setSummary(summary: String): Site = js.native
  def setTheme(theme: String): Site = js.native
  def setTitle(title: String): Site = js.native
  def addCollaborator(email: String): Site = js.native
  def addCollaborator(user: User): Site = js.native
  def createAnnouncement(title: String, html: String, parent: Page): Page = js.native
  def createComment(inReplyTo: String, html: String, parent: Page): Comment = js.native
  def createListItem(html: String, columnNames: js.Array[String], values: js.Array[String], parent: Page): ListItem = js.native
  def createWebAttachment(title: String, url: String, parent: Page): Attachment = js.native
  def deleteSite(): Unit = js.native
  def getAnnouncements(): js.Array[Page] = js.native
  def getAnnouncementsPages(): js.Array[Page] = js.native
  def getAttachments(): js.Array[Attachment] = js.native
  def getCollaborators(): js.Array[User] = js.native
  def getComments(): js.Array[Comment] = js.native
  def getFileCabinetPages(): js.Array[Page] = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getListPages(): js.Array[Page] = js.native
  def getSelfLink(): String = js.native
  def getSiteName(): String = js.native
  def getWebAttachments(): js.Array[Attachment] = js.native
  def getWebPages(): js.Array[Page] = js.native
  def removeCollaborator(email: String): Site = js.native
  def removeCollaborator(user: User): Site = js.native
}

@js.native
trait SitesApp extends js.Object {
  var AttachmentType: AttachmentType = js.native
  var PageType: PageType = js.native
  def copySite(domain: String, name: String, title: String, summary: String, site: Site): Site = js.native
  def createSite(domain: String, name: String, title: String, summary: String): Site = js.native
  def getActivePage(): Page = js.native
  def getActiveSite(): Site = js.native
  def getAllSites(domain: String): js.Array[Site] = js.native
  def getAllSites(domain: String, start: Integer, max: Integer): js.Array[Site] = js.native
  def getPageByUrl(url: String): Page = js.native
  def getSite(name: String): Site = js.native
  def getSite(domain: String, name: String): Site = js.native
  def getSiteByUrl(url: String): Site = js.native
  def getSites(): js.Array[Site] = js.native
  def getSites(start: Integer, max: Integer): js.Array[Site] = js.native
  def getSites(domain: String): js.Array[Site] = js.native
  def getSites(domain: String, start: Integer, max: Integer): js.Array[Site] = js.native
}
