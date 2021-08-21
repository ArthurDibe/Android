fun main() 
{
    
}

// this function returns true if both numbers are NOT NULL
// otherwise false
fun checkNumbers(cn1:Float?, cn2:Float?=0f):Boolean
{
    var isNotNull = true
    
    if((cn1 == null) || (cn2 == null))
    {
        isNotNull = false
        println("\tERROR ----> A NULL WAS FOUND!!!")
    }
    
    return isNotNull
}