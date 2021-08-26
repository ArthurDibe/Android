package me.dibe

fun main()
{
    println("------ CREATED MUTABLE LIST")
    val employee1 = Employee("John", 1000.0, EmployeeType.MN)
    val employee2 = Employee("Mary", 3000.0, EmployeeType.MN)
    val employee3 = Employee("Bob", 500.0, EmployeeType.FN)
    val employees = mutableListOf<Employee>(employee1, employee2)

    employees.forEach{ println(it) }
    println("------ ADDED EMPLOYEE 3")
    employees.add(employee3)
    employees.forEach{ println(it) }

    println("------ REMOVED EMPLOYEE 2")
    employees.remove(employee2)
    employees.forEach{ println(it) }

    println("------ CREATED SET OF")
    val employeesSetOf = mutableSetOf<Employee>(employee2)
    employeesSetOf.forEach{ println(it) }

    println("------ ADDED EMPLOYEES TO SET OF")
    employeesSetOf.add(employee1)
    employeesSetOf.add(employee3)
    employeesSetOf.forEach{ println(it) }

    println("------ REMOVED EMPLOYEE 1 FROM SET OF")
    employeesSetOf.remove(employee1)
    employeesSetOf.forEach{ println(it) }

    println("--------------------------------------------")

}