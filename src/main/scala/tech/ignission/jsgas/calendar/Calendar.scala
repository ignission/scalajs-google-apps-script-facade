package tech.ignission.jsgas.calendar

import tech.ignission.jsgas.base.{Date, Month, Weekday}

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends js.Object {
  def createAllDayEvent(title: String, date: Date): CalendarEvent                     = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
  def createAllDayEvent(
      title: String,
      startDate: Date,
      endDate: Date,
      options: js.Dictionary[js.Any]
  ): CalendarEvent = js.native
  def createAllDayEvent(title: String, date: Date, options: js.Dictionary[js.Any]): CalendarEvent =
    js.native
  def createAllDayEventSeries(
      title: String,
      startDate: Date,
      recurrence: EventRecurrence
  ): CalendarEventSeries = js.native
  def createAllDayEventSeries(
      title: String,
      startDate: Date,
      recurrence: EventRecurrence,
      options: js.Dictionary[js.Any]
  ): CalendarEventSeries                                                        = js.native
  def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
  def createEvent(
      title: String,
      startTime: Date,
      endTime: Date,
      options: js.Dictionary[js.Any]
  ): CalendarEvent                                                   = js.native
  def createEventFromDescription(description: String): CalendarEvent = js.native
  def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence
  ): CalendarEventSeries = js.native
  def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence,
      options: js.Dictionary[js.Any]
  ): CalendarEventSeries                                                 = js.native
  def deleteCalendar(): Unit                                             = js.native
  def getColor(): String                                                 = js.native
  def getDescription(): String                                           = js.native
  def getEventById(iCalId: String): CalendarEvent                        = js.native
  def getEventSeriesById(iCalId: String): CalendarEventSeries            = js.native
  def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
  def getEvents(
      startTime: Date,
      endTime: Date,
      options: js.Dictionary[js.Any]
  ): js.Array[CalendarEvent]                               = js.native
  def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date, options: js.Dictionary[js.Any]): js.Array[CalendarEvent] =
    js.native
  def getId(): String                               = js.native
  def getName(): String                             = js.native
  def getTimeZone(): String                         = js.native
  def isHidden(): Boolean                           = js.native
  def isMyPrimaryCalendar(): Boolean                = js.native
  def isOwnedByMe(): Boolean                        = js.native
  def isSelected(): Boolean                         = js.native
  def setColor(color: String): Calendar             = js.native
  def setDescription(description: String): Calendar = js.native
  def setHidden(hidden: Boolean): Calendar          = js.native
  def setName(name: String): Calendar               = js.native
  def setSelected(selected: Boolean): Calendar      = js.native
  def setTimeZone(timeZone: String): Calendar       = js.native
  def unsubscribeFromCalendar(): Unit               = js.native
}

@js.native
trait CalendarApp extends js.Object {
  var Color: Color                                                                    = js.native
  var EventColor: EventColor                                                          = js.native
  var GuestStatus: GuestStatus                                                        = js.native
  var Month: Month                                                                    = js.native
  var Visibility: Visibility                                                          = js.native
  var Weekday: Weekday                                                                = js.native
  def createAllDayEvent(title: String, date: Date): CalendarEvent                     = js.native
  def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
  def createAllDayEvent(
      title: String,
      startDate: Date,
      endDate: Date,
      options: js.Dictionary[js.Any]
  ): CalendarEvent = js.native
  def createAllDayEvent(title: String, date: Date, options: js.Dictionary[js.Any]): CalendarEvent =
    js.native
  def createAllDayEventSeries(
      title: String,
      startDate: Date,
      recurrence: EventRecurrence
  ): CalendarEventSeries = js.native
  def createAllDayEventSeries(
      title: String,
      startDate: Date,
      recurrence: EventRecurrence,
      options: js.Dictionary[js.Any]
  ): CalendarEventSeries                                                        = js.native
  def createCalendar(name: String): Calendar                                    = js.native
  def createCalendar(name: String, options: js.Dictionary[js.Any]): Calendar    = js.native
  def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
  def createEvent(
      title: String,
      startTime: Date,
      endTime: Date,
      options: js.Dictionary[js.Any]
  ): CalendarEvent                                                   = js.native
  def createEventFromDescription(description: String): CalendarEvent = js.native
  def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence
  ): CalendarEventSeries = js.native
  def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence,
      options: js.Dictionary[js.Any]
  ): CalendarEventSeries                                                 = js.native
  def getAllCalendars(): js.Array[Calendar]                              = js.native
  def getAllOwnedCalendars(): js.Array[Calendar]                         = js.native
  def getCalendarById(id: String): Calendar                              = js.native
  def getCalendarsByName(name: String): js.Array[Calendar]               = js.native
  def getColor(): String                                                 = js.native
  def getDefaultCalendar(): Calendar                                     = js.native
  def getDescription(): String                                           = js.native
  def getEventById(iCalId: String): CalendarEvent                        = js.native
  def getEventSeriesById(iCalId: String): CalendarEventSeries            = js.native
  def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
  def getEvents(
      startTime: Date,
      endTime: Date,
      options: js.Dictionary[js.Any]
  ): js.Array[CalendarEvent]                               = js.native
  def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
  def getEventsForDay(date: Date, options: js.Dictionary[js.Any]): js.Array[CalendarEvent] =
    js.native
  def getId(): String                                                           = js.native
  def getName(): String                                                         = js.native
  def getOwnedCalendarById(id: String): Calendar                                = js.native
  def getOwnedCalendarsByName(name: String): js.Array[Calendar]                 = js.native
  def getTimeZone(): String                                                     = js.native
  def isHidden(): Boolean                                                       = js.native
  def isMyPrimaryCalendar(): Boolean                                            = js.native
  def isOwnedByMe(): Boolean                                                    = js.native
  def isSelected(): Boolean                                                     = js.native
  def newRecurrence(): EventRecurrence                                          = js.native
  def setColor(color: String): Calendar                                         = js.native
  def setDescription(description: String): Calendar                             = js.native
  def setHidden(hidden: Boolean): Calendar                                      = js.native
  def setName(name: String): Calendar                                           = js.native
  def setSelected(selected: Boolean): Calendar                                  = js.native
  def setTimeZone(timeZone: String): Calendar                                   = js.native
  def subscribeToCalendar(id: String): Calendar                                 = js.native
  def subscribeToCalendar(id: String, options: js.Dictionary[js.Any]): Calendar = js.native
}

