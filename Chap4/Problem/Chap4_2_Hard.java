package Problem;

public class Chap4_2_Hard {
	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		num1+=10;//¡Ú
		num2+=10;//¡Ú
		result=(num1<0)&&(num2>0);//
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		
		num1+=10;//¡Ú
		num2+=10;//¡Ú
		result=(num1>0)||(num2<0);//
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
	}
}