package Chap2;

public class UnicodeChar {
	public static void main(String[] args) {
		char ch1='A'; //���ڴ� ���� ����ǥ�� ǥ��
		char ch2='��'; //char�� ������ ������ ������ ���� ���
		char ch3=0x3091; //char�� ������ ���� ����Ǵ� ���� �����ڵ� ��� ��
		char ch4=0x3092; //syso�� char�� ������, �� ���ڸ� ������ �����
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}
}
