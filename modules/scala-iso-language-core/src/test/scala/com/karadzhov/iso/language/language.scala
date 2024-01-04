package com.karadzhov.iso.language

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

class LanguageSpec extends AnyFlatSpec with TypeCheckedTripleEquals {

  "parsing correct string value" should "return some language object" in {
    assert(Language.withNameOption("zh") === Some(Language.Chinese))
  }

  "parsing incorrect string value" should "return no object" in {
    assert(Language.withNameOption("ac") === None)
  }

  "entryName" should "return the language code" in {
    assert(Language.Chinese.entryName === "zh")
  }

}
