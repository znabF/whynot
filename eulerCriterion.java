import java.util.*;
public class eulerCriterion {
    public static void main(String[] args) {
        // check if a squared version of number (x*x) is equal to n when getting modulus over 5
        System.out.println("What to compute: x*x%p = n\nFind x. Only certain combinations will work. \n If combination does not work it is false.\n");
        Scanner sc = new Scanner(System.in);

        // saving lines of code by applying the scanner on an integer variable while using parseInt() to avoid type errors
        System.out.println("Enter p as a prime number: ");
        int p = Integer.parseInt(sc.nextLine());
       
        System.out.println("Enter n:");
        int n = Integer.parseInt(sc.nextLine());
        sc.close();

        // have to iterate p times since doing modulus over p, if number > p that will give wrong answer
        int x = 0;
        int i = 1;
        for(i = 1; i < p+1; i++){
            if((i*i) % 5 == n){
                x = i;
                System.out.println("\nx is " + x);
                System.out.println("True");
            }
        }
        if(i > p){
            System.out.println("False");
        }   
        System.out.println("\n(" + x + " * " + x + ")" + " % " + p + " = " + n);
        
    }

    
}

