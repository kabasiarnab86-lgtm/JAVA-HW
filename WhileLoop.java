import static java.lang.IO.println;
class WhileLoop 
{
	static void main() 
	{
		//Q1
		println("Q1.The numbers from 1 to 10:");
		int i=1;
		while (i<=10)
		{
			println(i);
			i++;
		}
		//Q2
		println("Q2.The numbers from 10 to 1:");
		int j=10;
		while (j>=1)
		{
			println(j);
			j--;
		}	
		//Q3
		println("Q3.The even numbers from 1 to 20:");
		int k=1;
		while (k<=20)
		{
			if(k%2==0)
				println(k);
			k++;
		}
		//Q4
		println("Q4.The odd numbers from 1 to 20:");
		int m=1;
		while (m<=20)
		{
			if(m%2!=0)
				println(m);
			m++;
		}
		//Q5
		int n=1,sum=0;
		while (n<=10)
		{
			sum=sum+n;
			n++;
		}
		println ("Q5.The sum of first 10 natural numbers:"+sum);
		//Q6
		println("Q6.Multiplication table of 5:");
		int p=1;
		while (p<=10)
		{
			println("5X"+p+"="+(5*p));
			p++;
		}
		//Q7
		int num=Integer.parseInt(IO.readln("Enter a number:"));
		int count=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		println("Q7.The number of digits: "+count);
	}
}
			