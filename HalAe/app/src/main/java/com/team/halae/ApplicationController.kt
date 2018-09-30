package com.team.halae

<<<<<<< HEAD
import android.app.Application
import android.content.Context
import android.widget.Toast
=======
import android.app.Activity
import android.app.Application
import android.content.Context
import android.widget.Toast
import com.kakao.auth.KakaoSDK
>>>>>>> b58de814f8318a55ca696504d5510ad47b4f5104
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApplicationController : Application() {
<<<<<<< HEAD
    var networkService : NetworkService? = null
        private set
    val baseUrl = "http://52.78.137.158:3000"
=======
    lateinit var networkService: NetworkService
        private set
    private val baseUrl = "http://13.209.101.255:3006"
>>>>>>> b58de814f8318a55ca696504d5510ad47b4f5104
    var appContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext

        instance = this
<<<<<<< HEAD

        buildNetwork()

=======
        globalApplicationContext = this
        KakaoSDK.init(KakaoSDKAdapter())
        buildNetwork()
>>>>>>> b58de814f8318a55ca696504d5510ad47b4f5104
    }


    fun buildNetwork() {
        val builder = Retrofit.Builder()
<<<<<<< HEAD


=======
>>>>>>> b58de814f8318a55ca696504d5510ad47b4f5104
        val retrofit = builder
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        networkService = retrofit.create(NetworkService::class.java)
    }

    fun makeToast(message: String) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show()
    }

    companion object {
<<<<<<< HEAD
        var instance: ApplicationController? = null
    }
}

=======
        lateinit var instance: ApplicationController
        @Volatile
        var globalApplicationContext: ApplicationController? = null
            private set
        // Activity가 올라올때마다 Activity의 onCreate에서 호출
        @Volatile
        var currentActivity: Activity? = null
    }
}
>>>>>>> b58de814f8318a55ca696504d5510ad47b4f5104
