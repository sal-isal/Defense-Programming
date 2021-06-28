package Utils;

// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n){
        // Mereturn value sesuai argumen n
        if (n >= 0 && n <= 16) {
            int fac = 1;
            for (int i=n; i>0; i--)
                fac *= i;
            return fac;
        }else if(n >= 17){
            throw new IllegalArgumentException("Program only handle argument from 0 to 16");
        }else {
            throw new IllegalArgumentException("Negative number can't be procces");
        }
    }
}