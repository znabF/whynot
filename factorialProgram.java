import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to compute the factorial of:");
  // capturing what the user types
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    sc.close();
    
    int number = Integer.parseInt(input);
    
    int factorial = number;
    int i = number;
    while(i != 0){
      int lessThan = i - 1;
      if(lessThan == 0){
        break;
      }
      factorial = factorial * lessThan;
      i--;
    }
      
    System.out.println(factorial);
  
    
  }
}
