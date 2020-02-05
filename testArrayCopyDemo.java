
public class testArrayCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arraycopyfrom[]={'s','u','b','r','a','t'};
		char copyTo[] = new char[4];
		System.arraycopy(arraycopyfrom, 1, copyTo, 0, 4);
		System.out.println(copyTo);
	}

}
