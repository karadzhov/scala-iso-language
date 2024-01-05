package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object SpanishLanguagePack extends LanguageNameES

class LanguageNameESSuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(SpanishLanguagePack.languageName(Language.Armenian) === "Armenio")
    assert(SpanishLanguagePack.languageName(Language.Corsican) === "Corso")
    assert(SpanishLanguagePack.languageName(Language.Quechua) === "Quechua")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       SpanishLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("es")).capitalize
  //     )
  //   )
  // }

}
