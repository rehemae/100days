fun main(){
    name(arrayOf("rehema","Amina","Asha","Agnesss"))

    cities(arrayOf("halale","dodoma","mumbai","kigali"))

    town(arrayOf("kigoma","mwanza","shinyanga"))

    cars(arrayOf("toyota","harrier"))

    var results=createArray("ana","john","sara")
    println(results.contentToString())

    var girls=girlsName("caro","winnie","shaa")


}
fun name(r:Array<String>){
    println(r.contentToString())
}

fun cities(city: Array<String>){
    city.forEach {city ->
        println(city.capitalize())

    }
}

fun town(r:Array<String>) {
    r.forEach { r ->
        println(r.capitalize())
    }
}

    fun cars(c:Array<String>){
        c.forEach { c->
            println(c.capitalize())
        }
}

fun createArray(name1: String,name2: String, name3: String):Array<String>{
    var x= arrayOf(name1,name2,name3)
    return x
}

fun girlsName(name1:String, name2: String,name3: String ){
    var b= arrayOf(name1,name2,name3)
    println(b.contentToString())
}