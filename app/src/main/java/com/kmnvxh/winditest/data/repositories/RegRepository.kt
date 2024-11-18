package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.service.RegistrationApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject

class RegRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator
) {
    private val service: () -> RegistrationApi = { retrofitServiceGenerator.service(RegistrationApi::class) }
}