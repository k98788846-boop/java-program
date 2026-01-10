import java.util.Scanner;
public class Neonnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int temp=n;
        int sq=1;int sum=0;
        for(int i=1;i<=2;i++){
            sq=sq*n;
        }
        while(sq>0){
            int d=sq%10;
            sum+=d;
            sq/=10;

        }
        if(sum==temp){
            System.out.print("NEON NUMBER");
        }else{
            System.out.print("NOT A NEON NUMBER");
        }
        sc.close();
        
        }
}
