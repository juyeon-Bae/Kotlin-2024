import java.awt.Color
//익명이너클래스 : 일회성 객체를 생성해 사용, 인터페이스를 구현하는 것이 특징
//지역클래스 : 특정 메소드와 블럭이나 init블럭과 같이 블럭 범위에서만 유효한 클래스로 블록 범위를 벗어나면 더 이상 사용되지 않음
interface Switcher{//인터페이스 선언
    fun on():String
}
class SmartPhone2 (val model:String){
    private val cpu = "Exynos"
    fun powerOn(): String {
        class Led(val color:String){ //지역클래스 선언
            fun blink():String = "Blink $color on $model in $cpu"
        }//Led
        val powerStatus = Led("Red")//객체
        val powerSwitch = object :Switcher{//익명내부클래스로 이름없고 object사용
            override  fun on():String{
                return powerStatus.blink()
            }// on()
        }//object :Switcher
        return powerSwitch.on()
    }

}//SmartPhone2

fun main(){
    val myphone = SmartPhone2("Note9")
    println(myphone.powerOn())
}