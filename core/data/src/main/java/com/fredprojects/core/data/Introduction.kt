package com.fredprojects.core.data

/**
 * В данном модуле в основном описываем:
 * - интерфейсы для взаимодействия с базой данных(Dao);
 * - классы-сущности(entities), которые представляют собой таблицы базы данных.
 * К классам сущностям всегда добавлять постфикс "Entity". Например, "UserEntity" или "ProductEntity".
 * Для Dao интерфейса точно также добавляется постфикс. Например, "UserDao" или "ProductDao".
 * Dao интерфейс - это интерфейс, который представляет собой методы для взаимодействия с базой данных
 * Подробнее читать в документации Room.
 * https://developer.android.com/training/data-storage/room
 * https://developer.android.com/training/data-storage/room/accessing-data
 * https://developer.android.com/reference/kotlin/androidx/room/package-summary
**/