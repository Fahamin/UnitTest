package com.bubblegames.pop.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUitilTest{
    @Test
    // don't use this type function in real code
    fun `empty username returns false`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            userName = "",
            passWord = "334",
            confirmedPasswoard = "334"
        )
        assertThat(result).isFalse()
    }

    @Test
    // don't use this type function in real code
    fun `valid user and correct password`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            userName = "tttt",
            passWord = "334",
            confirmedPasswoard = "334"
        )
        assertThat(result).isTrue()
    }
    @Test
    // don't use this type function in real code
    fun ` user already exits return false`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            userName = "peter",
            passWord = "334",
            confirmedPasswoard = "334"
        )
        assertThat(result).isFalse()
    }

    @Test
    // don't use this type function in real code
    fun `no password`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            userName = "peter",
            passWord = "",
            confirmedPasswoard = ""
        )
        assertThat(result).isFalse()
    }
    @Test
    // don't use this type function in real code
    fun ` password repeated incorrecly`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            userName = "peter",
            passWord = "234",
            confirmedPasswoard = "333"
        )
        assertThat(result).isFalse()
    }

    @Test
    // don't use this type function in real code
    fun ` password contains less than 2`()
    {
        val result = RegistrationUitil.validateRegistrationInput(
            userName = "peter",
            passWord = "2",
            confirmedPasswoard = "3"
        )
        assertThat(result).isFalse()
    }
}