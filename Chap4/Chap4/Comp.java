package Chap4;

public class Comp {
	public static void main(String[] args) {
		double e=3.1;
		e+=2.1;
		e*=2;//int�� ���� 2�� double�� ���� 2.0���� ��ȯ �� *���� ����
		
		int n=5;
		n*=2.2;//n�� ���� double������ ��ȯ �� *����. n�� �������̱� ������ ��� 11.0�� ��� 11�� �� ��ȯ�Ǿ� ����
		
		System.out.println(e);
		System.out.println(n);
	}
}
