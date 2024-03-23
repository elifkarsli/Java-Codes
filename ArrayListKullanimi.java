import java.util.ArrayList;
public class ArrayListKullanimi {
  public static void main (String[]args){

    // Telefon[] telefonlar = new Telefon[20];
    ArrayList<Telefon> telefonlar = new ArrayList<>();
    Telefon tel1 = new Telefon("iphone1", 1000);
    Telefon tel2 = new Telefon("iphone2", 2000);
    Telefon tel3 = new Telefon("iphone3", 3000);
    /* 
    telefonlar.add(tel1);// tel1 i ekledik
    telefonlar.add(0,tel2);// 0ıncı index tel2 oldu
    telefonlar.remove(0);// 0ıncı indexi sildi
    telefonlar.remove(tel3); // tel3 ü sildi
    */

    telefonlar.add(tel1);
    telefonlar.add(tel2);
    telefonlar.add(tel3);

    System.out.println(telefonlar.size()); // listede kaç eleman olduğunu söyler
    listeyiYazdir(telefonlar);

    telefonlar.add(tel1);
    telefonlar.add(0,tel3);
    System.out.println("Değişikliklerden sonra: ");
    telefonlar.set(3,tel2);// verilerde değişiklik yaptık
    listeyiYazdir(telefonlar);

    System.out.println(telefonlar.contains(tel3));// tel3 içeriyo mu diye sorduk
  }

  public static void listeyiYazdir(ArrayList<Telefon> liste){
   // for(int i=0;i<liste.size();i++){
    //  System.out.println(liste.get(i));
      /*Telefonmodeliphone1/fiyat1000
      Telefonmodeliphone2/fiyat2000
      Telefonmodeliphone3/fiyat3000 */
   // }

   for(Telefon oankideger : liste){
    System.out.println(oankideger);
   }
  }
}

class Telefon{

  String model;
  int fiyat;

  public Telefon(String model, int fiyat){
    this.model = model;
    this.fiyat = fiyat;
  }

  public String toString(){
    return "Telefon" + "model" + model + "/" + "fiyat" + fiyat;
  }

}