package furhatos.nlu

import furhatos.nlu.common.Ludvig
import furhatos.util.Language

fun main(args: Array<String>) {
    val intentList = listOf(Ludvig())
    val lang = Language.ENGLISH_US
    val classifier = IdfIntentClassifier.getClassifier(intentList, lang)
    println(classifier.classify("hi ludvig"))
}