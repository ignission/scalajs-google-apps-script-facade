package tech.ignission.jsgas.forms

import tech.ignission.jsgas.base._
import tech.ignission.jsgas.document

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
sealed trait Alignment extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Forms.Alignment")
object Alignment extends js.Object {
  var LEFT: Alignment = js.native
  var CENTER: Alignment = js.native
  var RIGHT: Alignment = js.native
  @JSBracketAccess
  def apply(value: Alignment): String = js.native
}

@js.native
trait CheckboxGridItem extends js.Object {
  def clearValidation(): CheckboxGridItem = js.native
  def createResponse(responses: js.Array[js.Array[String]]): ItemResponse = js.native
  def duplicate(): CheckboxGridItem = js.native
  def getColumns(): js.Array[String] = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getRows(): js.Array[String] = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setColumns(columns: js.Array[String]): CheckboxGridItem = js.native
  def setHelpText(text: String): CheckboxGridItem = js.native
  def setRequired(enabled: Boolean): CheckboxGridItem = js.native
  def setRows(rows: js.Array[String]): CheckboxGridItem = js.native
  def setTitle(title: String): CheckboxGridItem = js.native
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem = js.native
}

@js.native
trait CheckboxGridValidation extends js.Object {
}

@js.native
trait CheckboxGridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): CheckboxGridValidationBuilder = js.native
}

@js.native
trait CheckboxItem extends js.Object {
  def clearValidation(): CheckboxItem = js.native
  def createChoice(value: String): Choice = js.native
  def createChoice(value: String, isCorrect: Boolean): Choice = js.native
  def createResponse(responses: js.Array[String]): ItemResponse = js.native
  def duplicate(): CheckboxItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def hasOtherOption(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def setChoiceValues(values: js.Array[String]): CheckboxItem = js.native
  def setChoices(choices: js.Array[Choice]): CheckboxItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): CheckboxItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): CheckboxItem = js.native
  def setHelpText(text: String): CheckboxItem = js.native
  def setPoints(points: Integer): CheckboxItem = js.native
  def setRequired(enabled: Boolean): CheckboxItem = js.native
  def setTitle(title: String): CheckboxItem = js.native
  def setValidation(validation: CheckboxValidation): CheckboxItem = js.native
  def showOtherOption(enabled: Boolean): CheckboxItem = js.native
}

@js.native
trait CheckboxValidation extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidation = js.native
  def requireSelectAtMost(number: Integer): CheckboxValidation = js.native
  def requireSelectExactly(number: Integer): CheckboxValidation = js.native
}

@js.native
trait CheckboxValidationBuilder extends js.Object {
  def requireSelectAtLeast(number: Integer): CheckboxValidationBuilder = js.native
  def requireSelectAtMost(number: Integer): CheckboxValidationBuilder = js.native
  def requireSelectExactly(number: Integer): CheckboxValidationBuilder = js.native
}

@js.native
trait Choice extends js.Object {
  def getGotoPage(): PageBreakItem = js.native
  def getPageNavigationType(): PageNavigationType = js.native
  def getValue(): String = js.native
  def isCorrectAnswer(): Boolean = js.native
}

@js.native
trait DateItem extends js.Object {
  def createResponse(response: Date): ItemResponse = js.native
  def duplicate(): DateItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def includesYear(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): DateItem = js.native
  def setHelpText(text: String): DateItem = js.native
  def setIncludesYear(enableYear: Boolean): DateItem = js.native
  def setPoints(points: Integer): DateItem = js.native
  def setRequired(enabled: Boolean): DateItem = js.native
  def setTitle(title: String): DateItem = js.native
}

@js.native
trait DateTimeItem extends js.Object {
  def createResponse(response: Date): ItemResponse = js.native
  def duplicate(): DateTimeItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def includesYear(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): DateTimeItem = js.native
  def setHelpText(text: String): DateTimeItem = js.native
  def setIncludesYear(enableYear: Boolean): DateTimeItem = js.native
  def setPoints(points: Integer): DateTimeItem = js.native
  def setRequired(enabled: Boolean): DateTimeItem = js.native
  def setTitle(title: String): DateTimeItem = js.native
}

@js.native
sealed trait DestinationType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Forms.DestinationType")
object DestinationType extends js.Object {
  var SPREADSHEET: DestinationType = js.native
  @JSBracketAccess
  def apply(value: DestinationType): String = js.native
}

