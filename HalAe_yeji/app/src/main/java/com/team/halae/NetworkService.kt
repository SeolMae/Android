package com.team.halae

import android.telecom.Call
import retrofit2.http.*


interface NetworkService {

    @POST("auth")
    fun postLogin(
            @Body LoginPost : LoginPost
    ) : retrofit2.Call<LoginResponse>

    @GET("usr/volunteer")
    fun getUserVoltime(
        @Header("token") token : String
    ) : retrofit2.Call<UserVoltimeResponse>

    @GET("usr/donate")
    fun getUserDonate(
            @Header("token") token : String
    ) : retrofit2.Call<UserDonateResponse>

    @GET("board/list")
    fun getBoardList(
            @Header("token") token: String
    ) : retrofit2.Call<BoardListResponse>

    @GET("board/:(보드 게시물 인덱스)")
    fun getBoardDetail(
         @Header("board_idx") board_idx : Int
    ) : retrofit2.Call<BoardDetailResponse>

    @GET("board/comment/:(게시물 인덱스)")
    fun getCommentList(
            @Header("board_idx") board_idx: String
    ) : retrofit2.Call<CommentListResponse>

    @GET("usr/halmae")
    fun getUsrHalList(
            @Header("token") token: String
    ) : retrofit2.Call<UsrHalListResponse>

    @GET("usr/board")
    fun getUsrBoardList(
            @Header("token") token: String
    ) : retrofit2.Call<UsrBoardListResponse>

    @GET("recommend/don")
    fun getRecommenDonationList(
            @Header("token") token: String
    ) : retrofit2.Call<RecommendDonationResponse>

    @GET("recommend/vol")
    fun getRecommentVolList(
            @Header("token") token: String
    ) : retrofit2.Call<RecommendVolResponse>

    @GET("recommend/hal")
    fun getRecommendHalList(
            @Header("token") token: String
    ) : retrofit2.Call<RecommendHalResponse>

    @POST("board/comment")
    fun postCommentAdd(
            @Header("token") token: String,
            @Body commentAddPost: commentAddPost
    ) : retrofit2.Call<postCommentAddResponse>

    @POST("board")
    fun postBoardAdd(
            @Header("token") token: String,
            @Body boardAddPost: boardAddPost
    ) : retrofit2.Call<postBoardAddResponse>
}