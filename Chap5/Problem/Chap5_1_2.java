package Problem;

public class Chap5_1_2 {
	public static void main(String[] args) {
		int num=320;
		
		if(num<0)
			System.out.println("num은 0 미만");
		else if(num<100)
				System.out.println("num은 0이상 100미만");
		else if(num<200)
			System.out.println("num은 100이상 200미만");
		else if(num<300)
			System.out.println("num은 200이상 300미만");
		else if(num>=300)
			System.out.println("num은 300이상");
	}
}
