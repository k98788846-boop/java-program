import java.util.Scanner;
public class Anti{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();//square matrix//
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }//123 123 123//
            //321 321 321//
        }for(int i=0;i<r;i++){
            for(int j=r-1;j>=0;j--){

              System.out.print(a[i][j]+" ");}
        }
        }
    }