@js.native
trait DurationItem extends js.Object {
  def createResponse(hours: Integer, minutes: Integer, seconds: Integer): ItemResponse = js.native
  def duplicate(): DurationItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): DurationItem = js.native
  def setHelpText(text: String): DurationItem = js.native
  def setPoints(points: Integer): DurationItem = js.native
  def setRequired(enabled: Boolean): DurationItem = js.native
  def setTitle(title: String): DurationItem = js.native
}

@js.native
sealed trait FeedbackType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Forms.FeedbackType")
object FeedbackType extends js.Object {
  var CORRECT: FeedbackType = js.native
  var INCORRECT: FeedbackType = js.native
  var GENERAL: FeedbackType = js.native
  @JSBracketAccess
  def apply(value: FeedbackType): String = js.native
}

@js.native
trait Form extends js.Object {
  def addCheckboxGridItem(): CheckboxGridItem = js.native
  def addCheckboxItem(): CheckboxItem = js.native
  def addDateItem(): DateItem = js.native
  def addDateTimeItem(): DateTimeItem = js.native
  def addDurationItem(): DurationItem = js.native
  def addEditor(emailAddress: String): Form = js.native
  def addEditor(user: User): Form = js.native
  def addEditors(emailAddresses: js.Array[String]): Form = js.native
  def addGridItem(): GridItem = js.native
  def addImageItem(): ImageItem = js.native
  def addListItem(): document.ListItem = js.native
  def addMultipleChoiceItem(): MultipleChoiceItem = js.native
  def addPageBreakItem(): PageBreakItem = js.native
  def addParagraphTextItem(): ParagraphTextItem = js.native
  def addScaleItem(): ScaleItem = js.native
  def addSectionHeaderItem(): SectionHeaderItem = js.native
  def addTextItem(): TextItem = js.native
  def addTimeItem(): TimeItem = js.native
  def addVideoItem(): VideoItem = js.native
  def canEditResponse(): Boolean = js.native
  def collectsEmail(): Boolean = js.native
  def createResponse(): FormResponse = js.native
  def deleteAllResponses(): Form = js.native
  def deleteItem(index: Integer): Unit = js.native
  def deleteItem(item: Item): Unit = js.native
  def deleteResponse(responseId: String): Form = js.native
  def getConfirmationMessage(): String = js.native
  def getCustomClosedFormMessage(): String = js.native
  def getDescription(): String = js.native
  def getDestinationId(): String = js.native
  def getDestinationType(): DestinationType = js.native
  def getEditUrl(): String = js.native
  def getEditors(): js.Array[User] = js.native
  def getId(): String = js.native
  def getItemById(id: Integer): Item = js.native
  def getItems(): js.Array[Item] = js.native
  def getItems(itemType: ItemType): js.Array[Item] = js.native
  def getPublishedUrl(): String = js.native
  def getResponse(responseId: String): FormResponse = js.native
  def getResponses(): js.Array[FormResponse] = js.native
  def getResponses(timestamp: Date): js.Array[FormResponse] = js.native
  def getShuffleQuestions(): Boolean = js.native
  def getSummaryUrl(): String = js.native
  def getTitle(): String = js.native
  def hasLimitOneResponsePerUser(): Boolean = js.native
  def hasProgressBar(): Boolean = js.native
  def hasRespondAgainLink(): Boolean = js.native
  def isAcceptingResponses(): Boolean = js.native
  def isPublishingSummary(): Boolean = js.native
  def isQuiz(): Boolean = js.native
  def moveItem(from: Integer, to: Integer): Item = js.native
  def moveItem(item: Item, toIndex: Integer): Item = js.native
  def removeDestination(): Form = js.native
  def removeEditor(emailAddress: String): Form = js.native
  def removeEditor(user: User): Form = js.native
  def requiresLogin(): Boolean = js.native
  def setAcceptingResponses(enabled: Boolean): Form = js.native
  def setAllowResponseEdits(enabled: Boolean): Form = js.native
  def setCollectEmail(collect: Boolean): Form = js.native
  def setConfirmationMessage(message: String): Form = js.native
  def setCustomClosedFormMessage(message: String): Form = js.native
  def setDescription(description: String): Form = js.native
  def setDestination(`type`: DestinationType, id: String): Form = js.native
  def setIsQuiz(enabled: Boolean): Form = js.native
  def setLimitOneResponsePerUser(enabled: Boolean): Form = js.native
  def setProgressBar(enabled: Boolean): Form = js.native
  def setPublishingSummary(enabled: Boolean): Form = js.native
  def setRequireLogin(requireLogin: Boolean): Form = js.native
  def setShowLinkToRespondAgain(enabled: Boolean): Form = js.native
  def setShuffleQuestions(shuffle: Boolean): Form = js.native
  def setTitle(title: String): Form = js.native
  def shortenFormUrl(url: String): String = js.native
  def submitGrades(responses: js.Array[FormResponse]): Form = js.native
}

