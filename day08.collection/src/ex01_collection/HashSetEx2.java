package ex01_collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","3", "435","3","3","3"};
		Set set = new HashSet(); // �θ�κ��� �ڼհ�ü ���� ����
		
		for(int i=0; i < objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}
