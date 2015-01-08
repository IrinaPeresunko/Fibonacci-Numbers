public class FibonacciNumber {
	public static long fibonacci(int number)
	{
		long sum=0;
		int p,pp,count=1;
		if(number==1) return 0;
		if(number==2 || number==3) return 1;
		else{
			p=1;pp=0;
		while(count<number)
		{
			sum=p+pp;
			p=pp;
			pp=(int) sum;
			count++;
		}
		return sum;
		}
	}
	public static void main(String[] args) {
		long start=System.nanoTime();
		long result=fibonacci(45);
		long end=System.nanoTime();
		System.out.println("result="+result);
		long time=end-start;
		double seconds = (double)time/1000000000.0;
		System.out.println("time:"+seconds);
	}
}
