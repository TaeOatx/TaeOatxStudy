package Problem;

public class Chap5_4_3_Hard {
	public static void main(String[] args) {//어렵도다 더 생각하자
		int num=1, sum=0;
		
		while(num<=1000)
			{
				if(num%2==0 && num%7==0)
				{
					System.out.println(num);
					sum+=num;
				}
				num++;
			}
		System.out.println("1000이하 숫자 중 2의 배수이면서 7의 배수인 숫자들의 합"+sum);
	}
}
