# class25-11
## kata task1
[Task link](https://www.codewars.com/kata/54c27a33fb7da0db0100040e)

My solution
```java
public class Square {
    public static boolean isSquare(int n) {
        for (int i = 0; i <= (int) (Math.sqrt(n)); i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false; // fix me!
    }
}
```

My fav solution 
```java
import static java.lang.Math.*;
public class Square {    
    public static boolean isSquare(int n) {      
        return Math.sqrt(n) % 1 == 0;
    }
}
```

## kata task2
[Task link](https://www.codewars.com/kata/5951d30ce99cf2467e000013)

My solution
```java
import java.util.Arrays;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple) {
        if (((triple[0] * triple[0] + triple[1] * triple[1]) == (triple[2] * triple[2])) ||
                ((triple[1] * triple[1] + triple[2] * triple[2]) == (triple[0] * triple[0])) ||
                ((triple[2] * triple[2] + triple[1] * triple[1]) == (triple[0] * triple[0]))) {
            return 1;
        }
        return 0;
    }
```

My fav solution
```java
public class PythagoreanTriple {
		public int pythagoreanTriple(int[] triple){
        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
    }
}
```
