package atm

object BankFactory {
    private val system = BankSystem()

    init {
        system.addAccount(makeCurrentAccount())
        system.addAccount(makeAccountBox())
    }

    fun makeBankSystem() = system

    private fun makeCurrentAccount(): Account {
        var currentAccount = CurrentAccount();
        currentAccount.balance = 100
        return currentAccount
    }

    private fun makeAccountBox(): Account {
        var currentBox = SavingsAccount();
        currentBox.balance = 30
        return currentBox
    }

}