package com.kmnvxh.winditest.data.models

import com.google.gson.annotations.SerializedName

class ProfileDataResponse(
    @SerializedName("name") val name: String,
    @SerializedName("username") val username: String,
    @SerializedName("birthday") val birthday: String,
    @SerializedName("city") val city: String,
    @SerializedName("vk") val vk: String,
    @SerializedName("instagram") val instagram: String,
    @SerializedName("status") val status: String,
    @SerializedName("avatar") val avatar: String,
    @SerializedName("id") val id: String,
    @SerializedName("last") val last: String,
    @SerializedName("online") val online: Boolean,
    @SerializedName("created") val created: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("completed_task") val completedTask: Int,
    @SerializedName("avatars") val avatars: AvatarsResponse
)