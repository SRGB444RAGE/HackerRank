import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int [][]a = new int[r1][c1];
    int col,row,flag=0;
        
    for(row=0;row<r1;row++)
    {
    for(col=0 ;col<c1 ; col++)
    {
        a[row][col] = sc.nextInt();
    }
        
    }
        
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int [][]a1 = new int[r2][c2];

    for(row=0;row<r2;row++)
    {
    for(col=0 ;col<c2 ; col++)
    {
        a1[row][col] = sc.nextInt();
    }
    }
    if(r1==r2 &&  c1==c2)
    for(row=0;row<r2;row++)   
    {
    for(col=0 ;col<c2 ; col++)
    {
       if(a1[row][col] !=  a[row][col])
       {
           flag = 1;
           break;
       }
    }
    }
        else{
            System.out.print("NOT IDENTICAL");
            return ;
        }
        
        
        if(flag == 0)
            System.out.print("IDENTICAL");
    else
            System.out.print("NOT IDENTICAL");
        
    
      
    }
}
