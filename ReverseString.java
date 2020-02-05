
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MADAM";
		String t="";
		for(int i=s.length()-1; i>=0;i--)
		{
			t=t+ s.charAt(i);
		}
		
		System.out.println(t);
		if(t.equals(s))
		{
			System.out.println("It is a Palindrum");
		}
		else
			System.out.println("Not a Palindrum");
		
	}

}
