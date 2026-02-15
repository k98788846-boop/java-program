package Recursion;

import java.util.Scanner;
public class RBS {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int a[]={5,6,7,8,1,2,3};
          int target=6;
          System.out.print(binary(a,target,0,a.length-1));
          sc.close();

    }
    static int binary(int a[],int target,int s,int e){
        if(s>e){
            return -1;
        }//rotaional binary search//
        int mid=(s+(e-s))/2;
        if(a[mid]==target){
            return mid;
        }if(a[s]<=a[e]){
        if(target>=a[s] && a[mid]>=target){
        return binary(a,target,s,mid-1);
        }else{
          return binary(a,target,mid+1,e);
        }
        }
        if(( target >=a[mid]) && (target <=a[e])){
            return binary(a,target,mid+1,e);
        }else{
            return binary(a,target,s,mid-1);
        }
    }
}
