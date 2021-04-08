package tech.ignission.jsgas.cardservice

import tech.ignission.jsgas.gmail.GmailDraft

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  def setFunctionName(functionName: String): Action            = js.native
  def setLoadIndicator(loadIndicator: LoadIndicator): Action   = js.native
  def setParameters(parameters: js.Dictionary[String]): Action = js.native
  def setMethodName(functionName: String): Action              = js.native
}

@js.native
trait ActionResponse extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait ActionResponseBuilder extends js.Object {
  def build(): ActionResponse                                            = js.native
  def setNavigation(navigation: Navigation): ActionResponseBuilder       = js.native
  def setNotification(notification: Notification): ActionResponseBuilder = js.native
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder             = js.native
  def setStateChanged(stateChanged: Boolean): ActionResponseBuilder      = js.native
}

@js.native
trait AuthorizationAction extends js.Object {
  def setAuthorizationUrl(authorizationUrl: String): AuthorizationAction = js.native
}

@js.native
trait AuthorizationException extends js.Object {
  def printJson(): String                                           = js.native
  def setAuthorizationUrl(authUrl: String): AuthorizationException  = js.native
  def setCustomUiCallback(callback: String): AuthorizationException = js.native
  def setResourceDisplayName(name: String): AuthorizationException  = js.native
  def throwException(): Unit                                        = js.native
}

@js.native
trait Button extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): Button                    = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button = js.native
  def setOnClickAction(action: Action): Button                                       = js.native
  def setOnClickOpenLinkAction(action: Action): Button                               = js.native
  def setOpenLink(openLink: OpenLink): Button                                        = js.native
}

@js.native
trait ButtonSet extends js.Object {
  def addButton(button: Button): ButtonSet = js.native
}

@js.native
trait Card extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait CardAction extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): CardAction = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction =
    js.native
  def setOnClickAction(action: Action): CardAction         = js.native
  def setOnClickOpenLinkAction(action: Action): CardAction = js.native
  def setOpenLink(openLink: OpenLink): CardAction          = js.native
  def setText(text: String): CardAction                    = js.native
}

@js.native
trait CardBuilder extends js.Object {
  def addCardAction(cardAction: CardAction): CardBuilder = js.native
  def addSection(section: CardSection): CardBuilder      = js.native
  def build(): Card                                      = js.native
  def setHeader(cardHeader: CardHeader): CardBuilder     = js.native
  def setName(name: String): CardBuilder                 = js.native
}

@js.native
trait CardHeader extends js.Object {
  def setImageAltText(imageAltText: String): CardHeader = js.native
  def setImageStyle(imageStyle: ImageStyle): CardHeader = js.native
  def setImageUrl(imageUrl: String): CardHeader         = js.native
  def setSubtitle(subtitle: String): CardHeader         = js.native
  def setTitle(title: String): CardHeader               = js.native
}

@js.native
trait CardSection extends js.Object {
  def addWidget(widget: Widget): CardSection                                    = js.native
  def setCollapsible(collapsible: Boolean): CardSection                         = js.native
  def setHeader(header: String): CardSection                                    = js.native
  def setNumUncollapsibleWidgets(numUncollapsibleWidgets: Integer): CardSection = js.native
}