@js.native
trait FormApp extends js.Object {
  var Alignment: Alignment = js.native
  var DestinationType: DestinationType = js.native
  var FeedbackType: FeedbackType = js.native
  var ItemType: ItemType = js.native
  var PageNavigationType: PageNavigationType = js.native
  def create(title: String): Form = js.native
  def createCheckboxGridValidation(): CheckboxGridValidationBuilder = js.native
  def createCheckboxValidation(): CheckboxValidationBuilder = js.native
  def createFeedback(): QuizFeedbackBuilder = js.native
  def createGridValidation(): GridValidationBuilder = js.native
  def createParagraphTextValidation(): ParagraphTextValidationBuilder = js.native
  def createTextValidation(): TextValidationBuilder = js.native
  def getActiveForm(): Form = js.native
  def getUi(): Ui = js.native
  def openById(id: String): Form = js.native
  def openByUrl(url: String): Form = js.native
}

@js.native
trait FormResponse extends js.Object {
  def getEditResponseUrl(): String = js.native
  def getGradableItemResponses(): js.Array[ItemResponse] = js.native
  def getGradableResponseForItem(item: Item): ItemResponse = js.native
  def getId(): String = js.native
  def getItemResponses(): js.Array[ItemResponse] = js.native
  def getRespondentEmail(): String = js.native
  def getResponseForItem(item: Item): ItemResponse = js.native
  def getTimestamp(): Date = js.native
  def submit(): FormResponse = js.native
  def toPrefilledUrl(): String = js.native
  def withItemGrade(gradedResponse: ItemResponse): FormResponse = js.native
  def withItemResponse(response: ItemResponse): FormResponse = js.native
}

@js.native
trait GridItem extends js.Object {
  def clearValidation(): GridItem = js.native
  def createResponse(responses: js.Array[String]): ItemResponse = js.native
  def duplicate(): GridItem = js.native
  def getColumns(): js.Array[String] = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getRows(): js.Array[String] = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setColumns(columns: js.Array[String]): GridItem = js.native
  def setHelpText(text: String): GridItem = js.native
  def setRequired(enabled: Boolean): GridItem = js.native
  def setRows(rows: js.Array[String]): GridItem = js.native
  def setTitle(title: String): GridItem = js.native
  def setValidation(validation: GridValidation): GridItem = js.native
}

@js.native
trait GridValidation extends js.Object {
}

@js.native
trait GridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): GridValidationBuilder = js.native
}

@js.native
trait ImageItem extends js.Object {
  def duplicate(): ImageItem = js.native
  def getAlignment(): Alignment = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getImage(): Blob = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getWidth(): Integer = js.native
  def setAlignment(alignment: Alignment): ImageItem = js.native
  def setHelpText(text: String): ImageItem = js.native
  def setImage(image: BlobSource): ImageItem = js.native
  def setTitle(title: String): ImageItem = js.native
  def setWidth(width: Integer): ImageItem = js.native
}

@js.native
trait Item extends js.Object {
  def asCheckboxGridItem(): CheckboxGridItem = js.native
  def asCheckboxItem(): CheckboxItem = js.native
  def asDateItem(): DateItem = js.native
  def asDateTimeItem(): DateTimeItem = js.native
  def asDurationItem(): DurationItem = js.native
  def asGridItem(): GridItem = js.native
  def asImageItem(): ImageItem = js.native
  def asListItem(): document.ListItem = js.native
  def asMultipleChoiceItem(): MultipleChoiceItem = js.native
  def asPageBreakItem(): PageBreakItem = js.native
  def asParagraphTextItem(): ParagraphTextItem = js.native
  def asScaleItem(): ScaleItem = js.native
  def asSectionHeaderItem(): SectionHeaderItem = js.native
  def asTextItem(): TextItem = js.native
  def asTimeItem(): TimeItem = js.native
  def asVideoItem(): VideoItem = js.native
  def duplicate(): Item = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def setHelpText(text: String): Item = js.native
  def setTitle(title: String): Item = js.native
}

@js.native
trait ItemResponse extends js.Object {
  def getFeedback(): QuizFeedback = js.native
  def getItem(): Item = js.native
  def getResponse(): js.Array[js.Array[String]] | js.Array[String] | String = js.native
  def getScore(): Double = js.native
  def setFeedback(feedback: js.Any): ItemResponse = js.native
  def setScore(score: js.Any): ItemResponse = js.native
}

