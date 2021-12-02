
public class numberreverse {

	
	public void number(int n)
	{
		int temp;
		int rem,rev=0;
		temp=n;
	
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10) +rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("The number is palindrone");
		}
		else
		{
			System.out.println("The number is not palindrone");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberreverse re=new numberreverse();
		re.number(76543);

	}

}