@js.native
trait CardService extends js.Object {
  var ComposedEmailType: ComposedEmailType                                    = js.native
  var ContentType: ContentType                                                = js.native
  var Icon: Icon                                                              = js.native
  var ImageStyle: ImageStyle                                                  = js.native
  var LoadIndicator: LoadIndicator                                            = js.native
  var OnClose: OnClose                                                        = js.native
  var OpenAs: OpenAs                                                          = js.native
  var SelectionInputType: SelectionInputType                                  = js.native
  var TextButtonStyle: TextButtonStyle                                        = js.native
  var UpdateDraftBodyType: UpdateDraftBodyType                                = js.native
  def newAction(): Action                                                     = js.native
  def newActionResponseBuilder(): ActionResponseBuilder                       = js.native
  def newAuthorizationAction(): AuthorizationAction                           = js.native
  def newAuthorizationException(): AuthorizationException                     = js.native
  def newButtonSet(): ButtonSet                                               = js.native
  def newCardAction(): CardAction                                             = js.native
  def newCardBuilder(): CardBuilder                                           = js.native
  def newCardHeader(): CardHeader                                             = js.native
  def newCardSection(): CardSection                                           = js.native
  def newComposeActionResponseBuilder(): ComposeActionResponseBuilder         = js.native
  def newImage(): Image                                                       = js.native
  def newImageButton(): ImageButton                                           = js.native
  def newKeyValue(): KeyValue                                                 = js.native
  def newNavigation(): Navigation                                             = js.native
  def newNotification(): Notification                                         = js.native
  def newOpenLink(): OpenLink                                                 = js.native
  def newSelectionInput(): SelectionInput                                     = js.native
  def newSuggestions(): Suggestions                                           = js.native
  def newSuggestionsResponseBuilder(): SuggestionsResponseBuilder             = js.native
  def newSwitch(): Switch                                                     = js.native
  def newTextButton(): TextButton                                             = js.native
  def newTextInput(): TextInput                                               = js.native
  def newTextParagraph(): TextParagraph                                       = js.native
  def newUniversalActionResponseBuilder(): UniversalActionResponseBuilder     = js.native
  def newUpdateDraftActionResponseBuilder(): UpdateDraftActionResponseBuilder = js.native
  def newUpdateDraftBodyAction(): UpdateDraftBodyAction                       = js.native
}

@js.native
trait ComposeActionResponse extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait ComposeActionResponseBuilder extends js.Object {
  def build(): ComposeActionResponse                                 = js.native
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder = js.native
}

@js.native
sealed trait ComposedEmailType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.ComposedEmailType")
object ComposedEmailType extends js.Object {
  var REPLY_AS_DRAFT: ComposedEmailType   = js.native
  var STANDALONE_DRAFT: ComposedEmailType = js.native
  @JSBracketAccess
  def apply(value: ComposedEmailType): String = js.native
}

@js.native
sealed trait ContentType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.ContentType")
object ContentType extends js.Object {
  var TEXT: ContentType           = js.native
  var MUTABLE_HTML: ContentType   = js.native
  var IMMUTABLE_HTML: ContentType = js.native
  @JSBracketAccess
  def apply(value: ContentType): String = js.native
}

@js.native
sealed trait Icon extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.Icon")
object Icon extends js.Object {
  var NONE: Icon                     = js.native
  var AIRPLANE: Icon                 = js.native
  var BOOKMARK: Icon                 = js.native
  var BUS: Icon                      = js.native
  var CAR: Icon                      = js.native
  var CLOCK: Icon                    = js.native
  var CONFIRMATION_NUMBER_ICON: Icon = js.native
  var DOLLAR: Icon                   = js.native
  var DESCRIPTION: Icon              = js.native
  var EMAIL: Icon                    = js.native
  var EVENT_PERFORMER: Icon          = js.native
  var EVENT_SEAT: Icon               = js.native
  var FLIGHT_ARRIVAL: Icon           = js.native
  var FLIGHT_DEPARTURE: Icon         = js.native
  var HOTEL: Icon                    = js.native
  var HOTEL_ROOM_TYPE: Icon          = js.native
  var INVITE: Icon                   = js.native
  var MAP_PIN: Icon                  = js.native
  var MEMBERSHIP: Icon               = js.native
  var MULTIPLE_PEOPLE: Icon          = js.native
  var OFFER: Icon                    = js.native
  var PERSON: Icon                   = js.native
  var PHONE: Icon                    = js.native
  var RESTAURANT_ICON: Icon          = js.native
  var SHOPPING_CART: Icon            = js.native
  var STAR: Icon                     = js.native
  var STORE: Icon                    = js.native
  var TICKET: Icon                   = js.native
  var TRAIN: Icon                    = js.native
  var VIDEO_CAMERA: Icon             = js.native
  var VIDEO_PLAY: Icon               = js.native
  @JSBracketAccess
  def apply(value: Icon): String = js.native
}

