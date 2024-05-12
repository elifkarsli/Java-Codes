package Exceptioan_And_IOFile.Exception;

import java.util.Scanner;

public class MakeYourOwnException{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        try{
            if(age<0){
                throw new NegativeAgeException("Age cannot be negative");
            }
        }catch(Exception e){
            System.out.println("Mistake" + e);
        }
        /*
        Enter your age
        -7       
        Mistake Age cannot be negative
         */
    }
}

class NegativeAgeException extends Exception{
    String exceptionMessage;

    public NegativeAgeException(String exceptionMessage){
        this.exceptionMessage=exceptionMessage;
    }

    public String toString(){
        return exceptionMessage;
    }
}