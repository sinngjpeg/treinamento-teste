package com.sinngjpeg.testes_treinamento

import java.util.*

class PasswordValidator {

    private val validations = listOf(
        "[a-z]",
        "[A-Z]",
        "[0-9]",
        "[\\W]", // digito
        "[\\w\\W]{8,}"
    ).map { it.toRegex() } // converte para regex

    fun isValid(password: String) = validations.all { validation ->
        password.contains(validation)
    }


}



