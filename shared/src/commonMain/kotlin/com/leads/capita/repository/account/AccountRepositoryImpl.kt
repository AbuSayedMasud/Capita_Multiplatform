package com.leads.capita.repository.account



import com.leads.capita.api.account.AccountBalance
import com.leads.capita.api.account.AccountInstrument
import com.leads.capita.api.account.AccountReceivable
import com.leads.capita.api.account.AccountRepository
import com.leads.capita.api.account.AccountTransaction


class AccountRepositoryImpl : AccountRepository {
    override fun getAccountBalance(): List<AccountBalance> {
        TODO("Not yet implemented")
    }

    override fun getAccountInstrument(): List<AccountInstrument> {
        TODO("Not yet implemented")
    }

    override fun getAccountReceivable(): List<AccountReceivable> {
        TODO("Not yet implemented")
    }

    override fun getAccountTransaction(): List<AccountTransaction> {
        TODO("Not yet implemented")
    }

    override fun createAccountTransaction(transactions: List<AccountTransaction>) {
        TODO("Not yet implemented")
    }

    override fun createAccountInstrument(instruments: List<AccountInstrument>) {
        TODO("Not yet implemented")
    }

    override fun createAccountBalance(balances: List<AccountBalance>) {
        TODO("Not yet implemented")
    }

    override fun createAccountReceivable(receivables: List<AccountReceivable>) {
        TODO("Not yet implemented")
    }

}
