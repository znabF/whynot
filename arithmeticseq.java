import java.util.*;
class Arithmetic{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting number of sequence: ");
    String start = sc.nextLine();
    System.out.println("Enter the # of terms: ");
    String terms = sc.nextLine();
    System.out.println("Enter common difference: ");
    String difference = sc.nextLine();
    
    sc.close();

    int startNumber = Integer.parseInt(start);
    int numOfTerms = Integer.parseInt(terms);
    int cd = Integer.parseInt(difference);
    int[] sequence = new int[numOfTerms];
    sequence[0] = startNumber;
    for(int i = 1; i < numOfTerms + 1; i++){
        sequence[i] = startNumber + cd;
    }
    
    for(int i = 0; i < sequence.length; i++){
        System.out.println(sequence[i]);
    }
    
}
}
