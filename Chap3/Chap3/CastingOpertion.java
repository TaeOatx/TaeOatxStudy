package Chap3;

public class CastingOpertion {
	public static void main(String[] args) {
		char ch1='A';
		char ch2='Z';
		
		int num1=ch1; //�ڵ� �� ��ȯ
		int num2=(int)ch2; //����� �� ��ȯ(�� ����� �� ����)
		
		System.out.println("���� A�� �����ڵ� �� :"+num1);
		System.out.println("���� Z�� �����ڵ� �� :"+num2);
	}
}
