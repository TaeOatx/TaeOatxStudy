package Chap7;

class Numberrr
{
	int num;
	
	public Numberrr(int n)//������
	{
		num=n;
		System.out.println("���� ���� :"+ n);
	}
	public int getNumber()
	{
		return num;
	}
}

class Constructor2 {
	public static void main(String[] args) {
		Numberrr num1=new Numberrr(10);
		System.out.println("�޼ҵ� ��ȯ �� : "+num1.getNumber());
		
		Numberrr num2=new Numberrr(20);
		System.out.println("�޼ҵ� ��ȯ �� : "+num2.getNumber());
	}
}
