package chap02.section03

fun main(){
    val a : Int = 127
    val b = a

    println(a === b) // 자료형 Int가 기본형인 int가 되어 값이 동일 true
    val c: Int? = a // Int? 는 변환되지 않고 참조형 그대로 남는다
    val d: Int? = a
    val e: Int? = c
    println(c == d) // true 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) //false 값의 내용은 같지만 참조를 비교해 다른 객체 주소 이므로 false
    println(c === e)// true 값의 내용도 같고 참조된 객체도 동일 하므로 true

}