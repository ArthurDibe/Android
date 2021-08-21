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

// Return the sum of 2 numbers if both numbers are not null
// Return null otherwise
fun sum(sn1:Float?, sn2:Float?):Float?
{
    var result:Float? = null
    
   	if(checkNumbers(sn1, sn2))
        result = (sn1?: -1f) + (sn2?: -1f)
    
	return result
}

// Return the subtraction of 2 numbers if both numbers are not null
// Return null otherwise
fun subtract(sn1:Float?, sn2:Float?):Float?
{
    var result:Float? = null
    
   	if(checkNumbers(sn1, sn2))
        result = (sn1?: -1f) - (sn2?: -1f)
   
	return result
}