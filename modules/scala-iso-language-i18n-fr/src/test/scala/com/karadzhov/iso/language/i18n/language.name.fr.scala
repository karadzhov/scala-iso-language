package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object FrenchLanguagePack extends LanguageNameFR

class LanguageNameFRSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(FrenchLanguagePack.languageName(Language.Armenian) === "Arménien")
    assert(FrenchLanguagePack.languageName(Language.Corsican) === "Corse")
    assert(FrenchLanguagePack.languageName(Language.Quechua) === "Quechua")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       FrenchLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("fr")).capitalize
  //     )
  //   )
  // }

}
