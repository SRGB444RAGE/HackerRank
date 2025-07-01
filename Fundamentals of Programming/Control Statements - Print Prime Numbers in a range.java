import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        
        for(int count = 2; count<=n; count++){
            int flag = 0;
            for(i = 2;i<count;i++){
                if(count%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag == 0)
                System.out.print(count+" ");
        }
    }
}