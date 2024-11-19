package com.kmnvxh.winditest.data.service

import com.kmnvxh.winditest.data.models.ProfileResponse
import com.kmnvxh.winditest.data.models.UpdateProfileRequest
import com.kmnvxh.winditest.data.models.UpdateProfileResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PUT

interface ProfileApi {

    @GET("api/v1/users/me/")
    suspend fun getProfile(
        @Header("Authorization") auth: String
    ): Flow<ProfileResponse>

    @PUT()
    suspend fun updateProfile(
        @Header("Authorization") auth: String,
        @Body updateProfileRequest: UpdateProfileRequest
    ): Flow<UpdateProfileResponse>
}