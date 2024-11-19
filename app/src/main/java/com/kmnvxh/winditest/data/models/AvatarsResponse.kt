package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class AvatarsResponse (
    @SerializedName("avatar") val avatar: String,
    @SerializedName("bigAvatar") val bigAvatar: String,
    @SerializedName("miniAvatar") val miniAvatar: String,
)