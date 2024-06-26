Math Fun House

```
import java.util.Scanner; 
import java.util.*; 

class Main 
{
  public static void main(String[] args) 
  {
    Scanner key = new Scanner(System.in);

    String name; 
    
    // Part-0: set-up
    System.out.print("\nEnter your name:: ");
    name = key.nextLine();
    System.out.println("Welcome " + name);
    
    // Part-1: slope of line
    System.out.print("\nEnter the x1, x2, y1, y2 coordinates: ");
    
    int x1 = key.nextInt(); 
    int x2 = key.nextInt(); 
    int y1 = key.nextInt(); 
    int y2 = key.nextInt();
    
    int m = (y2 - y1) / (x2 - x1); 
    System.out.println("The slope of the line is: " + (double)m);

    // Part-2: permieter of a rectangle
    Random rand = new Random();
    int width = 1 + rand.nextInt(10); // [0, 9] -> [1, 10]
    int length = 5 + rand.nextInt(16); // [0, 15] -> [5, 20]
    
    System.out.println("\nThe random numbers generated are: " + "[width] " + width + " and " + "[length] " + length);
    System.out.println("The perimeter of the rectangle is: " + ((width*2) + (length*2)));  
    
    // Part-3: area of a trapezoid
    System.out.print("\nEnter the first base, second base and height: "); 
    
    int base01 = key.nextInt(); 
    int base02 = key.nextInt();
    int height = key.nextInt(); 
    
    double area = (double)(((base01 + base02) * height) / 2);
    System.out.println("The area of the trapezoid is: " + area);
    
    // Part-4: vol of a cone
    System.out.print("\nEnter the radius and height: "); 

    int radius = key.nextInt(); 
    height = key.nextInt();
    
    double vol = (double)((Math.PI * (Math.pow(radius, 2)) * height) / 3); 
    System.out.println("The vol of the cone is: " + vol);
    
    // Part-5: surface area of a cube
    System.out.print("\nEnter the height: "); 
    
    height = key.nextInt(); 
    
    double surface = (double)(6 * (Math.pow(height, 2))); 
    System.out.println("The surface area of the cube is: " + surface);
    
    // BONUS: hypotenuse
    System.out.print("\nEnter side A and side B: "); 
    
    int sideA = key.nextInt(); 
    int sideB = key.nextInt(); 
    
    double hypotenuse = (double)(Math.sqrt(((Math.pow(sideA, 2)) + (Math.pow(sideB, 2))))); 
    System.out.println("The hypotenuse of the triangle is: " + hypotenuse);  
  }
}
```
