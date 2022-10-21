package Assignment3;

import java.util.*;
public class q2
{
	public static void main(String[] args) {
	        
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   ArrayList<String[]> al=new ArrayList<>();
	   for(int i=0;i<n;i++){
	       String s=sc.nextLine();
	       String arr[]=s.split(",");
	       al.add(arr);
	   }
	   
	   for(int i=0;i<al.size();i++){
	       String arr[]=al.get(i);
	       for(int j=0;j<arr.length;j++){
	            System.out.print(arr[j]+" ");
	       }
	       System.out.println();
	   }
	}
}
