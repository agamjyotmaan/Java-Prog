package java1.string;

import java.util.Scanner;

public class strProj {
public static StringBuffer upperStr(StringBuffer str) {
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(Character.isLowerCase(c)) {
				str.setCharAt(i, Character.toUpperCase(c));
			}
		}
		
		return str;
	}
	
	public static StringBuffer lowerStr(StringBuffer str) {
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(Character.isUpperCase(c)) {
				str.setCharAt(i, Character.toLowerCase(c));
			}
		}
		
		return str;
	}
	
	public static StringBuffer revStr(StringBuffer str) {
		StringBuffer temp=new StringBuffer(str.substring(0,str.length()));
		str=temp.reverse();
		return str;
	}
	
	
	public static  StringBuffer revStrWord (StringBuffer str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				continue;
			}
			int start=i;
			int end=i;
			for(;str.charAt(i) != ' ' && i != str.length()-1;i++,end++);
			if(end==str.length()-1)
				end=end+1;
			StringBuffer temp=new StringBuffer(str.substring(start,end));
			str.append(temp);
		}
		return str;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		StringBuffer str=new StringBuffer();
		String line = sc.nextLine();
		str.append(line);
		
		int n;
		
		do{
			System.out.println("\nSTRING-> "+str);
			System.out.println("MENU->");
			System.out.println("1.UPPER CASE");
			System.out.println("2.LOWER CASE");
			System.out.println("3.REVERSE");
			System.out.println("4.WORD WISE REVERSE");
			System.out.println("5.EXIT");
			System.out.println("Enter ur choice: ");
			n=sc.nextInt();
			switch(n){
				case 1: str=upperStr(str);
						break;
					
				case 2: str=lowerStr(str);
						break;
					
				case 3: str=revStr(str);
						break;
				
				case 4: str=revStrWord(str);
						break;
			}
		}while(n!=5);
		sc.close();
	}
}
