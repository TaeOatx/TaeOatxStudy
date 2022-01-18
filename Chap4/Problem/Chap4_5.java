package Problem;

public class Chap4_5 {
	public static void main(String[] args) {
		int A=((((25+5)+36/4)-72)*5), B=(((25*5)+(36-4)+71)/4), C=(128/4)*2;
		boolean result=B>C&&A>C&&A>B;
		System.out.println(result);
	}
}
