package Arrays.Recursive;

import java.util.Scanner;
public class Indexofmax {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,6,4};
        int max=0;
        System.out.print(max(a,max,0));
        sc.close();
    }
    static int max(int a[],int max,int index){
        if(index==a.length-1){
            if(max<a[index]){
                max=index;
            }
            return index;
        }
        else if(a[index]>max){
            max=index;
        }
        return max(a,max,index+1);
         
    }
}
