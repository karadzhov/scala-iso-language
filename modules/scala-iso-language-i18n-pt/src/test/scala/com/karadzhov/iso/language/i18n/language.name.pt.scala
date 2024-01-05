package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object PortugueseLanguagePack extends LanguageNamePT

class LanguageNamePTSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(PortugueseLanguagePack.languageName(Language.Armenian) === "Armênio")
    assert(PortugueseLanguagePack.languageName(Language.Corsican) === "Corso")
    assert(PortugueseLanguagePack.languageName(Language.Quechua) === "Quíchua")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       PortugueseLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("pt")).capitalize
  //     )
  //   )
  // }

}
