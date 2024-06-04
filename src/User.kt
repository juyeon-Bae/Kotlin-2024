// 자바에서 private 프로퍼티는 외부에서 직접 접근할 수 없다.
// 이때 getter, setter을 이용해서 접근함 -> private 프로퍼티가 많으면 getter, setter양이 많아짐
// 코틀린은 필요한 경우 getter, setter을 이용하지만 기본적으로 private 프로퍼티를 사용할 때
// 내부적으로 getter, setter가 수행된다

//커스텀 getter와 setter 사용
class User(_id:Int, _name:String, _age:Int){
    val id:Int = _id	//val은 getter만 있음
    var name:String = _name //var은 getter와 setter가 있음
        set(value){
            println("The name was changed")
            field = value.toUpperCase()
        }
    var age:Int =_age	//getter와 setter 있음
}

fun main(){
    val user1 = User(1, "kildong", 35)
    user1.name = user1.name //getter 수행
    user1.age = 41	//setter 수행

    println("name : ${user1.name}, ${user1.id}, ${user1.age}")
}