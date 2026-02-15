package Recursion;

import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n));
        sc.close();
    }
    static int sum(int n){
         if(n==0){
            return n;
        }
        return n + sum(n-1);
    } 
}
