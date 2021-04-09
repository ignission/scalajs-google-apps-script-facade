
import scala.scalajs.js
import js.annotation._
import js.|

package facade {

package GoogleAppsScript {

package Drive {

@js.native
sealed trait Access extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Drive.Access")
object Access extends js.Object {
  var ANYONE: Access = js.native
  var ANYONE_WITH_LINK: Access = js.native
  var DOMAIN: Access = js.native
  var DOMAIN_WITH_LINK: Access = js.native
  var PRIVATE: Access = js.native
  @JSBracketAccess
  def apply(value: Access): String = js.native
}

@js.native
trait DriveApp extends js.Object {
  var Access: Access.type = js.native
  var Permission: Permission.type = js.native
  def addFile(child: File): Folder = js.native
  def addFolder(child: Folder): Folder = js.native
  def continueFileIterator(continuationToken: String): FileIterator = js.native
  def continueFolderIterator(continuationToken: String): FolderIterator = js.native
  def createFile(blob: BlobSource): File = js.native
  def createFile(name: String, content: String): File = js.native
  def createFile(name: String, content: String, mimeType: String): File = js.native
  def createFolder(name: String): Folder = js.native
  def createShortcut(targetId: String): File = js.native
  def getFileById(id: String): File = js.native
  def getFiles(): FileIterator = js.native
  def getFilesByName(name: String): FileIterator = js.native
  def getFilesByType(mimeType: String): FileIterator = js.native
  def getFolderById(id: String): Folder = js.native
  def getFolders(): FolderIterator = js.native
  def getFoldersByName(name: String): FolderIterator = js.native
  def getRootFolder(): Folder = js.native
  def getStorageLimit(): Integer = js.native
  def getStorageUsed(): Integer = js.native
  def getTrashedFiles(): FileIterator = js.native
  def getTrashedFolders(): FolderIterator = js.native
  def removeFile(child: File): Folder = js.native
  def removeFolder(child: Folder): Folder = js.native
  def searchFiles(params: String): FileIterator = js.native
  def searchFolders(params: String): FolderIterator = js.native
}

@js.native
trait File extends js.Object {
  def addCommenter(emailAddress: String): File = js.native
  def addCommenter(user: _root_.User): File = js.native
  def addCommenters(emailAddresses: js.Array[String]): File = js.native
  def addEditor(emailAddress: String): File = js.native
  def addEditor(user: _root_.User): File = js.native
  def addEditors(emailAddresses: js.Array[String]): File = js.native
  def addViewer(emailAddress: String): File = js.native
  def addViewer(user: _root_.User): File = js.native
  def addViewers(emailAddresses: js.Array[String]): File = js.native
  def getAccess(email: String): Permission = js.native
  def getAccess(user: _root_.User): Permission = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getDateCreated(): Date = js.native
  def getDescription(): String | Null = js.native
  def getDownloadUrl(): String = js.native
  def getEditors(): js.Array[User] = js.native
  def getId(): String = js.native
  def getLastUpdated(): Date = js.native
  def getMimeType(): String = js.native
  def getName(): String = js.native
  def getOwner(): User = js.native
  def getParents(): FolderIterator = js.native
  def getSharingAccess(): Access = js.native
  def getSharingPermission(): Permission = js.native
  def getSize(): Integer = js.native
  def getTargetId(): String | Null = js.native
  def getThumbnail(): Blob = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def isShareableByEditors(): Boolean = js.native
  def isStarred(): Boolean = js.native
  def isTrashed(): Boolean = js.native
  def makeCopy(): File = js.native
  def makeCopy(destination: Folder): File = js.native
  def makeCopy(name: String): File = js.native
  def makeCopy(name: String, destination: Folder): File = js.native
  def moveTo(destination: Folder): File = js.native
  def removeCommenter(emailAddress: String): File = js.native
  def removeCommenter(user: _root_.User): File = js.native
  def removeEditor(emailAddress: String): File = js.native
  def removeEditor(user: _root_.User): File = js.native
  def removeViewer(emailAddress: String): File = js.native
  def removeViewer(user: _root_.User): File = js.native
  def revokePermissions(user: String): File = js.native
  def revokePermissions(user: _root_.User): File = js.native
  def setContent(content: String): File = js.native
  def setDescription(description: String): File = js.native
  def setName(name: String): File = js.native
  def setOwner(emailAddress: String): File = js.native
  def setOwner(user: _root_.User): File = js.native
  def setShareableByEditors(shareable: Boolean): File = js.native
  def setSharing(accessType: Access, permissionType: Permission): File = js.native
  def setStarred(starred: Boolean): File = js.native
  def setTrashed(trashed: Boolean): File = js.native
}

@js.native
trait FileIterator extends js.Object {
  def getContinuationToken(): String = js.native
  def hasNext(): Boolean = js.native
  def next(): File = js.native
}

@js.native
trait Folder extends js.Object {
  def addEditor(emailAddress: String): Folder = js.native
  def addEditor(user: _root_.User): Folder = js.native
  def addEditors(emailAddresses: js.Array[String]): Folder = js.native
  def addFile(child: File): Folder = js.native
  def addFolder(child: Folder): Folder = js.native
  def addViewer(emailAddress: String): Folder = js.native
  def addViewer(user: _root_.User): Folder = js.native
  def addViewers(emailAddresses: js.Array[String]): Folder = js.native
  def createFile(blob: BlobSource): File = js.native
  def createFile(name: String, content: String): File = js.native
  def createFile(name: String, content: String, mimeType: String): File = js.native
  def createFolder(name: String): Folder = js.native
  def getAccess(email: String): Permission = js.native
  def getAccess(user: _root_.User): Permission = js.native
  def getDateCreated(): Date = js.native
  def getDescription(): String | Null = js.native
  def getEditors(): js.Array[User] = js.native
  def getFiles(): FileIterator = js.native
  def getFilesByName(name: String): FileIterator = js.native
  def getFilesByType(mimeType: String): FileIterator = js.native
  def getFolders(): FolderIterator = js.native
  def getFoldersByName(name: String): FolderIterator = js.native
  def getId(): String = js.native
  def getLastUpdated(): Date = js.native
  def getName(): String = js.native
  def getOwner(): User = js.native
  def getParents(): FolderIterator = js.native
  def getSharingAccess(): Access = js.native
  def getSharingPermission(): Permission = js.native
  def getSize(): Integer = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def isShareableByEditors(): Boolean = js.native
  def isStarred(): Boolean = js.native
  def isTrashed(): Boolean = js.native
  def moveTo(destination: Folder): Folder = js.native
  def removeEditor(emailAddress: String): Folder = js.native
  def removeEditor(user: _root_.User): Folder = js.native
  def removeFile(child: File): Folder = js.native
  def removeFolder(child: Folder): Folder = js.native
  def removeViewer(emailAddress: String): Folder = js.native
  def removeViewer(user: _root_.User): Folder = js.native
  def revokePermissions(user: String): Folder = js.native
  def revokePermissions(user: _root_.User): Folder = js.native
  def searchFiles(params: String): FileIterator = js.native
  def searchFolders(params: String): FolderIterator = js.native
  def setDescription(description: String): Folder = js.native
  def setName(name: String): Folder = js.native
  def setOwner(emailAddress: String): Folder = js.native
  def setOwner(user: _root_.User): Folder = js.native
  def setShareableByEditors(shareable: Boolean): Folder = js.native
  def setSharing(accessType: Access, permissionType: Permission): Folder = js.native
  def setStarred(starred: Boolean): Folder = js.native
  def setTrashed(trashed: Boolean): Folder = js.native
}

@js.native
trait FolderIterator extends js.Object {
  def getContinuationToken(): String = js.native
  def hasNext(): Boolean = js.native
  def next(): Folder = js.native
}

@js.native
sealed trait Permission extends js.Object {
}

@js.native
@JSGlobal("GoogleAppsScript.Drive.Permission")
object Permission extends js.Object {
  var VIEW: Permission = js.native
  var EDIT: Permission = js.native
  var COMMENT: Permission = js.native
  var OWNER: Permission = js.native
  var ORGANIZER: Permission = js.native
  var NONE: Permission = js.native
  @JSBracketAccess
  def apply(value: Permission): String = js.native
}

@js.native
trait User extends js.Object {
  def getDomain(): String = js.native
  def getEmail(): String = js.native
  def getName(): String = js.native
  def getPhotoUrl(): String = js.native
  def getUserLoginId(): String = js.native
}

}

}

@js.native
@JSGlobalScope
object Facade extends js.Object {
  var DriveApp: GoogleAppsScript.Drive.DriveApp = js.native
}

}
