class Client(
	name: String,
    sinId: String,
    val type: ClientType,
    val password: String
) : Person(name, sinId), Loggable {
    override fun login(): Boolean = password == "123456"
    override fun toString(): String = """
        Nome: $name
        Sin ID: $sinId
        Client Type: $type
    """.trimIndent()
}