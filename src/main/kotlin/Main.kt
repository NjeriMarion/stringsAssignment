fun main() {
    characters()

    var introduction = person("Marion", "21")
    println(introduction)

    var howlong= check("akirachix")
    println(howlong)

    identification("Mary")
    identification("Marion")



}
//prints out string
fun characters() {
    val string = "akirachix"
    val first = (string[0])
    val third = (string[2])
    val fourth = (string[3])
    println(first +" "+ third+ " "+ fourth )
}
// returns interpolated string
fun person(name:String, age: String):String{
    return("Hi, my name is $name and I am $age years old")

}
// returns string's length
fun check(y:String):Int{
    return(y.length)
}
//prints out statement
fun identification( name:String){
    val me = "Marion"
    if (name == me ){
        println(" That's me!")
    }
        else{
        println(" I don't know who that is " )
    }
}