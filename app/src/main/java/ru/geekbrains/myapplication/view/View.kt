package ru.geekbrains.myapplication.view

import ru.geekbrains.myapplication.AppState

// Нижний уровень. View знает о контексте и фреймворке
interface View {
    // View имеет только один метод, в который приходит некое состояние приложения
    fun renderData(appState: AppState)

}