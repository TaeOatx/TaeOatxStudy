package Chap2;

public class ENotation {
	public static void main(String[] args) {
		double e1=1.2e-3, e2=1.2E+3;//1.2 X 10^(+-3)을 변수에 저장 *대문자E도 가능 *+생략 가능
		
		int num1=0xA0E;//0x로 시작 : 16진수/16^2*10+0+14
		int num2=0752;//0으로 시작 : 8진수/8^2*7+8*5+2
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(num1);
		System.out.println(num2);
	}
}
