package id.go.patikab.rsud.remun.futballclubapi.view

import id.go.patikab.rsud.remun.futballclubapi.model.Team

interface MainView{
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data:List<Team>)
}