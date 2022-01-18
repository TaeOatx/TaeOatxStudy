package Problem;

public class Chap4_8_Hard {
	public static void main(String[] args) {
		int num1=10, num2=-36;
		System.out.println(num1);
		System.out.println(num1<<31);
		System.out.println(num2);
		System.out.println(num2<<30);
		
		System.out.println("여기부턴 답지");
		int num=7;
		int bitset=1<<30;
		num|=bitset;
		System.out.println(num);
		System.out.println(num<<1);
		num=-12;
		bitset=~0;
		bitset=(1<<30);
		num&=bitset;
		System.out.println(num);
		System.out.println(num<<1);
	}
}
