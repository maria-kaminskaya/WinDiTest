package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.models.RegistrationUserRequest
import com.kmnvxh.winditest.data.models.RegistrationUserResponse
import com.kmnvxh.winditest.data.service.RegistrationApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class RegRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator
) {

    private val service: () -> RegistrationApi = { retrofitServiceGenerator.service(RegistrationApi::class) }

    suspend fun registrationUser(
        phone: String,
        name: String,
        username: String
    ): Flow<RegistrationUserResponse> =
        service().registrationUser(
            RegistrationUserRequest(
                phone = phone,
                name = name,
                username = username
            )
        )
}