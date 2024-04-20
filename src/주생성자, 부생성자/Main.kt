package `주생성자, 부생성자`

class Bird1{
    var name:String = "mybird" //클래스에 초기값을 줌
    var wing:Int = 2
    var beak:String = "short"
    var color:String = "blue"

    fun fly() = println("Fly wing:$wing")
    fun sing(vol:Int) = println("Sing vol:$vol")
}

fun main(){
    val coco = Bird1()  //객체 생성
    coco.color="blue"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)


}