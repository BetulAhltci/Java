package day31_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        Collections objeleri bir arada tutan yapılardır
        Gercek hayattaki ihtiyaclara gore Java farklı collections yapıları olusturur
        Bir Uygulamada hangi collectons kullanacağımıxza istediğimiz özelliklere göre karar veririz

        Collections temelde 3 ana gruba ayrılır ve 3 ınterface ile kuralları belirlenmiştir
           -list
           -Queue
           -Set
        Ancak ıntercace lerde obje olusturulamayacağı için child class ların constructor ları kullanılır
         Burada ozelikleri belirleyen constructor degil DATA TURU olarak secilen collection'dir

            Ornegin Linked list olustururken sececegimiz data turu ile
            Queue, Deque, List veya tumunun ozelliklerini tasiyan LinkedList'ler olusturabiliriz
         */

        LinkedList<String> ll1 = new LinkedList<>();
        List<String> ll2= new LinkedList<>();
        Queue<String> ll3 = new LinkedList<>();
        Deque<String> ll4 = new LinkedList<>();


    }
}




