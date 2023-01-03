package com.bubblegames.pop.unittest

class Utils {

    fun reversString(input: String?): String {

        if (input == null) {
            throw  java.lang.IllegalArgumentException("Input String is required")
        }

        var chars = input.toCharArray()
        var i = 0
        var j = chars.size - 1
        while (i < j) {
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++
            j--
        }
        return chars.joinToString { "" }
    }

    fun validatePassword(input: String) = when {
        input.isBlank() -> {
            "password is required field"
        }
        input.length < 6 -> {
            "Length of the password should be greater than 6"
        }
        input.length > 15 -> {
            "Length of the password should be less than 15"
        }
        else -> {
            "valid"
        }
    }
}