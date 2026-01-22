import java.util.Scanner;
public class Sprase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int zero=0,num=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(a[i][j]==0){// when the zero's are morethan numbers//
                    zero++;
                }else {
                    num++;
                }
            }
        }
        if(zero>num){
            System.out.print("sprase matrix");
        }else{
            System.out.print("not sprase matrix");
        }
        sc.close();
    }
}
