package ex04.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
public static void main(String[] args) {
	StringTokenizer token = new StringTokenizer("�ȳ�/ģ����/����/�����","/");
	
	while(token.hasMoreTokens()){
		System.out.println(token.nextToken());
		}
	}
}
