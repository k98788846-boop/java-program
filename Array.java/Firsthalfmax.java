import java.util.Scanner;
public class Firsthalfmax{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
        int k=(n/2)+1;
        for(int i=0;i<k;i++){
            int temp=a[i];
            a[i]=a[k-1-i];
            a[k-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
