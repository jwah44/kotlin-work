// Task 15.2.3: SavingsAccount class
class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init {
        require(rate > 0) { "Rate must be positive" }
    }

    fun applyInterest(rate: Double) {
        val realbalance =  BankAccount.balance
        amount = realbalance * rate
        deposit(amount)
    }
}