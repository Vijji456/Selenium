package differentPatterns;

public class FourthPattern {

	public static void main(String[] args) {
		int i,j,k=1,n=1;
		for(i=0;i<5;i++)
		{
			for(j=0;j<k;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			k=k+2;
			System.out.println();
		}
	}

}
