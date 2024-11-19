package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class CheckCodeResponse(
    @SerializedName("refresh_token") val refreshToken: String,
    @SerializedName("access_token") val accessToken: String,
    @SerializedName("user_id") val userId: Long,
    @SerializedName("is_user_exists") val isUserExists: Boolean,
    @SerializedName("message") val message: String?
)
