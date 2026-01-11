import java.util.Scanner;
public class Amstrongnumber{
    public static void main(String[] arrgs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int sum=0;int temp=n;int count=0;
        while(temp>0){
            temp=temp/10;
            count++; }
        temp=n;int num=0;
         while(temp>0){
            int d=temp%10;int pow=1;
            for(int i=1;i<=count;i++){
                pow=pow*d;//sum of its digits raised to the power of number og digits is equal to number//
            }
            sum+=pow;
            temp/=10;
         }
         if(sum==n){
            System.out.print("amstrng number");
         }else{
            System.out.print("not amstrong number");
         }
         sc.close();
         
         }

         }
    

