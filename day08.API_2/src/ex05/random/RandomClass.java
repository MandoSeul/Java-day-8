package ex05.random;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random rand = new Random();
		//int iNum=rand.nextInt(); //난수추출됨
		int iNum=rand.nextInt(5); //0~4	
		System.out.println(iNum);
		
		for(int i=0; i<5;i++){
			System.out.print(rand.nextInt(5)+1+"\t");
		}
	}
}
