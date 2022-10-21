package Assignment3;

import java.util.*;
public class q3{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
		    
		    
		    if(s.charAt(i)>='a' && s.charAt(i)<='z'){
		        sb.append(s.charAt(i));
		    }
		    else if(sb.toString().charAt(sb.length()-1)>='a' && sb.toString().charAt(sb.length()-1)<='z' ){
		        sb.append(s.charAt(i));
		    }
		}
		System.out.print(sb.toString());
		
	}
}
