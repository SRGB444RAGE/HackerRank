import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int l = sc.nextInt();  

        for (int i = n; i <= l; i++) {  
            int d, copy = i, sum = 0, mul = 1;

            while (copy > 0) {
                d = copy % 10;
                sum += d;
                mul *= d;
                copy /= 10;
            }

            if (i == sum + mul) {
                System.out.println(i);
            }
        }
    }
}