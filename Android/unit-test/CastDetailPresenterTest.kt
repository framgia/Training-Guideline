package com.example.moviews.screen.castdetail

import com.example.moviews.data.OnLoadDataCallback
import com.example.moviews.data.model.Cast
import com.example.moviews.data.model.CastDetail
import com.example.moviews.data.model.Movie
import com.example.moviews.repository.DetailRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.junit.Test

class CastDetailPresenterTest {
    private val view = mockk<CastDetailContract.View>(relaxed = true)
    private val repository = mockk<DetailRepository>()
    private val castDetailPresenter = CastDetailPresenter(view, repository)
    private val callback = slot<OnLoadDataCallback<CastDetail>>()

    @Test
    fun `getCastDetail callback return onSuccess`() {
        val cast = Cast(1, "", "")
        val movies = mutableListOf<Movie>()
        val castDetail = CastDetail(cast, movies, "", "", "")
        every {
            repository.getCastDetail(0, capture(callback))
        } answers {
            callback.captured.onSuccess(castDetail)
        }
        castDetailPresenter.getCastDetail(0)
        verify {
            view.showCastDetail(castDetail)
            view.showMovies(castDetail.movies)
        }
    }

    @Test
    fun `getCastDetail callback return onError exception not null`() {
        val exception = Exception()
        every {
            repository.getCastDetail(0, capture(callback))
        } answers {
            callback.captured.onError(exception)
        }
        castDetailPresenter.getCastDetail(0)
        verify {
            view.showError(exception.message.toString())
        }
    }

    @Test
    fun `getCastDetail callback return onError exception null`() {
        val exception: Exception? = null
        every {
            repository.getCastDetail(0, capture(callback))
        } answers {
            callback.captured.onError(exception)
        }
        castDetailPresenter.getCastDetail(0)
        verify {
            view.showError(exception?.message.toString())
        }
    }
}
