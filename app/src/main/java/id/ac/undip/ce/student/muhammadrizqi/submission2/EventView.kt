package id.ac.undip.ce.student.muhammadrizqi.submission2

interface EventView {
    fun showLoading()
    fun hideLoading()
    fun showList(data: List<MatchDetail>)

}
