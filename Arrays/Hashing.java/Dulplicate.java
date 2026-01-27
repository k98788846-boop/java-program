import java.util.Scanner;
public class Dulplicate {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[]=new int[r];
        for(int i=0;i<r;i++){
            a[i]=sc.nextInt();
        }
        int h[]=new int[256];
        for(int i=0;i<r;i++){
            if(a[i]>=0 && a[i]<256){
                h[a[i]]++;
            }
        }
        for(int i=0;i<r;i++){
            if(h[i]>1){
                System.out.print(i+"is"+"duplicte");
            }
        }
        sc.close();
    }
}
