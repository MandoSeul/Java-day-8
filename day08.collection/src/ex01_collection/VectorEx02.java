package ex01_collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("사람의 수를 입력하세요 : ");
		num=sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];  // num 받기 전에 정의하지 않기
		for(int i=0; i<str.length; i++){
		System.out.println("사람이름을 입력하세요 : ");
		str[i] = sc.next();
		v.add(str[i]);
		}
		Collections.sort(v);
		System.out.println("알파벳 순서입니다 : ");
		for(int i=0; i<v.size(); i++){
			System.out.print(v.get(i)+"\t");
		}
		
		v.removeElementAt(4);
		// vector값 삭제하고 싶을때
		System.out.println();
		for(int i=0; i<v.size(); i++){
			System.out.print(v.get(i)+"\t");
		}
		for(int i=0; i<v.size(); i++){
			//v.removeElementAt(i);
			//v.remove(0);
			v.removeAllElements();
			
		}
	
	}
}
