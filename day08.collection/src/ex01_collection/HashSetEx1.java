package ex01_collection;

import java.util.HashSet;
import java.util.Iterator;

//set : 순서없고, 중복 허용x
public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();//<E>  이렇게 형식을 정해주고 객체를 생성하면
		//데이터 불러올때마다 형식변환을 안해줘도 됨. new 이후에는 형식지정자 안써도 되는데 7.0부터 그냥 씀 ㅎ
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소개수 : "+hs.size()); // 4
		
		Iterator it = hs.iterator();
		while(it.hasNext()){ // 다음 요소가 있다면..
			System.out.println(it.next()); // 요소를 꺼내와서 출력함
		}
		System.out.println("확장 for문 이용");
		for(Object item : hs){ // 내가 넣었던 순서대로 나오지 않음 - > set은 순서x
			System.out.println(item);
		}
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(200);
		hs2.add(200);
		hs2.add(2200);
		hs2.add(2030);
		
		Iterator it2 = hs.iterator();
		for(Object item : hs2){ // 내가 넣었던 순서대로 나오지 않음 - > set은 순서x
			System.out.println(item);
		}
	}
}
