Dog

```
public class Dog 
{
    private int age;
    private String name;
    
    public Dog(int a, String n) 
    {
    	age = a;
    	name = n;
    } 
    	 
    public String getName()
    {
    	return name;
    }
    
    public int getAge()
    {
    	return age;
    }
    
    public void setName(String n)
    {
    	name = n;
    }
    
    public void setAge(int n)
    {
    	age =n;
    }
    	    	
    public String toString()
    {
    	return "" + age + " " + name;
    }  
}
```
