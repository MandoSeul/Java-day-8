package ex01_collection;

import java.util.*;
// List : 순서 있고 중복도 허용
public class VectorEx01 {
 public static void main(String[] args) {
	Vector<Integer> v = new Vector<>();
	System.out.println("length        /      capacity ");
	int length = v.size();
	System.out.println(length +"             /         " + v.capacity());
	//아무것도 vector에 넣어주지 않아서 기본 크기인 10만 갖고 있음	 0 / 10
	
	Vector<Integer>v2 = new Vector<>(3,4);//초기용량, 증가용량
	v2.add(2);
	v2.add(new Integer(333));
	v2.add(2);
	length = v2.size();
	System.out.println(length +"             /         " + v2.capacity());
	v2.add(3);v2.add(4);v2.add(5);v2.add(7);v2.add(82);v2.add(25);
	length = v2.size();
	System.out.println(length +"             /         " + v2.capacity());
	System.out.println("-------interator() method ---------");
	Iterator it = v2.iterator();
	while(it.hasNext()){
		System.out.print(it.next()+"\t");
	}
	
	System.out.println("\n------------get() method ---------");
	for(int i=0; i<v2.size();i++){
		System.out.print(v2.get(i)+"\t");
	}
	
	System.out.println("\n------------sort result ---------");
	
	Collections.sort(v2);
	for(int i=0; i<v2.size(); i++){
		System.out.print(v2.get(i)+"\t");
	}
	System.out.println("\n------------elementAt(i) result ---------");
	for(int i=0; i<v2.size();i++){ // vector에 있는 모든 요소에 대해 반복
		Integer num = v2.elementAt(i); // 요소객체 알아보기
		System.out.print(num.toString() + "\t");
	}
	System.out.println("\n------------Enumeration  result ---------");
		Enumeration enu = v2.elements();
		while(enu.hasMoreElements()){
			System.out.print(enu.nextElement()+"\t");
	}
	
	System.out.println("\n------------trimToSize() method ---------");
	System.out.println("length        /      capacity ");
	System.out.println(v2.size() +"             /         " + v2.capacity());
	v2.trimToSize(); // capacity 조정
	System.out.println(v2.size() +"             /         " + v2.capacity());
	
	System.out.println("=================================");
	Vector<Integer> v3 = new Vector<Integer>();
	v3.add(2);
	v3.add(new Integer(333));
	v3.add(22);
	System.out.println("length        /      capacity ");
	System.out.println(v3.size() +"             /         " + v3.capacity());
	
 }

}
