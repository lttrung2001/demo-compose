package com.trunglt.democompose.models

import java.util.UUID

data class Message(
    val author: String,
    val body: String
) {
    val id: String = UUID.randomUUID().toString()
}