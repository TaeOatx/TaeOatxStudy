package Problem;

public class C6_1_1 {
	public static void main(String[] args) {
	Calculate(2,17);	
	}
	public static void Calculate(int a, int b)
	{
		if(a>b)
		{
		System.out.println("������� : " + (a+b));
		System.out.println("������� : " + (a-b));
		System.out.println("������� : " + (a*b));
		System.out.println("����������� �� : " + (a/b) +", ������ : "+ (a%b));
		}
		else
		{
		System.out.println("������� : " + (b+a));
		System.out.println("������� : " + (b-a));
		System.out.println("������� : " + (b*a));
		System.out.println("����������� �� : " + (b/a) +", ������ : "+ (b%a));
		}
			
	}
}