@js.native
sealed trait ItemType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Forms.ItemType")
object ItemType extends js.Object {
  var CHECKBOX: ItemType = js.native
  var CHECKBOX_GRID: ItemType = js.native
  var DATE: ItemType = js.native
  var DATETIME: ItemType = js.native
  var DURATION: ItemType = js.native
  var GRID: ItemType = js.native
  var IMAGE: ItemType = js.native
  var LIST: ItemType = js.native
  var MULTIPLE_CHOICE: ItemType = js.native
  var PAGE_BREAK: ItemType = js.native
  var PARAGRAPH_TEXT: ItemType = js.native
  var SCALE: ItemType = js.native
  var SECTION_HEADER: ItemType = js.native
  var TEXT: ItemType = js.native
  var TIME: ItemType = js.native
  var VIDEO: ItemType = js.native
  @JSBracketAccess
  def apply(value: ItemType): String = js.native
}

@js.native
trait ListItem extends js.Object {
  def createChoice(value: String): Choice = js.native
  def createChoice(value: String, isCorrect: Boolean): Choice = js.native
  def createChoice(value: String, navigationItem: PageBreakItem): Choice = js.native
  def createChoice(value: String, navigationType: PageNavigationType): Choice = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): document.ListItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setChoiceValues(values: js.Array[String]): document.ListItem = js.native
  def setChoices(choices: js.Array[Choice]): document.ListItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): document.ListItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): document.ListItem = js.native
  def setHelpText(text: String): document.ListItem = js.native
  def setPoints(points: Integer): document.ListItem = js.native
  def setRequired(enabled: Boolean): document.ListItem = js.native
  def setTitle(title: String): document.ListItem = js.native
}

@js.native
trait MultipleChoiceItem extends js.Object {
  def createChoice(value: String): Choice = js.native
  def createChoice(value: String, isCorrect: Boolean): Choice = js.native
  def createChoice(value: String, navigationItem: PageBreakItem): Choice = js.native
  def createChoice(value: String, navigationType: PageNavigationType): Choice = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): MultipleChoiceItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def hasOtherOption(): Boolean = js.native
  def isRequired(): Boolean = js.native
  def setChoiceValues(values: js.Array[String]): MultipleChoiceItem = js.native
  def setChoices(choices: js.Array[Choice]): MultipleChoiceItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): MultipleChoiceItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): MultipleChoiceItem = js.native
  def setHelpText(text: String): MultipleChoiceItem = js.native
  def setPoints(points: Integer): MultipleChoiceItem = js.native
  def setRequired(enabled: Boolean): MultipleChoiceItem = js.native
  def setTitle(title: String): MultipleChoiceItem = js.native
  def showOtherOption(enabled: Boolean): MultipleChoiceItem = js.native
}

@js.native
trait PageBreakItem extends js.Object {
  def duplicate(): PageBreakItem = js.native
  def getGoToPage(): PageBreakItem = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPageNavigationType(): PageNavigationType = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def setGoToPage(goToPageItem: PageBreakItem): PageBreakItem = js.native
  def setGoToPage(navigationType: PageNavigationType): PageBreakItem = js.native
  def setHelpText(text: String): PageBreakItem = js.native
  def setTitle(title: String): PageBreakItem = js.native
}

@js.native
sealed trait PageNavigationType extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Forms.PageNavigationType")
object PageNavigationType extends js.Object {
  var CONTINUE: PageNavigationType = js.native
  var GO_TO_PAGE: PageNavigationType = js.native
  var RESTART: PageNavigationType = js.native
  var SUBMIT: PageNavigationType = js.native
  @JSBracketAccess
  def apply(value: PageNavigationType): String = js.native
}

@js.native
trait ParagraphTextItem extends js.Object {
  def clearValidation(): ParagraphTextItem = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): ParagraphTextItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): ParagraphTextItem = js.native
  def setHelpText(text: String): ParagraphTextItem = js.native
  def setPoints(points: Integer): ParagraphTextItem = js.native
  def setRequired(enabled: Boolean): ParagraphTextItem = js.native
  def setTitle(title: String): ParagraphTextItem = js.native
  def setValidation(validation: ParagraphTextValidation): ParagraphTextItem = js.native
}

@js.native
trait ParagraphTextValidation extends js.Object {
}

