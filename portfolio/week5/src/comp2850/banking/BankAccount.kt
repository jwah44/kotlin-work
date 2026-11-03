// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking

abstract class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance = 0
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    abstract fun withdraw(amount: Int)
}

class StudentAccount(holder: String, _overdraft: Int = 0) : BankAccount(holder) {
    var overdraft = _overdraft
        set(value) {
            require(value<= 100) {throw IllegalArgumentException()}
            require(value>= 0) {throw IllegalArgumentException()}
            field = value
        }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"

    fun withdrawalsAllowed(): Boolean {
        return balance > (0-overdraft)
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) { throw IllegalArgumentException("Withdrawal amount must be greater than 0") }
        require(balance-amount >= 0-overdraft) { throw IllegalArgumentException("Insufficient funds for withdrawal") }
        balance -= amount
    }
}
