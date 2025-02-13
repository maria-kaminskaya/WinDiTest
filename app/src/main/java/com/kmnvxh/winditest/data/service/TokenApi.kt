package com.kmnvxh.winditest.data.service

import com.kmnvxh.winditest.data.models.TokenResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface TokenApi {
    @POST("/api/v1/users/refresh-token/")
    suspend fun refreshAccessToken(
        @Body refreshToken: String
    ): TokenResponse
}