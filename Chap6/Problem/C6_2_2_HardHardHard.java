package Problem;

public class C6_2_2_HardHardHard {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(isPrimeNumber(i))
				System.out.println(i + " is prime number");
		}
	}
	
	public static boolean isPrimeNumber(int num)
	{
		if(num==1)
			return false;
		
		for(int j=2; j<num; j++)
		{
			if(num%j==0)//num을 2부터 num보다 1 작은 수까지 나눠서 전부 나머지가 0이 아니면 true
				return false;
		}
		return true;
	}
}
