package tech.ignission.GoogleAppsScript.groups

import tech.ignission.GoogleAppsScript.base.User

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def getEmail(): String = js.native
  def getGroups(): js.Array[Group] = js.native
  def getRole(email: String): Role = js.native
  def getRole(user: User): Role = js.native
  def getRoles(users: js.Array[User]): js.Array[Role] = js.native
  def getUsers(): js.Array[User] = js.native
  def hasGroup(group: Group): Boolean = js.native
  def hasGroup(email: String): Boolean = js.native
  def hasUser(email: String): Boolean = js.native
  def hasUser(user: User): Boolean = js.native
}

@js.native
trait GroupsApp extends js.Object {
  var Role: Role = js.native
  def getGroupByEmail(email: String): Group = js.native
  def getGroups(): js.Array[Group] = js.native
}

@js.native
sealed trait Role extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Groups.Role")
object Role extends js.Object {
  var OWNER: Role = js.native
  var MANAGER: Role = js.native
  var MEMBER: Role = js.native
  var INVITED: Role = js.native
  var PENDING: Role = js.native
  @JSBracketAccess
  def apply(value: Role): String = js.native
}
