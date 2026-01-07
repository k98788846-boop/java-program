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
        for(int i=0;i<c.length;i++){
            c[i]=a[i];}
        for(int i=0;i<n2;i++){
           c[n1+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(c[j]>c[j+1]){
                    int temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
        }}
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }

        
    }
}