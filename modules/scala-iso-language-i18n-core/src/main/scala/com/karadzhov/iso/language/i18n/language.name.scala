package com.karadzhov.iso.language.i18n

import com.karadzhov.iso.language.Language
import com.karadzhov.iso.language.Language._
import com.karadzhov.iso.language.Language.{Nauru => NauruLanguage}

trait LanguageName {

  def languageName(a: Language): String = a match {
    case Abkhazian        => abkhazian
    case Afar             => afar
    case Afrikaans        => afrikaans
    case Akan             => akan
    case Albanian         => albanian
    case Amharic          => amharic
    case Arabic           => arabic
    case Aragonese        => aragonese
    case Armenian         => armenian
    case Assamese         => assamese
    case Avaric           => avaric
    case Avestan          => avestan
    case Aymara           => aymara
    case Azerbaijani      => azerbaijani
    case Bambara          => bambara
    case Bangla           => bangla
    case Bashkir          => bashkir
    case Basque           => basque
    case Belarusian       => belarusian
    case Bislama          => bislama
    case Bosnian          => bosnian
    case Breton           => breton
    case Bulgarian        => bulgarian
    case Burmese          => burmese
    case Catalan          => catalan
    case Chamorro         => chamorro
    case Chechen          => chechen
    case Chinese          => chinese
    case ChurchSlavic     => churchSlavic
    case Chuvash          => chuvash
    case Cornish          => cornish
    case Corsican         => corsican
    case Cree             => cree
    case Croatian         => croatian
    case Czech            => czech
    case Danish           => danish
    case Divehi           => divehi
    case Dutch            => dutch
    case Dzongkha         => dzongkha
    case English          => english
    case Esperanto        => esperanto
    case Estonian         => estonian
    case Ewe              => ewe
    case Faroese          => faroese
    case Fijian           => fijian
    case Finnish          => finnish
    case French           => french
    case Fulah            => fulah
    case Galician         => galician
    case Ganda            => ganda
    case Georgian         => georgian
    case German           => german
    case Greek            => greek
    case Guarani          => guarani
    case Gujarati         => gujarati
    case HaitianCreole    => haitianCreole
    case Hausa            => hausa
    case Hebrew           => hebrew
    case Herero           => herero
    case Hindi            => hindi
    case HiriMotu         => hiriMotu
    case Hungarian        => hungarian
    case Icelandic        => icelandic
    case Ido              => ido
    case Igbo             => igbo
    case Indonesian       => indonesian
    case Interlingua      => interlingua
    case Interlingue      => interlingue
    case Inuktitut        => inuktitut
    case Inupiaq          => inupiaq
    case Irish            => irish
    case Italian          => italian
    case Japanese         => japanese
    case Javanese         => javanese
    case Kalaallisut      => kalaallisut
    case Kannada          => kannada
    case Kanuri           => kanuri
    case Kashmiri         => kashmiri
    case Kazakh           => kazakh
    case Khmer            => khmer
    case Kikuyu           => kikuyu
    case Kinyarwanda      => kinyarwanda
    case Komi             => komi
    case Kongo            => kongo
    case Korean           => korean
    case Kuanyama         => kuanyama
    case Kurdish          => kurdish
    case Kyrgyz           => kyrgyz
    case Lao              => lao
    case Latin            => latin
    case Latvian          => latvian
    case Limburgish       => limburgish
    case Lingala          => lingala
    case Lithuanian       => lithuanian
    case LubaKatanga      => lubaKatanga
    case Luxembourgish    => luxembourgish
    case Macedonian       => macedonian
    case Malagasy         => malagasy
    case Malay            => malay
    case Malayalam        => malayalam
    case Maltese          => maltese
    case Manx             => manx
    case Maori            => maori
    case Marathi          => marathi
    case Marshallese      => marshallese
    case Mongolian        => mongolian
    case NauruLanguage    => nauruLanguage
    case Navajo           => navajo
    case Ndonga           => ndonga
    case Nepali           => nepali
    case NorthNdebele     => northNdebele
    case NorthernSami     => northernSami
    case Norwegian        => norwegian
    case NorwegianBokmal  => norwegianBokmal
    case NorwegianNynorsk => norwegianNynorsk
    case Nyanja           => nyanja
    case Occitan          => occitan
    case Odia             => odia
    case Ojibwa           => ojibwa
    case Oromo            => oromo
    case Ossetic          => ossetic
    case Pali             => pali
    case Pashto           => pashto
    case Persian          => persian
    case Polish           => polish
    case Portuguese       => portuguese
    case Punjabi          => punjabi
    case Quechua          => quechua
    case Romanian         => romanian
    case Romansh          => romansh
    case Rundi            => rundi
    case Russian          => russian
    case Samoan           => samoan
    case Sango            => sango
    case Sanskrit         => sanskrit
    case Sardinian        => sardinian
    case ScottishGaelic   => scottishGaelic
    case Serbian          => serbian
    case Shona            => shona
    case SichuanYi        => sichuanYi
    case Sindhi           => sindhi
    case Sinhala          => sinhala
    case Slovak           => slovak
    case Slovenian        => slovenian
    case Somali           => somali
    case SouthNdebele     => southNdebele
    case SouthernSotho    => southernSotho
    case Spanish          => spanish
    case Sundanese        => sundanese
    case Swahili          => swahili
    case Swati            => swati
    case Swedish          => swedish
    case Tagalog          => tagalog
    case Tahitian         => tahitian
    case Tajik            => tajik
    case Tamil            => tamil
    case Tatar            => tatar
    case Telugu           => telugu
    case Thai             => thai
    case Tibetan          => tibetan
    case Tigrinya         => tigrinya
    case Tongan           => tongan
    case Tsonga           => tsonga
    case Tswana           => tswana
    case Turkish          => turkish
    case Turkmen          => turkmen
    case Twi              => twi
    case Ukrainian        => ukrainian
    case Urdu             => urdu
    case Uyghur           => uyghur
    case Uzbek            => uzbek
    case Venda            => venda
    case Vietnamese       => vietnamese
    case Volapuk          => volapuk
    case Walloon          => walloon
    case Welsh            => welsh
    case WesternFrisian   => westernFrisian
    case Wolof            => wolof
    case Xhosa            => xhosa
    case Yiddish          => yiddish
    case Yoruba           => yoruba
    case Zhuang           => zhuang
    case Zulu             => zulu
  }

