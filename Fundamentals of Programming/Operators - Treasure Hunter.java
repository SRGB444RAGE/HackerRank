import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tot = sc.nextInt();  
        int benP = sc.nextInt(); 
        int bbP = sc.nextInt();  
        int ben = (tot * benP) / 100;
        int rem1 = tot - ben;
        int bb = (rem1 * bbP) / 100;
        int rem2 = rem1 - bb;
        int other = rem2 / 3; 

        System.out.println(ben);
        System.out.println(bb);
        System.out.println(other);
    }
}