Main

```
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
   public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);
      
  	String name = "";
    int age = 0;
		
		for(int i=0; i<size;i++)
		{
          System.out.print("Enter the age :: ");
		  age = keyboard.nextInt(); 
			System.out.print("Enter the name :: ");
		  name = keyboard.next();
			
			pack.set(i, age, name); 
		}		
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());	            	
	}		
}
```
