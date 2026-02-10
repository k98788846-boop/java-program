package Arrays.Recursive;

import java.util.Scanner;
public class Min {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,0};
        int min=a[0];
        System.out.print(min(a,min,0));
        sc.close();
    }
    static int min(int a[],int min,int index){
        if(index==a.length-1){
            if(a[index]<min){
                min=a[index];
            }
            return min;
        }
        else if(a[index]<min){
            min=a[index];
        }
        return min(a,min,index+1);
    }
}
