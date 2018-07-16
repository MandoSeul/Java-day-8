package ex05.random;

public class MathRandom {
	public static void main(String[] args) {
		System.out.println(Math.random());//0.0~1.0
		System.out.println((int)Math.random());
		System.out.println((int)(Math.random()*5)); // 0~4중에 출력 0~n-1
		System.out.println((int)(Math.random()*5+2)); // 0~4중에 출력 0~n-1
		
		int[] num = new int[6];
		for(int i=0; i<num.length; i++)
		{
			num[i] = (int)(Math.random()*10);
			System.out.print(num[i] + "\t");
		}
	}
}
