package gustafc.emptysbt

import org.scalatest.{FlatSpec, Matchers}

class OneTest extends FlatSpec with Matchers {

  "One" should "have the correct value" in {
    One.value should be (1)
  }

}
