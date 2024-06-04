//setter를 이용해서 나이 속이기
class FakeAge {
    var age: Int = 0
        set(value) {
            // 18 미만이면 18
            // 18~30이면 value
            // 31이상이면 value - 3
            field = when{
                value<18 -> 18
                    value in 18..30 -> value
                        else -> value-3
            }
        }
}

fun main(){
    val kim = FakeAge()
    kim.age = 15
    println("Kim's real age = 15, fake age = ${kim.age}")

    val hong = FakeAge()
    hong.age = 35
    println("hong's real age = 15, fake age = ${hong.age}")
}

