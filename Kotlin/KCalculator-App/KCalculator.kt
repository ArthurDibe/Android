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

// Return the multiplication of 2 numbers if both numbers are not null
// Return null otherwise
fun multiply(sn1:Float?, sn2:Float?):Float?
{
    var result:Float? = null
    
   	if(checkNumbers(sn1, sn2))
        result = (sn1?: -1f) * (sn2?: -1f)
  
    
	return result
}

// Return the division of 2 numbers if both numbers are not null
// Return null otherwise
fun divide(sn1:Float?, sn2:Float?):Float?
{
    var result:Float? = null
    
   	if(checkNumbers(sn1, sn2)) 
    	result = (sn1?: -1f) / (sn2?: -1f)
    
	return result
}

// Calculate the factorial of a number
// If the number is not equal to null and positive, return the calculation of factorial
// return null otherwise 
fun factorial(fn:Float?):Float?
{
    var result:Float? = null
    
    // Recursive factorial version
   	if(checkNumbers(fn) && fn!! > 1f)
    {
    	result = (fn.toInt() * factorial(fn-1f)!!.toInt()).toFloat()
    } 
    
	return result
}

// Function to calculate the porcentage of a given number in a total only if 
// the numbers are not equal to null
// returns null otherwise
fun percentage(pn:Float?, total:Float?):Float?
{
    var result:Float? = null

    if(checkNumbers(pn, total) && pn!! <= total!!)
    {
        result = ((pn.toFloat() / total.toFloat()) * 100f).toInt().toFloat()  
    }

    return result
}

// Function that calculates the power of a number given an expoent
// return the power if the number and the expoent are not null
// return null otherwise
fun power(pn:Float?, expo:Float?):Float?
{
    var result:Float = 1f

    
   	if(checkNumbers(pn, expo) && expo!! > 0f)
    {
        for(i in 1..expo.toInt()) {
            result *= pn!!.toFloat()
        }
    	    
    } else return null

    return result
}