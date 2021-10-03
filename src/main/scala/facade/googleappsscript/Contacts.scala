package facade.googleappsscript.contacts

import facade.googleappsscript.base._

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait AddressField extends js.Object {
  def deleteAddressField(): Unit                 = js.native
  def getAddress(): String                       = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def isPrimary(): Boolean                       = js.native
  def setAddress(address: String): AddressField  = js.native
  def setAsPrimary(): AddressField               = js.native
  def setLabel(field: Field): AddressField       = js.native
  def setLabel(label: String): AddressField      = js.native
}

@js.native
trait CompanyField extends js.Object {
  def deleteCompanyField(): Unit                    = js.native
  def getCompanyName(): String                      = js.native
  def getJobTitle(): String                         = js.native
  def isPrimary(): Boolean                          = js.native
  def setAsPrimary(): CompanyField                  = js.native
  def setCompanyName(company: String): CompanyField = js.native
  def setJobTitle(title: String): CompanyField      = js.native
}

@js.native
trait Contact extends js.Object {
  def addAddress(label: Field.type | String, address: String): AddressField            = js.native
  def addCompany(company: String, title: String): CompanyField                         = js.native
  def addCustomField(label: ExtendedField.type | String, content: js.Any): CustomField = js.native
  def addDate(label: Field.type | String, month: Month, day: Integer, year: Integer): DateField =
    js.native
  def addEmail(label: Field.type | String, address: String): EmailField          = js.native
  def addIM(label: Field.type | String, address: String): IMField                = js.native
  def addPhone(label: Field.type | String, number: String): PhoneField           = js.native
  def addToGroup(group: ContactGroup): Contact                                   = js.native
  def addUrl(label: Field.type | String, url: String): UrlField                  = js.native
  def deleteContact(): Unit                                                      = js.native
  def getAddresses(): js.Array[AddressField]                                     = js.native
  def getAddresses(label: Field.type | String): js.Array[AddressField]           = js.native
  def getCompanies(): js.Array[CompanyField]                                     = js.native
  def getContactGroups(): js.Array[ContactGroup]                                 = js.native
  def getCustomFields(): js.Array[CustomField]                                   = js.native
  def getCustomFields(label: ExtendedField.type | String): js.Array[CustomField] = js.native
  def getDates(): js.Array[DateField]                                            = js.native
  def getDates(label: Field.type | String): js.Array[DateField]                  = js.native
  def getEmails(): js.Array[EmailField]                                          = js.native
  def getEmails(label: Field.type | String): js.Array[EmailField]                = js.native
  def getFamilyName(): String                                                    = js.native
  def getFullName(): String                                                      = js.native
  def getGivenName(): String                                                     = js.native
  def getIMs(): js.Array[IMField]                                                = js.native
  def getIMs(label: Field.type | String): js.Array[IMField]                      = js.native
  def getId(): String                                                            = js.native
  def getInitials(): String                                                      = js.native
  def getLastUpdated(): Date                                                     = js.native
  def getMaidenName(): String                                                    = js.native
  def getMiddleName(): String                                                    = js.native
  def getNickname(): String                                                      = js.native
  def getNotes(): String                                                         = js.native
  def getPhones(): js.Array[PhoneField]                                          = js.native
  def getPhones(label: Field.type | String): js.Array[PhoneField]                = js.native
  def getPrefix(): String                                                        = js.native
  def getPrimaryEmail(): String                                                  = js.native
  def getShortName(): String                                                     = js.native
  def getSuffix(): String                                                        = js.native
  def getUrls(): js.Array[UrlField]                                              = js.native
  def getUrls(label: Field.type | String): js.Array[UrlField]                    = js.native
  def removeFromGroup(group: ContactGroup): Contact                              = js.native
  def setFamilyName(familyName: String): Contact                                 = js.native
  def setFullName(fullName: String): Contact                                     = js.native
  def setGivenName(givenName: String): Contact                                   = js.native
  def setInitials(initials: String): Contact                                     = js.native
  def setMaidenName(maidenName: String): Contact                                 = js.native
  def setMiddleName(middleName: String): Contact                                 = js.native
  def setNickname(nickname: String): Contact                                     = js.native
  def setNotes(notes: String): Contact                                           = js.native
  def setPrefix(prefix: String): Contact                                         = js.native
  def setShortName(shortName: String): Contact                                   = js.native
  def setSuffix(suffix: String): Contact                                         = js.native
  def getEmailAddresses(): js.Array[String]                                      = js.native
  def getHomeAddress(): String                                                   = js.native
  def getHomeFax(): String                                                       = js.native
  def getHomePhone(): String                                                     = js.native
  def getMobilePhone(): String                                                   = js.native
  def getPager(): String                                                         = js.native
  def getUserDefinedField(key: String): String                                   = js.native
  def getUserDefinedFields(): js.Object                                          = js.native
  def getWorkAddress(): String                                                   = js.native
  def getWorkFax(): String                                                       = js.native
  def getWorkPhone(): String                                                     = js.native
  def setHomeAddress(addr: String): Unit                                         = js.native
  def setHomeFax(phone: String): Unit                                            = js.native
  def setHomePhone(phone: String): Unit                                          = js.native
  def setMobilePhone(phone: String): Unit                                        = js.native
  def setPager(phone: String): Unit                                              = js.native
  def setPrimaryEmail(primaryEmail: String): Unit                                = js.native
  def setUserDefinedField(key: String, value: String): Unit                      = js.native
  def setUserDefinedFields(o: js.Object): Unit                                   = js.native
  def setWorkAddress(addr: String): Unit                                         = js.native
  def setWorkFax(phone: String): Unit                                            = js.native
  def setWorkPhone(phone: String): Unit                                          = js.native
}

