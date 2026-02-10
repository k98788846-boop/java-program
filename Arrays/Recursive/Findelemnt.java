package Arrays.Recursive;
import java.util.Scanner;
public class Findelemnt {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a[]={1,2,3,4};
    int target=5;
    System.out.print(find(a,target,0));
    sc.close();
   }
   static boolean find(int a[],int target,int index){
    if(index==(a.length-1)){
        if(a[index]==target){
            return true;
        }else
            return false;
    }
    return a[index]==target || find(a,target,index+1);
   }
}
