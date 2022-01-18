package Chap4;

public class SCE {
	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result=(num1+=10)<0&&(num2+=10)>0;//(num1+=10)<0에서 결과가 나와서 우측 계산 안 함
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		
		result=(num1+=10)>0||(num2+=10)>0;//(num1+=10)>0에서 결과가 나와서 우측 계산 안 함
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
	}
}
