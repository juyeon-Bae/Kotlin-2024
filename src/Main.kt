// 오버로딩 : 상속무관, 동일한 함수명이지만 서로 다른 매개변수로 구분

class Calc{
    //오버로딩
    fun add(x:Int, y:Int): Int = x + y
    fun add(x:Double, y:Double): Double = x - y
    fun add(x:Int, y:Int, z:Int): Int = x + y + z
    fun add(x:String, y:String): String = x + y
}

fun main() {
     val calc = Calc()
    println(calc.add(3,2))
    println(calc.add(3.5,2.5))
    println(calc.add(3,2,5))
    println(calc.add("hello","world"))
}

