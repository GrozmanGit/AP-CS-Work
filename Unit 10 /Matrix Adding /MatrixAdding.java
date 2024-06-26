Matrix Adding

```
public class MatrixAdding
{   
  //load in the matrix values
  private int[][] m =      
  {//0  1  2  3  4
    {1, 2, 3, 4, 5}, // 0
    {6, 7, 8, 9, 0}, // 1
    {6, 7, 1, 2, 5}, // 2
    {6, 7, 8, 9, 0}, // 3
    {5, 4, 3, 2, 1}  // 4
  };
	
  private int row;
  private int col;  

  public MatrixAdding()
  {
    row = 0;
	col = 0;
  }
    
  public MatrixAdding(int r, int c)
  {
    row = r; 
	col = c;
  }
  
  public int totalRelativePositions( int r, int c )
  {
	int total = m[r][c]; 

	int x_offset[] = {-1, 0, 1, -1, 1, -1, 0, 1}; 
	int y_offset[] = {-1, -1, -1, 0, 0, 1, 1, 1}; 

	for (int i = 0; i < 8; i++)
	{ 
	  int cx = r + x_offset[i];
	  int cy = c + y_offset[i];

	  if (((cx < 0) || (cx > 4)) || ((cy < 0) || (cy > 4)))
	  { continue; }  
      total += m[cx][cy]; 
	}		
    return total;
  }
	
  public void printMat()
  {
    for (int R = 0; R < m.length; R++)
    {
	  for (int C = 0; C < m[R].length; C++)
	  { System.out.print(m[R][C] + " "); }
	  System.out.println(""); 
	}
  } 
		    
  public String toString()
  {
    return "The sum of " + row + "," + col + " is " + sum(row, col);
  }
}
```
