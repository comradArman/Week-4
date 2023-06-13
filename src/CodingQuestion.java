import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static void halfList(List<String> words) {
		// Add your code below this line 
		 System.out.println("The old list is: " + words);
	    
	    ArrayList<String> newList = new ArrayList<String>();
			 newList.addAll(words);
			 
		     
		     System.out.println("The new list is: " + newList);
	    
	   
}
		// Add your code above this line 
	

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1, word2, word3, word4, word5;
		word1 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		word4 = in.nextLine();
		word5 = in.nextLine();
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		halfList(words);
		
	}
}
