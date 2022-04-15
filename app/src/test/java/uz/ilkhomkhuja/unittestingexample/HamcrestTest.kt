package uz.ilkhomkhuja.unittestingexample

import org.junit.Assert.assertTrue
import org.junit.Test

class HamcrestTest {

    @Test
    fun testWithAsserts() {
        val list = generateStingList()
        assertTrue(list.contains("android"))
        assertTrue(list.contains("context"))
        assertTrue(list.size > 4)
        assertTrue(list.size < 13)
    }

    @Test
    fun testWithBigAssert() {
        val list = generateStingList()
        assertTrue(list.contains("android") && list.contains("context") && list.size > 3 && list.size < 12)
    }

    @Test
    fun testFailureWithAsserts() {
        val list = generateStingList()
        assertTrue(list.contains("android"))
        assertTrue(list.contains("service"))
        assertTrue(list.size > 3)
        assertTrue(list.size < 12)
    }


    private fun generateStingList(): Array<String> {
        val sentence = arrayOf(
            "android",
            "context",
            "service",
            "manifest",
            "layout",
            "resource",
            "broadcast",
            "receiver",
            "gradle"
        )
        return sentence
    }
}