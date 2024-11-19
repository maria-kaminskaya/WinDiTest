package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class RegistrationUserRequest(
    @SerializedName("phone") val phone: String,
    @SerializedName("name") val name: String,
    @SerializedName("username") val username: String
)