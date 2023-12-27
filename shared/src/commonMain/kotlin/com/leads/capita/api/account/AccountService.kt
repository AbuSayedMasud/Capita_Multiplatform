package com.leads.capita.api.account
import com.leads.capita.database.DatabaseDriverFactory

interface AccountService {
    fun getBalanceServices(databaseDriverFactory: DatabaseDriverFactory): List<AccountBalance>
    fun getInstrumentServices(databaseDriverFactory: DatabaseDriverFactory):List<AccountInstrument>
    fun getReceivableServices(databaseDriverFactory: DatabaseDriverFactory):List<AccountReceivable>
    fun getTransactionServices(databaseDriverFactory: DatabaseDriverFactory):List<AccountTransaction>
}