 import java.util.Scanner;
public class Sum2d{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();int c=sc.nextInt();int a[][]=new int[r][c];int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }System.out.println("sum of"+i+sum);
            sum=0;
        }
    
}
}
 
    

