package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object CzechLanguagePack extends LanguageNameCS

class LanguageNameCSSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(CzechLanguagePack.languageName(Language.Armenian) === "Arménština")
    assert(CzechLanguagePack.languageName(Language.Corsican) === "Korsičtina")
    assert(CzechLanguagePack.languageName(Language.Quechua) === "Kečuánština")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       CzechLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("cs")).capitalize
  //     )
  //   )
  // }

}
