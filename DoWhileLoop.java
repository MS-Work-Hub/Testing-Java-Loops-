package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//I want to print 20-30 numbers
		
		int i=90;
		
		do 
		{
			System.out.println(i);
			i++;
		}
		while (i<=100);
		
		
		
		//I want to print 1-30 only even numbers (Descending order)
		
		int n=30;
		
		do
		{
			System.out.println(n);
			n=n-2;
		}
		while (n>=2);
		
		
		//I want to print 1-30 only even numbers (Ascending order)
		
		int j=2;
		do {
			System.out.println(j);
			j=j+2;
		}
		while (j<=30);
	}
	
	
	

}
