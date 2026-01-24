import java.util.Scanner;
public class Suminner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i!=0 && j!=0 && j!=r-1 && i!=r-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.print("sum  of inner elemnts"+sum);
        sc.close();

    }
}
