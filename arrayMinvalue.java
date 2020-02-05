
public class arrayMinvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{3,4,5},{4,8,1},{7,4,9}};
		int min =a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					System.out.print(min);
				}
				
			}
		
		
	}
	}

}
