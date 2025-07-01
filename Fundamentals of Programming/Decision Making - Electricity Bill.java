import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        double amt = 0;

        if (u <= 200) {
            amt = u * 0.5;
        } else if (u <= 400) {
            amt = u * 0.65 + 100;
        } else if (u <= 600) {
            amt = u * 0.80 + 200;
        } else {
            amt = u * 1.25 + 425;
        }

        System.out.println("Rs." + (int)amt);
    }
}