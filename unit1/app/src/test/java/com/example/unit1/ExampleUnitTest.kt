package com.example.unit1

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun  generates_number(){
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("the value of rollResult was not btween 1 and 6",rollResult in 1..6)
    }
}