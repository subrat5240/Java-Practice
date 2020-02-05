
public class constructorOL {
	
	int id;
	String name;
	int age;
	constructorOL(int i,String n){
		id=i;
		name=n;
	}
	constructorOL(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	
	public void display()
	{
		System.out.println(id+ " " + name + " " + age );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorOL pc=new constructorOL(101,"Subrat",30);
		constructorOL pc1=new constructorOL(102,"Subrat Rath",30);
		pc.display();
		pc1.display();
	}

}
