package com.trunglt.democompose.models

import java.io.Serializable

data class BaseInitResponse(
    val otp: String,
    val otpToken: String,
    val expiredTime: String
) : Serializable