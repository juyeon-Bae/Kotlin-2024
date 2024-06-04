// 인터페이스
interface Pet {
    var category: String // abstract 키워드 없어도 기본은 추상 프로퍼티로 값을 저장할 수 없음
    val msgTags:String  //val는 값을 전달해 줄 수 있음 get()
        get()="I'm yours lovely pet!"

    fun feeding()   // 마찬가지로 추상 메서드
    fun patting() { // 비-추상 메서드: 구현부 포함하면 비-추상이 되며 기본 구현이 된다.
        println("Keep patting!") // 구현부
    }
}
class Cat(override var category: String) : Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
fun main() {
    val obj = Cat("small")
    println("Pet Category: ${obj.category}")
    println("Pet Message : ${obj.msgTags}")
    obj.feeding() // 구현된 메소드
    obj.patting() // 기본 메소드
}