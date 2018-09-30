package com.team.halae

import android.app.Application
import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApplicationController : Application() {
    lateinit var networkService: NetworkService
    private val baseUrl = "http://13.209.101.255:3006"
    companion object {
        lateinit var instance : ApplicationController
    }


    override fun onCreate() {
        super.onCreate()
        instance = this
        buildNetwork()
    }

    fun buildNetwork(){

        val builder = Retrofit.Builder()
        val retrofit = builder
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        networkService = retrofit.create(NetworkService::class.java)
    }
}