import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int playing = (a/b);
        int leftout = (a%b);
        
        System.out.print("The number of friends in each team is "+ playing +" and left out is "+leftout);
    }
}