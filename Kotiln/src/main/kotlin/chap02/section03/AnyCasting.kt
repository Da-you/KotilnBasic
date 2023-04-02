package chap02.section03
/* 묵시적 변환
* Any 자료형이 정해지지 않은경우, 모든 클래스의 뿌리 Int나 String은 Any의 자식 클래스
* Any는 자바의 Object와 같은 역할
* Any는 언제든 필요한 자료형으로 자동 변환
 */
fun main(){
    var a: Any = 1 // Any형 a는 1로 초기화
    a = 20L // Long형으로 변경
    println("a: $a type: ${a.javaClass}") // a의 자료형 출력
}