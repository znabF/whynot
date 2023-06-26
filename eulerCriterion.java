import java.util.*;
public class eulerCriterion {
    public static boolean main(String[] args) {
        // check if a squared version of number (x*x) is equal to n when getting modulus over 5
        System.out.println("What to compute: x*x%5 = n\nFind x.");
        Scanner sc = new Scanner(System.in);

        // saving lines of code by applying the scanner on an integer variable while using parseInt() to avoid type errors
        System.out.println("Enter p as a prime number: ");
        int p = Integer.parseInt(sc.nextLine());
       
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
    }

    
}

