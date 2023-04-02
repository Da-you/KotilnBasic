package chap02.section03
// == 값만비교
// === 값과 참조 주소를 비교 (참조형 변수일때만 사용가능)
fun main(){
    var str1 : String? = "Hello"
    var num : Int? = null
    str1 = null
    println("str1: $str1, num : $num")

    var str2 : String? = "Hello Kotlin"
   // str2 = null
//    println("str2: ${str2!!.length}") // null을 허용하면 length를 사용할 수 없음

//    str2?.length // safe call > null호출
    println("str2: ${str2?.length}")


   //str2!!.length // non-null assertion > null이 아님을 확신 !!를 많이쓰면 NPE발생 확률이 증가함

    val len = if(str2 != null ) str2.length else -1
    println("str2: $str2 length: ${len}")

    // 코틀린식으로 세이프 콜과 엘비스 연산자(?:)를 사용
    println("str2: $str2 length : ${str2?.length ?: -1}")



}