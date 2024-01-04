package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object GermanLanguagePack extends LanguageNameDE

class LanguageNameDESuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(GermanLanguagePack.languageName(Language.Armenian) === "Armenisch")
    assert(GermanLanguagePack.languageName(Language.Corsican) === "Korsisch")
    assert(GermanLanguagePack.languageName(Language.Quechua) === "Ketschua")
  }

}
