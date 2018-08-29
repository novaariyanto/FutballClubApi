package id.go.patikab.rsud.remun.futballclubapi.presenter

import com.google.gson.Gson
import id.go.patikab.rsud.remun.futballclubapi.model.TeamResponse
import id.go.patikab.rsud.remun.futballclubapi.service.ApiRepository
import id.go.patikab.rsud.remun.futballclubapi.service.`object`.TheSportDbApi
import id.go.patikab.rsud.remun.futballclubapi.view.MainView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(
        private val view: MainView,
        private val apiRepository: ApiRepository,
        private val gson: Gson) {

    fun getTeamList(league: String) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDbApi.getTeams(league)),
                    TeamResponse::class.java
            )
            uiThread {
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }
}
