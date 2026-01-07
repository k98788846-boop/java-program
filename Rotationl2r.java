import java.util.*;
public class Rotationl2r{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter no of roataion");
        int g=sc.nextInt();
         g=g%n;
        for(int i=0;i<g;i++){
            int first=a[0];
            for(int j=0;j>n;j++){
                a[j]=a[j+1];
            }
            a[n-1]=first;  

        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");//ROTATION FROM LEFT TO RIGTH//
            //12345 TO 23451//
        }
    }
}