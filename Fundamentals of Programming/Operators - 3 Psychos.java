import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double mx = (x1 + x2) / 2.0;
        double my = (y1 + y2) / 2.0;

        System.out.printf("Arun's house is located at(%.1f,%.1f)", mx, my);
    }
}