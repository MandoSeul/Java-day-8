package ex04.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
	public static void main(String[] args) {
//		StringTokenizer token = new StringTokenizer("김연아 박태환 강감찬 이순신 ");

		StringTokenizer token = new StringTokenizer("사과=5|초콜렛=3|샴페인=1","=|",true);
		// 구분자가 다중으로 있을 때 true를 넣어줌
		
		while(token.hasMoreTokens()){//다음요소가 있나?
		//	System.out.println(token.nextToken());
			String str = token.nextToken();
			
			if(str.equals("=")) System.out.println("\t");
			else if(str.equals("|")) System.out.println("\n");
			else System.out.println(str);
			 

		}
	}
}
