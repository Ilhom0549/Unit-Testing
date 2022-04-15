package uz.ilkhomkhuja.unittestingexample

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import uz.ilkhomkhuja.unittestingexample.utils.FibonacciNumber

class FibonacciNumberTest {
    /**
     * fibonacci
     */
    @Test
    fun nIsZeroEqualsZero() {
        val result = FibonacciNumber.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun nIsOneEqualsOne() {
        val result = FibonacciNumber.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun nMoreThanOneIsEqualToExpectationNumberNTimes() {
        val n = 6
        val expectationResult = 8
        val result = FibonacciNumber.fib(n)
        assertThat(result).isEqualTo(expectationResult)
    }

    @Test
    fun `FibNIsEqualsFibN-2PlusFibN-1`() {
        val n = 6
        val expected = FibonacciNumber.fib(n)
        val result = FibonacciNumber.fib(n - 2) + FibonacciNumber.fib(n - 1)
        assertThat(result).isEqualTo(expected)
    }

    /*  braces */
    @Test
    fun bracesIsCompleteReturnTrue() {
        val result = FibonacciNumber.checkBraces("(1*2)")
        assertThat(result).isTrue()
    }

    @Test
    fun inCompleteBracesReturnFalse() {
        val result = FibonacciNumber.checkBraces("(1*2))")
        assertThat(result).isFalse()
    }

}