package Exceptioan_And_IOFile.Exception;

public class Exceptions{
    public static void main (String[]args){

        try{
            Integer i = new Integer("asd");
            System.out.println(i);
        }catch (Exception e){
            System.out.println("There is a mistake " + e.toString());//There is a mistake java.lang.NumberFormatException: For input string: "asd" 
        }

        try{
        int sonuc = 5/0;
        }catch(Exception e){
            System.out.println("Mistake : " + e.toString());
            //Mistake : java.lang.ArithmeticException: / by zero
        }

        try{
            int [] sayilar ={1,2,3};
            System.out.println(""+sayilar[4]);
        }catch(Exception e){
            System.out.println("Mistake : " + e);
            //Mistake : java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        }

        try{
            Object a = new Object();
            String b = (String) a;
        }catch(Exception e){
            System.out.println("Mistake : " + e);
            //Mistake : java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
        }finally{
            System.out.println("finally runed");
        }


        System.out.println("The program must run here");
    }
}