import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fp = sc.nextInt(); 
        int fd = sc.nextInt(); 
        int fs = sc.nextInt(); 

        int sp = sc.nextInt(); 
        int sd = sc.nextInt(); 
        int ss = sc.nextInt(); 

        int ap = sc.nextInt(); 
        int ad = sc.nextInt(); 
        int as = sc.nextInt(); 

        int fnet = (int)(fp - (fp * fd / 100.0) + fs);
        int snet = (int)(sp - (sp * sd / 100.0) + ss);
        int anet = (int)(ap - (ap * ad / 100.0) + as);

        System.out.println("In Flipkart: Rs." + fnet);
        System.out.println("In Snapdeal: Rs." + snet);
        System.out.println("In Amazon: Rs." + anet);

        if (fnet <= snet && fnet <= anet) {
            System.out.println("Choose Flipkart");
        } else if (snet <= fnet && snet <= anet) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }
    }
}
