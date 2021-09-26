package facade.googleappsscript.gmail

import facade.googleappsscript.base._

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait GmailApp extends js.Object {
  def createDraft(recipient: String, subject: String, body: String): GmailDraft = js.native
  def createDraft(
      recipient: String,
      subject: String,
      body: String,
      options: GmailAdvancedOptions
  ): GmailDraft = js.native
  def createLabel(name: String): GmailLabel                                = js.native
  def deleteLabel(label: GmailLabel): GmailApp                             = js.native
  def getAliases(): js.Array[String]                                       = js.native
  def getChatThreads(): js.Array[GmailThread]                              = js.native
  def getChatThreads(start: Integer, max: Integer): js.Array[GmailThread]  = js.native
  def getDraft(draftId: String): GmailDraft                                = js.native
  def getDraftMessages(): js.Array[GmailMessage]                           = js.native
  def getDrafts(): js.Array[GmailDraft]                                    = js.native
  def getInboxThreads(): js.Array[GmailThread]                             = js.native
  def getInboxThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getInboxUnreadCount(): Integer                                       = js.native
  def getMessageById(id: String): GmailMessage                             = js.native
  def getMessagesForThread(thread: GmailThread): js.Array[GmailMessage]    = js.native
  def getMessagesForThreads(threads: js.Array[GmailThread]): js.Array[js.Array[GmailMessage]] =
    js.native
  def getPriorityInboxThreads(): js.Array[GmailThread]                             = js.native
  def getPriorityInboxThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getPriorityInboxUnreadCount(): Integer                                       = js.native
  def getSpamThreads(): js.Array[GmailThread]                                      = js.native
  def getSpamThreads(start: Integer, max: Integer): js.Array[GmailThread]          = js.native
  def getSpamUnreadCount(): Integer                                                = js.native
  def getStarredThreads(): js.Array[GmailThread]                                   = js.native
  def getStarredThreads(start: Integer, max: Integer): js.Array[GmailThread]       = js.native
  def getStarredUnreadCount(): Integer                                             = js.native
  def getThreadById(id: String): GmailThread                                       = js.native
  def getTrashThreads(): js.Array[GmailThread]                                     = js.native
  def getTrashThreads(start: Integer, max: Integer): js.Array[GmailThread]         = js.native
  def getUserLabelByName(name: String): GmailLabel                                 = js.native
  def getUserLabels(): js.Array[GmailLabel]                                        = js.native
  def markMessageRead(message: GmailMessage): GmailApp                             = js.native
  def markMessageUnread(message: GmailMessage): GmailApp                           = js.native
  def markMessagesRead(messages: js.Array[GmailMessage]): GmailApp                 = js.native
  def markMessagesUnread(messages: js.Array[GmailMessage]): GmailApp               = js.native
  def markThreadImportant(thread: GmailThread): GmailApp                           = js.native
  def markThreadRead(thread: GmailThread): GmailApp                                = js.native
  def markThreadUnimportant(thread: GmailThread): GmailApp                         = js.native
  def markThreadUnread(thread: GmailThread): GmailApp                              = js.native
  def markThreadsImportant(threads: js.Array[GmailThread]): GmailApp               = js.native
  def markThreadsRead(threads: js.Array[GmailThread]): GmailApp                    = js.native
  def markThreadsUnimportant(threads: js.Array[GmailThread]): GmailApp             = js.native
  def markThreadsUnread(threads: js.Array[GmailThread]): GmailApp                  = js.native
  def moveMessageToTrash(message: GmailMessage): GmailApp                          = js.native
  def moveMessagesToTrash(messages: js.Array[GmailMessage]): GmailApp              = js.native
  def moveThreadToArchive(thread: GmailThread): GmailApp                           = js.native
  def moveThreadToInbox(thread: GmailThread): GmailApp                             = js.native
  def moveThreadToSpam(thread: GmailThread): GmailApp                              = js.native
  def moveThreadToTrash(thread: GmailThread): GmailApp                             = js.native
  def moveThreadsToArchive(threads: js.Array[GmailThread]): GmailApp               = js.native
  def moveThreadsToInbox(threads: js.Array[GmailThread]): GmailApp                 = js.native
  def moveThreadsToSpam(threads: js.Array[GmailThread]): GmailApp                  = js.native
  def moveThreadsToTrash(threads: js.Array[GmailThread]): GmailApp                 = js.native
  def refreshMessage(message: GmailMessage): GmailApp                              = js.native
  def refreshMessages(messages: js.Array[GmailMessage]): GmailApp                  = js.native
  def refreshThread(thread: GmailThread): GmailApp                                 = js.native
  def refreshThreads(threads: js.Array[GmailThread]): GmailApp                     = js.native
  def search(query: String): js.Array[GmailThread]                                 = js.native
  def search(query: String, start: Integer, max: Integer): js.Array[GmailThread]   = js.native
  def sendEmail(recipient: String, subject: String, body: String): GmailApp        = js.native
  def sendEmail(
      recipient: String,
      subject: String,
      body: String,
      options: GmailAdvancedOptions
  ): GmailApp = js.native
  def setCurrentMessageAccessToken(accessToken: String): Unit    = js.native
  def starMessage(message: GmailMessage): GmailApp               = js.native
  def starMessages(messages: js.Array[GmailMessage]): GmailApp   = js.native
  def unstarMessage(message: GmailMessage): GmailApp             = js.native
  def unstarMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
}

