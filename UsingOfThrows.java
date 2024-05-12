package Exceptioan_And_IOFile.Exception;

import java.sql.SQLException;
import java.util.function.DoubleToIntFunction;

public class UsingOfThrows {
    public static void main (String[]args){
        try{
            method3();
        }catch(NumberFormatException e){
            System.out.println("Mistake" + e);
            //Mistakejava.lang.NumberFormatException: For input string: "abc"
        }
    }

    private static void method() throws NumberFormatException,NullPointerException{
        Integer sayi = Integer.parseInt("abc");
    }
    private static void method2() throws NumberFormatException{
        method();
    }
    private static void method3() throws NumberFormatException{
        method2();;
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class A{

    void aMethod() throws SQLException{
        System.out.println("In the A class method");
    }
}

class B extends A{

    void aMethod() throws ArrayIndexOutOfBoundsException,SQLException{
        System.out.println("In the B class method");
    }
}

class C extends B{

    void aMethod() throws ArrayIndexOutOfBoundsException,NullPointerException,SQLException{
        System.out.println("In the C class method");
    }
}