import java.util.Scanner;
public class Countletters {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();int count=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>=97||ch<=122|| ch>=65||ch<=90){
            count++;
        }

      } 
      System.out.print(count);
      sc.close(); 
    }
}
