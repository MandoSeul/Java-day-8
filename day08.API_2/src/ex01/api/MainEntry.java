package ex01.api;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "abc def g hi";
		System.out.println("���ĺ� �Է��ض�");
		str1 = sc.nextLine();
		String temp = str1.toUpperCase();
//value of �ϸ� string���� �� ���� touppercase�� �� ����.
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
	
