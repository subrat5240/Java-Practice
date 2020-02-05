
public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Subrat";
		String b="Rath";
		System.out.println("Before Swap"+" "+ a+ " "+ b);
		a=a+b;
		b=a.substring(0,a.length()- b.length());
		a=a.substring(b.length());
		System.out.println("After Swap"+" " + a+ " "+ b);
	}

}
