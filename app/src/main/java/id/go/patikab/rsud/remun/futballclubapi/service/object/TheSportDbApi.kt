package id.go.patikab.rsud.remun.futballclubapi.service.`object`

import android.net.Uri
import id.go.patikab.rsud.remun.futballclubapi.BuildConfig

object TheSportDbApi{
    fun getTeams(league:String?):String{
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath("api")
                .appendPath("v1")
                .appendPath("json")
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("search_all_team.php")
                .appendQueryParameter("1",league)
                .build()
                .toString()
    }
}