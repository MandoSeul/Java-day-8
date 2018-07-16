package ex01_collection;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name; int age;


	public Person(String string) {
		name = string;
	}


	public Person(String string, int i) {
		name = string; age =i;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}


	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){ // 부모로부터 상속되서 이용할 수 있는지
			Person temp = (Person)obj;
			return name.equals(temp.name)&&age==temp.age;
		}
		return false;
	}
	
	
}
public class HashSetEx3 {
	public static void main(String[] args) {
		Set set = new HashSet();
		Person ps = new Person("aaa",55);
		set.add(ps);
		set.add(new String("happy"));
		set.add(new String("virus"));
		set.add(new Person("seul"));
		set.add(new Person("seul"));
		
		System.out.println(set);
	}
}
