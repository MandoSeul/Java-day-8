package ex01_collection;
import java.util.*;
public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int [] score = {86, 88,94,92};
		
		for(int i = 0; i < score.length; i++)
			set.add(new Integer(score[i]));
		System.out.println(set); // �ڵ����ĵȴ�.
		
		System.out.println("50���� ���� ��  : " + set.headSet(new Integer(50)) );
		System.out.println("50���� ���� ��  : " + set.tailSet(new Integer(50)));
		
	}
}
