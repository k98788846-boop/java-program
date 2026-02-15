package Recursion;

import java.util.Scanner;
public class Arrsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,3,2,4,5};
        int sum=0;
        System.out.print(sum(a,sum,0));
        sc.close();
    }
    static int sum(int a[],int sum,int index){
        if(index==a.length-1){
            sum+=a[index];
            return sum;
        }
        sum+=a[index];
        return sum(a,sum,index+1);
    }
}
