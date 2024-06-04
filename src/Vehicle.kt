// 추상 클래스, 주 생성자에는 비-추상 프로퍼티 선언의 매개변수 3개가 있다.
abstract class Vehicle(val name:String, val color:String, val weight:Double) {
    // 2개 추상 프로퍼티(반드시 하위 클래스에서 재정의 해야 한다)
    abstract var maxSpeed:Double // 최대 속도
    abstract var minSpeed:Double // 최소 속도
    // 비-추상 프로퍼티 (초기 값인 상태를 저장할 수 있다)
    var year = "2018"

    // 추상 메서드 (반드시 하위 클래스에서 구현 해야 한다)
    abstract  fun start()
    abstract fun stop()

    // 비-추상 메서드
    fun displaySpecs(){
        println("이름: $name, 색상: $color, 무게: $weight, 년식: $year, 최대: $maxSpeed, 최소: $minSpeed")
    }
}

class Car(name:String,
          color:String,
          weight:Double,
          override var maxSpeed:Double,      // maxSpeed는 오버라이딩 한다
          override var minSpeed: Double)   // minSpeed는 오버라이딩 한다
    :Vehicle(name, color, weight){
    override fun start(){
        println("Car Started")
    }

    override fun stop(){
        println("Car stopped")
    }
}

class Motorcycle(name:String,
                 color:String,
                 weight:Double,
                 override var maxSpeed:Double,
                 override var minSpeed: Double)
    :Vehicle(name, color, weight){
    override fun start(){
        println("Bike Started")
    }
    override fun stop(){
        println("Bike Stopped")
    }

}

fun main(){
    val car = Car("SuperMatiz","yellow",1110.0, 270.0, 27.0)
    val motor = Motorcycle("DreamBike","red",173.0, 17.0, 7.0)
    car.year = "2013"
    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}