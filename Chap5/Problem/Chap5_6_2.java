package Problem;

public class Chap5_6_2 {
	public static void main(String[] args) {
		int result=0;
		int a=1;
		
		while(result<1000)//무한루프 안 썼음 오답
		{
			if(a%2==1 || a%3==0)
			{
				result+=a;
			}
			a++;
		}
		System.out.println("모든 홀수와 3의 배수인 짝수의 합이 1000을 넘을 때 수는"+result+"입니다.");
		System.out.println("--------답지풀이----------");
		int sum=0, num=1;
		
			while(true)//무한루프 사용
			{
				if(num%2!=0)
				{
					sum+=num;			
				}
				else if(num%3==0)
				{
					sum+=num;
				}	
				
				if(sum>1000)
				{
					System.out.println(sum+"더할 때 1000을 넘는다.");
					System.out.println("초과된 값 : "+sum);
					break;
				}
				num++;
			}
			System.out.println("break 이후 여기(while문 바깥)로 나감");
	}
}
