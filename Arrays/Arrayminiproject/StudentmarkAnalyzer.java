package Arrays.Arrayminiproject;

import java.util.Scanner;
public class StudentmarkAnalyzer {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int a[]=new int[r];
    for(int i=0;i<r;i++){
        a[i]=sc.nextInt();
    } 
    int min=a[0];
    int max=a[0];
    int Average=0;
    int pass=0,fail=0;
    for(int i=0;i<r;i++){
        Average+=a[i];
        if(i==r-1){
            Average/=r;
        }
        if(min<a[i]){
            min=a[i];
        }else{
           max=a[i];
        }
        if(a[i]>=40){
            pass++;
        }else{
            fail++;
        }
    }
    System.out.println("AVERAGE OF STUDENTS MAARK"+Average);
    System.out.println("HIGHEST MARK"+min);
    System.out.println("LOWEST MARK"+max);
    System.out.println("NUMBER OF PASS MEMBERS:"+pass);
    System.out.println("NUMBER OF FAIL MEMBERS:"+fail);
    sc.close();
 }
}
