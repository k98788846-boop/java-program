package Arrays.Recursive;

import java.util.Scanner;
public class Replaceneg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,-2,-1,0,9};
        replace(a,0);
        System.out.print(a);
    }
    static void replace(int a[],int index){
        if(index==a.length-1){
            if(a[index]<0){
                a[index]=0;
            }
            return ;
        }
        else if(a[index]<0){
            a[index]=0;
        }
    replace(a,index+1);
    return;
    } 
}
