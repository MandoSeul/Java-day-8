package ex04.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
	public static void main(String[] args) {
//		StringTokenizer token = new StringTokenizer("�迬�� ����ȯ ������ �̼��� ");

		StringTokenizer token = new StringTokenizer("���=5|���ݷ�=3|������=1","=|",true);
		// �����ڰ� �������� ���� �� true�� �־���
		
		while(token.hasMoreTokens()){//������Ұ� �ֳ�?
		//	System.out.println(token.nextToken());
			String str = token.nextToken();
			
			if(str.equals("=")) System.out.println("\t");
			else if(str.equals("|")) System.out.println("\n");
			else System.out.println(str);
			 

		}
	}
}
