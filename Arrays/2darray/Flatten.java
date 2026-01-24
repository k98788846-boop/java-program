import java.util.Scanner;
public class Flatten{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            int a[][]=new int[r][r];int count=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                    a[i][j]=sc.nextInt();// multidimensional array to single dimension array//
                     count++;
                }
                
            } int b[]=new int[count];            
            for(int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                    for(int k=0;k<count;k++){
                     b[k]=a[i][j];
                     System.out.print(b[k]);
                    }
                }
            }
            sc.close();
    }
}