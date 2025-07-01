import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(); 
        int m = sc.nextInt(); 
        if (y < 1900 || y > 9999 || m < 1 || m > 12) {
            System.out.println(0);
            return;
        }

        int d;
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                d = 29;
            } else {
                d = 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            d = 30;
        } else {
            d = 31;
        }
        System.out.println(d + " Days");
    }
}
