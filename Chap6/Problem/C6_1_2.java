package Problem;

public class C6_1_2 {
	public static void main(String[] args) {
		Absolute(5 ,21);
	}
	public static void Absolute(int a, int b)
	{
		if(a>b)
		System.out.println("두 수의 차 : " + (a-b));
		else
		System.out.println("두 수의 차 : " + (b-a));
	}
}
