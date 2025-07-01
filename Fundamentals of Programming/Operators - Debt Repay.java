import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble(); 
        double r = sc.nextDouble(); 
        double y = sc.nextDouble(); 

        double i = (p * r * y) / 100;
        double amt = p + i; 
        double dis = i * 0.02; 
        double finalAmt = amt - dis; 

        System.out.printf("%.2f\n", i);
        System.out.printf("%.2f\n", amt);
        System.out.printf("%.2f\n", dis);
        System.out.printf("%.2f\n", finalAmt);
    }
}