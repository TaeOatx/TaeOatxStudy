package Chap3;

public class SuffixConst {
	public static void main(String[] args) {
		
		double e1=7.125;
		float e2=7.125F;  
		
		long n1=10000000000L; //접미사 대소문자 상관없음 하지만 1(일)과 l(소문자 엘)비슷하니까 대문자 쓰자 
		long n2=150; //L안 붙였는데 에러 안 뜸 자동 형 변환
		//실수는 double이 기본, 정수는 int가 기본
		System.out.println(e1);
		System.out.println(n1);
	}
}
