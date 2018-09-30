package id.ac.undip.ce.student.muhammadrizqi.submission2.event

import com.google.gson.Gson
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import id.ac.undip.ce.student.muhammadrizqi.submission2.TestContextProvider
import id.ac.undip.ce.student.muhammadrizqi.submission2.api.ApiRepository
import id.ac.undip.ce.student.muhammadrizqi.submission2.api.TheSportDBApi
import id.ac.undip.ce.student.muhammadrizqi.submission2.model.MatchResponse
import id.ac.undip.ce.student.muhammadrizqi.submission2.model.Event

class EventPresenterTest {
    @Mock
    private lateinit var view: EventView

    @Mock
    private lateinit var gson: Gson

    @Mock
    private lateinit var apiRepository: ApiRepository

    private lateinit var presenter: EventPresenter

    @Before
    fun setUp(){
        MockitoAnnotations.initMocks(this)

        presenter = EventPresenter(
                view,
                apiRepository,
                gson,
                1,
                TestContextProvider()
        )
    }

    @Test
    fun testGetEventDetail() {
        val events: MutableList<Event> = mutableListOf()
        val leagueId = "4329"
        val response = MatchResponse(events)

        Mockito.`when`(gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getPrevSchedule(leagueId)),
                MatchResponse::class.java
        )).thenReturn(response)

        presenter.getList(leagueId)

        Mockito.verify(view).showLoading()
        Mockito.verify(view).showList(response.events)
        Mockito.verify(view).hideLoading()
    }
}