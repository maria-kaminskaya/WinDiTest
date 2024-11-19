package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class UpdateProfileResponse(
    @SerializedName("avatars") val avatars: AvatarsResponse
)