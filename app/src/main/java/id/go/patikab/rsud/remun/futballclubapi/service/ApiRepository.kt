package id.go.patikab.rsud.remun.futballclubapi.service

import java.net.URL

class ApiRepository{
    fun doRequest(url:String):String{
        return URL(url).readText()
    }
}