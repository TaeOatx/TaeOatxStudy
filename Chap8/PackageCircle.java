import orange.area.Circle;

class PackageCircle
{
	public static void main(String[] args) {
		orange.area.Circle c1=new orange.area.Circle(1.5);
		System.out.println("�������� 1.5�� ���� ���� : "+c1.getArea());
		
		orange.perimeter.Circle c2=new orange.perimeter.Circle(1.5);
		System.out.println("�������� 1.5�� ���� ���� : "+c2.getperimeter());
	}
}
