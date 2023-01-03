package com.bubblegames.pop.unittest

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class PasswordValid {

    @Test
    fun validatePassword_blankInput_expectedRequiredField() {
        val sut = Utils()
        val result = sut.validatePassword("      ")
        assertEquals("password is required field", result)
    }

    @Test
    fun validatePassword_length_lessthan6() {
        val sut = Utils()
        val result = sut.validatePassword("dd")
        assertEquals("Length of the password should be greater than 6", result)
    }


    @Test
    fun validatePassword_valid() {
        val sut = Utils()
        val result = sut.validatePassword("ddddddd43")
        Assert.assertEquals("valid", result)
    }
}