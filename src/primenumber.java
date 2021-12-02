
public class primenumber {
	
	public void prime(int n)
	
	{
		int temp=0;
		if(n==0)
		{
			System.out.println("0 not is prime number");
		}
		else if(n==1)
		{
			System.out.println("1 is prime number");
		}
		else 
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(n+ " is not a prime number");
		}
		else
			System.out.println(n+ " is  a prime number");
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primenumber p=new primenumber();
		p.prime(98);
		
	}

}
