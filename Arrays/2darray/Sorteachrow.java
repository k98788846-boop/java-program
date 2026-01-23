import java.util.Scanner;
public class Sorteachrow {
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
        for(int j=0;j<r-1;j++){
            if(a[i][j]>a[i][j+1]){
                int temp=a[i][j];
                a[i][j]=a[i][j+1];
                a[i][j+1]=temp;
            }
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            System.out.print(a[i][j]);//in ascending rowvise.//
        }
    }
    sc.close();
  }
}
