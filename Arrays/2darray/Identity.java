import java.util.Scanner;
public class Identity {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
              a[i][j]=sc.nextInt();
            }
        } boolean identity=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i==j && a[i][j]!=1){// diagonal ele is 1 and others 0//
                    identity=true;
                    break;
                }else if(i!=j && a[i][j]!=0){
                    identity=false;
                    break;
                }
            }
        }
        if(identity){
            System.out.print("idenity matrix");
        }else{
            System.out.print("not identity matrix");
        }
        sc.close();
    }
}

