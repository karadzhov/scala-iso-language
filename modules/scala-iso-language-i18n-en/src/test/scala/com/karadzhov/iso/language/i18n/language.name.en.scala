package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object EnglishLanguagePack extends LanguageNameEN

class LanguageNameENSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(EnglishLanguagePack.languageName(Language.Armenian) === "Armenian")
    assert(EnglishLanguagePack.languageName(Language.Corsican) === "Corsican")
    assert(EnglishLanguagePack.languageName(Language.Quechua) === "Quechua")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       EnglishLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("en")).capitalize
  //     )
  //   )
  // }

}
