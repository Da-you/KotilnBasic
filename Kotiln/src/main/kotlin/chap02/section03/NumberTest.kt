package chap02.section03
// 스마트 캐스트
fun main(){
    var test: Number = 12.2
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")
}