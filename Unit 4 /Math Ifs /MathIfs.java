Math Ifs

```
public class MathIfs
{
   public int doMath(int a, int b)
   {
     if (a > b) 
     { return a - b; }
     else if (b > a)
     { return b + a; }
     else if (a == b)
     { return a * b;  }
     else if (a == 0)
     { return b * 2;  }
     else if (b == 0)
     { return a * 2;  }
     else
     { return 0; }
   }
}
```
