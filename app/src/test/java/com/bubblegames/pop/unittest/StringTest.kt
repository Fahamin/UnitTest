package com.bubblegames.pop.unittest

import org.junit.Assert.*
import org.junit.Test

class StringTest {

    @Test
    fun testStringReverse_empty_expectedEmptyString() {
        val sut = Utils()
        val result = sut.reversString("")
        assertEquals("", result)
    }

    @Test
    fun testStringReverse_single_expectedsingleString() {
        val sut = Utils()
        val result = sut.reversString("a")
        assertEquals("a", result)
    }

    @Test
    fun testStringReverse_valid_expectedValidString() {
        val sut = Utils()
        val result = sut.reversString("fahamin")
        assertEquals("fahamin", result)
    }

    @Test(expected = java.lang.IllegalArgumentException::class)
    fun testStringReverse_null_expectedValidException() {
        val sut = Utils()
        val result = sut.reversString(null)
        assertEquals("ccc", result)
    }
}