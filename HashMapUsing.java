package Collection_Framework;
import java.util.HashMap;
import java.util.Map;

public class HashMapUsing{
 public static void main (String[]args){
    HashMap <Integer,String> plakalar = new HashMap<>();
    plakalar.put(1,"Adana");
    plakalar.put(34,"İstanbul");
    plakalar.put(16,"Bursa");
    plakalar.put(35,"İzmir");
    plakalar.put(6,"Ankara");
    plakalar.put(null,"null deger");

    System.out.println(plakalar);//{16=Bursa, 1=Adana, 34=İstanbul, 35=İzmir, 6=Ankara}
    
    String deger = plakalar.get(6);
    System.out.println(deger);// Ankara

    System.out.println(plakalar.get(null));//null deger

    System.out.println(plakalar.size());//6
    System.out.println(plakalar.isEmpty());//false

    System.out.println(plakalar.containsKey(30));// false
    System.out.println(plakalar.containsValue("Bursa"));//true

    System.out.println(plakalar.remove(35));
    System.out.println(plakalar.size());//5

    HashMap <Integer,String> plakalarYedek = new HashMap<>();
    System.out.println("plakalar yedek size : " + plakalarYedek.size());//plakalar yedek size : 0
    plakalarYedek.putAll(plakalar);
    System.out.println("plakalar yedek size : " + plakalarYedek.size());//plakalar yedek size : 5
    plakalarYedek.clear();
    System.out.println("plakalar yedek size : " + plakalarYedek.size());//plakalar yedek size : 0
    
    for(Integer key : plakalar.keySet()){
        System.out.print("Keyler : " + key);//Keyler : 16Keyler : nullKeyler : 1Keyler : 34Keyler : 6
    }

    System.out.println("\n Değerler : ");
    for(String value : plakalar.values()){
        System.out.println(value);
    }

    for(Map.Entry<Integer,String> entry: plakalar.entrySet()){
        System.out.println(" key : " + entry.getKey() + " value : " + entry.getValue());
    }
    /* Değerler :
        Bursa
        null deger
        Adana
        İstanbul
        Ankara
        key : 16 value : Bursa
        key : null value : null deger
        key : 1 value : Adana
        key : 34 value : İstanbul
        key : 6 value : Ankara
  */
}
}