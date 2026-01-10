import java.util.Scanner;
public class Diagonal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();//square matrix//
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }for(int i=0;i<r;i++){
        System.out.print(a[i][i]+" ");
        }
        }
    }

