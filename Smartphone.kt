//inner class : 내부에 작성된 클래스이며 외부 클래스의 멤버변수와 메소드를 사용 가능
class Smartphone(val model:String) {
    private val cpu = "Exynos"
    inner class ExtrnalStorange(val size:Int){
        fun getInfo() = "${model}:Installed on ${cpu} with ${size}Gb"

    }
}//Smartphone

fun main(){
    val mySdcard = Smartphone("S9").ExtrnalStorange(32)
    println(mySdcard.getInfo())
}