package javaprograms;

public class Fibo {

	public static void main(String[] args) {
		int n=9,first_term=0,second_term=1,next_term;
		for(int i=0;i<=n;i++) {
			if(i<=1) {
				next_term=i;
			}
			else {
				next_term=first_term+second_term;
				first_term=second_term;
				second_term=next_term;
			}
			
			System.out.print(next_term+" ");
		}
		
	}

}
