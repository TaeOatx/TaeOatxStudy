package Problem;

public class Chap5_6_1 {
	public static void main(String[] args) {
		
		int count=0;
		for(int num=0; num++<100;)
		{
			if(num%5!=0 || num%7!=0)
			continue;
			
			count++;
			System.out.println(num);
		}
		System.out.println("Count : "+count);
	}
}
