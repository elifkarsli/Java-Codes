package Exceptioan_And_IOFile.Exception;

public class ErrorInMethod {
    public static void main(String[]args){

        try{
            createError();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    private static void createError(){
        String[] dizi = {"abc","234",null,"bdc"};

        for(int i=0; i<dizi.length+2; i++){
            try{
                int sayi = dizi[i].length()+Integer.parseInt(dizi[i]);
            }catch(NumberFormatException e){
                System.out.println(e);
            }catch(NullPointerException e){
                System.out.println(e);
            }

            System.out.println(dizi[i]);
        }

        System.out.println("It' the end of the method");
    }
}


/*

java.lang.NumberFormatException: For input string: "abc"
abc
234
java.lang.NullPointerException: Cannot invoke "String.length()" because "dizi[i]" is null
null
java.lang.NumberFormatException: For input string: "bdc"
bdc
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 

*/

//after catching errors, switches to submethod and does not continue to run