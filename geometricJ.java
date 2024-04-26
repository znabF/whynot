import java.util.*;

class Geo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the first term (a) of the geometric sequence:");
      double firstTerm = scanner.nextDouble();

      System.out.println("Enter the common ratio (r) of the geometric sequence:");
      double commonRatio = scanner.nextDouble();

      System.out.println("Enter the number of terms you want in the sequence:");
      int numTerms = scanner.nextInt();

        double[] geoSeq = new double[length];

        // geoSeq[0] = startNumber;
        // updating this variable each iteration
        double termTrak = startNumber;
        for (int i = 1; i < length; i++) {
            System.out.print(termTrak + " ");
            // if this is second iteration is multiples then sets the multiplied value equal to it so each iteration a termTrak will be printed.
            term *= commonRatio; 
        }
    }
}
