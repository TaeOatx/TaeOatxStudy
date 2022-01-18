package Problem;

public class Chap5_4_1 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(num<100)
		{
			System.out.print(sum+"+"+num+"=");//과정 필요없으므로 빼고
			sum+=num;
			System.out.println(sum);//한 번만 나오게 하려면 while 밖으로
			num++;			
		}
		//요기로
	}
}
