import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int row = (n - 1) / 3;
        int col = (n - 1) % 3;

        System.out.println(row + " " + col);
    }
}