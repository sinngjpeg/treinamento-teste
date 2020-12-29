package com.sinngjpeg.testes_treinamento

import org.junit.Assert
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PasswordValidatorTest {
    private val passwordValidator = PasswordValidator()

    @Test
    fun givenPasswordShorterThan8_whenValidate_shouldReturnFalse() {
        //act
        val result = passwordValidator.isValid("1B3@f67")

        //assert
        assertFalse(result)
    }


    @Test
    fun givenPasswordWhithoutUppercase_whenValidate_shouldReturnFalse() {

        val result = passwordValidator.isValid("1b3@f67")

        assertFalse(result)

    }


    @Test
    fun givenPasswordWhithoutLowercase_whenValidate_shouldReturnFalse() {

        val result = passwordValidator.isValid("1B3@F67A#")

        assertFalse(result)

    }

    @Test
    fun givenPasswordWhithoutNumber_whenValidade_shouldReturnFalse() {

        val result = passwordValidator.isValid("ABcdedfa#")

        //assert
        assertFalse(result)
    }

    @Test
    fun givenPasswordWhithoutCharSpecial_whenValidade_shouldReturnFalse() {

        val result = passwordValidator.isValid("ABcdedfa")


        assertFalse(result)
    }


    @Test
    fun givenPasswordShorterThan8_whenValidate_shouldReturnTrue() {

        val result = passwordValidator.isValid("1B3@f670")

        assertTrue(result)
    }

}


