package Problem;

public class Chap5_4_3_Hard {
	public static void main(String[] args) {//��Ƶ��� �� ��������
		int num=1, sum=0;
		
		while(num<=1000)
			{
				if(num%2==0 && num%7==0)
				{
					System.out.println(num);
					sum+=num;
				}
				num++;
			}
		System.out.println("1000���� ���� �� 2�� ����̸鼭 7�� ����� ���ڵ��� ��"+sum);
	}
}
