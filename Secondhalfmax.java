import java.util.*;
public class Secondhalfmax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");}
        int k=n/2;
        for(int i=0;i<k;i++){
            int temp=a[k+i];
            a[k+i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");}


    }
}