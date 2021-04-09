package facade.googleappsscript.maps

import facade.googleappsscript.base.{Blob, Date}

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
sealed trait Avoid extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Maps.Avoid")
object Avoid extends js.Object {
  var TOLLS: Avoid    = js.native
  var HIGHWAYS: Avoid = js.native
  @JSBracketAccess
  def apply(value: Avoid): String = js.native
}

@js.native
sealed trait Color extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Maps.Color")
object Color extends js.Object {
  var BLACK: Color  = js.native
  var BROWN: Color  = js.native
  var GREEN: Color  = js.native
  var PURPLE: Color = js.native
  var YELLOW: Color = js.native
  var BLUE: Color   = js.native
  var GRAY: Color   = js.native
  var ORANGE: Color = js.native
  var RED: Color    = js.native
  var WHITE: Color  = js.native
  @JSBracketAccess
  def apply(value: Color): String = js.native
}

@js.native
trait DirectionFinder extends js.Object {
  def addWaypoint(latitude: Double, longitude: Double): DirectionFinder    = js.native
  def addWaypoint(address: String): DirectionFinder                        = js.native
  def clearWaypoints(): DirectionFinder                                    = js.native
  def getDirections(): js.Dynamic                                          = js.native
  def setAlternatives(useAlternatives: Boolean): DirectionFinder           = js.native
  def setArrive(time: Date): DirectionFinder                               = js.native
  def setAvoid(avoid: String): DirectionFinder                             = js.native
  def setDepart(time: Date): DirectionFinder                               = js.native
  def setDestination(latitude: Double, longitude: Double): DirectionFinder = js.native
  def setDestination(address: String): DirectionFinder                     = js.native
  def setLanguage(language: String): DirectionFinder                       = js.native
  def setMode(mode: Mode): DirectionFinder                                 = js.native
  def setOptimizeWaypoints(optimizeOrder: Boolean): DirectionFinder        = js.native
  def setOrigin(latitude: Double, longitude: Double): DirectionFinder      = js.native
  def setOrigin(address: String): DirectionFinder                          = js.native
  def setRegion(region: String): DirectionFinder                           = js.native
}

@js.native
trait DirectionFinderEnums extends js.Object {
  var Avoid: Avoid = js.native
  var Mode: Mode   = js.native
}

@js.native
trait ElevationSampler extends js.Object {
  def sampleLocation(latitude: Double, longitude: Double): js.Dynamic       = js.native
  def sampleLocations(points: js.Array[Double]): js.Dynamic                 = js.native
  def sampleLocations(encodedPolyline: String): js.Dynamic                  = js.native
  def samplePath(points: js.Array[Double], numSamples: Integer): js.Dynamic = js.native
  def samplePath(encodedPolyline: String, numSamples: Integer): js.Dynamic  = js.native
}

@js.native
sealed trait Format extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Maps.Format")
object Format extends js.Object {
  var PNG: Format          = js.native
  var PNG8: Format         = js.native
  var PNG32: Format        = js.native
  var GIF: Format          = js.native
  var JPG: Format          = js.native
  var JPG_BASELINE: Format = js.native
  @JSBracketAccess
  def apply(value: Format): String = js.native
}

@js.native
trait Geocoder extends js.Object {
  def geocode(address: String): js.Dynamic                            = js.native
  def reverseGeocode(latitude: Double, longitude: Double): js.Dynamic = js.native
  def reverseGeocode(
      swLatitude: Double,
      swLongitude: Double,
      neLatitude: Double,
      neLongitude: Double
  ): js.Dynamic = js.native
  def setBounds(
      swLatitude: Double,
      swLongitude: Double,
      neLatitude: Double,
      neLongitude: Double
  ): Geocoder                                 = js.native
  def setLanguage(language: String): Geocoder = js.native
  def setRegion(region: String): Geocoder     = js.native
}

@js.native
trait Maps extends js.Object {
  var DirectionFinder: DirectionFinderEnums                         = js.native
  var StaticMap: StaticMapEnums                                     = js.native
  def decodePolyline(polyline: String): js.Array[Double]            = js.native
  def encodePolyline(points: js.Array[Double]): String              = js.native
  def newDirectionFinder(): DirectionFinder                         = js.native
  def newElevationSampler(): ElevationSampler                       = js.native
  def newGeocoder(): Geocoder                                       = js.native
  def newStaticMap(): StaticMap                                     = js.native
  def setAuthentication(clientId: String, signingKey: String): Unit = js.native
}

@js.native
sealed trait MarkerSize extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Maps.MarkerSize")
object MarkerSize extends js.Object {
  var TINY: MarkerSize  = js.native
  var MID: MarkerSize   = js.native
  var SMALL: MarkerSize = js.native
  @JSBracketAccess
  def apply(value: MarkerSize): String = js.native
}

@js.native
sealed trait Mode extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Maps.Mode")
object Mode extends js.Object {
  var DRIVING: Mode   = js.native
  var WALKING: Mode   = js.native
  var BICYCLING: Mode = js.native
  var TRANSIT: Mode   = js.native
  @JSBracketAccess
  def apply(value: Mode): String = js.native
}

@js.native
trait StaticMap extends js.Object {
  def addAddress(address: String): StaticMap                                     = js.native
  def addMarker(latitude: Double, longitude: Double): StaticMap                  = js.native
  def addMarker(address: String): StaticMap                                      = js.native
  def addPath(points: js.Array[Double]): StaticMap                               = js.native
  def addPath(polyline: String): StaticMap                                       = js.native
  def addPoint(latitude: Double, longitude: Double): StaticMap                   = js.native
  def addVisible(latitude: Double, longitude: Double): StaticMap                 = js.native
  def addVisible(address: String): StaticMap                                     = js.native
  def beginPath(): StaticMap                                                     = js.native
  def clearMarkers(): StaticMap                                                  = js.native
  def clearPaths(): StaticMap                                                    = js.native
  def clearVisibles(): StaticMap                                                 = js.native
  def endPath(): StaticMap                                                       = js.native
  def getAs(contentType: String): Blob                                           = js.native
  def getBlob(): Blob                                                            = js.native
  def getMapImage(): js.Array[Byte]                                              = js.native
  def getMapUrl(): String                                                        = js.native
  def setCenter(latitude: Double, longitude: Double): StaticMap                  = js.native
  def setCenter(address: String): StaticMap                                      = js.native
  def setCustomMarkerStyle(imageUrl: String, useShadow: Boolean): StaticMap      = js.native
  def setFormat(format: String): StaticMap                                       = js.native
  def setLanguage(language: String): StaticMap                                   = js.native
  def setMapType(mapType: String): StaticMap                                     = js.native
  def setMarkerStyle(size: String, color: String, label: String): StaticMap      = js.native
  def setMobile(useMobileTiles: Boolean): StaticMap                              = js.native
  def setPathStyle(weight: Integer, color: String, fillColor: String): StaticMap = js.native
  def setSize(width: Integer, height: Integer): StaticMap                        = js.native
  def setZoom(zoom: Integer): StaticMap                                          = js.native
}

@js.native
trait StaticMapEnums extends js.Object {
  var Color: Color           = js.native
  var Format: Format         = js.native
  var MarkerSize: MarkerSize = js.native
  var Type: Type             = js.native
}

@js.native
sealed trait Type extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Maps.Type")
object Type extends js.Object {
  var ROADMAP: Type   = js.native
  var SATELLITE: Type = js.native
  var TERRAIN: Type   = js.native
  var HYBRID: Type    = js.native
  @JSBracketAccess
  def apply(value: Type): String = js.native
}
