import java.util.Scanner;

public class GeometricSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first term (a) of the geometric sequence:");
        double firstTerm = scanner.nextDouble();

        System.out.println("Enter the common ratio (r) of the geometric sequence:");
        double commonRatio = scanner.nextDouble();

        System.out.println("Enter the number of terms you want in the sequence:");
        int numTerms = scanner.nextInt();

        generateGeometricSequence(firstTerm, commonRatio, numTerms);
    }

    public static void generateGeometricSequence(double firstTerm, double commonRatio, int numTerms) {
      System.out.println("Geometric sequence:");

      double term = firstTerm;
      for (int i = 0; i < numTerms; i++) {
          System.out.print(term + " ");
          // if this is second iteration is multiples then sets the multiplied value equal to it so each iteration a termTrak will be printed.
          term *= commonRatio; 
      }
  }

    
}
