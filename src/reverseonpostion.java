
public class reverseonpostion {
	
	public static void stringPo(String Words)
	{
		String Reverse="";
		String Word[]=Words.split(" ");
		
		for(int i=0;i<Word.length;i++)
		{
            String W=Word[i];
            String rev="";
            for(int j=0;j<W.length();j++)
            {
            	//rev=W.charAt(j)+rev;
            	rev=rev+W.charAt(j);
            }
            Reverse=rev+" "+Reverse;
	}
		System.out.println(Reverse);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringPo("The Name of Boy");
	}

}
