package com.kmnvxh.winditest.data.service

import com.kmnvxh.winditest.data.models.CheckCodeRequest
import com.kmnvxh.winditest.data.models.CheckCodeResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("api/v1/users/send-auth-code/")
    suspend fun sendAuthCode(
        @Body phone: String
    ): Flow<Boolean>

    @POST("api/v1/users/check-auth-code/")
    suspend fun checkAuthCode(
        @Body checkCodeRequest: CheckCodeRequest
    ): Flow<CheckCodeResponse>
}