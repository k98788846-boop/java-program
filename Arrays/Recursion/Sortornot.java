package Recursion;

import java.util.Scanner;
public class Sortornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,5,4};
        System.out.print(sort(a,0));
    }
    static boolean sort(int a[],int index){
        if(index==(a.length-1)){
            return true;
        }
        return a[index] <a[index+1] && sort(a,index+1);
    }
}
