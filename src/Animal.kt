open class Animal(val name:String)

interface Pets{
    var category:String
    var species :String
    fun feeding()
    fun patting(){
        println("Keep patting")
    }
}

class Cats(name:String, override var category: String):Animal(name), Pets{
    override var species:String = "cat"
    override fun feeding(){
        println("${name} Feed the dog any can")
       // println("Feed the cat a tuna can!!")
    }
}
class Dog(name:String, override var category:String):Animal(name),Pets{
    override var species:String = "dog"
    override fun feeding(){
        println("${name} Feet the cat a tuna can!")
        //println("Feed the dog any can!!")
    }
}

class Rabbit(name:String, override var category:String):Animal(name), Pets{
    override var species:String = "rabbit"
    override fun feeding(){
        println("${name} Feed the rabbit carrot can!")
        //println("Feed the Rabbit any can!!")
    }
}

class Master{
    fun playWithPet(Pets:Pets){ //오버로딩을 하되 구분은 매개변수
        println("Enjoy with my dog!")
    }

    fun playWithPet(dog: Dog){ //오버로딩을 하되 구분은 매개변수
        println("Enjoy with my dog!")
    }

    fun playWithPet(Cats: Cats){
        println("Enjoy with my cat!")
    }

    fun playWithPet(Rabbit: Rabbit){
        println("Enjoy with my Rabbit!")
    }
}

fun main(){
//    val obj1 = Cats("small")
//    println("Pet category: ${obj1.category}")
//    obj1.feeding()
//    obj1.feeding()
//
//    val obj2 = Cats("big")
//    println("Pet category: ${obj2.category}")
//    obj2.feeding()
//    obj2.feeding()

    val master = Master()
    val dog = Dog("DoDO","big")
    val cat = Cats("CoCo","small")
    master.playWithPet(dog)
    master.playWithPet(cat)
    val Rabbit = Rabbit("RoRo","middle")
    master.playWithPet(Rabbit)

    dog.feeding()
    cat.feeding()
    Rabbit.feeding()

}