@js.native
trait Image extends js.Object {
  def setAltText(altText: String): Image                                            = js.native
  def setAuthorizationAction(action: AuthorizationAction): Image                    = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Image = js.native
  def setImageUrl(url: String): Image                                               = js.native
  def setOnClickAction(action: Action): Image                                       = js.native
  def setOnClickOpenLinkAction(action: Action): Image                               = js.native
  def setOpenLink(openLink: OpenLink): Image                                        = js.native
}

@js.native
trait ImageButton extends js.Object {
  def setAltText(altText: String): ImageButton                         = js.native
  def setAuthorizationAction(action: AuthorizationAction): ImageButton = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): ImageButton =
    js.native
  def setIcon(icon: Icon): ImageButton                      = js.native
  def setIconUrl(url: String): ImageButton                  = js.native
  def setOnClickAction(action: Action): ImageButton         = js.native
  def setOnClickOpenLinkAction(action: Action): ImageButton = js.native
  def setOpenLink(openLink: OpenLink): ImageButton          = js.native
}

@js.native
sealed trait ImageStyle extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.ImageStyle")
object ImageStyle extends js.Object {
  var SQUARE: ImageStyle = js.native
  var CIRCLE: ImageStyle = js.native
  @JSBracketAccess
  def apply(value: ImageStyle): String = js.native
}

@js.native
trait KeyValue extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): KeyValue                    = js.native
  def setBottomLabel(text: String): KeyValue                                           = js.native
  def setButton(button: Button): KeyValue                                              = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): KeyValue = js.native
  def setContent(text: String): KeyValue                                               = js.native
  def setIcon(icon: Icon): KeyValue                                                    = js.native
  def setIconAltText(altText: String): KeyValue                                        = js.native
  def setIconUrl(url: String): KeyValue                                                = js.native
  def setMultiline(multiline: Boolean): KeyValue                                       = js.native
  def setOnClickAction(action: Action): KeyValue                                       = js.native
  def setOnClickOpenLinkAction(action: Action): KeyValue                               = js.native
  def setOpenLink(openLink: OpenLink): KeyValue                                        = js.native
  def setSwitch(switchToSet: Switch): KeyValue                                         = js.native
  def setTopLabel(text: String): KeyValue                                              = js.native
}

@js.native
sealed trait LoadIndicator extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.LoadIndicator")
object LoadIndicator extends js.Object {
  var SPINNER: LoadIndicator = js.native
  var NONE: LoadIndicator    = js.native
  @JSBracketAccess
  def apply(value: LoadIndicator): String = js.native
}

@js.native
trait Navigation extends js.Object {
  def popCard(): Navigation                        = js.native
  def popToNamedCard(cardName: String): Navigation = js.native
  def popToRoot(): Navigation                      = js.native
  def printJson(): String                          = js.native
  def pushCard(card: Card): Navigation             = js.native
  def updateCard(card: Card): Navigation           = js.native
}

@js.native
trait Notification extends js.Object {
  def setText(text: String): Notification = js.native
}

@js.native
sealed trait OnClose extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.OnClose")
object OnClose extends js.Object {
  var NOTHING: OnClose       = js.native
  var RELOAD_ADD_ON: OnClose = js.native
  @JSBracketAccess
  def apply(value: OnClose): String = js.native
}

@js.native
sealed trait OpenAs extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.OpenAs")
object OpenAs extends js.Object {
  var FULL_SIZE: OpenAs = js.native
  var OVERLAY: OpenAs   = js.native
  @JSBracketAccess
  def apply(value: OpenAs): String = js.native
}

@js.native
trait OpenLink extends js.Object {
  def setOnClose(onClose: OnClose): OpenLink = js.native
  def setOpenAs(openAs: OpenAs): OpenLink    = js.native
  def setUrl(url: String): OpenLink          = js.native
}

@js.native
trait SelectionInput extends js.Object {
  def addItem(text: js.Any, value: js.Any, selected: Boolean): SelectionInput = js.native
  def setFieldName(fieldName: String): SelectionInput                         = js.native
  def setOnChangeAction(action: Action): SelectionInput                       = js.native
  def setTitle(title: String): SelectionInput                                 = js.native
  def setType(`type`: SelectionInputType): SelectionInput                     = js.native
}

