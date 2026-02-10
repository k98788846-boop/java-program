package Arrays.Recursive;

import java.util.Scanner;
public class Odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6};
        odd(a,0);
        sc.close();
    }
    static void odd(int a[],int index){
        if(index==a.length-1){
            if((a[index]%2)!=0){
              System.out.print(a[index]);
            }
            return;
        }
        else if((a[index]%2)!=0){
            System.out.print(a[index]);
        }
         odd(a,index+1);
         return;
    }
}
