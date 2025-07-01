import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int dx = x - 3;
        int dy = y - 4;

        int dist = (int)Math.round(Math.sqrt(dx*dx + dy*dy));

        System.out.println(dist);
    }
}
