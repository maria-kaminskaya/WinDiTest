package com.kmnvxh.winditest.domain

import com.kmnvxh.winditest.data.repositories.AuthRepository
import javax.inject.Inject

class CheckAuthCodeUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    suspend operator fun invoke(
        phone: String,
        code: Long
    ) = authRepository.checkAuthCode(
        phone = phone,
        code = code.toString() //проверка на 6 символов
    )
}