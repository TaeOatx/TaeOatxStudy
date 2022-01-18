package Problem;

public class C6_3_1 {
	public static void main(String[] args) {
		int num=10;
		System.out.println("2ÀÇ " + num +"½Â : " + sqare(num));
	}
	public static int sqare(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n=sqare(n-1)*2;
		}
		
	}
}
