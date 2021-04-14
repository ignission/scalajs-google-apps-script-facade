package facade.googleappsscript

import scala.scalajs.js.|

object syntax {
  implicit class NullableOps[A](val nullable: A | Null) extends AnyVal {
    def toOption: Option[A] =
      if (nullable != null) Some(nullable.asInstanceOf[A]) else None
  }

}
