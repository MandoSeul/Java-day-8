package ex01.api;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "abc def g hi";
		System.out.println("알파벳 입력해라");
		str1 = sc.nextLine();
		String temp = str1.toUpperCase();
//value of 하면 string에서 그 값만 touppercase할 수 있음.
		char[] ch = str1.toCharArray();
		char [] temp1 = temp.toCharArray();
		
		for(int i=0; i<ch.length; i++){
			ch[0] = temp1[0];
			if(ch[i]==' '){
				ch[i+1] = temp1[i+1];
			}
			System.out.print(ch[i]);
		}
		
	}
}
	
