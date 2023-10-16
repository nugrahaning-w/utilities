package com.aladinbank.utils

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform