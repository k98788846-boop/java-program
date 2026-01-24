import java .util.Scanner;
public class Boundarytraversal {
   public static void main(String[] ars){
        Scanner sc=new  Scanner(System.in);
        int r=sc.nextInt();int a[][]=new int[r][r];
        for(int  i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i==0||j==0||i==r-1||j==r-1){
                    System.out.print(a[i][j]);
                }
            }
        }
        sc.close();//boundarytraveresal means acessing the border elements//
   }
}
