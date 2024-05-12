package Exceptioan_And_IOFile.Exception;



public class LotsOfCatch {
    public static void main (String[]args){
        String [] dizi = {"abc","234",null,"bdc"};

        for(int i=0; i<dizi.length; i++){

            try{
                int sayi = dizi[i].length()+ Integer.parseInt(dizi[i]);
            }catch(NumberFormatException e){
                System.out.println(e);
                //java.lang.NumberFormatException: For input string: "abc"
            }catch(NullPointerException e){
                System.out.println(e);
                //java.lang.NumberFormatException: For input string: "bdc"
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }

            //If we don't know the exception names and want to write it short

            for(int j=0; j<dizi.length+2; j++){
                try{
                    int sayi = dizi[j].length()+ Integer.parseInt(dizi[j]);
                }catch(Exception e){
                    System.out.println(e);
                }

                      // We can write it also
            try{
                int sayi = dizi[j].length()+ Integer.parseInt(dizi[j]);
            }catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
         }

      
       
            //It' the another way

            
        for(int k=0; k<dizi.length; k++){

            try{
                int sayi = dizi[k].length()+ Integer.parseInt(dizi[k]);
            }catch(Exception e){
                System.out.println(e);
                //java.lang.NumberFormatException: For input string: "abc"
            }catch(Throwable t){
                System.out.println(t);
                //Throwable cover the exception that's why we can use it, it's same the exception
            }
            
            
            /*catch(NullPointerException e){
                System.out.println(e);
                //java.lang.NumberFormatException: For input string: "bdc"
            }*/

            //After the exception, it find the all errors that's why we cannot use spesific exceptions;but we can use them before
       
        }

           ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


         // We can write inside each other 
        for(int i=0; i<dizi.length;i++){
            try{
                int sayi = dizi[i].length();
                try{
                    sayi = Integer.parseInt(dizi[i]);
                }catch(NumberFormatException e){
                    System.out.println(e);
                }
            }catch(NumberFormatException e){
                System.out.println(e);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }





    }
}
