package App;

// ****************************************************************
// Factorials.java
// Reads integers from the user and prints the factorial of each.
// Factorial can throw an IllegalArgumentException.
// Program only handle arguments from 0 to 16.
// ****************************************************************
import Utils.MathUtils;
import java.util.Scanner;
public class Factorials{
    public static void main(String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            // try and catch diletakan didalam while sebelum
            // melanjutkan loop
            try {
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            }catch (IllegalArgumentException ie) {
                // menampilkan pesan kesalahan sesuai argumen
                System.out.println(ie.getMessage());
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
            System.out.println();
        }
    }
}
