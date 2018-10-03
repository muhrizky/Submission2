package id.ac.undip.ce.student.muhammadrizqi.submission2

import id.ac.undip.ce.student.muhammadrizqi.submission2.util.CoroutineContextProvider
import kotlinx.coroutines.experimental.Unconfined
import kotlin.coroutines.experimental.CoroutineContext

class TestContextProvider: CoroutineContextProvider() {
    override val main : CoroutineContext = Unconfined
}