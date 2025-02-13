package com.kmnvxh.winditest.data.repositories

import com.kmnvxh.winditest.data.datastors.TokenDataStore
import javax.inject.Inject

class TokenRepository @Inject constructor(
    private val tokenDataStore: TokenDataStore
) {

    suspend fun saveToken(refreshToken: String, accessToken: String) {

    }

    suspend fun getAccessToken(): String = ""

    suspend fun getRefreshToken(): String = ""

    fun refreshToken(){

    }

}
