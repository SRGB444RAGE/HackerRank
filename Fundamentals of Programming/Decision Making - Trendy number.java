import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Invalid Number");
        } else {
            int mid = (n / 10) % 10;
            if (mid % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not a Trendy Number");
            }
        }
    }
}
