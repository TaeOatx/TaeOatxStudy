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
		Number nInst=new Number();//��ü ����, �������� : nInst
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber());//nInst�� �����ϴ� ��ü�� getNumber�޼ҵ� ȣ��, ��ü ���� �����ϴ� ���� num�� �� ��ȯ 0
		
		simpleMethod(nInst);//24�� �޼ҵ� ȣ��, ���� nInst ���ٸ� �޼ҵ� �������� �Ű����� numb�� �̸� ����.
		System.out.println("�޼ҵ� ȣ�� �� : " + nInst.getNumber());//nInst�� �����ϴ� ��ü�� getNumber �޼ҵ� ȣ��
	}
	public static void simpleMethod(Number numb)
	{
		numb.addNum(12);//�Ű����� numb�� �̿��� addNum�޼ҵ� ȣ�� �̸����� numb�� �����ϴ� ��ü�� ����� ���� num�� ���� 12 ����
	}
}
