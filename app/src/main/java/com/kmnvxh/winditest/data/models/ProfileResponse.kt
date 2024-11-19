package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class ProfileResponse(
    @SerializedName("profile_data") val profileData: ProfileDataResponse
)