First Middle Last

```
import java.util.Scanner; 

class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    String word = sc.next(); 

    int median = word.length() / 2; 
    int last = word.length() - 1; 
    
    System.out.println("word :: " + word); 
    System.out.println("first letter :: " + word.charAt(0)); 
    System.out.println("last letter :: " + word.charAt(last)); 
    System.out.println("middle letter :: " + word.charAt(median)); 
  }
}
```
