package Recursion;

import java.util.Scanner;
public class Frequencyarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,2,3,4,4,2};int ele=2;
        int count=0;
        System.out.print(frequency(a,count,ele,0));
        sc.close();
    }
    static int frequency(int a[],int count,int ele,int index){
        if(index==a.length-1){
            if(a[index]==ele){
                count++;
            }
            return count;
        }        
        else if(a[index]==ele){
            count++;
        }
        return frequency(a,count,ele,index+1);

    }
}
