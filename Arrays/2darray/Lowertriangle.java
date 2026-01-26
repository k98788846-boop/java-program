import java.util.Scanner;
public class Lowertriangle {
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
        for(int j=0;j<r;j++){// elements above the diagonal i<j ,daigonal i=j,below diagonal i>j//
            if(i<j){
               a[i][j]=0; 
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
