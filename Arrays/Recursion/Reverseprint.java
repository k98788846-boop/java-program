package Recursion;

import java.util.Scanner;
public class Reverseprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6};
        print(a,a.length-1);
        sc.close();
    }
    static void print(int a[],int index){
        if(index==0){
            System.out.print(a[index]);
            return;
        }
        System.out.print(a[index]);
        print(a,index-1);
        return;
    }
}
