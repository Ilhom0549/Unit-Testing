package uz.ilkhomkhuja.unittestingexample.utils

import java.util.*

object DateUtil {
    fun doSomething(source: Date, someDate: Date?): String {
        return when {
            source.after(someDate) -> {
                "Tomorrow"
            }
            source.before(someDate) -> {
                "Yesterday"
            }
            else -> {
                "Equal"
            }
        }
    }
}