@js.native
trait GmailAttachment extends js.Object {
  def copyBlob(): Blob                                         = js.native
  def getAs(contentType: String): Blob                         = js.native
  def getBytes(): js.Array[Byte]                               = js.native
  def getContentType(): String                                 = js.native
  def getDataAsString(): String                                = js.native
  def getDataAsString(charset: String): String                 = js.native
  def getHash(): String                                        = js.native
  def getName(): String                                        = js.native
  def getSize(): Integer                                       = js.native
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
trait GmailDraft extends js.Object {
  def deleteDraft(): Unit                                                  = js.native
  def getId(): String                                                      = js.native
  def getMessage(): GmailMessage                                           = js.native
  def getMessageId(): String                                               = js.native
  def send(): GmailMessage                                                 = js.native
  def update(recipient: String, subject: String, body: String): GmailDraft = js.native
  def update(
      recipient: String,
      subject: String,
      body: String,
      options: GmailAdvancedOptions
  ): GmailDraft = js.native
}

@js.native
trait GmailAdvancedOptions extends js.Object {
  var attachments: js.Array[BlobSource]               = js.native
  var bcc: String                                     = js.native
  var cc: String                                      = js.native
  var from: String                                    = js.native
  var htmlBody: String                                = js.native
  var inlineImages: GmailAdvancedOptions.InlineImages = js.native
  var name: String                                    = js.native
  var replyTo: String                                 = js.native
}

object GmailAdvancedOptions {

