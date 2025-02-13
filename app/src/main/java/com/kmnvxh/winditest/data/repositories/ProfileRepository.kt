package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.models.AvatarRequest
import com.kmnvxh.winditest.data.models.ProfileResponse
import com.kmnvxh.winditest.data.models.UpdateProfileRequest
import com.kmnvxh.winditest.data.models.UpdateProfileResponse
import com.kmnvxh.winditest.data.service.ProfileApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class ProfileRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator,
    private val tokenRepository: TokenRepository,
) {

    private val service: () -> ProfileApi = { retrofitServiceGenerator.service(ProfileApi::class) }

    suspend fun getProfile(): Flow<ProfileResponse> =
        service().getProfile(
            tokenRepository.getAccessToken()
        )

    suspend fun updateProfile(
        name: String,
        username: String,
        birthday: String,
        city: String,
        vk: String,
        instagram: String,
        status: String,
        filename: String,
        base64: String,
    ): Flow<UpdateProfileResponse> =
        service().updateProfile(
            auth = tokenRepository.getAccessToken(),
            updateProfileRequest = UpdateProfileRequest(
                name = name,
                username = username,
                birthday = birthday,
                city = city,
                vk = vk,
                instagram = vk,
                status = status,
                avatar = AvatarRequest(
                    filename = filename,
                    base64 = base64
                )
            )
        )
}