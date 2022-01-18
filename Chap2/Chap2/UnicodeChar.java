package Chap2;

public class UnicodeChar {
	public static void main(String[] args) {
		char ch1='A'; //문자는 작은 따옴표로 표현
		char ch2='한'; //char형 변수는 문자의 저장을 위해 사용
		char ch3=0x3091; //char형 변수에 실제 저장되는 것은 유니코드 상수 값
		char ch4=0x3092; //syso는 char형 데이터, 즉 문자를 적절히 출력함
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}
}
