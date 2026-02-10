import java.util.Scanner;
public class Insertatposition {
public static void main(String[] ars){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter the position:");
    int pos=sc.nextInt();
    System.out.println("enter the value");
    int val=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=n;i>pos;i++){
        a[i]=a[i+1];
    }
    n++;
    a[pos]=val;
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    sc.close();
}
}
