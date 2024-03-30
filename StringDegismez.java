public class StringDegismez {
  public static void main (String[]args){

    String isim = new String("elif").intern();
    String ad = new String("elif");
    // burada new dediği için farklı belleklerde tutuyo o yüzden eşit olamaz.

    System.out.println(isim == ad); // false
    System.out.println(isim.equals(ad)); // true

    
    String abc = "abc";
    String def = "abc";
    //burada new demediği için aynı bellek içerisinde tutuyo o yüzden eşit.

    System.out.println(abc == def); //true


    String elif = "elif";
    elif.concat("karslı");
    System.out.println(elif);// elif verdi çıktıyı
    //concat ekleme metodudur ama string değişmediği için etki etmedi
    //ama eğer aşağıdaki gibi yaparsan ekleyebilirsin:
    String yeni = elif.concat("karslı");
    System.out.println(yeni); // elifkarslı


    //normalde eğer 
    System.out.println(isim == elif);// dersen false sonucunu alırsın
    //ama eğer new yazanın yanına intern eklersen ikisi de aynı heep alanını gösterir true sonucunu alırsın.
  }
}