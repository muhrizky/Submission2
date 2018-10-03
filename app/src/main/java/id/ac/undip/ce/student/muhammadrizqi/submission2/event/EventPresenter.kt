package id.ac.undip.ce.student.muhammadrizqi.submission2.event

import com.google.gson.Gson
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.coroutines.experimental.bg
import id.ac.undip.ce.student.muhammadrizqi.submission2.api.ApiRepository
import id.ac.undip.ce.student.muhammadrizqi.submission2.api.TheSportDBApi
import id.ac.undip.ce.student.muhammadrizqi.submission2.model.MatchResponse
import id.ac.undip.ce.student.muhammadrizqi.submission2.util.CoroutineContextProvider

class EventPresenter(private val view: EventView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson,
                     private val fixture: Int = 1,
                     private val context: CoroutineContextProvider = CoroutineContextProvider()){

    fun getList(id: String?){
        view.showLoading()

        val api = if (fixture == 1) TheSportDBApi.getPrevSchedule(id) else TheSportDBApi.getNextSchedule(id)

        async(context.main) {
            val data = bg {
                gson.fromJson(apiRepository.doRequest(api), MatchResponse::class.java)
            }

            view.showList(data.await().events)
            view.hideLoading()
        }
    }

}