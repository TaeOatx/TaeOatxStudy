package Problem;

class Triangle//�غ�(bottom)�� ����(height)�� ���� �� �� �ִ� Ŭ����
{
	double bottom, height;//double�� ���� bottom, height
	
	public Triangle(double bt, double hg)//������ : Ŭ������ �̸��� ����, ��ȯ�� ����x, ��ȯx
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
	public double getArea()//�ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ�
	{
		return bottom*height/2;
	}
}

class C7_1_1_Hard {
	public static void main(String[] args)
	{
		Triangle tr=new Triangle(4,8);//�ν��Ͻ�ȭ(Ŭ������ ��ü ����)
		System.out.println("The Area of Triangle is " + tr.getArea());
		
		tr.setBottom(10.5);
		tr.setHeight(8);
		System.out.println("The Area of Triangle is " + tr.getArea());
	}
}
