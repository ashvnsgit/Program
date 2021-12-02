
public class onlynumber {
	
	public void numberprint(String Name)
	{
		String number=Name.replaceAll("[~(!-)0-9)]", "");
		System.out.println(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onlynumber nh=new onlynumber();
		nh.numberprint("he41512466^^%$#$@@#$%^&*%$##!@#%^%$##gdg218vdh");
	}

}
