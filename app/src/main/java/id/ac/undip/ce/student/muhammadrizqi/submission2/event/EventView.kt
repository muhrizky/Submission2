package id.ac.undip.ce.student.muhammadrizqi.submission2.event

import id.ac.undip.ce.student.muhammadrizqi.submission2.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showList(data: List<Event>)
}
