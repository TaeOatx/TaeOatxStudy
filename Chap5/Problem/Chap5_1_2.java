package Problem;

public class Chap5_1_2 {
	public static void main(String[] args) {
		int num=320;
		
		if(num<0)
			System.out.println("num�� 0 �̸�");
		else if(num<100)
				System.out.println("num�� 0�̻� 100�̸�");
		else if(num<200)
			System.out.println("num�� 100�̻� 200�̸�");
		else if(num<300)
			System.out.println("num�� 200�̻� 300�̸�");
		else if(num>=300)
			System.out.println("num�� 300�̻�");
	}
}
