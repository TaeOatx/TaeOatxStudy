package orange.perimeter;

public class Circle {
	double rad;
	final double PI;
		
	public Circle(double r)
	{
		rad=r;
		PI=3.14;
	}
	public double getperimeter()
	{
		return(rad*2)*PI;
	}
}
