import Loggable.kt
import ClientType.kt
import Bank.kt
import Client.kt
import Employee.kt
import Account.kt

class PrintEmployeeReport{
    companion object {
        fun display(employee: Employee){
            println(employee.toString())
        }
    }
}

class Authentication{
    fun tryLogin(loggable: Loggable) = println(loggable.login())
}

fun main()
{
    // ---------- Bank Testing
    val bank1 = Bank(name = "Bank 1", number = 12)
    println(bank1.name)
    println(bank1.number)

    val bank2 = bank1.copy(name = "Bank 2")
    println(bank2.bankInfo())

    // ---------- Client Testing
    val client1 = Client("José Carlos Mata", "9999111122223333", ClientType.PA, "my123password")
    println(client1.toString())
    Authentication().tryLogin(client1)    // OK to pass client1!

    // ---------- Account Testing
    val account1 = Account(
        number = "13444-5",
        ag = "0857"
    )

    println(account1)

    try {
        account1.withdraw(10.0)
    } catch (e: Exception) {
        println(e.message)
        account1.deposit(150.0)
    }

    println(account1)
}