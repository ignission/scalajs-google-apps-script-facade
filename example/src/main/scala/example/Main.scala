package example

import facade.googleappsscript.DoPost
import facade.googleappsscript.GoogleAppsScript.{ContentService, SpreadsheetApp}
import facade.googleappsscript.content.{MimeType, TextOutput}
import facade.googleappsscript.spreadsheet.Sheet

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation._

@js.native
trait PostData extends js.Object {
  val post: Post   = js.native
  val topic: Topic = js.native
}

@js.native
trait Post extends js.Object {
  val id: js.Any       = js.native
  val message: String  = js.native
  val account: Account = js.native
}

@js.native
trait Topic extends js.Object {
  val id: js.Any   = js.native
  val name: String = js.native
}

@js.native
trait Account extends js.Object {
  val id: js.Any   = js.native
  val name: String = js.native
}

trait TypetalkReply extends js.Object {
  val message: String
  val replyTo: js.Any
}

object Main {

  import facade.googleappsscript.syntax._

  @JSExportTopLevel("doPost")
  def doPost(e: DoPost): TextOutput = {
    val data           = JSON.parse(e.postData.contents).asInstanceOf[PostData]
    val sheet          = getOrCreateSheet(data.topic, data.post.account)
    val message        = data.post.message
    val removedMessage = removeBotName(message)

    addContent(sheet, removedMessage)

    val contents = listContents(sheet)
    val reply = new TypetalkReply {
      val message: String = contents.mkString("\n")
      val replyTo: js.Any = data.post.id
    }

    ContentService
      .createTextOutput(JSON.stringify(reply))
      .setMimeType(MimeType.JSON);
  }

  def removeBotName(content: String): String = {
    content.replaceFirst("@.+\\+ ", "")
  }

  private def getOrCreateSheet(topic: Topic, account: Account): Sheet = {
    val sheetName = s"${topic.id}-${account.name}"

    SpreadsheetApp
      .getActiveSpreadsheet()
      .getSheetByName(sheetName)
      .toOption
      .getOrElse(SpreadsheetApp.getActiveSpreadsheet().insertSheet(sheetName, 1))
  }

  private def addContent(sheet: Sheet, content: String): Unit =
    sheet.getRange(sheet.getLastRow() + 1, 1).setNumberFormat("@").setValue(content)

  private def listContents(sheet: Sheet): Seq[String] =
    (1 to sheet.getLastRow())
      .map { i =>
        sheet
          .getRange(i, 1)
          .getValue()
          .asInstanceOf[js.Any]
          .toString
      }

}
