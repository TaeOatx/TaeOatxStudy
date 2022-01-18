package Chap2;

public class VariableDecl {
	public static void main(String[] args) {
		double num1, num2, result;//double형 변수를 동시에 선언
		num1=1.0000001;
		num2=2.0000001;
		result=num1+num2;
		
		System.out.println(result);//실행결과 3.0000001999999997 예상 3.0000002와 차이
	}
}