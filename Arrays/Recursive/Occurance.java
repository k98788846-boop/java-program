package Arrays.Recursive;

import java.util.Scanner;
public class Occurance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,2,4,2};
        int ele=2;
        occur(a,ele,0);
        sc.close();    
    }
    static void occur(int a[],int ele,int index){
        if(index==a.length-1){
          if(a[index]==ele){
            System.out.print(index);
          }
          return;
        }
       else if(a[index]==ele){
        System.out.print(index);
       }
       occur(a,ele,index+1);
       return ;
    }
}
