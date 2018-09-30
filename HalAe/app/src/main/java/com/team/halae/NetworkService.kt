package com.team.halae

import retrofit2.Call
import retrofit2.http.*

interface NetworkService {

    //할메이트 찾기 필터링 하기
    @POST("halmae/filter")
    fun postHalmateFitering(
            @Body filter : FilteringRequestBody
    ):Call<FilteringPostResponse>

    //기부글 리스트 가져오기
    @GET("donate/list/{align}")
    fun getdonateList(
            @Path("align") align : String
    ) : Call<DonateListResponse>

}