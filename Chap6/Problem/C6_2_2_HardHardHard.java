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
			if(num%j==0)//num�� 2���� num���� 1 ���� ������ ������ ���� �������� 0�� �ƴϸ� true
				return false;
		}
		return true;
	}
}
