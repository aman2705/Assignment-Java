package Assignment3;

import java.util.*;
public class q1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		if(s.equals(t)){
		    System.out.println("RED");
		    return;
		}
		else {
            int space=0;
            int space1=0;
            StringBuilder sb=new StringBuilder();
            StringBuilder sb1=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    space++;
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
            for(int i=0;i<t.length();i++){
                if(t.charAt(i)==' '){
                    space1++;
                }
                else{
                    sb1.append(t.charAt(i));
                }
            }
            if(space!=space1 && sb.toString().equals(sb1.toString())){
                System.out.print("YELLOW");
                return;
            }
            else if(s.equalsIgnoreCase(t)){
                System.out.print("BLUE");
                return;
            }
            else{
                System.out.print("GREEN");
                return;
            }
		   
		}
	}
}