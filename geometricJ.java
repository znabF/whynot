import java.util.*; 
import java.lang.*;
class Geo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter start: ");
    String start = sc.nextLine();
    System.out.println("Enter # of terms: ");
    String terms = sc.nextLine();
    System.out.println("Enter common ratio: ");
    String common = sc.nextLine();
    sc.close();

    // integer conversions
    int startNumber = Integer.parseInt(start);
    int numOfTerms = Integer.parseInt(terms);
    int common_ratio = Integer.parseInt(common);

    int length = numOfTerms + 1;

    int[] geo_seq = new int[length];

    geo_seq[0] = startNumber;

    for(int i = 0; i < length; i++){
      int prev_index = i - 1;

      if(prev_index == 0){
        geo_seq[i] = startNumber * common_ratio;
      }
      geo_seq[i] = startNumber * Math.pow(common_ratio, i);
    }

    System.out.println("Geometric Sequence: ");
    for(int j = 0; j < length; j++){
      System.out.print(geo_seq[j] + " ");
    }

  }
}