package com.leads.capita.database

import app.cash.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory{
    fun createDriver(): SqlDriver
}