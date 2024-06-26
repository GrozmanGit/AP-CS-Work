Seating Chart

```
import java.util.List;
import java.util.ArrayList;

public class SeatingChart 
{
  private Student[][] seats;
	
  public SeatingChart( List<Student> studentList, int rows, int cols) 
  { 
    seats = new Student[rows][cols]; 
	int k = 0; 
		
	for (int C = 0; C < cols; C++)
	{
	  for (int R = 0; R < rows; R++)
	  {
	    if (k < studentList.size())
		{ seats[R][C] = studentList.get(k++); }
	  }
	}
  }  
    	
  public int removeAbsentStudents( int allowedAbsences )
  {
    int n_removed = 0;

    for (int R = 0; R < seats.length; R++)
	{
	  for (int C = 0; C < seats[R].length; C++)
	  {
		if ((seats[R][C] != null) && (seats[R][C].getAbsenceCount() > allowedAbsences))
		{
		  seats[R][C] = null; 
		  n_removed++; 
		 }
	   }
	 }
	return n_removed;
   }   
    	
   public String toString()
   {
     String ret = "";
     
	 for( Student[] row : seats )
     {
       for( Student it : row )
       {
    	 if( it == null )
		 { ret += String.format("%-9s", "null"); }
    	 else
		 { ret += it; }
    	}
    	ret += "\n";
     }
	 return ret;
   }
}
```
