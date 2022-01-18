package Problem;

public class C6_1_1 {
	public static void main(String[] args) {
	Calculate(2,17);	
	}
	public static void Calculate(int a, int b)
	{
		if(a>b)
		{
		System.out.println("µ¡¼À°á°ú : " + (a+b));
		System.out.println("»¬¼À°á°ú : " + (a-b));
		System.out.println("°ö¼À°á°ú : " + (a*b));
		System.out.println("³ª´°¼À°á°úÀÇ ¸ò : " + (a/b) +", ³ª¸ÓÁö : "+ (a%b));
		}
		else
		{
		System.out.println("µ¡¼À°á°ú : " + (b+a));
		System.out.println("»¬¼À°á°ú : " + (b-a));
		System.out.println("°ö¼À°á°ú : " + (b*a));
		System.out.println("³ª´°¼À°á°úÀÇ ¸ò : " + (b/a) +", ³ª¸ÓÁö : "+ (b%a));
		}
			
	}
}
