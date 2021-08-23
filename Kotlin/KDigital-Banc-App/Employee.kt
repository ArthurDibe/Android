abstract class Employee(
    name: String,
	sinId: String,
    val salary: Double
) : Person(name, sinId) {
    protected abstract fun calculateSupport():Double
    
    override fun toString(): String = """
        Nome: $name
        Sin ID: $sinId
        Salary: $salary
        Support: ${calculateSupport()}
    """.trimIndent()
    
}