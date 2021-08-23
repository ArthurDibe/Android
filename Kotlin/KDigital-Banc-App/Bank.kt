data class Bank(
    val name:String, 
    val number:Int
){
    fun bankInfo() = "$name_ | $number_"
}