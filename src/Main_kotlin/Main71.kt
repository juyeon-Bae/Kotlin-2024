package Main_kotlin
//주생성자로 매개변수를 통해 초기화 프로퍼트 지정
class Person1(var name: String, var age:Int, var address:String) {

   fun fly() = println("$name 이가 좋아하는 노래부르기 ")
   fun sleeping(h:Int) = println("Sleeping hour : $h")
}

fun main(){
   val p = Person1(name = "juyeon", age = 18, address = "sanbon")  //객체 생성

   println("나이 : ${p.age}")
   println("이름 : ${p.name}")
   println("주소 : ${p.address}")
   println()
   p.fly()
   p.sleeping(4)



}

