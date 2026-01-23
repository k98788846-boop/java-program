import java.util.Scanner;
public class Replacesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sum;
                System.out.print(a[i][j]);
            }
        }
        sc.close();
    }
}
