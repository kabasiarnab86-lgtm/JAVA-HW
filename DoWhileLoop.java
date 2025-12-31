import static java.lang.IO.println;
class DoWhileLoop
{
	static void main ()
	{
		//Q8
		println("Q8.The numbers from 1 to 5:");
		int i=1;
		do 
		{
			println(i);
			i++;
		}while(i<=5);
		//Q9
		println("Q9.The numbers from 5 to 1:");
		int j=5;
		do
		{
			println(j);
			j--;
		}while(j>=1);
		//Q10
		println("Q10.The even numbers from 1 to 10:");
		int k=1;
		do
		{
			if(k%2==0)
				println(k);
			k++;
		}while(k<=10);
		//Q11
		int num=Integer.parseInt(IO.readln("Enter a number:"));
		int count=0;
		do
		{
			count ++;
			num=num/10;
		}while(num>0);
		println("Q11.The number of digits:"+count);
		//Q12
		int n=Integer.parseInt(IO.readln("Enter a number to reverse:"));
		int rev=0;
		do
		{
			int ld=n%10;
			rev=(rev*10)+ld;
			n=n/10;
		}while(n>0);
		println("Q12.The reverse number is:"+rev);
		//Q13
		println("Q13.Print message at least once:");
		int m=10;
		do
		{
			println("Hello JAVA");
		}while(m<5);
	}
}