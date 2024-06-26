Main

```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		Words test = new Words("one two three four five six seven alligator");
		System.out.println(test);
		System.out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		System.out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		System.out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		System.out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		System.out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		System.out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		System.out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		System.out.println("\nafter removing words with 3 chars \n" + test);
		System.out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		System.out.println("\n\n");
	
		test = new Words("fun fly four six times ten plus eight");
		System.out.println(test);
		System.out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		System.out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		System.out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		System.out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		System.out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		System.out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		System.out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		vowelsRemoved = test.removeWordsWithXChars(3);
		System.out.println("\nafter removing words with 3 chars \n" + test);
		System.out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		System.out.println("\n\n");

		test = new Words("alligator chicken dog cat pig buffalo");
		System.out.println(test);
		System.out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		System.out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		System.out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		System.out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		System.out.println("word with 3 chars = "+test.countWordsWithXChars(3));
		System.out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		System.out.println("word with 9 chars = "+test.countWordsWithXChars(9)); 
		vowelsRemoved = test.removeWordsWithXChars(3);
		System.out.println("\nafter removing words with 3 chars \n" + test);
		System.out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
	}
}

/*public class Main
{
	public static void main(String[] args)
	{*/
      /*Look at the instructions (Word document) to see what the expected output should look like and make it happen.*/
      /*HINT: You only need to make ONE object*/
      /*Word w = new Word("chicken");
			System.out.println(w); 
			System.out.println("# vowels == " + w.getNumVowels()); 
			System.out.println("# chars == " + w.getLength() + "\n"); 

			w = new Word("alligator");
			System.out.println(w);
			System.out.println("# vowels == " + w.getNumVowels()); 
			System.out.println("# chars == " + w.getLength() + "\n"); 
  	
			w = new Word("elephant");
			System.out.println(w);
			System.out.println("# vowels == " + w.getNumVowels()); 
			System.out.println("# chars == " + w.getLength() + "\n"); 
	}
}*/
```
