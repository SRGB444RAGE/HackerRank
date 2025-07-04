import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[][] arr = new int[n][n];

        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxZeros = 0;
        int rowIndex = -1;


        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 0)
                    count++;
            }
            if(count > maxZeros) {
                maxZeros = count;
                rowIndex = i;
            }
        }

        if(maxZeros == 0)
            System.out.println("No row has zeros");
        else
            System.out.println(rowIndex);
    }
}
