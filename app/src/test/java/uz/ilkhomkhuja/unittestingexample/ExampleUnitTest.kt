package uz.ilkhomkhuja.unittestingexample

import org.junit.Test

import org.junit.Assert.*
import uz.ilkhomkhuja.unittestingexample.utils.DateUtil
import java.util.*
import kotlin.jvm.Throws

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun comparing7thWith10th_returnYesterday() {
        try {
             val date = Date()
             assertEquals(DateUtil.doSomething(Date(),date),"Equal")
        } catch (e: Exception) {

        }
    }

}