@js.native
trait CalendarEvent extends js.Object {
  def addEmailReminder(minutesBefore: Integer): CalendarEvent                 = js.native
  def addGuest(email: String): CalendarEvent                                  = js.native
  def addPopupReminder(minutesBefore: Integer): CalendarEvent                 = js.native
  def addSmsReminder(minutesBefore: Integer): CalendarEvent                   = js.native
  def anyoneCanAddSelf(): Boolean                                             = js.native
  def deleteEvent(): Unit                                                     = js.native
  def deleteTag(key: String): CalendarEvent                                   = js.native
  def getAllDayEndDate(): Date                                                = js.native
  def getAllDayStartDate(): Date                                              = js.native
  def getAllTagKeys(): js.Array[String]                                       = js.native
  def getColor(): String                                                      = js.native
  def getCreators(): js.Array[String]                                         = js.native
  def getDateCreated(): Date                                                  = js.native
  def getDescription(): String                                                = js.native
  def getEmailReminders(): js.Array[Integer]                                  = js.native
  def getEndTime(): Date                                                      = js.native
  def getEventSeries(): CalendarEventSeries                                   = js.native
  def getGuestByEmail(email: String): EventGuest                              = js.native
  def getGuestList(): js.Array[EventGuest]                                    = js.native
  def getGuestList(includeOwner: Boolean): js.Array[EventGuest]               = js.native
  def getId(): String                                                         = js.native
  def getLastUpdated(): Date                                                  = js.native
  def getLocation(): String                                                   = js.native
  def getMyStatus(): GuestStatus                                              = js.native
  def getOriginalCalendarId(): String                                         = js.native
  def getPopupReminders(): js.Array[Integer]                                  = js.native
  def getSmsReminders(): js.Array[Integer]                                    = js.native
  def getStartTime(): Date                                                    = js.native
  def getTag(key: String): String                                             = js.native
  def getTitle(): String                                                      = js.native
  def getVisibility(): Visibility                                             = js.native
  def guestsCanInviteOthers(): Boolean                                        = js.native
  def guestsCanModify(): Boolean                                              = js.native
  def guestsCanSeeGuests(): Boolean                                           = js.native
  def isAllDayEvent(): Boolean                                                = js.native
  def isOwnedByMe(): Boolean                                                  = js.native
  def isRecurringEvent(): Boolean                                             = js.native
  def removeAllReminders(): CalendarEvent                                     = js.native
  def removeGuest(email: String): CalendarEvent                               = js.native
  def resetRemindersToDefault(): CalendarEvent                                = js.native
  def setAllDayDate(date: Date): CalendarEvent                                = js.native
  def setAllDayDates(startDate: Date, endDate: Date): CalendarEvent           = js.native
  def setAnyoneCanAddSelf(anyoneCanAddSelf: Boolean): CalendarEvent           = js.native
  def setColor(color: String): CalendarEvent                                  = js.native
  def setDescription(description: String): CalendarEvent                      = js.native
  def setGuestsCanInviteOthers(guestsCanInviteOthers: Boolean): CalendarEvent = js.native
  def setGuestsCanModify(guestsCanModify: Boolean): CalendarEvent             = js.native
  def setGuestsCanSeeGuests(guestsCanSeeGuests: Boolean): CalendarEvent       = js.native
  def setLocation(location: String): CalendarEvent                            = js.native
  def setMyStatus(status: GuestStatus): CalendarEvent                         = js.native
  def setTag(key: String, value: String): CalendarEvent                       = js.native
  def setTime(startTime: Date, endTime: Date): CalendarEvent                  = js.native
  def setTitle(title: String): CalendarEvent                                  = js.native
  def setVisibility(visibility: Visibility): CalendarEvent                    = js.native
}

