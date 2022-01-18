package Problem;

public class Chap5_7_2 {
	public static void main(String[] args) {
		for(int a=0; a<10; a++)
		{
			for(int b=0; b<10; b++)
			{
				if(((10*a)+b+(10*b)+a)==99)
				{
				System.out.println("a=" + a + "," + "b=" + b);
				System.out.println(a + "" + b + "+" + b+ a + "=" + ((10*a)+b+(10*b)+a));
				}
			}
		}
	}
}
