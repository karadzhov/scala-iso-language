package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object BulgarianLanguagePack extends LanguageNameBG

class LanguageNameBGSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(BulgarianLanguagePack.languageName(Language.Armenian) === "Арменски")
    assert(BulgarianLanguagePack.languageName(Language.Corsican) === "Корсикански")
    assert(BulgarianLanguagePack.languageName(Language.Quechua) === "Кечуа")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       BulgarianLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("bg")).capitalize
  //     )
  //   )
  // }

}
