import java.util.Scanner;
public class Countchars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count++;
        }System.out.print("no of characters"+count);
        sc.close();
    }
}