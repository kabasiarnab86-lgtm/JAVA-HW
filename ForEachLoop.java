import static java.lang.IO.println;
class ForEachLoop
{
	static void main ()
	{
		//Q21
		println("Q21.The Elements in the array:");
		int []a={1,2,3,4,5};
		for(int x:a)
		{
			println(x);
		}
		//Q22
		int []b={10,20,30,40,50};
		int sum=0;
		for(int x:b)
		{
			sum=sum+x;
		}
		println ("Q22.The sum of array elements:"+sum);
		//Q23
		println("Q23.The even numbers from array:");
		int []c={28,45,86,93,18};
		for(int x:c)
		{
			if(x%2==0)
				println(x);
		}
		//Q24
		int []d={29,48,95,82,39,94};
		int large=d[0];
		for(int x:d)
		{
			if(large<x)
				large=x;
		}
		println("Q24.The largest element is:"+large);
		//Q25
		int []e={23,58,39,81,36};
		int count =0;
		for(int x:e)
		{
			count++;
		}
		println("Q25.Count elements in array:"+count);
		//Q26
		println("Q26.The characters of a char array:");
		char []ch={'J','A','V','A'};
		for(char x:ch)
		{
			println(x);
		}
	}
}