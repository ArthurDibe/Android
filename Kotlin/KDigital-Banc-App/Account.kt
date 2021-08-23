class Account(
    val ag:String, 
    val number:String 
) : Depositable, Withdrawable {
    var amount: Double = 0.0; private set
    
    override fun toString(): String = """
        Ag:     $ag
        Account N:     $number
        Balance:  $amount
    """.trimIndent()
    
    override fun deposit(value: Double){
        this.amount_ += value
    }

    override fun withdraw(value: Double){
        if(this.amount_ < value) {
            println("WARNING: You have not enough founds to take money out")
        }
        else {
            this.amount_ -= value  
        }
    }
}