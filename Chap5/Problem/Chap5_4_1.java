package Problem;

public class Chap5_4_1 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(num<100)
		{
			System.out.print(sum+"+"+num+"=");//���� �ʿ�����Ƿ� ����
			sum+=num;
			System.out.println(sum);//�� ���� ������ �Ϸ��� while ������
			num++;			
		}
		//����
	}
}
