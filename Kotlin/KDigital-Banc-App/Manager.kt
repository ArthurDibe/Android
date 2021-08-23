class Manager(
    name: String,
    sinId: String,
    salary: Double,
    val password: String
) : Employee(name = name, sinId = sinId, salary = salary), Loggable {
    override fun calculateSupport():Double = salary * 0.4
    override fun login(): Boolean = password == "my123password"
}