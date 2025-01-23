package thread

/*
 * The program reads the number of threads and creates the threads that will change your balance.

Use block synchronization to ensure the correct work of this program.
 */


@SuppressWarnings("MagicNumber")
class BankAccount {
    var balance = 0L

    fun addMoney(action: String) {
        // synchronize adding money with synchronized()
        when (action) {
            "1" -> synchronized(this) {
                addGold()
            }
            "2" -> synchronized(this) {
                addSilver()
            }
            else -> synchronized(this) {
                addCopper()
            }
        }
    }
    fun addGold() {
        balance += 10000
    }
    fun addSilver() {
        balance += 100
    }
    fun addCopper() {
        balance += 1
    }
}