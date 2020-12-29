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
        //arrange

        //act
        val result = passwordValidator.upperCase("1B3@f67")

        //assert
        Assert.assertFalse(result)

    }


    @Test
    fun givenPasswordWhithoutLowercase_whenValidate_shouldReturnFalse() {
        //arrange

        //act
        val result = passwordValidator.lowerCase("1B3@f67")

        //assert
        Assert.assertFalse(result)

    }

    @Test
    fun givenPasswordWhithoutNumber_whenValidade_shouldReturnFalse() {

        //arrange
        //act
        //assert
    }

    @Test
    fun givenPasswordWhithoutChar_whenValidade_shouldReturnFalse() {

        //arrange
        //act
        //assert
    }
}


