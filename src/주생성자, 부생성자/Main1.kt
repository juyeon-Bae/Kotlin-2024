package `주생성자, 부생성자`
//부생성자 - 매개변수를 통해 초기화 프로퍼트 지정
class Bird2{
    var name:String
    var wing:Int
    var beak:String
    var color:String

   constructor(name_: String, wing_:Int, beak_:String, color_:String){ //멤머변수
        name = name_
        wing = wing_
        beak = beak_
        color = color_
   }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}

fun main(){
    val coco = Bird2(name_ = "mybird", wing_ = 2, beak_ = "short", color_ = "blue")  //객체 생성
    coco.color="yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)


}