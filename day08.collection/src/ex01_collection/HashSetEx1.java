package ex01_collection;

import java.util.HashSet;
import java.util.Iterator;

//set : ��������, �ߺ� ���x
public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();//<E>  �̷��� ������ �����ְ� ��ü�� �����ϸ�
		//������ �ҷ��ö����� ���ĺ�ȯ�� �����൵ ��. new ���Ŀ��� ���������� �Ƚᵵ �Ǵµ� 7.0���� �׳� �� ��
		hs.add("Ű����");
		hs.add("���콺");
		hs.add("��");
		hs.add("����");
		hs.add("Ű����");
		
		System.out.println("��Ұ��� : "+hs.size()); // 4
		
		Iterator it = hs.iterator();
		while(it.hasNext()){ // ���� ��Ұ� �ִٸ�..
			System.out.println(it.next()); // ��Ҹ� �����ͼ� �����
		}
		System.out.println("Ȯ�� for�� �̿�");
		for(Object item : hs){ // ���� �־��� ������� ������ ���� - > set�� ����x
			System.out.println(item);
		}
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(200);
		hs2.add(200);
		hs2.add(2200);
		hs2.add(2030);
		
		Iterator it2 = hs.iterator();
		for(Object item : hs2){ // ���� �־��� ������� ������ ���� - > set�� ����x
			System.out.println(item);
		}
	}
}
