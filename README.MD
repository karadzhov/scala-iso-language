## scala-iso-language [![Continuous integration](https://github.com/karadzhov/scala-iso-language/actions/workflows/release.yml/badge.svg)](https://github.com/karadzhov/scala-iso-language/actions/workflows/release.yml) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.karadzhov/scala-iso-language-core_2.12/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.karadzhov/scala-iso-language-core_2.12)

scala-iso-language is a minimalistic library compatible with Scala, Scala.js and Scala Native. It simplifies the representation of ISO 639 languages using [Enumeratum](https://github.com/lloydmeta/enumeratum) and provides translations of language names into various languages.

### SBT

To get started with SBT add the following to your build.sbt file:

#### Enum without translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-language-core" % "0.1.0"
```

#### Enum + English translations
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-language-i18n-en" % "0.1.0"
```

#### Enum + German translations 
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-language-i18n-de" % "0.1.0"
```

#### Enum + Bulgarian translations 
``` scala   
libraryDependencies += "com.karadzhov" %% "scala-iso-language-i18n-bg" % "0.1.0"
```

## Sample

```scala
import com.karadzhov.iso.language.Language
import com.karadzhov.iso.language.i18n.LanguageNameDE

Language.values
// Vector(Language.Abkhazian, Language.Afar, Language.Afrikaans...)

Language.Chinese.entryName
// "zh"

Language.withNameOption("zh")
// Some(Language.Chinese)

Language.withNameOption("ac")
// None

object GermanLanguagePack extends LanguageNameDE

GermanLanguagePack.languageName(Language.Quechua)
// "Ketschua"

```