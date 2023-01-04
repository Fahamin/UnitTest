package com.bubblegames.pop.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    private lateinit var resourceComparer: ResourceComparer


    //call in before every test case
    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @Test
    fun stringResouceSameAsGivenSring_returnTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTest")
        assertThat(result).isTrue()

    }

    @Test
    fun stringResouceDifferentAsGivenSring_returnTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "dddd")
<<<<<<< HEAD
        //assertThat(result).isFalse()
=======
        assertThat(result).isFalse()
>>>>>>> origin/master

    }
}