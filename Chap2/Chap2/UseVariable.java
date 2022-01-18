package Chap2;
public class UseVariable {
	public static void main(String[] args) {
		int num1; //변수 num1을 int형 변수로 선언(정수 저장 가능)
		num1=10; //변수 num1에 10을 저장
		
		int num2=20; // int형 변수 num2를 선언과 동시에 20을 저장
		int num3=num1+num2; //int형 변수 num3을 선원과 동시에 num1+num2를 저장(숫자, 연산결과 가능)
		System.out.println(num1+"+"+num2+"="+num3);
	}
}
