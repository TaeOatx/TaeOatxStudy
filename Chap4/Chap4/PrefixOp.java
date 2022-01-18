package Chap4;

public class PrefixOp {
	public static void main(String[] args) {
		int num1=7;
		int num2, num3;
		
		num2= ++num1;//num1이 8(7+1)이 된다
		num3= --num1;//num1이 7(8-1)이 된다 (7-1이 아님)
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
