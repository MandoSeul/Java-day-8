package ex02.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
	
		StringBuffer strbuf = new StringBuffer(); // 초기용량 16
		
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
	
		strbuf.trimToSize(); // 메모리 공간 사이즈 맞게 재조정
		leng = strbuf.length();
		size = strbuf.capacity();
		
		System.out.println(leng+ "            //             "+size);
	
	}
}
