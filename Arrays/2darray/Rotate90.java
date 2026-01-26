import java.util.Scanner;
public class Rotate90 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){//rotate 90 clockwise//
            for(int j=i+1;j<r;j++){
                if(i!=j){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
        for(int i=0;i<r;i++){// s1:take transverse then reverse each row//
            for(int j=0;j<r/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][r-1-j];
                a[i][r-1-j]=temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