@js.native
trait ContactGroup extends js.Object {
  def addContact(contact: Contact): ContactGroup    = js.native
  def deleteGroup(): Unit                           = js.native
  def getContacts(): js.Array[Contact]              = js.native
  def getId(): String                               = js.native
  def getName(): String                             = js.native
  def isSystemGroup(): Boolean                      = js.native
  def removeContact(contact: Contact): ContactGroup = js.native
  def setName(name: String): ContactGroup           = js.native
  def getGroupName(): String                        = js.native
  def setGroupName(name: String): Unit              = js.native
}

@js.native
trait ContactsApp extends js.Object {
  var ExtendedField: ExtendedField                                                 = js.native
  var Field: Field                                                                 = js.native
  var Gender: Gender                                                               = js.native
  var Month: Month                                                                 = js.native
  var Priority: Priority                                                           = js.native
  var Sensitivity: Sensitivity                                                     = js.native
  def createContact(givenName: String, familyName: String, email: String): Contact = js.native
  def createContactGroup(name: String): ContactGroup                               = js.native
  def deleteContact(contact: Contact): Unit                                        = js.native
  def deleteContactGroup(group: ContactGroup): Unit                                = js.native
  def getContact(emailAddress: String): Contact                                    = js.native
  def getContactById(id: String): Contact                                          = js.native
  def getContactGroup(name: String): ContactGroup                                  = js.native
  def getContactGroupById(id: String): ContactGroup                                = js.native
  def getContactGroups(): js.Array[ContactGroup]                                   = js.native
  def getContacts(): js.Array[Contact]                                             = js.native
  def getContactsByAddress(query: String): js.Array[Contact]                       = js.native
  def getContactsByAddress(query: String, label: Field): js.Array[Contact]         = js.native
  def getContactsByAddress(query: String, label: String): js.Array[Contact]        = js.native
  def getContactsByCompany(query: String): js.Array[Contact]                       = js.native
  def getContactsByCustomField(
      query: ExtendedField | String,
      label: ExtendedField
  ): js.Array[Contact] = js.native
  def getContactsByDate(month: Month, day: Integer, label: Field): js.Array[Contact] = js.native
  def getContactsByDate(
      month: Month,
      day: Integer,
      year: Integer,
      label: Field
  ): js.Array[Contact] = js.native
  def getContactsByDate(
      month: Month,
      day: Integer,
      year: Integer,
      label: String
  ): js.Array[Contact] = js.native
  def getContactsByDate(month: Month, day: Integer, label: String): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: String): js.Array[Contact]                     = js.native
  def getContactsByEmailAddress(query: String, label: Field): js.Array[Contact]       = js.native
  def getContactsByEmailAddress(query: String, label: String): js.Array[Contact]      = js.native
  def getContactsByGroup(group: ContactGroup): js.Array[Contact]                      = js.native
  def getContactsByIM(query: String): js.Array[Contact]                               = js.native
  def getContactsByIM(query: String, label: Field): js.Array[Contact]                 = js.native
  def getContactsByIM(query: String, label: String): js.Array[Contact]                = js.native
  def getContactsByJobTitle(query: String): js.Array[Contact]                         = js.native
  def getContactsByName(query: String): js.Array[Contact]                             = js.native
  def getContactsByName(query: String, label: Field): js.Array[Contact]               = js.native
  def getContactsByNotes(query: String): js.Array[Contact]                            = js.native
  def getContactsByPhone(query: String): js.Array[Contact]                            = js.native
  def getContactsByPhone(query: String, label: Field): js.Array[Contact]              = js.native
  def getContactsByPhone(query: String, label: String): js.Array[Contact]             = js.native
  def getContactsByUrl(query: String): js.Array[Contact]                              = js.native
  def getContactsByUrl(query: String, label: Field): js.Array[Contact]                = js.native
  def getContactsByUrl(query: String, label: String): js.Array[Contact]               = js.native
  def findByEmailAddress(email: String): Contact                                      = js.native
  def findContactGroup(name: String): ContactGroup                                    = js.native
  def getAllContacts(): js.Array[Contact]                                             = js.native
}

