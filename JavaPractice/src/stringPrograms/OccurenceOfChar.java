package stringPrograms;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String str="beginersbook";
		char[] c=str.toCharArray();
		int i,j,counter=0; 
		int len=str.length();
		for(i=0;i<len;i++) {
			counter=0;
			for(j=0;j<len;++j) {
				
				if(j<i&&c[i]==c[j]) {
					break;
				}
					if(c[j]==c[i]) {
						counter++;
					}
					if(j==len-1) {
						System.out.println("the occurence of character "+c[i]+" is "+counter+" in given string");
					}
				
			}
		}
				
	
	}

}
