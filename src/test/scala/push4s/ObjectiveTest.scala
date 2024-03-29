package push4s

import org.scalatest.{FunSpec, Matchers}

class ObjectiveTest extends FunSpec with Matchers {
  describe("Objective") {
    it ("can score ints by distance") {
      val obj = Objective(TestCase(Seq(LiteralInt(1)), Seq(LiteralInt(1))))
      obj.score(PushParser.parse("3").get) shouldBe Seq(2)
    }
    // TODO: Test other types of objectives
  }

}
