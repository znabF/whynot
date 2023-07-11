import java.util.*;
class Mean {
  public static void main(String[] args) {
    System.out.println("Computes mean and median of unsorted array");
    // ArrayList<Integer> list = new ArrayList<Integer>();
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers in array?");
    int how_many = Integer.parseInt(sc.nextLine());
    while(i < how_many){
       System.out.println("Enter number of array");
       String input = sc.nextLine();
       i++;
    }
    sc.close();
    // for(int j = 0; j < list.length; j++){
    //     int sum = list[j] + list[j + 1];
    // }
  }
    
}