package Main_kotlin
//주생성자로 매개변수를 통해 초기화 프로퍼트 지정
class Person2(var name: String, var age:Int=18, var address:String="미림") {
    init {
        println("---자기소개---")
        println("이름 : $name")
        println("나이 : $age")
        println("주소 : $address")
        this.play()
        println("----------")

    }
    fun play() = println("$name 이가 좋아하는 노래부르기 ")
    fun sleeping(h:Int) = println("Sleeping hour : $h")
}

fun main(){
    val p = Person2(name = "juyeon", age = 18, address = "sanbon")  //객체 생성
    p.sleeping(6)



}
