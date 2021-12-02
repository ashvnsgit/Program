
public class swapnumber {

	
	
	
	public void swap(int a,int b)
	{
		System.out.println("number before swap a "+a);
		System.out.println("number before swap b "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("number after swap a "+a);
		System.out.println("number after swap b "+b);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	swapnumber swapiing=new swapnumber();
	swapiing.swap(12, 14);

	}

}
