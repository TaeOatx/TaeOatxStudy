package Problem;

class Triangle//밑변(bottom)과 높이(height)를 저장 할 수 있는 클래스
{
	double bottom, height;//double형 변수 bottom, height
	
	public Triangle(double bt, double hg)//생성자 : 클래스의 이름과 동일, 반환형 선언x, 반환x
	{
		bottom=bt;
		height=hg;
	}
	public void setBottom(double bt)//
	{
		bottom=bt;
	}
	public void setHeight(double hg)
	{
		height=hg;
	}
	public double getArea()//삼각형의 넓이를 계산해서 반환하는 메소드
	{
		return bottom*height/2;
	}
}

class C7_1_1_Hard {
	public static void main(String[] args)
	{
		Triangle tr=new Triangle(4,8);//인스턴스화(클래스의 객체 생성)
		System.out.println("The Area of Triangle is " + tr.getArea());
		
		tr.setBottom(10.5);
		tr.setHeight(8);
		System.out.println("The Area of Triangle is " + tr.getArea());
	}
}
