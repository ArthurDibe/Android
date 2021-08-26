package me.dibe

class Repository<T>
{
    private val mapVal = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        mapVal[id] = value   // mapVal.put(id, value)
    }

    fun remove(id:String) = mapVal.remove(id)

    fun findById(id: String) = mapVal[id] // mapVal.get(id)

    fun findAll() = mapVal.values
}