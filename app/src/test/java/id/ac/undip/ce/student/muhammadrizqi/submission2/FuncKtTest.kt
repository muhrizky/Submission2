package id.ac.undip.ce.student.muhammadrizqi.submission2

import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat
import id.ac.undip.ce.student.muhammadrizqi.submission2.util.strToDate
import id.ac.undip.ce.student.muhammadrizqi.submission2.util.changeFormatDate

class FuncKtTest2 {

    @Test
    fun testStrToDate() {
        val date = SimpleDateFormat("dd/MM/yyy").parse("22/07/2018")

        assertEquals(date, strToDate("2018-07-22"))
    }

    @Test
    fun testChangeFormatDate() {
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        val date = dateFormat.parse("02/28/2018")
        assertEquals("Wed, 28 Feb 2018", changeFormatDate(date))
    }
}