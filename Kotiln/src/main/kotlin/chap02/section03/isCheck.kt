package chap02.section03

fun main(){
    val num = 256

    if (num is Int){ // num이 Int형이면
        print(num)
    }else if (num !is Int){ // num이 Int형이 아닐 떄, !(num is Int)와 같음
        print("Not a Int")
    }
}