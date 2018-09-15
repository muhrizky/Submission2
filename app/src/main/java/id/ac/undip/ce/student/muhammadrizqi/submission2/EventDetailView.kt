package id.ac.undip.ce.student.muhammadrizqi.submission2

import id.ac.undip.ce.student.muhammadrizqi.submission2.MatchDetail

interface EventDetailView {
    fun showLoading()
    fun hideloading()
    fun showDetail(eventDetail: MatchDetail, hometeam: MatchDetail, awayTeam: MatchDetail)

}
