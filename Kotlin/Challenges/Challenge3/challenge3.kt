fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F
  
    if (r > 2000f && r <= 3000f)  
      i = (r - 2000f) * 0.08f
      
    else if (r > 3000f && r <= 4500f)   
      i = ((r - 3000) * 0.18f) + (1000f * 0.08f)
      
    else if (r > 4500)  
      i = ((r - 4500) * 0.28f) + (1500f * 0.18f) + (1000f * 0.08f)
    
  
    if (i == 0F) println("Free") else println("R$ ${i.format(2)}")
}