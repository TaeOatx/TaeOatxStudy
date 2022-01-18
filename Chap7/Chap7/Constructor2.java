package Chap7;

class Numberrr
{
	int num;
	
	public Numberrr(int n)//생성자
	{
		num=n;
		System.out.println("인자 전달 :"+ n);
	}
	public int getNumber()
	{
		return num;
	}
}

class Constructor2 {
	public static void main(String[] args) {
		Numberrr num1=new Numberrr(10);
		System.out.println("메소드 반환 값 : "+num1.getNumber());
		
		Numberrr num2=new Numberrr(20);
		System.out.println("메소드 반환 값 : "+num2.getNumber());
	}
}
