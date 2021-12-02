 
public class prime {
	
	public void primen(int n)
	{
	int temp=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
	{
			temp++;
	}
	}
		if(temp<1)
		{
			System.out.println("The given number is prime");
		}
		else
			System.out.println("The given number is not prime");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime p=new prime();
		p.primen(18);
	}

}
