package atm

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SavingsAccountTest {
    @Test fun `Savings Account creation`() {
        val account = SavingsAccount()
        assertEquals("Caja De Ahorro", account.type)
        assertEquals(0, account.balance)
    }

    @Test fun `Make a deposit increase balance`() {
        val account = SavingsAccount()
        assertEquals(0, account.balance)
        account.deposit(100)
        assertEquals(100, account.balance)
    }
}