package Arrays.Recursive;

import java.util.Scanner;
public class Max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,6,5};
        int max=a[0];
        System.out.print(max(a,max,0));
        sc.close();
    }
    static int max(int a[],int max,int index){
        if(index==a.length-1){
            if(a[index]>max){
                max=a[index];
            }
            return max;}
            else if(a[index]>max){
                max=a[index];
            }
            return max(a,max,index+1);
        }
        
    }

