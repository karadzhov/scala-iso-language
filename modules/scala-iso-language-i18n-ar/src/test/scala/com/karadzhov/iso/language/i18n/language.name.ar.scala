package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object ArabicLanguagePack extends LanguageNameAR

class LanguageNameARSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(ArabicLanguagePack.languageName(Language.Armenian) === "الأرمنية")
    assert(ArabicLanguagePack.languageName(Language.Corsican) === "الكورسيكية")
    assert(ArabicLanguagePack.languageName(Language.Quechua) === "الكويتشوا")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       ArabicLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("ar")).capitalize
  //     )
  //   )
  // }

}
