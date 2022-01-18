package Chap4;

public class AtirhOp {
	public static void main(String[] args) {
		int n1=7;
		int n2=3;
		
		int result=n1+n2;
		System.out.println("덧셈 결과 : "+result);
		
		result=n1-n2;
		System.out.println("뺄셈 결과 : "+result);
		System.out.println("곱셈 결과 : "+n1*n2);// * / % << 우선순위 +보다 높음
		System.out.println("나눗셈 결과 : "+n1/n2);// 연산자는 피연산자의 자료형에 따라 결정
		System.out.println("나머지 결과 : "+(n1%n2));//우선순위 기억하지 않아도 되기 때문에 소괄호를 사용
	}
}
