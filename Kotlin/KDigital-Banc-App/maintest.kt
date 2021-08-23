import Bank.kt
import Client.kt
import ClientType.kt
import Employee.kt
import Loggable.kt

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
}