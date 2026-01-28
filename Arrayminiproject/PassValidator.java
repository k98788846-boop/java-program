package Arrayminiproject;

import java.util.Scanner;
public class PassValidator {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE PASSWORD:");
    String pass=sc.nextLine();
    boolean upperin=false;
    boolean lowerin=false;
    boolean digitin=false;
    boolean islength=false;
    boolean special=false;
    for(int i=0;i<pass.length()-1;i++){
        char ch=pass.charAt(i);
        if(pass.length()>=8){
            islength=true;
        }else{
            System.out.println("PASSWORD MUST CONTAINS ATLEAST 8 CHARACTERS");
            break;
        }
        if(ch>=65 && ch<=90){
            upperin=true;
        }
        if(ch>=97 && ch<=122){
            lowerin=true;
        }
        if(ch>=0 && ch<=9){
            digitin=true;
        }
        if((ch>=33 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=126)){
            special=true;
        }
    }
    if(upperin && lowerin && digitin && special ){
        System.out.println("STRONG PASSWORD");
    }
    else{
        System.out.println("WEAK PASSWORD");
    }
    sc.close();
}
}
