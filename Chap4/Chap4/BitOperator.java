package Chap4;

public class BitOperator {
	public static void main(String[] args) {
		int num1=5; // 00000000 00000000 00000000 00000101
		int num2=3; // 00000000 00000000 00000000 00000011
		int num3=-1;// 11111111 11111111 11111111 11111111
		
		System.out.println(num1&num2); // 00000000 00000000 00000000 00000001 =1
		System.out.println(num1|num2); // 00000000 00000000 00000000 00000111 =7
		System.out.println(num1^num2); // 00000000 00000000 00000000 00000110 =6
		System.out.println(~num3); // 00000000 00000000 00000000 00000000 =0
	}
}
