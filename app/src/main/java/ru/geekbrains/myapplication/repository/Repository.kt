package ru.geekbrains.myapplication.repository

import io.reactivex.Observable

// Репозиторий представляет собой слой получения и хранения данных, которые он
// передаёт интерактору
interface Repository<T> {

    fun getData(word: String): Observable<T>
}
// Источник данных для репозитория (Интернет, БД и т. п.)
interface DataSource<T> {

    fun getData(word: String): Observable<T>
}