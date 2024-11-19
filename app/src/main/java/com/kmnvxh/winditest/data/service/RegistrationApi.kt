package com.kmnvxh.winditest.data.service

import com.kmnvxh.winditest.data.models.RegistrationUserRequest
import com.kmnvxh.winditest.data.models.RegistrationUserResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.POST

interface RegistrationApi {
    @POST("api/v1/users/register/")
    suspend fun registrationUser(
        @Body registrationUserRequest: RegistrationUserRequest
    ): Flow<RegistrationUserResponse>
}