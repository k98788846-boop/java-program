import java.util.Scanner;
public class Sortquick{
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int pivot=a[n-1];
            for(int j=n-1;j>=0;j--){
                if(pivot<a[j]){
                    int temp=a[j];
                    a[j]=pivot;//guicksort//
                                 //choose pivot and the compare then sort//
                    pivot=temp;
                }a[n-1]=pivot;
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
}
