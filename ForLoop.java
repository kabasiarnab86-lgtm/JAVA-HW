import static java.lang.IO.println;
class ForLoop
{
	static void main () 
	{
		//Q14
		println("Q14.The numbers from 1 to 10:");
		for (int i=1;i<=10;i++)
		{
			println(i);
		}
		//Q15
		println("Q15.The numbers from 10 to 1:");
		for (int i=10;i>=1;i--)
		{
			println(i);
		}
		//Q16
		println("Q16.Squares of numbers from 1 to 5:");
		for (int i=1;i<=5;i++)
		{
			println(i*i);
		}
		//Q17
		println("Q17.The multiplication table of 7:");
		for(int i=1;i<=10;i++)
		{
			println("7X"+i+"="+(7*i));
		}
		//Q18
		int num=Integer.parseInt(IO.readln("Enter a number to do factorial:"));
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		println("Q18.Factorial of the number "+num+"="+fact);
		//Q19
		println("Q19.The first 10 multiples of 3:");
		for(int i=1;i<=10;i++)
		{
			println(3*i);
		}
		//Q20
	    int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
				sum=sum+i;
		}
		println("Q20.The Sum of even numbers from 1 to 20:"+sum);
		
	}
}