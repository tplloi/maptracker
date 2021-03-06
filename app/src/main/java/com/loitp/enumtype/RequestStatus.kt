package com.loitp.enumtype

enum class RequestStatus(val value: Int) {
    NO_INTERNET_CONNECTION(value = 470),
    ERROR_CLIENT(value = 472),
    NO_AUTHENTICATION(value = 401),
    BAD_GATEWAY(value = 502),
    INTERNAL_SERVER(value = 500)
}