@js.native
trait ParagraphTextValidationBuilder extends js.Object {
  def requireTextContainsPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextDoesNotContainPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextDoesNotMatchPattern(pattern: String): ParagraphTextValidationBuilder = js.native
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder = js.native
  def requireTextLengthLessThanOrEqualTo(number: Integer): ParagraphTextValidationBuilder = js.native
  def requireTextMatchesPattern(pattern: String): ParagraphTextValidationBuilder = js.native
}

@js.native
trait QuizFeedback extends js.Object {
  def getLinkUrls(): js.Array[String] = js.native
  def getText(): String = js.native
}

@js.native
trait QuizFeedbackBuilder extends js.Object {
  def addLink(url: String): QuizFeedbackBuilder = js.native
  def addLink(url: String, displayText: String): QuizFeedbackBuilder = js.native
  def build(): QuizFeedback = js.native
  def copy(): QuizFeedbackBuilder = js.native
  def setText(text: String): QuizFeedbackBuilder = js.native
}

@js.native
trait ScaleItem extends js.Object {
  def createResponse(response: Integer): ItemResponse = js.native
  def duplicate(): ScaleItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getLeftLabel(): String = js.native
  def getLowerBound(): Integer = js.native
  def getPoints(): Integer = js.native
  def getRightLabel(): String = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getUpperBound(): Integer = js.native
  def isRequired(): Boolean = js.native
  def setBounds(lower: Integer, upper: Integer): ScaleItem = js.native
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem = js.native
  def setHelpText(text: String): ScaleItem = js.native
  def setLabels(lower: String, upper: String): ScaleItem = js.native
  def setPoints(points: Integer): ScaleItem = js.native
  def setRequired(enabled: Boolean): ScaleItem = js.native
  def setTitle(title: String): ScaleItem = js.native
}

@js.native
trait SectionHeaderItem extends js.Object {
  def duplicate(): SectionHeaderItem = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def setHelpText(text: String): SectionHeaderItem = js.native
  def setTitle(title: String): SectionHeaderItem = js.native
}

@js.native
trait TextItem extends js.Object {
  def clearValidation(): TextItem = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): TextItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): TextItem = js.native
  def setHelpText(text: String): TextItem = js.native
  def setPoints(points: Integer): TextItem = js.native
  def setRequired(enabled: Boolean): TextItem = js.native
  def setTitle(title: String): TextItem = js.native
  def setValidation(validation: TextValidation): TextItem = js.native
}

@js.native
trait TextValidation extends js.Object {
}

@js.native
trait TextValidationBuilder extends js.Object {
  def requireNumber(): TextValidationBuilder = js.native
  def requireNumberBetween(start: Double, end: Double): TextValidationBuilder = js.native
  def requireNumberEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberGreaterThan(number: Double): TextValidationBuilder = js.native
  def requireNumberGreaterThanOrEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberLessThan(number: Double): TextValidationBuilder = js.native
  def requireNumberLessThanOrEqualTo(number: Double): TextValidationBuilder = js.native
  def requireNumberNotBetween(start: Double, end: Double): TextValidationBuilder = js.native
  def requireNumberNotEqualTo(number: Double): TextValidationBuilder = js.native
  def requireTextContainsPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextDoesNotContainPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextDoesNotMatchPattern(pattern: String): TextValidationBuilder = js.native
  def requireTextIsEmail(): TextValidationBuilder = js.native
  def requireTextIsUrl(): TextValidationBuilder = js.native
  def requireTextLengthGreaterThanOrEqualTo(number: Integer): TextValidationBuilder = js.native
  def requireTextLengthLessThanOrEqualTo(number: Integer): TextValidationBuilder = js.native
  def requireTextMatchesPattern(pattern: String): TextValidationBuilder = js.native
  def requireWholeNumber(): TextValidationBuilder = js.native
}

@js.native
trait TimeItem extends js.Object {
  def createResponse(hour: Integer, minute: Integer): ItemResponse = js.native
  def duplicate(): TimeItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): TimeItem = js.native
  def setHelpText(text: String): TimeItem = js.native
  def setPoints(points: Integer): TimeItem = js.native
  def setRequired(enabled: Boolean): TimeItem = js.native
  def setTitle(title: String): TimeItem = js.native
}

@js.native
trait VideoItem extends js.Object {
  def duplicate(): VideoItem = js.native
  def getAlignment(): Alignment = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getWidth(): Integer = js.native
  def setAlignment(alignment: Alignment): VideoItem = js.native
  def setHelpText(text: String): VideoItem = js.native
  def setTitle(title: String): VideoItem = js.native
  def setVideoUrl(youtubeUrl: String): VideoItem = js.native
  def setWidth(width: Integer): VideoItem = js.native
}
