package id.ac.undip.ce.student.muhammadrizqi.submission2

import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat

class FuncKtTest2 {

    @Test
    fun changeFormatDate() {
        val dateFormat = SimpleDateFormat("MM/dd/yyyy")
        val date = dateFormat.parse("02/28/2018")
        assertEquals("Rab, 28 Feb 2018", id.ac.undip.ce.student.muhammadrizqi.submission2.util.changeFormatDate(date))
    }
}