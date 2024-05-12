package Exceptioan_And_IOFile.Exception;

public class BlocksReturningValues {
    public static void main (String[]args){
        System.out.println(stringReturnValueMethod());
        System.out.println(throwMethod());
    }

    private static String stringReturnValueMethod(){

        String hi = "hi";
       
        try{
            hi = hi + "try";
            return hi;
        }catch(Exception e){
            hi = hi + "catch";
            return hi;
        }finally{
            hi = hi + "finally";
            return hi;
        } // *hitryfinally  * it's the result   * we write the catch block for sure
    }    // if there is a return int he finally block we do not need to write return the others, it returns anyway

   

    private static String throwMethod(){

        String hi = "hi";
       
        try{
            hi = hi + "try";
            ArithmeticException e = new ArithmeticException();
            throw e;
        }catch(Exception e){
            hi = hi + "catch";
            System.out.println("error caught in catch block");
            return hi;
        }finally{
            hi = hi + "finally";
            return hi;
        } //error caught in catch block
          //hitrycatchfinally   * these are results
    }
}



