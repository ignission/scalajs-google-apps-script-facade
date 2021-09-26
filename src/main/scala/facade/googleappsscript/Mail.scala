package facade.googleappsscript.mail

import facade.googleappsscript.base.BlobSource

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait MailAdvancedParameters extends js.Object {
  var attachments: js.Array[BlobSource]                 = js.native
  var bcc: String                                       = js.native
  var body: String                                      = js.native
  var cc: String                                        = js.native
  var htmlBody: String                                  = js.native
  var inlineImages: MailAdvancedParameters.InlineImages = js.native
  var name: String                                      = js.native
  var noReply: Boolean                                  = js.native
  var replyTo: String                                   = js.native
  var subject: String                                   = js.native
  var to: String                                        = js.native
}

object MailAdvancedParameters {

  @js.native
  trait InlineImages extends js.Object {
    @JSBracketAccess
    def apply(imageKey: String): BlobSource = js.native
    @JSBracketAccess
    def update(imageKey: String, v: BlobSource): Unit = js.native
  }
}

@js.native
trait MailApp extends js.Object {
  def getRemainingDailyQuota(): Integer                                 = js.native
  def sendEmail(message: MailAdvancedParameters): Unit                  = js.native
  def sendEmail(recipient: String, subject: String, body: String): Unit = js.native
  def sendEmail(
      recipient: String,
      subject: String,
      body: String,
      options: MailAdvancedParameters
  ): Unit = js.native
  def sendEmail(to: String, replyTo: String, subject: String, body: String): Unit = js.native
}
