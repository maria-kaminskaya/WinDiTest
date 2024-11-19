package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.models.CheckCodeRequest
import com.kmnvxh.winditest.data.models.CheckCodeResponse
import com.kmnvxh.winditest.data.service.AuthApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class AuthRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator
) {
    private val service: () -> AuthApi = { retrofitServiceGenerator.service(AuthApi::class) }

    suspend fun sendAuthCode(phone: String): Flow<Boolean> =
        service().sendAuthCode(phone)

    suspend fun checkAuthCode(
        phone: String,
        code: String
    ): Flow<CheckCodeResponse> =
        service().checkAuthCode(
            CheckCodeRequest(
                phone = phone,
                code = code
            )
        )
}