package ex05.random;

import java.util.Random;

public class LotteryProgram {
	public static void main(String[] args) {
//		Random rand = new Random();
//		for(int i=0; i<6;i++){
//			System.out.print(rand.nextInt(45)+1+"\t");
//		}
		int[] num = new int[6];
		for(int i=0; i<num.length; i++)
		{
			num[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++){
				if(num[i]==num[j])
				i--;
			//	break;
			}
			
		}
		for(int i=0; i<num.length; i++)
		System.out.print(num[i] + "\t");
	
	}
	
}
