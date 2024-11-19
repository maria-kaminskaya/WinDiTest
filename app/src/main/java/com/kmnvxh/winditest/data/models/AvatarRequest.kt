package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class AvatarRequest(
    @SerializedName("filename") val filename: String,
    @SerializedName("base_64") val base64: String
)