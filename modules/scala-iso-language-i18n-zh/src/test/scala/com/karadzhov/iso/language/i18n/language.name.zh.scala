package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object ChineseLanguagePack extends LanguageNameZH

class LanguageNameZHSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(ChineseLanguagePack.languageName(Language.Armenian) === "亚美尼亚语")
    assert(ChineseLanguagePack.languageName(Language.Corsican) === "科西嘉语")
    assert(ChineseLanguagePack.languageName(Language.Quechua) === "克丘亚语")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       ChineseLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("zh")).capitalize
  //     )
  //   )
  // }

}
