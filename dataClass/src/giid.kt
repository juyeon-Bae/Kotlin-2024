class giid {
}

fun main(){
    println(a())
    println(b())
    println(sum(1,2))
    println(sumNumber(1,2))
    println(sumTypeNumber(1,2))
}
fun sum(a:Int, b:Int):Int{
    return a+b
}
val sumNumber = {a:Int, b:Int -> a+b}
val sumTypeNumber : (Int, Int) ->Int = {a,b -> a+b}

fun a():String{
    return "A-Good"
}

fun b() = "B-Good"