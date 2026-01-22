import java.util.Scanner;
public class Interchangerow {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int a[][]=new int[r][r];
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            if(i==0){
                int temp=a[i][j];
                a[i][j]=a[r-1][j];
                a[r-1][j]=temp;//intrchange first adn last row//
            }
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            System.out.print(a[i][j]);
        }
    }
    sc.close();
   }
}
