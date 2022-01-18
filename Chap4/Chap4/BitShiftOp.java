package Chap4;

public class BitShiftOp {
	public static void main(String[] args) {
		System.out.println(2<<1);// 00000010 << 00000100=4
		System.out.println(2<<2);// 00000010 << 00001000=8
		System.out.println(2<<3);// 00000010 << 00010000=16
		
		System.out.println(8>>1);// 00001000 >> 00000100=4
		System.out.println(8>>2);// 00001000 >> 00000010=2
		System.out.println(8>>3);// 00001000 >> 00000001=1
		
		System.out.println(-8>>1);// 11110110 >> 11111011=-4
		System.out.println(-8>>2);// 11110110 >> 11111101=-2
		System.out.println(-8>>3);// 11110110 >> 11111110=-1
		
		System.out.println(-8>>>1); // 2147483644
	}
}
//8을 00001000 음수로 바꾸면 11110110 맞나? 0, 1 뒤집고 1 더하는데 맨 뒷자리 1있는거 0으로 바꾸면 되는건가