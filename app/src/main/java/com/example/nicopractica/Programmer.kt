package com.example.nicopractica

class Programmer(val name: String,
                 val age: Int,
                 val language: Array<Language>,
                 val friends: Array<Programmer>? = null) {

    enum class Language {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (language: Language in language) {
            println("Estoy programando en $language")
        }
    }

}