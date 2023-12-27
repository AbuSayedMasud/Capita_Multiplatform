package com.leads.capita.service.account

import com.leads.capita.api.account.AccountBalance
import com.leads.capita.api.account.AccountInstrument
import com.leads.capita.api.account.AccountReceivable
import com.leads.capita.database.DatabaseDriverFactory

import com.leads.capita.api.account.AccountService
import com.leads.capita.api.account.AccountTransaction


class AccountServiceImpl : AccountService {

   override fun getBalanceServices(databaseDriverFactory: DatabaseDriverFactory): List<AccountBalance>{
       val repository = AccountFactory.getRepository(databaseDriverFactory);
        return repository.getAccountBalance()
    }

    override fun getInstrumentServices(databaseDriverFactory: DatabaseDriverFactory): List<AccountInstrument> {
        val repository=AccountFactory.getRepository(databaseDriverFactory)
        return repository.getAccountInstrument()
    }

    override fun getReceivableServices(databaseDriverFactory: DatabaseDriverFactory): List<AccountReceivable> {
        val repository=AccountFactory.getRepository(databaseDriverFactory)
        return repository.getAccountReceivable()
    }

    override fun getTransactionServices(databaseDriverFactory: DatabaseDriverFactory): List<AccountTransaction> {
        val repository=AccountFactory.getRepository(databaseDriverFactory)
        return repository.getAccountTransaction()
    }


}