@js.native
trait CustomField extends js.Object {
  def deleteCustomField(): Unit                   = js.native
  def getLabel(): Field | ExtendedField | String  = js.native
  def getValue(): js.Dynamic                      = js.native
  def setLabel(field: ExtendedField): CustomField = js.native
  def setLabel(label: String): CustomField        = js.native
  def setValue(value: js.Any): CustomField        = js.native
}

@js.native
trait DateField extends js.Object {
  def deleteDateField(): Unit                                       = js.native
  def getDay(): Integer                                             = js.native
  def getLabel(): Field | ExtendedField | String                    = js.native
  def getMonth(): Month                                             = js.native
  def getYear(): Integer                                            = js.native
  def setDate(month: Month, day: Integer): DateField                = js.native
  def setDate(month: Month, day: Integer, year: Integer): DateField = js.native
  def setLabel(label: Field): DateField                             = js.native
  def setLabel(label: String): DateField                            = js.native
}

@js.native
trait EmailField extends js.Object {
  def deleteEmailField(): Unit                   = js.native
  def getAddress(): String                       = js.native
  def getDisplayName(): String                   = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def isPrimary(): Boolean                       = js.native
  def setAddress(address: String): EmailField    = js.native
  def setAsPrimary(): EmailField                 = js.native
  def setDisplayName(name: String): EmailField   = js.native
  def setLabel(field: Field): EmailField         = js.native
  def setLabel(label: String): EmailField        = js.native
}

@js.native
sealed trait ExtendedField extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Contacts.ExtendedField")
object ExtendedField extends js.Object {
  var HOBBY: ExtendedField               = js.native
  var MILEAGE: ExtendedField             = js.native
  var LANGUAGE: ExtendedField            = js.native
  var GENDER: ExtendedField              = js.native
  var BILLING_INFORMATION: ExtendedField = js.native
  var DIRECTORY_SERVER: ExtendedField    = js.native
  var SENSITIVITY: ExtendedField         = js.native
  var PRIORITY: ExtendedField            = js.native
  var HOME: ExtendedField                = js.native
  var WORK: ExtendedField                = js.native
  var USER: ExtendedField                = js.native
  var OTHER: ExtendedField               = js.native
  @JSBracketAccess
  def apply(value: ExtendedField): String = js.native
}

