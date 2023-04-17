package ecommerceapplication;

import java.util.Arrays;
import java.util.Scanner;


public class progrm {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,10,5,7,9,30};
		/*
		int temp;
		
			for (int i=0; i<a.length; i++) {
			
			for (int j=i+1; j<a.length; j++) {
				if (a[i]>a[j])
				{
				temp= a[i];
				a[i]= a[j];
				a[j]= temp;
				}
				
				
			}
			
		}
		System.out.println(a[a.length-1]);
		*/
		
		Arrays.sort(a);
		System.out.println(a[0]);
		
	}
	
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();


}
