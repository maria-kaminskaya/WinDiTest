package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.models.ProfileResponse
import com.kmnvxh.winditest.data.models.UpdateProfileResponse
import com.kmnvxh.winditest.data.service.ProfileApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class ProfileRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator
) {

    private val service: () -> ProfileApi = { retrofitServiceGenerator.service(ProfileApi::class) }

    suspend fun getProfile(): Flow<ProfileResponse> =
        service().getProfile()

    suspend fun updateProfile(): Flow<UpdateProfileResponse> =
        service().updateProfile()
}