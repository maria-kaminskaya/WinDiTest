package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.service.AuthApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject

class AuthRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator
) {
    private val service: () -> AuthApi = { retrofitServiceGenerator.service(AuthApi::class) }
}