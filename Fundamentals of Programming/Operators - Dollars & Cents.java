import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d2 = sc.nextInt();
        int c2 = sc.nextInt();

        int d = d1 + d2;
        int c = c1 + c2;

        if (c >= 100) {
            d += c / 100;
            c = c % 100;
        }

        System.out.println(d);
        System.out.println(c);
    }
}
