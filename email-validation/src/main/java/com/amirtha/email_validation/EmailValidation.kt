package com.amirtha.email_validation

fun isEmailValid(email: String): Boolean {
    val pattern = Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}")
    return pattern.matches(email)
}