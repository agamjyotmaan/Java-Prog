package Java.Ques;

import java.util.*;

public class InfixToPostfix {
	
	public static int priorityOpp (Character ch) {
	    switch(ch){
	        case '*':
	        case '/':
	        case '%': return 2;
	        case '+':
	        case '-': return 1;
	    }
	    return 0;
	}
	
	public static int isOpp(Character ch) {
		switch(ch){
	        case '*':
	        case '/':
	        case '%':
	        case '+':
	        case '-': return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the infix expression: ");
		
		StringBuilder in=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		String line = sc.nextLine();
		in.append(line);
		
		StringBuilder post=new StringBuilder();
		
		Stack<Character> stk = new Stack<Character>();
		
		for( int i=0 ; i<in.length() ; i++ ) {
			
			Character ch=in.charAt(i);
			
			if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')) {
				post.append(ch);
			}
			
			if(ch=='(') {
				stk.push(ch);
			}
			
			if(ch==')') {
				while(!stk.isEmpty() && stk.peek()!='(') {
					post.append(stk.pop());
				}
				stk.pop();
			}
			
			if(isOpp(ch)==1) {
				while( !stk.isEmpty() && stk.peek()!='(' 
						&& priorityOpp(ch) <= priorityOpp(stk.peek()) ){
					post.append(stk.pop());
				}
				stk.push(ch);
			}
		}
		
		while(!stk.empty()) {
			post.append(stk.pop());
		}
		
		System.out.println(post);
		sc.close();
	}
}