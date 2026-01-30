package Arrayminiproject;

import java.util.Scanner;
public  class MobilenumberValidator {
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String mobile=sc.nextLine();
   boolean length=false;
   boolean firstnum=false;
   boolean number=false;
   if(mobile.length()!=10){
       System.out.println("MOBILE NUMBER CONTAINS 10 DIGITS");
    }
    else{
        length=true;
    }
    for(int i=0;i<mobile.length();i++){
       char ch=mobile.charAt(i);
        if(i==0){
            if(ch!='6' && ch!='7'&& ch!='8' && ch!='9'){
                System.out.println("INVALID MOBILE NUMBER");
                break;
            }
            else{
               firstnum=true;
            }
        }
        if(ch <'0' && ch >'9'){
            number=false;
        }else{
            number=true;
        }
    }
if(length && firstnum && number){
    System.out.println("VALID MOBILE NUMBER");
}
else{
System.out.println("INVALID MOBILE NUMBER");
}
sc.close();
}
}

