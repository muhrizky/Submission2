package id.ac.undip.ce.student.muhammadrizqi.submission2

import java.net.URL

class ApiRepository {
    fun doRequest(url: String) = URL(url).readText()
}