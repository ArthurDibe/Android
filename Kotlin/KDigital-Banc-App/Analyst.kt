class Analyst(
    name: String,
    sinId: String,
    salary: Double
) : Employee(name, sinId, salary) {
    override fun calculateSupport():Double = salary * 1.1
}