package me.dibe

class Employee(
    val name: String,
    val salary: Double,
    val type: EmployeeType
){
    override fun toString(): String = """
        Name:   $name
        Salary: $salary
        Type: ${type.description}
        
    """.trimIndent()
}