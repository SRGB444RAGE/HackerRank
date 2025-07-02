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
            for (int i = 1; i <= n; i++) {      
                for (int j = 1; j <= i; j++) {  
                    if (i % 2 == 1) {
                        System.out.print(2 * j - 1);
                    } else {
                        System.out.print(2 * j);
                    }
                }
                System.out.println(); 
            }
        }
    }
}