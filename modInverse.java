import java.util.*;

class Mod {
    public static void main(String[] args) {
        System.out.println("Reference: A*X % M \nalgorithm computes for x. \nsuch that x should be 1 to complete modular multiplicative inverse");
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        String A = sc.nextLine();

        System.out.println("M: ");
        String M = sc.nextLine();
        sc.close();

        int a = Integer.parseInt(A);
        int m = Integer.parseInt(M);

        for(int i = 0; i < m; i++){
            if((a * i) % m == 1){
                System.out.println("X: " + i);
                break;
            }
        }


    }

}