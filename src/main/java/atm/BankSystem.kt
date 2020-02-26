package atm

class BankSystem {
    val accounts = mutableListOf<Account>()

    fun addAccount(account: Account) {
        accounts.add(account)
    }
}
