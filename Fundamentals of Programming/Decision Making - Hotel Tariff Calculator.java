import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int rent = sc.nextInt();
        int d = sc.nextInt(); 

        if (m < 1 || m > 12) {
            System.out.println("Invalid Input");
            return;
        }
        if ((m >= 4 && m <= 6) || (m == 11 || m == 12)) {
            rent += rent * 0.20; 
        }
        int amt = rent * d;
        System.out.println(amt);
    }
}
