package Loops;

public class ForLoop {

	public static void main(String[] args) {
		
		//I want to print "Windows" five times
		
		String name = "Windows11";
		
		for (int OS=1; OS<=5; OS++)            //for(initialization; condition; updation)
		{
			System.out.println(name);
		}
		
		
		//I want to print 10 to 20 numbers
		
		for (int n=10; n<=20; n++)
		{
			System.out.println(n);
		}
		
		
		//I want to print table of 7
		
		for (int t=7; t<=70; t=t+7)
		{
			System.out.println(t);
		}
		
		
		//I want to print reverse table of 5
		for (int tb=50; tb>=5; tb=tb-5)
		{
			System.out.println(tb);
		}

	}

}