@js.native
trait CalendarEventSeries extends js.Object {
  def addEmailReminder(minutesBefore: Integer): CalendarEventSeries                    = js.native
  def addGuest(email: String): CalendarEventSeries                                     = js.native
  def addPopupReminder(minutesBefore: Integer): CalendarEventSeries                    = js.native
  def addSmsReminder(minutesBefore: Integer): CalendarEventSeries                      = js.native
  def anyoneCanAddSelf(): Boolean                                                      = js.native
  def deleteEventSeries(): Unit                                                        = js.native
  def deleteTag(key: String): CalendarEventSeries                                      = js.native
  def getAllTagKeys(): js.Array[String]                                                = js.native
  def getColor(): String                                                               = js.native
  def getCreators(): js.Array[String]                                                  = js.native
  def getDateCreated(): Date                                                           = js.native
  def getDescription(): String                                                         = js.native
  def getEmailReminders(): js.Array[Integer]                                           = js.native
  def getGuestByEmail(email: String): EventGuest                                       = js.native
  def getGuestList(): js.Array[EventGuest]                                             = js.native
  def getGuestList(includeOwner: Boolean): js.Array[EventGuest]                        = js.native
  def getId(): String                                                                  = js.native
  def getLastUpdated(): Date                                                           = js.native
  def getLocation(): String                                                            = js.native
  def getMyStatus(): GuestStatus                                                       = js.native
  def getOriginalCalendarId(): String                                                  = js.native
  def getPopupReminders(): js.Array[Integer]                                           = js.native
  def getSmsReminders(): js.Array[Integer]                                             = js.native
  def getTag(key: String): String                                                      = js.native
  def getTitle(): String                                                               = js.native
  def getVisibility(): Visibility                                                      = js.native
  def guestsCanInviteOthers(): Boolean                                                 = js.native
  def guestsCanModify(): Boolean                                                       = js.native
  def guestsCanSeeGuests(): Boolean                                                    = js.native
  def isOwnedByMe(): Boolean                                                           = js.native
  def removeAllReminders(): CalendarEventSeries                                        = js.native
  def removeGuest(email: String): CalendarEventSeries                                  = js.native
  def resetRemindersToDefault(): CalendarEventSeries                                   = js.native
  def setAnyoneCanAddSelf(anyoneCanAddSelf: Boolean): CalendarEventSeries              = js.native
  def setColor(color: String): CalendarEventSeries                                     = js.native
  def setDescription(description: String): CalendarEventSeries                         = js.native
  def setGuestsCanInviteOthers(guestsCanInviteOthers: Boolean): CalendarEventSeries    = js.native
  def setGuestsCanModify(guestsCanModify: Boolean): CalendarEventSeries                = js.native
  def setGuestsCanSeeGuests(guestsCanSeeGuests: Boolean): CalendarEventSeries          = js.native
  def setLocation(location: String): CalendarEventSeries                               = js.native
  def setMyStatus(status: GuestStatus): CalendarEventSeries                            = js.native
  def setRecurrence(recurrence: EventRecurrence, startDate: Date): CalendarEventSeries = js.native
  def setRecurrence(
      recurrence: EventRecurrence,
      startTime: Date,
      endTime: Date
  ): CalendarEventSeries                                         = js.native
  def setTag(key: String, value: String): CalendarEventSeries    = js.native
  def setTitle(title: String): CalendarEventSeries               = js.native
  def setVisibility(visibility: Visibility): CalendarEventSeries = js.native
}

