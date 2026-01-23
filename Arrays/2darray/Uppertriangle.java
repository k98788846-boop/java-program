import java.util.Scanner;
public class Uppertriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();// 1 0 0//
                                      //  2 3 0//
            }                           //5 6 7 //
        }
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){ 
                if(i!=j){
                a[i][j]=0;
            }
        } }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[i][j]);
            }
        }
        sc.close();
    }
}
