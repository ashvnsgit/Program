
public class factorial {

	int fcat=1;
	public void factorialnumber(int n)
	{
		for(int i=1;i<=n;i++)
		{
			fcat=fcat*i;
			
		}
		
		System.out.println("factorial of the given number is " +fcat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial gb=new factorial();
		gb.factorialnumber(5);

	}

}
