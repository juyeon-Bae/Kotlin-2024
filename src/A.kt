//인터페이스 사용과 위임 비교
interface A {
   // fun functionA1()
    fun functionA(){
        println("interface A")
    }
}

interface B{
    fun functionB(){
        println("interface B")
    }
}

class C(a:A, b:B):A by a, B by b{
   fun functionC(){
       functionA()
       functionB()
   }
}

fun main(){
    val c = C()
    c.functionA()
    c.functionB()
   // c.functionA1()
}

