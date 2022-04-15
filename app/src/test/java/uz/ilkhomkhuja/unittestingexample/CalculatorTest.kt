package uz.ilkhomkhuja.unittestingexample

import org.junit.Assert.assertEquals
import org.junit.Test
import uz.ilkhomkhuja.unittestingexample.utils.Calculator

class CalculatorTest {

    @Test
    fun computeAdditionWhenGivenTwoPositiveNumbersReturnTrue() {
        val a = 5
        val b = 5
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)
        assertEquals(result, 10)
    }

    @Test
    fun computeAdditionWhenGivenTwoNegativeNumbersReturnTrue() {
        val a = -5
        val b = -5
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)
        assertEquals(result, -10)
    }

    @Test
    fun computeAdditionWhenGivenOneNegativeNumbersAndOnePositiveNumberReturnTrue() {
        val a = 5
        val b = -3
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)
        assertEquals(result, 2)
    }

    @Test
    fun computeAdditionWhenGivenOneNegativeNumberAndOnePositiveNumberReturnTrue() {
        val a = 5
        val b = -3
        val calculator = Calculator()
        val result = calculator.computeAddition(a, b)
        assertEquals(result, 2)
    }


    @Test
    fun computedDivisionWhenGivenTwoPositiveNumbersReturnTrue() {
        val a = 10
        val b = 5
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)
        assertEquals(result, 2)
    }

    @Test
    fun computedDivisionWhenGivenTwoNegativeNumbersReturnTrue() {
        val a = -10
        val b = -5
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)
        assertEquals(result, 2)
    }

    @Test
    fun computedDivisionWhenGivenOneNegativeNumbersAndOnePositiveNumberReturnTrue() {
        val a = 10
        val b = -5
        val calculator = Calculator()
        val result = calculator.computedDivision(a, b)
        assertEquals(result, -2)
    }

    @Test
    fun computedSubtractionWhenGivenTwoPositiveNumbersReturnTrue() {
        val a = 6
        val b = 5
        val calculator = Calculator()
        val result = calculator.computedSubtraction(a, b)
        assertEquals(result, 1)
    }

    @Test
    fun computedSubtractionWhenGivenTwoNegativeNumbersReturnTrue() {
        val a = -6
        val b = -5
        val calculator = Calculator()
        val result = calculator.computedSubtraction(a, b)
        assertEquals(result, -1)
    }

    @Test
    fun computedSubtractionWhenGivenOneNegativeNumbersAndOnePositiveNumberReturnTrue() {
        val a = -6
        val b = 5
        val calculator = Calculator()
        val result = calculator.computedSubtraction(a, b)
        assertEquals(result, -11)
    }

    @Test
    fun computedMultiplicationWhenGivenTwoPositiveNumbersReturnTrue() {
        val a = 5
        val b = 5
        val calculator = Calculator()
        val result = calculator.computedMultiplication(a, b)
        assertEquals(result, 25)
    }

    @Test
    fun computedMultiplicationWhenGivenTwoNegativeNumbersReturnTrue() {
        val a = -5
        val b = -5
        val calculator = Calculator()
        val result = calculator.computedMultiplication(a, b)
        assertEquals(result, 25)
    }

    @Test
    fun computedMultiplicationWhenGivenOneNegativeNumbersAndOnePositiveNumberReturnTrue() {
        val a = -5
        val b = 5
        val calculator = Calculator()
        val result = calculator.computedMultiplication(a, b)
        assertEquals(result, -25)
    }
}