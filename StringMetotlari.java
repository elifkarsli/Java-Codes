public class StringMetotlari {
  public static void main (String[]args){
    String isim = "elif";

    System.out.println(isim.length());// 4 , karakter uzunluğunu verdi
    System.out.println(isim.charAt(2)); // i o indeksteki harfi verdi
    System.out.println(isim.concat("karsli")); // elifkarsli anlık olarak ekler 
    System.out.println(isim.toUpperCase());// hepsini büyük yazdı
    System.out.println(isim.toLowerCase());// hepsini küçük yazdı
    System.out.println(isim.trim());// olan fazla boşlukları siler

    String ay = "Mart";
    String ay2 = "mart";

    System.out.println(ay.equals(ay2));// false
    System.out.println(ay.equalsIgnoreCase(ay2));// true
    
    System.out.println(ay.compareTo(ay2));// ikiside eşitse 0 alfabeye göre
    System.out.println(ay.startsWith("m"));// true m ile mi başlıyo diye sorduk
    System.out.println(ay.endsWith("k"));// false k ile bitmiyo 
    System.out.println(ay.contains("ma"));// true ma içeriyor
    
    System.out.println(ay.substring(1));// art verdi içine yazdığımız indeksten sonuna kadar
    System.out.println(ay.substring(1,3));// ar verdi

    System.out.println(ay.indexOf("a"));// 1 inci indekste olduğunu söyledi
    System.out.println(ay.lastIndexOf("r"));// 2 son r nin kaçıncı indekste olduğunu verdi

    System.out.println(5+"elif");// 5elif verdi 5i de string gibi aldı

    int sayi = 5;
    int sayi2 = 6;
    String say = "56";

    System.out.println(sayi+sayi2);// 11
    System.out.println(say+5);// 565 string olduğu için
    System.out.println(Integer.parseInt(say)+4); // 60 Stringi integere dönüştürdü

  }
}