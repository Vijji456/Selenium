package javaprograms;

public class AddingSeries {

	public static void main(String[] args) {
		int n=4;
		float c=0,d=0;
		float sum=0;
		System.out.printf("1");
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.printf("-1/%d",i);
				c=(float) (-1.0/i);
			}
				else {
					System.out.printf("+1/%d",i);
					d=(float) (1.0/i);
					
			}
		     sum=1+c+d;
		}
		System.out.println("\n");
		System.out.println("The Sum is :"+sum);
	}

}
