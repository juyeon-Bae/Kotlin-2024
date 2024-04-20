package `주생성자, 부생성자`
//부생성자 - 매개변수를 통해 초기화 프로퍼트 지정 (constructor 안쓰면 안된다)
class Bird3{
    var name:String //멤버변수
    var wing:Int
    var beak:String
    var color:String

    constructor(name_: String, wing_:Int, beak_:String, color_:String){ //매개변수
        name = name_ //mybird
        wing = wing_
        beak = beak_
        color = color_
    }

    constructor(name_: String, beak_: String){ //객체만들기
        this.name = name_
        this.wing = 2
        this.beak = beak_
        this.color = "grey"
    }

    fun fly() = println("Fly wing: $wing")  //메소드
    fun sing(vol:Int) = println("Sing vol:$vol")
}

fun main(){

    val coco = Bird3(name_ = "mybird", wing_ = 2, beak_ = "short", color_ = "blue")  //constructor로 간다
    val coco2 = Bird3(name_ = "mybird2", beak_ = "long")
    coco.color="yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)

    coco2.color = "red"
    println("coco.colr : ${coco2.color}")
    coco2.fly()
    coco2.sing(vol = 4)


}
