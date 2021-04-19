package example

import org.scalatest.flatspec._
import org.scalatest.matchers._

class MainSpec extends AnyFlatSpec with should.Matchers {

  "Main.removeBotName" should "remove a bot name" in {
    val actual = Main.removeBotName("@bot+ message to the Typetalk")

    actual should be("message to the Typetalk")
  }

  it should "do nothing if the bot name is not included" in {
    val actual = Main.removeBotName("message without bot name")

    actual should be("message without bot name")
  }

}
