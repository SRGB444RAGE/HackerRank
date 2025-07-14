import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Stack {
        int[] arr;
        int top;
        int capacity;

        Stack(int size) {
            arr = new int[size];
            top = -1;
            capacity = size;
        }

        void push(int x) {
            if (top < capacity - 1) {
                arr[++top] = x;
            }
        }

        String pop() {
            if (top == -1) {
                return "Empty";
            } else {
                return String.valueOf(arr[top--]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        Stack st = new Stack(T); 

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine().trim();
            if (input.startsWith("push")) {
                int x = Integer.parseInt(input.split(" ")[1]);
                st.push(x);
            } else if (input.equals("pop")) {
                System.out.println(st.pop());
            }
        }

    }
}