// 여러 인터페이스 구현
// 코틀린에서 클래스 상속 : 단일(O), 다중(X)
// 코틀린에서 인터페이스 구현 : 단일(X), 다중(O)

interface Bird {
    val wings : Int
    fun fly()
    fun jump() {
        println("bird jump!")
    }
}

interface Horse {
    val maxSpeed : Int
    fun run()
    fun jump() {
        println("jump!, max speed : $maxSpeed")
    }
}

class Pegasus : Bird,Horse {
    override val wings : Int = 2
    override val maxSpeed : Int = 100
    override fun fly() {
        println("Fly!")
    }
    override fun run() {
        println("Run!")
    }
    override fun jump() {
        // super<인터페이스 이름>.메소드드
        super<Horse>.jump()
        super<Bird>.jump()
        println("Pegasus Jump!")
    }
}

fun main() {
    val pegasus = Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}