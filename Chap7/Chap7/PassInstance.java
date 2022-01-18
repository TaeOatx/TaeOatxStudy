package Chap7;

class Number
{
	int num=0;
	public void addNum(int n)
	{
		num+=n;
	}
	public int getNumber()
	{
		return num;
	}
}

class PassInstance {
	public static void main(String[] args) {
		Number nInst=new Number();//객체 생성, 참조변수 : nInst
		System.out.println("메소드 호출 전 : " + nInst.getNumber());//nInst가 참조하는 객체의 getNumber메소드 호출, 객체 내에 존재하는 변수 num의 값 반환 0
		
		simpleMethod(nInst);//24행 메소드 호출, 인자 nInst 전다르 메소드 내에서는 매개변수 numb로 이를 받음.
		System.out.println("메소드 호출 후 : " + nInst.getNumber());//nInst가 참조하는 객체의 getNumber 메소드 호출
	}
	public static void simpleMethod(Number numb)
	{
		numb.addNum(12);//매개변수 numb를 이용해 addNum메소드 호출 이를통해 numb가 참조하는 객체에 저장된 변수 num의 값은 12 증가
	}
}
