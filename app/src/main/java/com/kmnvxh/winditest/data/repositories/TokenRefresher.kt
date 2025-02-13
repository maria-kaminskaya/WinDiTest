//package com.kmnvxh.winditest.data.repositories
//
//import android.net.http.HttpException
//import android.view.WindowManager
//import javax.inject.Inject
//
//class TokenRefresher @Inject constructor(
//    private val tokenRepository: TokenRepository
//) {
//
//    suspend fun <T> requestWithToken(function: suspend (token: String) -> T): T {
//        val token = tokenRepository.getAccessToken()
//        val refreshToken = tokenRepository.getRefreshToken()
//
//        return try {
//            val safeToken = checkTime()
//            function("$ACCESS_TOKEN_PREFIX $safeToken")
//        } catch (error: Throwable) {
//            when (error as HttpException) {
//                is BadTokenException -> {
//                    val safeToken = tokenRepository.getRefreshToken(lastToken = token, force = false)
//                    function("$ACCESS_TOKEN_PREFIX $safeToken")
//                }
//                else -> throw error
//            }
//        }
//    }
//
//    companion object {
//        private const val ACCESS_TOKEN_PREFIX = "Bearer"
//    }
//}