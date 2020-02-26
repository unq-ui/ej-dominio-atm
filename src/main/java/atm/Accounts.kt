package atm

abstract class Account(val type : String) {
    var balance : Int = 0
    abstract fun extract(amount: Int) : Int
    open fun deposit(amount: Int): Int {
        balance += amount
        return balance
    }
}

class SavingsAccount : Account(type = "Caja De Ahorro") {
    override fun extract(amount : Int) : Int {
        if (balance < amount) {
            throw NoCreditException("No dispones de saldo suficiente")
        }
        balance -= amount
        return balance
    }
}

class CurrentAccount : Account(type = "Cuenta Corriente") {
    var overdraftLimit: Int = -20

    override fun extract(amount: Int): Int {
        if (balance < overdraftLimit + amount) {
            throw NoCreditException("No puedes superar el descubierto")
        }
        balance -= amount
        return balance
    }
}