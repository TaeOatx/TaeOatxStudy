package Chap7;

class Numberr
{
	int num;
	
	public Numberr()//������
	{
		num=10;
		System.out.println("������ ȣ��");
	}
	public int getNumber()
	{
		return num;
	}
}

class Constructor1 {
	public static void main(String[] args) {
		Numberr num1=new Numberr();
		System.out.println(num1.getNumber());
		
		Numberr num2=new Numberr();
		System.out.println(num2.getNumber());
	}
}
