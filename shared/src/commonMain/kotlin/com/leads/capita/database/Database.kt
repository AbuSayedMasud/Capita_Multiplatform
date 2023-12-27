package com.leads.capita.database

import com.leads.capita.CapitaDb

internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = CapitaDb(databaseDriverFactory.createDriver())
}