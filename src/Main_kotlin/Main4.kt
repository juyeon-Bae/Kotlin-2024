package Main_kotlin
// 2.주생성자를 선언 - 생략된 표현법
class Bird5 (var name: String, var wing:Int, var beak:String, var color:String){ //매개변수
    fun fly() = println("Fly wing: $wing")  //메소드
    fun sing(vol:Int) = println("Sing vol:$vol")
}

fun main(){

    val coco = Bird5(name = "mybird", wing= 2, beak = "short", color = "blue")
    coco.color= "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)



}
