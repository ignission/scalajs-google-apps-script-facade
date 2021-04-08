package tech.ignission.jsgas.language

import scala.scalajs.js

@js.native
trait LanguageAdvancedParameters extends js.Object {
  var contentType: String = js.native
}

@js.native
trait LanguageApp extends js.Object {
  def translate(text: String, sourceLanguage: String, targetLanguage: String): String = js.native
  def translate(
      text: String,
      sourceLanguage: String,
      targetLanguage: String,
      advancedArgs: LanguageAdvancedParameters
  ): String = js.native
}
