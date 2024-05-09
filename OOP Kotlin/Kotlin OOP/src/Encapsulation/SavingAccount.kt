package Encapsulation

class SavingAccount(private var accountHolder: String, private var balance: Double) : BankAccount {

    init {
        println("$accountHolder your saving account is created")
        println("Your current balance $balance")
    }
    override fun withdraw(amount: Double) {

        if (balance <= 0) {
            println("$accountHolder you have insufficient balance");
        } else {
            println("$accountHolder you had  $balance amount")
            balance -= amount
            println("$accountHolder you current balance  $balance")
        }
    }

    override fun deposite(amount: Double) {
        println("$accountHolder you had  $balance amount")
        balance += amount
        println("$accountHolder you current balance  $balance")
    }

    override fun checkBalance(): Double{
        return balance
    }
}