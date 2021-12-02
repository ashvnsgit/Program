
public class ResvdersAsString {
	
	
	public void reverse(String name)
	{
		String rev="";
		for(int i=0;i<name.length();i++)
		{
			rev=name.charAt(i)+rev;
		}
	
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResvdersAsString r=new ResvdersAsString();
		r.reverse("Ashish");

	}

}
