package Recursion;
import java.util.Scanner;
public class Triange {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    triangle(4,0);
}
static void triangle(int r,int c){
    if(r==0){
        return;
    }
    if(r>c){
         System.out.print("*");
         triangle(r,c+1);
         return;
    }else{
        System.out.println();
        triangle(r-1,0);
        return;
    }

    }
}
