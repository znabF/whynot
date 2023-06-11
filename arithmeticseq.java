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

    int real = numOfTerms + 1;
    int[] sequence = new int[real];
    sequence[0] = startNumber;
    for(int i = 1; i < sequence.length; i++){
        int part = i - 1;
        if(part == 0){
            sequence[i] = startNumber + cd;
        }
        sequence[i] = startNumber + cd * part;
    }
    
    System.out.print("Sequence: ");
    for(int i = 1; i < sequence.length; i++){
        System.out.print(sequence[i] +  " ");
    }
    System.out.println();
    
}
}