@js.native
sealed trait Color extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Calendar.Color")
object Color extends js.Object {
  var BLUE: Color       = js.native
  var BROWN: Color      = js.native
  var CHARCOAL: Color   = js.native
  var CHESTNUT: Color   = js.native
  var GRAY: Color       = js.native
  var GREEN: Color      = js.native
  var INDIGO: Color     = js.native
  var LIME: Color       = js.native
  var MUSTARD: Color    = js.native
  var OLIVE: Color      = js.native
  var ORANGE: Color     = js.native
  var PINK: Color       = js.native
  var PLUM: Color       = js.native
  var PURPLE: Color     = js.native
  var RED: Color        = js.native
  var RED_ORANGE: Color = js.native
  var SEA_BLUE: Color   = js.native
  var SLATE: Color      = js.native
  var TEAL: Color       = js.native
  var TURQOISE: Color   = js.native
  var YELLOW: Color     = js.native
  @JSBracketAccess
  def apply(value: Color): String = js.native
}

@js.native
sealed trait EventColor extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Calendar.EventColor")
object EventColor extends js.Object {
  var PALE_BLUE: EventColor  = js.native
  var PALE_GREEN: EventColor = js.native
  var MAUVE: EventColor      = js.native
  var PALE_RED: EventColor   = js.native
  var YELLOW: EventColor     = js.native
  var ORANGE: EventColor     = js.native
  var CYAN: EventColor       = js.native
  var GRAY: EventColor       = js.native
  var BLUE: EventColor       = js.native
  var GREEN: EventColor      = js.native
  var RED: EventColor        = js.native
  @JSBracketAccess
  def apply(value: EventColor): String = js.native
}

@js.native
trait EventGuest extends js.Object {
  def getAdditionalGuests(): Integer = js.native
  def getEmail(): String             = js.native
  def getGuestStatus(): GuestStatus  = js.native
  def getName(): String              = js.native
  def getStatus(): String            = js.native
}

@js.native
trait EventRecurrence extends js.Object {
  def addDailyExclusion(): RecurrenceRule            = js.native
  def addDailyRule(): RecurrenceRule                 = js.native
  def addDate(date: Date): EventRecurrence           = js.native
  def addDateExclusion(date: Date): EventRecurrence  = js.native
  def addMonthlyExclusion(): RecurrenceRule          = js.native
  def addMonthlyRule(): RecurrenceRule               = js.native
  def addWeeklyExclusion(): RecurrenceRule           = js.native
  def addWeeklyRule(): RecurrenceRule                = js.native
  def addYearlyExclusion(): RecurrenceRule           = js.native
  def addYearlyRule(): RecurrenceRule                = js.native
  def setTimeZone(timeZone: String): EventRecurrence = js.native
}

@js.native
sealed trait GuestStatus extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
object GuestStatus extends js.Object {
  var INVITED: GuestStatus = js.native
  var MAYBE: GuestStatus   = js.native
  var NO: GuestStatus      = js.native
  var OWNER: GuestStatus   = js.native
  var YES: GuestStatus     = js.native
  @JSBracketAccess
  def apply(value: GuestStatus): String = js.native
}

@js.native
trait RecurrenceRule extends js.Object {
  def addDailyExclusion(): RecurrenceRule                      = js.native
  def addDailyRule(): RecurrenceRule                           = js.native
  def addDate(date: Date): EventRecurrence                     = js.native
  def addDateExclusion(date: Date): EventRecurrence            = js.native
  def addMonthlyExclusion(): RecurrenceRule                    = js.native
  def addMonthlyRule(): RecurrenceRule                         = js.native
  def addWeeklyExclusion(): RecurrenceRule                     = js.native
  def addWeeklyRule(): RecurrenceRule                          = js.native
  def addYearlyExclusion(): RecurrenceRule                     = js.native
  def addYearlyRule(): RecurrenceRule                          = js.native
  def interval(interval: Integer): RecurrenceRule              = js.native
  def onlyInMonth(month: Month): RecurrenceRule                = js.native
  def onlyInMonths(months: js.Array[Month]): RecurrenceRule    = js.native
  def onlyOnMonthDay(day: Integer): RecurrenceRule             = js.native
  def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule = js.native
  def onlyOnWeek(week: Integer): RecurrenceRule                = js.native
  def onlyOnWeekday(day: Weekday): RecurrenceRule              = js.native
  def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule  = js.native
  def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule    = js.native
  def onlyOnYearDay(day: Integer): RecurrenceRule              = js.native
  def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule  = js.native
  def setTimeZone(timeZone: String): EventRecurrence           = js.native
  def times(times: Integer): RecurrenceRule                    = js.native
  def until(endDate: Date): RecurrenceRule                     = js.native
  def weekStartsOn(day: Weekday): RecurrenceRule               = js.native
}

@js.native
sealed trait Visibility extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Calendar.Visibility")
object Visibility extends js.Object {
  var CONFIDENTIAL: Visibility = js.native
  var DEFAULT: Visibility      = js.native
  var PRIVATE: Visibility      = js.native
  var PUBLIC: Visibility       = js.native
  @JSBracketAccess
  def apply(value: Visibility): String = js.native
}
