package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.flatspec.AnyFlatSpec

object HindiLanguagePack extends LanguageNameHI

class LanguageNameHISuite extends AnyFlatSpec with TypeCheckedTripleEquals {

  "translating language names" should "return the correct translation" in {
    assert(HindiLanguagePack.languageName(Language.Armenian) === "आर्मेनियाई")
    assert(HindiLanguagePack.languageName(Language.Corsican) === "कोर्सीकन")
    assert(HindiLanguagePack.languageName(Language.Quechua) === "क्वेचुआ")
  }

  // Scala Native throws exception during linking
  // "language names" should "be aligned with the JVM language names" in {
  //   Language.values.foreach(a =>
  //     assert(
  //       HindiLanguagePack
  //         .languageName(a) === new Locale(a.entryName, "").getDisplayLanguage(new Locale("hi")).capitalize
  //     )
  //   )
  // }

}
