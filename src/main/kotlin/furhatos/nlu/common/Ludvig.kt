package furhatos.nlu.common

import furhatos.nlu.Intent
import furhatos.util.Language

class Ludvig : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("ludvig", "ludwig", "mr ludvig")
    }
}
