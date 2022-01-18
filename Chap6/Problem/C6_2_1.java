package Problem;

public class C6_2_1 {
	public static void main(String[] args) {
		double radius=5;
		double Area, Periphery;
		Area= area(radius);
		Periphery=periphery(radius);
		System.out.println("원의 넓이 : " + Area);
		System.out.println("원의 둘레 : " + Periphery);
	}
	public static double area(double num)
	{
		return (num*num*3.14);
	}
	public static double periphery(double num)
	{
		return (2*3.14*num);
	}
}
