package Problem;

public class Chap5_6_2 {
	public static void main(String[] args) {
		int result=0;
		int a=1;
		
		while(result<1000)//���ѷ��� �� ���� ����
		{
			if(a%2==1 || a%3==0)
			{
				result+=a;
			}
			a++;
		}
		System.out.println("��� Ȧ���� 3�� ����� ¦���� ���� 1000�� ���� �� ����"+result+"�Դϴ�.");
		System.out.println("--------����Ǯ��----------");
		int sum=0, num=1;
		
			while(true)//���ѷ��� ���
			{
				if(num%2!=0)
				{
					sum+=num;			
				}
				else if(num%3==0)
				{
					sum+=num;
				}	
				
				if(sum>1000)
				{
					System.out.println(sum+"���� �� 1000�� �Ѵ´�.");
					System.out.println("�ʰ��� �� : "+sum);
					break;
				}
				num++;
			}
			System.out.println("break ���� ����(while�� �ٱ�)�� ����");
	}
}
