package Main_kotlin
// 2.주생성자를 선언 - 생략된 표현법, 프로퍼티의 기본값 지정
open class Bird7 (var name: String, var wing:Int, var beak:String, var color:String){ //매개변수


    fun fly() = println("Fly wing: $wing")  //메소드
    fun sing(vol:Int) = println("Sing vol:$vol")
}

//주생성자를 사용하는 상속
class Lark(name: String, wing:Int,  beak:String, color:String, age:Int)
    :Bird7(name, wing, beak, color){
        fun singingHitone()  = println("Happy song") //자식이 새로 만든 것
    }


fun main(){

    val lark1 = Lark(name="lark", wing = 2, beak = "long", color = "brown", age = 18)

    println("${lark1.color}")
    lark1.fly()
    lark1.sing(3)
    lark1.singingHitone()

}




