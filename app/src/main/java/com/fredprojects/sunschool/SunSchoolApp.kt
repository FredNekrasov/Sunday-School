package com.fredprojects.sunschool

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

/**
 * Класс приложения необходим для использования DI(dependency injection, инъекция зависимостей)
 * DI позволяет внедрять зависимости в другие классы.
 * Например, есть класс A, в конструктор которого нужен класс B (класс A зависит от B, т.е. есть зависимость от B).
 * В классе B есть конструктор, в котором нужны классы C и D.
 * DI сам создает объекты и внедрет/передает эти зависимости в их конструкторы, вместо создания объектов вручную.
 */
class SunSchoolApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SunSchoolApp)
            androidLogger()
            modules()
        }
    }
    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }
}