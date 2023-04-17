package com.EndtoEndTest;


public class sampleTest {
	public static void main(String[] args) {
		/*
		int k=1;
		for (int i=0; i<4; i++) {
			for (int j=1; j<=4-i; j++) {
				 
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");	
		}
		
		
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) {
				 
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println("");	
		}
		
		
		
		int a[] = {2,5,7,10,25,50,40};
		
		int temp ;
		
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(a[a.length-1]);
		
		
		
		int a[] = {2,5,7,10,25,50,40};
	int	max=a[0];
	
	for (int i=0; i<a.length; i++) {
		if (a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
	

		int a[] = {2,5,7,10,1,25,50,40};
		int	min=a[0];
		for (int b:a) {
			if(b<min) {
				min=b;
			}
		}
		System.out.println(min);
		
		
		int a=10, b=50;
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+ a);
		System.out.println("b="+ b);
			
		
		String name="thejaswini";
		String rev= "";
		
		for (int i=name.length()-1; i>=0; i--) {
			rev=rev+ name.charAt(i);
			
		}
		System.out.println(rev);
		
		*/
		
		String name = "Hello Thejaswini How are You";
		String[] revword = name.split(" ");
		
		for (int i=revword.length-1; i>=0; i--) {
			System.out.print(revword[i]+ " ");
		}
   }
}
