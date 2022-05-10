package CoreJava;

import java.util.Scanner;

public
class Even_Odd {
    public static
    void main (String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println ("Enter n:  ");
     int n= sc.nextInt ();
       // int n=100;
        if (n>=0){
            System.out.println ("valid");
            if(n%2==0){
                System.out.println ("even");
            }else {
                System.out.println ("odd");
            }
        }else {
            System.out.println ("invalid");
        }
    }
}
