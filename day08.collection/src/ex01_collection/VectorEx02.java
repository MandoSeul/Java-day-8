package ex01_collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("����� ���� �Է��ϼ��� : ");
		num=sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];  // num �ޱ� ���� �������� �ʱ�
		for(int i=0; i<str.length; i++){
		System.out.println("����̸��� �Է��ϼ��� : ");
		str[i] = sc.next();
		v.add(str[i]);
		}
		Collections.sort(v);
		System.out.println("���ĺ� �����Դϴ� : ");
		for(int i=0; i<v.size(); i++){
			System.out.print(v.get(i)+"\t");
		}
		
		v.removeElementAt(4);
		// vector�� �����ϰ� ������
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
