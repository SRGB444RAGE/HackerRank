import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * (n - i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}