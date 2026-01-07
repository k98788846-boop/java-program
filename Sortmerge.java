import java.util.Scanner;
public class Sortmerge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
            a[i]=sc.nextInt();
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for(int i=0;i<n2;i++)
            b[i]=sc.nextInt();
        int c[]=new int[n1+n2];
        for(int i=0;i<n1+n2;i++){
            c[i]=a[i];}
        for(int i=0;i<n2;i++){
           c[n1+i]=b[i];
        }
        for(int i=0;i<n1+n2;i++){
            for(int j=0;j<n1+n2;j++){
                if(c[i]>c[j]){
                    int temp=c[i];
                    c[i]=c[i+1];
                    c[i+1]=temp;
                }
        }}
        for(int i=0;i<n1+n2;i++){
            System.out.print(c[i]+" ");
        }

        
    }
}