package me.dibe

fun main()
{
    val salaries = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salaries) { print("${salario} ") }

    println("\n--------------------------------------------")
    println("Greatest Salary: ${salaries.maxOrNull()}")     // find the MAX value
    println("Smallest Salary: ${salaries.minOrNull()}")     // find the MIN value
    println("Salaries Average: ${salaries.average()}")      // AVERAGE
    println("\n--------------------------------------------")

    print("Salaries > 2500.0: ")
    val filteredSalaries = salaries.filter { it ->          // Create a new array using filter
        it > 2500.0
    }
    filteredSalaries.forEach{ print("${it} ") }
    println()
    print("\nNumber of Salaries between 2000 and 5000: ")
    println(salaries.count { it in 2000.0..5000.0 })        // COUNT
    print("\nfind == 2650.0 : ")
    println(salaries.find{ it == 2650.0}) // it returns the value if found, null otherwise
    print("\nany == 1000.0 : ")
    println(salaries.any{ it == 1000.0}) // returns true if found, false otherwise



    println("--------------------------------------------")
    val employee1 = Employee("John", 1000.0, EmployeeType.MN)
    val employee2 = Employee("Mary", 3000.0, EmployeeType.MN)
    val employee3 = Employee("Bob", 500.0, EmployeeType.FN)
    val employees = listOf<Employee>(employee1, employee2, employee3)

    employees.forEach{ println(it) }
    println("------")
    println("Finding an Employee with name \"Mary\":")
    println(employees.find{ it.name == "Mary"})

    println("------")
    println("Sorting Employees array by salary attribute:")
    employees.sortedBy{ it.salary }.forEach{ println(it) }   // sortedBy

    println("------")
    println("Grouping Employees array by Employee type attribute:")
    employees.groupBy{ it.type.description }.forEach{ println(it) }   // groupBy


    println("--------------------------------------------")
    println("UNION of 2 setOf list")
    val employees1 = setOf(employee1, employee2)
    val employees2 = setOf(employee3)
    val resultUnion = employees1.union(employees2)

    resultUnion.forEach{ println(it) }

    println("------")
    println("SUBTRACT of 2 setOf list")
    val employees3 = setOf(employee1, employee2, employee3)
    val resultSubtract = employees3.subtract(employees2)        // REMOVE what is in common

    resultSubtract.forEach{ println(it) }

    println("------")
    println("INTERSECT of 2 setOf list")
    val resultIntersect = employees3.intersect(employees2)      // GET what is in common

    resultIntersect.forEach{ println(it) }


    println("--------------------------------------------")
    val pairVar: Pair<String, Double> = Pair("John", 1000.0)
    val map1 = mapOf(pairVar)
    val map2 = mapOf("Stewie" to 2000.0, "Balboa" to 3000.0) // Infix declaration


    map1.forEach{ (key, value) -> println("Key: $key, Value: $value")}
    println("------")
    map2.forEach{ (key, value) -> println("Key: $key, Value: $value")}
}