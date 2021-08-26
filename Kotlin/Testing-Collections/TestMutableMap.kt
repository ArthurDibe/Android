package me.dibe

fun main()
{
    val employee1 = Employee("John", 1000.0, EmployeeType.MN)
    val employee2 = Employee("Mary", 3000.0, EmployeeType.MN)
    val employee3 = Employee("Bob", 500.0, EmployeeType.FN)

    val empRepository = Repository<Employee>()
    empRepository.create(employee1.name, employee1)
    empRepository.create(employee2.name, employee2)
    empRepository.create(employee3.name, employee3)

    println(empRepository.findById(employee2.name))

    println("------ FINDALL Member FUnction")
    empRepository.findAll().forEach{ println(it) }

    println("------ After REMOVE Member FUnction")
    empRepository.remove(employee2.name)
    empRepository.findAll().forEach{ println(it) }
}