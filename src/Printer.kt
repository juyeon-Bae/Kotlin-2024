// 추상 클래스의 1회성 객체만들기
abstract class Printer{
    abstract fun print() // 추상메소드
}

val myPrinter = object : Printer(){ //추상클래스의 1회성 객체 인스턴스 만들려면 object
    override fun print(){
        println("출력합니다")
    }
}

fun main(){
    myPrinter.print()
}