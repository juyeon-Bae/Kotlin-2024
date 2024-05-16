package Main_kotlin

class Person{
   var name:String
   var age:Int
   var address: String

   constructor(name_: String, age_:Int, address_:String){ //멤머변수
      this.name = name_
      age = age_
      address = address_
   }
//부생성자로 상속
   constructor(name_: String){
      this.name = name_
      this.age = 18
      this.address = "seoul"
   }

   fun fly() = println("$name 가 좋아하는 노래부르기 ")
   fun sleeping(h:Int) = println("Sleeping hour : $h")
}

fun main(){
   val p = Person(name_ = "juyeon", age_ = 18, address_ = "sanbon")  //객체 생성
   val p2 = Person(name_ = "jy")
   println("나이 : ${p.age}")
   println("이름 : ${p.name}")
   println("주소 : ${p.address}")
   println()

   println("이름 : ${p2.name}")
   println("나이 : ${p2.age}")
   println("주소 : ${p2.address}")
   p.fly()
   p.sleeping(5)



}

