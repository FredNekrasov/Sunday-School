package com.fredprojects.core.data.local

import com.fredprojects.core.data.local.model.User

/**
 * IUserStorage предоставляет методы для сохранения и получения данных о пользователе в SharedPreferences
 * Он также предоставляет константу USER_KEY для ключа SharedPreferences, по которому сохраняются данные.
 * Этот интерфейс необходим, чтобы обращаться к данным о пользователе из разных модулей.
 */
interface IUserStorage {
    /**
     * Метод upsertUser сохраняет данные о пользователе в SharedPreferences по ключу [USER_KEY].
     * @param user объект User, который содержит данные о пользователе.
     * @param isRegistration флаг, указывающий, является ли это регистрацией. Это необходимо, чтобы отличать регистрацию от обновления данных.
     * @see User
     */
    fun upsertUser(user: User, isRegistration: Boolean): Boolean
    /**
     * Метод getUser возвращает данные о пользователе из SharedPreferences по ключу [USER_KEY].
     * @return объект User, содержащий данные о пользователе.
     * @see User
     */
    fun getUser(): User
    companion object {
        /**
         * Константа USER_KEY используется для ключа SharedPreferences, по которому получаем данные о пользователе или сохраням их.
         */
        const val USER_KEY = "USER_PD.KEY"
    }
}