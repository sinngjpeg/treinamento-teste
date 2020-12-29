package com.sinngjpeg.testes_treinamento

import java.util.*

class PasswordValidator {
    fun isValid(password: String): Boolean {
        return password.length >= 8

    }

    fun upperCase(password: String) : Boolean {
        val separado = password.split(" , ").toTypedArray()
        val mapeado = separado.map { item -> item == item.toUpperCase(Locale.ROOT)
        }
        return mapeado.contains(true)
    }


    fun lowerCase(password: String) : Boolean {
        val separado = password.split(" , ").toTypedArray()
        val mapeado = separado.map { item -> item == item.toLowerCase(Locale.ROOT)
        }
        return mapeado.contains(true)
    }



}
