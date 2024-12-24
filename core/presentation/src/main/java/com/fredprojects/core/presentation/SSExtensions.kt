package com.fredprojects.core.presentation

import android.content.Context
import android.widget.Toast

// Sun(day) School Extensions
fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
/**
 * Отображение тоста.
 * @param messageId идентификатор строки из ресурсов. Например, R.string.some_string
 * @param duration длительность тоста
 */
fun Context.toast(messageId: Int, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, messageId, duration).show()
}