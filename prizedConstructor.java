
public class prizedConstructor {
	
	int id;
	String name;
	prizedConstructor(int i,String n){
		id=i;
		name=n;
	}
	public void display()
	{
		System.out.println(id+ " " + name );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prizedConstructor pc=new prizedConstructor(101,"Subrat");
		prizedConstructor pc1=new prizedConstructor(102,"Subrat Rath");
		pc.display();
		pc1.display();
	}

}
