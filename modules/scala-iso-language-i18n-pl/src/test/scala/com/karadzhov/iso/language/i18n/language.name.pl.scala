package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object PolishLanguagePack extends LanguageNamePL

class LanguageNamePLSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(PolishLanguagePack.languageName(Language.Armenian) === "Ormiański")
    assert(PolishLanguagePack.languageName(Language.Corsican) === "Korsykański")
    assert(PolishLanguagePack.languageName(Language.Quechua) === "Keczua")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       PolishLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("pl")).capitalize
  //     )
  //   )
  // }

}
