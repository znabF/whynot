import java.util.*;
public class modDivision {
    public static void main(String[] args){
        System.out.println("This is a modular division algorithm. The idea is b * c % m = a % m.");
        System.out.println("The point is to use the modulo operator to divide when modular inverse of divisor exists and have them equal to each other");
        System.out.println("That is what will be computed.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        String A = sc.nextLine();

        System.out.println("Enter value of B: ");
        String B = sc.nextLine();

        System.out.println("Enter value of M: ");
        String M = sc.nextLine();

        sc.close();

        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int m = Integer.parseInt(M);
        // int modCheck = (a/b) % m;
        int modCheck = a % m;
        // consider the clock analogy from Khan Academy modular arithmetic when we go around the clock m times (% m)
        // for loop replicates clock analogy
        // we can only go around the clock m times to find the right inverse 
        int i = 0;
        int inverse = 0;
        for(i = 0; i < m; i++){
            if((i * b) % m == modCheck){
                inverse = i;
                System.out.println("\nThe inverse that multiplies with b: "+inverse);
                break;

            }
        }
        if(i > m){
            System.out.println("Division incorrectly defined. Numbers do not match each other");
        }
        System.out.println("\n" + inverse + " * " + b + " % " + m +  " = " + a + " % " + m);
        
    }
}
