package com.fredprojects.core.data.local.model

/**
 * User - класс, содержащий данные пользователя.
 * @property firstName имя пользователя
 * @property lastName фамилия пользователя
 * @property login логин пользователя
 * @property password пароль пользователя
 * @property email электронная почта пользователя
 */
data class User(
    val login: String,
    val password: String,
    val email: String,
    val firstName: String,
    val lastName: String
)