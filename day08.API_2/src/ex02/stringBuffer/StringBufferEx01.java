package ex02.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
	
		StringBuffer strbuf = new StringBuffer(); // �ʱ�뷮 16
		
		System.out.println("length         //        capacity");
		System.out.println(strbuf.hashCode());
		int leng = strbuf.length();
		int size = strbuf.capacity();
		
		System.out.println(leng+ "            //             "+size);
	
		strbuf.append("kostra");
		leng = strbuf.length();
		size = strbuf.capacity();
		
		System.out.println(leng+ "            //             "+size);
	
		strbuf.append("himynameisseul");
		System.out.println(strbuf.hashCode());
		leng = strbuf.length();
		size = strbuf.capacity();
		
		System.out.println(leng+ "            //             "+size);
	
		strbuf.trimToSize(); // �޸� ���� ������ �°� ������
		leng = strbuf.length();
		size = strbuf.capacity();
		
		System.out.println(leng+ "            //             "+size);
	
	}
}
