package Chap3;

public class CastingOpertion {
	public static void main(String[] args) {
		char ch1='A';
		char ch2='Z';
		
		int num1=ch1; //자동 형 변환
		int num2=(int)ch2; //명시적 형 변환(이 방법이 더 좋음)
		
		System.out.println("문자 A의 유니코드 값 :"+num1);
		System.out.println("문자 Z의 유니코드 값 :"+num2);
	}
}
