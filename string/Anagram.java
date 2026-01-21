import java .util.Scanner;
public class Anagram  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k=sc.nextLine();int count=0;int count1=0;
        if (s.length()==k.length()){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);count1++;
                for(int j=0;j<k.length();j++){
                      char ch1=k.charAt(j);
                      if(ch==ch1){
                        count++;
                      }
                        
                      }if (count>0){
                        count=0;
                      }else{
                        break;
                      }
                }
            }
          if(count1==s.length()){
            System.out.print("anagram");//listen & silent// //same of no of letters ,same letters but different position//
          }else{
            System.out.print("not anagram");
          }
          
        }
    }

