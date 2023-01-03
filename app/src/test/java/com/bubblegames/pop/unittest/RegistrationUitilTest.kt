package com.bubblegames.pop.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUitilTest{
    @Test
    // don't use this type function in real code
    fun `empty username returns false`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            username = "",
            password = "334",
            confirmedPassword = "334"
        )
        assertThat(result).isFalse()
    }

    @Test
    // don't use this type function in real code
    fun `valid user and correct password`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            username = "iii",
            password = "334",
            confirmedPassword = "334"
        )
        assertThat(result).isTrue()
    }
    @Test
    // don't use this type function in real code
    fun ` user already exits return false`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            username = "Peter",
            password = "334",
            confirmedPassword = "334"
        )
        assertThat(result).isFalse()
    }

    @Test
    // don't use this type function in real code
    fun `no password`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            username = "jjjjjj",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }
    @Test
    // don't use this type function in real code
    fun ` password repeated incorrecly`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            username = "ee",
            password = "334",
            confirmedPassword = "334ee"
        )
        assertThat(result).isFalse()
    }

    @Test
    // don't use this type function in real code
    fun ` password contains less than 2`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            username = "fff",
            password = "4",
            confirmedPassword = "4"
        )
        assertThat(result).isFalse()
    }
}