package Chap4;

public class Comp {
	public static void main(String[] args) {
		double e=3.1;
		e+=2.1;
		e*=2;//int형 정수 2가 double형 정수 2.0으로 변환 후 *연산 진행
		
		int n=5;
		n*=2.2;//n의 값이 double형으로 변환 후 *연산. n이 정수형이기 때문에 결과 11.0이 상수 11로 형 변환되어 저장
		
		System.out.println(e);
		System.out.println(n);
	}
}
