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
                for (int j = 1; j <= n; j++) {   
                    if ((i + j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println(); 
            }
        }
    }
}