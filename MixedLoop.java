import static java.lang.IO.println;
class MixedLoop
{
	static void main ()
	{
		//Q27
		println("Q27.The numbers divisible by 5 (1–50):");
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
				println(i);
		}
		//Q28
		println("The Fibonacci series (first 5 terms):");
		int a = 0, b = 1;
		for (int i = 1; i <= 5; i++) {
			println(a);
			int c = a + b;
			a = b;
			b = c;
		}
		//Q30
		println("Stars using for loop:");
		for (int i=1;i<=5;i++)
		{
			println("*");
		}
		
	}
}