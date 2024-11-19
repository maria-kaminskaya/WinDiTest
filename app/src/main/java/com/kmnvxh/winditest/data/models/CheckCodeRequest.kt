package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class CheckCodeRequest(
    @SerializedName("phone") val phone: String,
    @SerializedName("code") val code: String
)