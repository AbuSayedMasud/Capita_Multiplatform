package com.leads.capita.service.account


import com.leads.capita.database.DatabaseDriverFactory
import com.leads.capita.api.account.AccountRepository
import com.leads.capita.repository.RuntimeProfile
import com.leads.capita.repository.RuntimeProfile.LIVE_RUNTIME
import com.leads.capita.repository.account.AccountLocalRepositoryImpl
import com.leads.capita.repository.account.AccountRepositoryImpl


object AccountFactory {
    fun getRepository(databaseDriverFactory: DatabaseDriverFactory): AccountRepository {
        return if (RuntimeProfile.getCurrentRuntime() == LIVE_RUNTIME) {
            AccountRepositoryImpl()
        } else {
            AccountLocalRepositoryImpl(databaseDriverFactory)
        }
    }
}
