package Chap2;

public class ENotation {
	public static void main(String[] args) {
		double e1=1.2e-3, e2=1.2E+3;//1.2 X 10^(+-3)�� ������ ���� *�빮��E�� ���� *+���� ����
		
		int num1=0xA0E;//0x�� ���� : 16����/16^2*10+0+14
		int num2=0752;//0���� ���� : 8����/8^2*7+8*5+2
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(num1);
		System.out.println(num2);
	}
}