  @js.native
  trait InlineImages extends js.Object {
    @JSBracketAccess
    def apply(imageKey: String): BlobSource = js.native
    @JSBracketAccess
    def update(imageKey: String, v: BlobSource): Unit = js.native
  }
}

@js.native
trait GmailAttachmentOptions extends js.Object {
  var includeInlineImages: Boolean = js.native
  var includeAttachments: Boolean  = js.native
}

@js.native
trait GmailLabel extends js.Object {
  def addToThread(thread: GmailThread): GmailLabel                    = js.native
  def addToThreads(threads: js.Array[GmailThread]): GmailLabel        = js.native
  def deleteLabel(): Unit                                             = js.native
  def getName(): String                                               = js.native
  def getThreads(): js.Array[GmailThread]                             = js.native
  def getThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getUnreadCount(): Integer                                       = js.native
  def removeFromThread(thread: GmailThread): GmailLabel               = js.native
  def removeFromThreads(threads: js.Array[GmailThread]): GmailLabel   = js.native
}

@js.native
trait GmailMessage extends js.Object {
  def createDraftReply(body: String): GmailDraft                                   = js.native
  def createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft    = js.native
  def createDraftReplyAll(body: String): GmailDraft                                = js.native
  def createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
  def forward(recipient: String): GmailMessage                                     = js.native
  def forward(recipient: String, options: GmailAdvancedOptions): GmailMessage      = js.native
  def getAttachments(): js.Array[GmailAttachment]                                  = js.native
  def getAttachments(options: GmailAttachmentOptions): js.Array[GmailAttachment]   = js.native
  def getBcc(): String                                                             = js.native
  def getBody(): String                                                            = js.native
  def getCc(): String                                                              = js.native
  def getDate(): Date                                                              = js.native
  def getFrom(): String                                                            = js.native
  def getHeader(name: String): String                                              = js.native
  def getId(): String                                                              = js.native
  def getPlainBody(): String                                                       = js.native
  def getRawContent(): String                                                      = js.native
  def getReplyTo(): String                                                         = js.native
  def getSubject(): String                                                         = js.native
  def getThread(): GmailThread                                                     = js.native
  def getTo(): String                                                              = js.native
  def isDraft(): Boolean                                                           = js.native
  def isInChats(): Boolean                                                         = js.native
  def isInInbox(): Boolean                                                         = js.native
  def isInPriorityInbox(): Boolean                                                 = js.native
  def isInTrash(): Boolean                                                         = js.native
  def isStarred(): Boolean                                                         = js.native
  def isUnread(): Boolean                                                          = js.native
  def markRead(): GmailMessage                                                     = js.native
  def markUnread(): GmailMessage                                                   = js.native
  def moveToTrash(): GmailMessage                                                  = js.native
  def refresh(): GmailMessage                                                      = js.native
  def reply(body: String): GmailMessage                                            = js.native
  def reply(body: String, options: GmailAdvancedOptions): GmailMessage             = js.native
  def replyAll(body: String): GmailMessage                                         = js.native
  def replyAll(body: String, options: GmailAdvancedOptions): GmailMessage          = js.native
  def star(): GmailMessage                                                         = js.native
  def unstar(): GmailMessage                                                       = js.native
}

@js.native
trait GmailThread extends js.Object {
  def addLabel(label: GmailLabel): GmailThread                                     = js.native
  def createDraftReply(body: String): GmailDraft                                   = js.native
  def createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft    = js.native
  def createDraftReplyAll(body: String): GmailDraft                                = js.native
  def createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
  def getFirstMessageSubject(): String                                             = js.native
  def getId(): String                                                              = js.native
  def getLabels(): js.Array[GmailLabel]                                            = js.native
  def getLastMessageDate(): Date                                                   = js.native
  def getMessageCount(): Integer                                                   = js.native
  def getMessages(): js.Array[GmailMessage]                                        = js.native
  def getPermalink(): String                                                       = js.native
  def hasStarredMessages(): Boolean                                                = js.native
  def isImportant(): Boolean                                                       = js.native
  def isInChats(): Boolean                                                         = js.native
  def isInInbox(): Boolean                                                         = js.native
  def isInPriorityInbox(): Boolean                                                 = js.native
  def isInSpam(): Boolean                                                          = js.native
  def isInTrash(): Boolean                                                         = js.native
  def isUnread(): Boolean                                                          = js.native
  def markImportant(): GmailThread                                                 = js.native
  def markRead(): GmailThread                                                      = js.native
  def markUnimportant(): GmailThread                                               = js.native
  def markUnread(): GmailThread                                                    = js.native
  def moveToArchive(): GmailThread                                                 = js.native
  def moveToInbox(): GmailThread                                                   = js.native
  def moveToSpam(): GmailThread                                                    = js.native
  def moveToTrash(): GmailThread                                                   = js.native
  def refresh(): GmailThread                                                       = js.native
  def removeLabel(label: GmailLabel): GmailThread                                  = js.native
  def reply(body: String): GmailThread                                             = js.native
  def reply(body: String, options: GmailAdvancedOptions): GmailThread              = js.native
  def replyAll(body: String): GmailThread                                          = js.native
  def replyAll(body: String, options: GmailAdvancedOptions): GmailThread           = js.native
}

@js.native
@JSGlobal("GoogleAppsScript.Gmail")
object Gmail extends js.Object {
  type GmailDraftOptions = GmailAdvancedOptions
}
