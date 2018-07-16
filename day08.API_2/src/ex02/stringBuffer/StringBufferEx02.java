package ex02.stringBuffer;

public class StringBufferEx02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");
		System.out.println(sb);
		
		sb.append("is pencil"); // ���ڿ� �߰� ( append �� ������ �ڿ� �߰� )
		System.out.println(sb);
		
		sb.insert(7, "my"); // ���ϴ� ��ġ�� ���ڿ� �߰�
		System.out.println(sb);
		
		sb.replace(7,9, "your"); // ���ڿ� ����(��ü)
		System.out.println(sb);
		
		System.out.println(sb.reverse()); // ����ϸ� ���Ŀ� �� �����.
		
		sb.setLength(5);// ���̸� ���ϴ� ��ŭ���� ����.
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}
