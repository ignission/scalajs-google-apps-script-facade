
import scala.scalajs.js
import js.annotation._
import js.|

package facade {

package GoogleAppsScript {

package Language {

@js.native
trait LanguageAdvancedParameters extends js.Object {
  var contentType: String = js.native
}

@js.native
trait LanguageApp extends js.Object {
  def translate(text: String, sourceLanguage: String, targetLanguage: String): String = js.native
  def translate(text: String, sourceLanguage: String, targetLanguage: String, advancedArgs: LanguageAdvancedParameters): String = js.native
}

}

}

@js.native
@JSGlobalScope
object Facade extends js.Object {
  var LanguageApp: GoogleAppsScript.Language.LanguageApp = js.native
}

}
