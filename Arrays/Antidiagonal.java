import java.util.Scanner;
public class Antidiagonal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
        } }
        for(int j=0;j<r;j++){
            System.out.print(a[j][r-1-j]+" ");
        }
        sc.close();
    }
}

