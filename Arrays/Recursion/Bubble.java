package Recursion;
import java.util.Scanner;
public class Bubble {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a[]={5,6,4,3,1};
     bubble(a,4,0);
    System.out.print(a);
    sc.close();
}
static void bubble(int a[],int r,int c){
    if(r==0){
       return;
        }if(r<c){
        if(a[r]>a[c]){
            int temp=a[r];
            a[r]=a[c];
            a[c]=temp;
        }
        bubble(a,r,c+1);
        return;
    }
    else{
        bubble(a,r-1,0);
    }
    }
}


