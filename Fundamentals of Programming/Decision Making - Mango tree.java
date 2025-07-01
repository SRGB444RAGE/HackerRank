import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); 
        int c = sc.nextInt(); 
        int t = sc.nextInt(); 

        if (t >= 1 && t <= c) {
            System.out.println("Yes");
        }
        else if ((t - 1) % c == 0) {
            System.out.println("Yes");
        }
        else if (t % c == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
