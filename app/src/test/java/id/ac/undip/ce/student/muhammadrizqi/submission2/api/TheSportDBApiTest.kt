package id.ac.undip.ce.student.muhammadrizqi.submission2.api

import org.junit.Assert.*
import org.junit.Test

class TheSportDBApiTest{
    @Test
    fun testGetTeamDetail() {
        val url = "https://www.thesportsdb.com/api/v1/json/1/eventspastleague.php?id=4328"


        assertEquals(url, TheSportDBApi.getPrevSchedule("4328"))
    }
}
