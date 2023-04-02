//val(value)는 한번만 할당 가능
//var(variable)는 여러번 할당 가능
// 코틀린에서는 참조형 사용 > 코틀린 컴파일러가 자동적으로 최적화
// 컴파일 과정을 거친 후 기본형이 사용됨

fun main() {
// 키워드 : 변수명 : 타입 = 값
    val number: Int = 10
    // 타입 추론 가능
    val number2 = 20
    val numberOfBook: Int = 30
    val init: Int = 10

    var language = "English"
    language = "Korean"

    println("number: $number, number2: $number2")
    println("language: $language")

    var a =1
    val str1 = "a = $a"
    val str2 = "a = ${a +2}" // 문자열에 표현식사용

    println("str1 : \"$str1\", str2 : \"$str2\"")

    val str3 = "He said, \"Hello!\""
    println("str3 : \"$str3\"")



}