@js.native
sealed trait Field extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Contacts.Field")
object Field extends js.Object {
  var FULL_NAME: Field       = js.native
  var GIVEN_NAME: Field      = js.native
  var MIDDLE_NAME: Field     = js.native
  var FAMILY_NAME: Field     = js.native
  var MAIDEN_NAME: Field     = js.native
  var NICKNAME: Field        = js.native
  var SHORT_NAME: Field      = js.native
  var INITIALS: Field        = js.native
  var PREFIX: Field          = js.native
  var SUFFIX: Field          = js.native
  var HOME_EMAIL: Field      = js.native
  var WORK_EMAIL: Field      = js.native
  var BIRTHDAY: Field        = js.native
  var ANNIVERSARY: Field     = js.native
  var HOME_ADDRESS: Field    = js.native
  var WORK_ADDRESS: Field    = js.native
  var ASSISTANT_PHONE: Field = js.native
  var CALLBACK_PHONE: Field  = js.native
  var MAIN_PHONE: Field      = js.native
  var PAGER: Field           = js.native
  var HOME_FAX: Field        = js.native
  var WORK_FAX: Field        = js.native
  var HOME_PHONE: Field      = js.native
  var WORK_PHONE: Field      = js.native
  var MOBILE_PHONE: Field    = js.native
  var GOOGLE_VOICE: Field    = js.native
  var NOTES: Field           = js.native
  var GOOGLE_TALK: Field     = js.native
  var AIM: Field             = js.native
  var YAHOO: Field           = js.native
  var SKYPE: Field           = js.native
  var QQ: Field              = js.native
  var MSN: Field             = js.native
  var ICQ: Field             = js.native
  var JABBER: Field          = js.native
  var BLOG: Field            = js.native
  var FTP: Field             = js.native
  var PROFILE: Field         = js.native
  var HOME_PAGE: Field       = js.native
  var WORK_WEBSITE: Field    = js.native
  var HOME_WEBSITE: Field    = js.native
  var JOB_TITLE: Field       = js.native
  var COMPANY: Field         = js.native
  @JSBracketAccess
  def apply(value: Field): String = js.native
}

@js.native
sealed trait Gender extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Contacts.Gender")
object Gender extends js.Object {
  var MALE: Gender   = js.native
  var FEMALE: Gender = js.native
  @JSBracketAccess
  def apply(value: Gender): String = js.native
}

@js.native
trait IMField extends js.Object {
  def deleteIMField(): Unit                      = js.native
  def getAddress(): String                       = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def isPrimary(): Boolean                       = js.native
  def setAddress(address: String): IMField       = js.native
  def setAsPrimary(): IMField                    = js.native
  def setLabel(field: Field): IMField            = js.native
  def setLabel(label: String): IMField           = js.native
}

@js.native
trait PhoneField extends js.Object {
  def deletePhoneField(): Unit                   = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def getPhoneNumber(): String                   = js.native
  def isPrimary(): Boolean                       = js.native
  def setAsPrimary(): PhoneField                 = js.native
  def setLabel(field: Field): PhoneField         = js.native
  def setLabel(label: String): PhoneField        = js.native
  def setPhoneNumber(number: String): PhoneField = js.native
}

@js.native
sealed trait Priority extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Contacts.Priority")
object Priority extends js.Object {
  var HIGH: Priority   = js.native
  var LOW: Priority    = js.native
  var NORMAL: Priority = js.native
  @JSBracketAccess
  def apply(value: Priority): String = js.native
}

@js.native
sealed trait Sensitivity extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Contacts.Sensitivity")
object Sensitivity extends js.Object {
  var CONFIDENTIAL: Sensitivity = js.native
  var NORMAL: Sensitivity       = js.native
  var PERSONAL: Sensitivity     = js.native
  var PRIVATE: Sensitivity      = js.native
  @JSBracketAccess
  def apply(value: Sensitivity): String = js.native
}

@js.native
trait UrlField extends js.Object {
  def deleteUrlField(): Unit                     = js.native
  def getAddress(): String                       = js.native
  def getLabel(): Field | ExtendedField | String = js.native
  def isPrimary(): Boolean                       = js.native
  def setAddress(address: String): UrlField      = js.native
  def setAsPrimary(): UrlField                   = js.native
  def setLabel(field: Field): UrlField           = js.native
  def setLabel(label: String): UrlField          = js.native
}
