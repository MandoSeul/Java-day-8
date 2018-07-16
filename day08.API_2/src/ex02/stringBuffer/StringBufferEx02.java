package ex02.stringBuffer;

public class StringBufferEx02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");
		System.out.println(sb);
		
		sb.append("is pencil"); // 문자열 추가 ( append 는 무조건 뒤에 추가 )
		System.out.println(sb);
		
		sb.insert(7, "my"); // 원하는 위치에 문자열 추가
		System.out.println(sb);
		
		sb.replace(7,9, "your"); // 문자열 변경(교체)
		System.out.println(sb);
		
		System.out.println(sb.reverse()); // 사용하면 이후에 다 적용됨.
		
		sb.setLength(5);// 길이를 원하는 만큼으로 만듬.
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}