  def abkhazian: String

  def afar: String

  def afrikaans: String

  def akan: String

  def albanian: String

  def amharic: String

  def arabic: String

  def aragonese: String

  def armenian: String

  def assamese: String

  def avaric: String

  def avestan: String

  def aymara: String

  def azerbaijani: String

  def bambara: String

  def bangla: String

  def bashkir: String

  def basque: String

  def belarusian: String

  def bislama: String

  def bosnian: String

  def breton: String

  def bulgarian: String

  def burmese: String

  def catalan: String

  def chamorro: String

  def chechen: String

  def chinese: String

  def churchSlavic: String

  def chuvash: String

  def cornish: String

  def corsican: String

  def cree: String

  def croatian: String

  def czech: String

  def danish: String

  def divehi: String

  def dutch: String

  def dzongkha: String

  def english: String

  def esperanto: String

  def estonian: String

  def ewe: String

  def faroese: String

  def fijian: String

  def finnish: String

  def french: String

  def fulah: String

  def galician: String

  def ganda: String

  def georgian: String

  def german: String

  def greek: String

  def guarani: String

  def gujarati: String

  def haitianCreole: String

  def hausa: String

  def hebrew: String

  def herero: String

  def hindi: String

  def hiriMotu: String

  def hungarian: String

  def icelandic: String

  def ido: String

  def igbo: String

  def indonesian: String

  def interlingua: String

  def interlingue: String

  def inuktitut: String

  def inupiaq: String

  def irish: String

  def italian: String

  def japanese: String

  def javanese: String

  def kalaallisut: String

  def kannada: String

  def kanuri: String

  def kashmiri: String

  def kazakh: String

  def khmer: String

  def kikuyu: String

  def kinyarwanda: String

  def komi: String

  def kongo: String

  def korean: String

  def kuanyama: String

  def kurdish: String

  def kyrgyz: String

  def lao: String

  def latin: String

  def latvian: String

  def limburgish: String

  def lingala: String

  def lithuanian: String

  def lubaKatanga: String

  def luxembourgish: String

  def macedonian: String

  def malagasy: String

  def malay: String

  def malayalam: String

  def maltese: String

  def manx: String

  def maori: String

  def marathi: String

  def marshallese: String

  def mongolian: String

  def nauruLanguage: String

  def navajo: String

  def ndonga: String

  def nepali: String

  def northNdebele: String

  def northernSami: String

  def norwegian: String

  def norwegianBokmal: String

  def norwegianNynorsk: String

  def nyanja: String

  def occitan: String

  def odia: String

  def ojibwa: String

  def oromo: String

  def ossetic: String

  def pali: String

  def pashto: String

  def persian: String

  def polish: String

  def portuguese: String

  def punjabi: String

  def quechua: String

  def romanian: String

  def romansh: String

  def rundi: String

  def russian: String

  def samoan: String

  def sango: String

  def sanskrit: String

  def sardinian: String

  def scottishGaelic: String

  def serbian: String

  def shona: String

  def sichuanYi: String

  def sindhi: String

  def sinhala: String

  def slovak: String

  def slovenian: String

  def somali: String

  def southNdebele: String

  def southernSotho: String

  def spanish: String

  def sundanese: String

  def swahili: String

  def swati: String

  def swedish: String

  def tagalog: String

  def tahitian: String

  def tajik: String

  def tamil: String

  def tatar: String

  def telugu: String

  def thai: String

  def tibetan: String

  def tigrinya: String

  def tongan: String

  def tsonga: String

  def tswana: String

  def turkish: String

  def turkmen: String

  def twi: String

  def ukrainian: String

  def urdu: String

  def uyghur: String

  def uzbek: String

  def venda: String

  def vietnamese: String

  def volapuk: String

  def walloon: String

  def welsh: String

  def westernFrisian: String

  def wolof: String

  def xhosa: String

  def yiddish: String

  def yoruba: String

  def zhuang: String

  def zulu: String

}
