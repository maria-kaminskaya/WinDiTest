package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.service.ProfileApi
import com.kmnvxh.winditest.data.service.RetrofitServiceGenerator
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    retrofitServiceGenerator: RetrofitServiceGenerator
) {
    private val service: () -> ProfileApi = { retrofitServiceGenerator.service(ProfileApi::class) }
}