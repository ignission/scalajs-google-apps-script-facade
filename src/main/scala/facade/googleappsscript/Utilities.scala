package facade.googleappsscript.utilities

import facade.googleappsscript.base._

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
sealed trait Charset extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Utilities.Charset")
object Charset extends js.Object {
  var US_ASCII: Charset = js.native
  var UTF_8: Charset    = js.native
  @JSBracketAccess
  def apply(value: Charset): String = js.native
}

@js.native
sealed trait DigestAlgorithm extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Utilities.DigestAlgorithm")
object DigestAlgorithm extends js.Object {
  var MD2: DigestAlgorithm     = js.native
  var MD5: DigestAlgorithm     = js.native
  var SHA_1: DigestAlgorithm   = js.native
  var SHA_256: DigestAlgorithm = js.native
  var SHA_384: DigestAlgorithm = js.native
  var SHA_512: DigestAlgorithm = js.native
  @JSBracketAccess
  def apply(value: DigestAlgorithm): String = js.native
}

@js.native
sealed trait MacAlgorithm extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Utilities.MacAlgorithm")
object MacAlgorithm extends js.Object {
  var HMAC_MD5: MacAlgorithm     = js.native
  var HMAC_SHA_1: MacAlgorithm   = js.native
  var HMAC_SHA_256: MacAlgorithm = js.native
  var HMAC_SHA_384: MacAlgorithm = js.native
  var HMAC_SHA_512: MacAlgorithm = js.native
  @JSBracketAccess
  def apply(value: MacAlgorithm): String = js.native
}

@js.native
sealed trait RsaAlgorithm extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Utilities.RsaAlgorithm")
object RsaAlgorithm extends js.Object {
  var RSA_SHA_1: RsaAlgorithm   = js.native
  var RSA_SHA_256: RsaAlgorithm = js.native
  @JSBracketAccess
  def apply(value: RsaAlgorithm): String = js.native
}

@js.native
trait Utilities extends js.Object {
  var Charset: Charset                                                                 = js.native
  var DigestAlgorithm: DigestAlgorithm                                                 = js.native
  var MacAlgorithm: MacAlgorithm                                                       = js.native
  var RsaAlgorithm: RsaAlgorithm                                                       = js.native
  def base64Decode(encoded: String): js.Array[Byte]                                    = js.native
  def base64Decode(encoded: String, charset: Charset): js.Array[Byte]                  = js.native
  def base64DecodeWebSafe(encoded: String): js.Array[Byte]                             = js.native
  def base64DecodeWebSafe(encoded: String, charset: Charset): js.Array[Byte]           = js.native
  def base64Encode(data: js.Array[Byte]): String                                       = js.native
  def base64Encode(data: String): String                                               = js.native
  def base64Encode(data: String, charset: Charset): String                             = js.native
  def base64EncodeWebSafe(data: js.Array[Byte]): String                                = js.native
  def base64EncodeWebSafe(data: String): String                                        = js.native
  def base64EncodeWebSafe(data: String, charset: Charset): String                      = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: js.Array[Byte]): js.Array[Byte] = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: String): js.Array[Byte]         = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: String, charset: Charset): js.Array[Byte] =
    js.native
  def computeHmacSha256Signature(value: js.Array[Byte], key: js.Array[Byte]): js.Array[Byte] =
    js.native
  def computeHmacSha256Signature(value: String, key: String): js.Array[Byte] = js.native
  def computeHmacSha256Signature(value: String, key: String, charset: Charset): js.Array[Byte] =
    js.native
  def computeHmacSignature(
      algorithm: MacAlgorithm,
      value: js.Array[Byte],
      key: js.Array[Byte]
  ): js.Array[Byte] = js.native
  def computeHmacSignature(algorithm: MacAlgorithm, value: String, key: String): js.Array[Byte] =
    js.native
  def computeHmacSignature(
      algorithm: MacAlgorithm,
      value: String,
      key: String,
      charset: Charset
  ): js.Array[Byte]                                                       = js.native
  def computeRsaSha1Signature(value: String, key: String): js.Array[Byte] = js.native
  def computeRsaSha1Signature(value: String, key: String, charset: Charset): js.Array[Byte] =
    js.native
  def computeRsaSha256Signature(value: String, key: String): js.Array[Byte] = js.native
  def computeRsaSha256Signature(value: String, key: String, charset: Charset): js.Array[Byte] =
    js.native
  def computeRsaSignature(algorithm: RsaAlgorithm, value: String, key: String): js.Array[Byte] =
    js.native
  def computeRsaSignature(
      algorithm: RsaAlgorithm,
      value: String,
      key: String,
      charset: Charset
  ): js.Array[Byte]                                                          = js.native
  def formatDate(date: Date, timeZone: String, format: String): String       = js.native
  def formatString(template: String, args: js.Any*): String                  = js.native
  def getUuid(): String                                                      = js.native
  def gzip(blob: BlobSource): Blob                                           = js.native
  def gzip(blob: BlobSource, name: String): Blob                             = js.native
  def newBlob(data: js.Array[Byte]): Blob                                    = js.native
  def newBlob(data: js.Array[Byte], contentType: String): Blob               = js.native
  def newBlob(data: js.Array[Byte], contentType: String, name: String): Blob = js.native
  def newBlob(data: String): Blob                                            = js.native
  def newBlob(data: String, contentType: String): Blob                       = js.native
  def newBlob(data: String, contentType: String, name: String): Blob         = js.native
  def parseCsv(csv: String): js.Array[js.Array[String]]                      = js.native
  def parseCsv(csv: String, delimiter: Char): js.Array[js.Array[String]]     = js.native
  def sleep(milliseconds: Integer): Unit                                     = js.native
  def ungzip(blob: BlobSource): Blob                                         = js.native
  def unzip(blob: BlobSource): js.Array[Blob]                                = js.native
  def zip(blobs: js.Array[BlobSource]): Blob                                 = js.native
  def zip(blobs: js.Array[BlobSource], name: String): Blob                   = js.native
  def jsonParse(jsonString: String): js.Dynamic                              = js.native
  def jsonStringify(obj: js.Any): String                                     = js.native
}
