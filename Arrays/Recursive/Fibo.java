package Arrays.Recursive;

import java.util.Scanner;
public class Fibo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fibo(n));
        sc.close();
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        else
        return (fibo(n-1)+fibo(n-2));
    }
}
