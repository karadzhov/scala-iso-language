package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object ItalianLanguagePack extends LanguageNameIT

class LanguageNameITSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(ItalianLanguagePack.languageName(Language.Armenian) === "Armeno")
    assert(ItalianLanguagePack.languageName(Language.Corsican) === "Corso")
    assert(ItalianLanguagePack.languageName(Language.Quechua) === "Quechua")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       ItalianLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("it")).capitalize
  //     )
  //   )
  // }

}
