import java.util.Scanner;
public class Maxele{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();
        int a[]=new int[n];int s=0;
        for(int i=0;i<n;i++){           
            a[i]=sc.nextInt();
            if(s<=a[i]){
                s=a[i];
            }}
    System.out.println("MAXIMUM ELEMENT"+s);
    }
}