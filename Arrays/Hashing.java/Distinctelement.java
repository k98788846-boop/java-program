import java.util.Scanner;
public class Distinctelement {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);//  no of non repeating elemnts//
    int r=sc.nextInt();int a[]=new int[r];
    for(int i=0;i<r;i++){
        a[i]=sc.nextInt();
    }
    int h[]=new int[r];
    for(int i=0;i<r;i++){
        h[a[i]]++;
    } int count=0;
    for(int i=0;i<r;i++){
        if(h[a[i]]==1){
           count++;
        }
    }
    if(count!=0){
        System.out.print("distinct elments :"+count);
    }
    sc.close();
}
}
