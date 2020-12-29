package com.sinngjpeg.testes_treinamento

import org.junit.Assert
import org.junit.Test

class PasswordValidatorTest {
    private val passwordValidator = PasswordValidator()

    @Test
    fun givenPasswordShorterThan8_whenValidate_shouldReturnFalse() {

        //arrange

        //act
        val result = passwordValidator.isValid("1B3@f67")

        //assert
        Assert.assertFalse(result)
    }


    @Test
    fun givenPasswordWhithoutUppercase_whenValidate_shouldReturnFalse() {

        val result = passwordValidator.isValid("1b3@f67")


        Assert.assertFalse(result)

    }


    @Test
    fun givenPasswordWhithoutLowercase_whenValidate_shouldReturnFalse() {

        val result = passwordValidator.isValid("1B3@F67A#")

        Assert.assertFalse(result)

    }

    @Test
    fun givenPasswordWhithoutNumber_whenValidade_shouldReturnFalse() {

        val result = passwordValidator.isValid("ABcdedfa#")

        //assert
        Assert.assertFalse(result)
    }

    @Test
    fun givenPasswordWhithoutCharSpecial_whenValidade_shouldReturnFalse() {

        val result = passwordValidator.isValid("ABcdedfa")

        //assert
        Assert.assertFalse(result)
    }


    @Test
    fun givenPasswordShorterThan8_whenValidate_shouldReturnTrue() {

        //arrange

        //act
        val result = passwordValidator.isValid("1B3@f670")

        //assert
        Assert.assertTrue(result)
    }

}


