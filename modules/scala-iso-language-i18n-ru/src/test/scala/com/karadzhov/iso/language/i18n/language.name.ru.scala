package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object RussianLanguagePack extends LanguageNameRU

class LanguageNameRUSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(RussianLanguagePack.languageName(Language.Armenian) === "Армянский")
    assert(RussianLanguagePack.languageName(Language.Corsican) === "Корсиканский")
    assert(RussianLanguagePack.languageName(Language.Quechua) === "Кечуа")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       RussianLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("ru")).capitalize
  //     )
  //   )
  // }

}
