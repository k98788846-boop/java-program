import java.util.Scanner;
public class Rotationarray{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    System.out.print("enter no of rotation");
    int g=sc.nextInt();g=g%n;   
       for(int i=0;i<g;i++){
        int last=a[n-1];
        for(int j=n-1;j>0;j--){
            a[j]=a[j-1];
        }
        a[0]=last;
        
       }
       for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
       }//rotate from right to left//
       //12345 to 51234//
    }
    
}
