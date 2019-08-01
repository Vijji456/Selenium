package stringPrograms;

import java.util.Scanner;

public class DeleteWordFromSentence {

	public static void main(String[] args) {
		String Sentence,Newsentence;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence");
		Sentence=s.nextLine();
		System.out.println("Enter the word to remove");
		String word=s.next();
		s.close();
		Newsentence=Sentence.replaceAll(word, "");
		System.out.println("This "+word+" is removed from the given sentence, now the new sentence is: "+Newsentence);
	}

}
