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

    suspend fun registrationUser(): Flow<RegistrationUserResponse> =
        service().registrationUser(
            RegistrationUserRequest()
        )
}