package Chap2;

public class VariableDecl {
	public static void main(String[] args) {
		double num1, num2, result;//double�� ������ ���ÿ� ����
		num1=1.0000001;
		num2=2.0000001;
		result=num1+num2;
		
		System.out.println(result);//������ 3.0000001999999997 ���� 3.0000002�� ����
	}
}