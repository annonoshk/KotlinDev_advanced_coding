package delegation

interface Transaction {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
}

class TransactionHandler(private val bankAccount: () -> BankAccount) : Transaction {
    override fun deposit(amount: Double) {
        bankAccount().balance += amount
    }

    override fun withdraw(amount: Double) {
        if (bankAccount().balance - amount >= 0) {
            bankAccount().balance -= amount
        } else {
            println("Insufficient balance!")
        }
    }
}

class BankAccount(
    val accountHolder: String,
    val accountNumber: String,
    var balance: Double,
    transaction: Transaction
) : Transaction by transaction

fun main() {
    lateinit var bankAccount: BankAccount
    val transactionHandler = TransactionHandler { bankAccount }
    bankAccount = BankAccount("John Doe", "123456789", 1000.0, transactionHandler)

    bankAccount.deposit(500.0)
    println("Balance after deposit: ${bankAccount.balance}")

    bankAccount.withdraw(300.0)
    println("Balance after withdrawal: ${bankAccount.balance}")

    bankAccount.withdraw(1500.0)
    println("Attempt to withdraw more than the balance")
}