package ru.geekbrains.myapplication.db

import io.reactivex.Observable
import ru.geekbrains.myapplication.model.DataModel
import javax.sql.DataSource

class RoomDataBaseImplementation : DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented") // To change body of created functions use File
        // | Settings | File Templates.
    }
}