@js.native
sealed trait SelectionInputType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.SelectionInputType")
object SelectionInputType extends js.Object {
  var CHECK_BOX: SelectionInputType    = js.native
  var RADIO_BUTTON: SelectionInputType = js.native
  var DROPDOWN: SelectionInputType     = js.native
  @JSBracketAccess
  def apply(value: SelectionInputType): String = js.native
}

@js.native
trait Suggestions extends js.Object {
  def addSuggestion(suggestion: String): Suggestions             = js.native
  def addSuggestions(suggestions: js.Array[String]): Suggestions = js.native
}

@js.native
trait SuggestionsResponse extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait SuggestionsResponseBuilder extends js.Object {
  def build(): SuggestionsResponse                                         = js.native
  def setSuggestions(suggestions: Suggestions): SuggestionsResponseBuilder = js.native
}

@js.native
trait Switch extends js.Object {
  def setFieldName(fieldName: String): Switch   = js.native
  def setOnChangeAction(action: Action): Switch = js.native
  def setSelected(selected: Boolean): Switch    = js.native
  def setValue(value: String): Switch           = js.native
}

@js.native
trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton = js.native
  def setBackgroundColor(backgroundColor: String): TextButton         = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton =
    js.native
  def setDisabled(disabled: Boolean): TextButton                       = js.native
  def setOnClickAction(action: Action): TextButton                     = js.native
  def setOnClickOpenLinkAction(action: Action): TextButton             = js.native
  def setOpenLink(openLink: OpenLink): TextButton                      = js.native
  def setText(text: String): TextButton                                = js.native
  def setTextButtonStyle(textButtonStyle: TextButtonStyle): TextButton = js.native
}

@js.native
sealed trait TextButtonStyle extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.TextButtonStyle")
object TextButtonStyle extends js.Object {
  var TEXT: TextButtonStyle   = js.native
  var FILLED: TextButtonStyle = js.native
  @JSBracketAccess
  def apply(value: TextButtonStyle): String = js.native
}

@js.native
trait TextInput extends js.Object {
  def setFieldName(fieldName: String): TextInput                 = js.native
  def setHint(hint: String): TextInput                           = js.native
  def setMultiline(multiline: Boolean): TextInput                = js.native
  def setOnChangeAction(action: Action): TextInput               = js.native
  def setSuggestions(suggestions: Suggestions): TextInput        = js.native
  def setSuggestionsAction(suggestionsAction: Action): TextInput = js.native
  def setTitle(title: String): TextInput                         = js.native
  def setValue(value: String): TextInput                         = js.native
}

@js.native
trait TextParagraph extends js.Object {
  def setText(text: String): TextParagraph = js.native
}

@js.native
trait UniversalActionResponse extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait UniversalActionResponseBuilder extends js.Object {
  def build(): UniversalActionResponse                                               = js.native
  def displayAddOnCards(cardObjects: js.Array[Card]): UniversalActionResponseBuilder = js.native
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder                = js.native
}

@js.native
trait UpdateDraftActionResponse extends js.Object {
  def printJson(): String = js.native
}

@js.native
trait UpdateDraftActionResponseBuilder extends js.Object {
  def build(): UpdateDraftActionResponse = js.native
  def setUpdateDraftBodyAction(
      updateDraftBodyAction: UpdateDraftBodyAction
  ): UpdateDraftActionResponseBuilder = js.native
}

@js.native
trait UpdateDraftBodyAction extends js.Object {
  def addUpdateContent(content: String, contentType: ContentType): UpdateDraftBodyAction =
    js.native
  def setUpdateType(updateType: UpdateDraftBodyType): UpdateDraftBodyAction = js.native
}

@js.native
sealed trait UpdateDraftBodyType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Card_Service.UpdateDraftBodyType")
object UpdateDraftBodyType extends js.Object {
  var IN_PLACE_INSERT: UpdateDraftBodyType = js.native
  @JSBracketAccess
  def apply(value: UpdateDraftBodyType): String = js.native
}

@js.native
trait Widget extends js.Object {}
