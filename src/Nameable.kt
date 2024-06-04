interface Nameable {
    var name: String
}

class StaffName : Nameable {
    override var name: String = "Sean"
}

class Work : Runnable {
    override fun run() {
        println("work....")
    }
}

class Person(nameable: Nameable, work: Runnable) : Nameable by nameable, Runnable by work

fun main() {
    val person = Person(StaffName(), Work())
    println(person.name)
    person.run()
}
