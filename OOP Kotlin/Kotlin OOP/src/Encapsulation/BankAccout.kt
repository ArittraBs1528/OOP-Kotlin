package Encapsulation

interface BankAccount {
    open fun withdraw(amount:Double)
    open fun deposite(amount:Double)
    open fun checkBalance(): Double
}