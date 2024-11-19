package com.kmnvxh.winditest.domain

import com.kmnvxh.winditest.data.repositories.AuthRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class SendAuthCodeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    suspend operator fun invoke(phone: String): Flow<Boolean> =
        authRepository.sendAuthCode(phone)

}