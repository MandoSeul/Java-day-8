package ex01_collection;

import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("def");
		set.add("car");
		set.add("mannn");
		set.add("hihi");
		set.add("good");
		set.add("girl");
		set.add("dzzzzz");
		set.add("dZZZZZ");
		
		System.out.println(set);
		System.out.println("range search : from "+from+" to "+to);
		System.out.println("result1 : " + set.subSet(from, to));
		// �տ����� ���Եڿ� ���� ������
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		// zzz�� �� ���� �����ؼ� ���
		
	}
	
	
}
