package ex04.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
public static void main(String[] args) {
	StringTokenizer token = new StringTokenizer("안녕/친구들/나는/배고파","/");
	
	while(token.hasMoreTokens()){
		System.out.println(token.nextToken());
		}
	}
}
