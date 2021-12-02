
public class palindrome {
	int rev=0;
	int rem=0;
	int temp;
	
	public void number(int n)
	{
		System.out.println("The Input number is " +n);
		temp=n;
		while(n!=0) {
		
		rem=n%10;
		n=n/10;
		rev=(rev*10)+rem;
		}
		
		System.out.println("The Output number is "  +rev);
		
		
			if(rev==temp)
			{
				System.out.println("And the number is palindrome");
			}
			else
				System.out.println("And the number is not  palindrome");
				
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to Verify palindrome or not?
		palindrome nt=new palindrome();
		nt.number(12432221);
		

	}

}
