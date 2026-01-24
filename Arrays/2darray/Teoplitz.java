import java.util.Scanner;
public class Teoplitz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        } int count=0;
        for(int i=0;i<r;i++){
            int element=a[0][0];
            if(element==a[i][i]){
                count++;
            }else{
                break;// all diagonal elements are same//
            }
        }
        if(count==r){
            System.out.print("teoplitz matrix");
        }
        else{
            System.out.print(" not teopliz matrix");
        }
        sc.close();
    }
}
