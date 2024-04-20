package `주생성자, 부생성자`
//주생성자를 포함한 클래스 사용하기
class Bird4 (var name_: String, var wing_:Int, var beak_:String, var color_:String){ //매개변수
    var name:String = name_ //멤버변수
    var wing:Int = wing_
    var beak:String = beak_
    var color:String = color_


    fun fly() = println("Fly wing: $wing")  //메소드
    fun sing(vol:Int) = println("Sing vol:$vol")
}

fun main(){

    val coco = Bird4(name_ = "mybird", wing_ = 2, beak_ = "short", color_ = "blue")
    coco.color= "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)



}
