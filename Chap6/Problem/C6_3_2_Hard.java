package Problem;

public class C6_3_2_Hard {
	public static void main(String[] args) {
		int n=9;
		trans(n);
		System.out.println(" : "+ n + "을 2진수로 변환한 값");
	}
	public static int trans(int num)
	{
		if(num>0)
		{
			int num2;
			num2=num%2;//num2==1
			num/=2;//num=4
			trans(num);//num2==0, num=2/ num2==0, num==1/ num2==1, num==0
			System.out.print(num2);
		}
		return 0;
	}
}
