import java.util.Scanner;
public class Add2arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];int b[][]=new int[r][r];int c[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                    b[i][j]=sc.nextInt();
                }

            }
            for(int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                   c[i][j]=a[i][j]+b[i][j];                    
                }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                    System.out.print(c[i][j]);
                }
            }
            sc.close();
            
        }
    } 

