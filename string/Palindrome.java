import java.util.Scanner;
public class Palindrome{
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String word="";
        for(int i=s.length()-1;i>=0;i++){
            char ch=s.charAt(i);
            word=word+ch;
        }
        if(s.equals(word)){
            System.out.print("palindrome");
        }else{
            System.out.print("not palindrome");
        }
    sc.close();

    }
}