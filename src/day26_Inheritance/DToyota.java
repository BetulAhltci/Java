package day26_Inheritance;

public class DToyota {

    /*
    Bir objenin data türü construktor olarak kullanılan class veya o class ın parend classları olabilir

    Data türü olarak parend class secilmesindeki amaç
    child class'dan oluşturulan objenin parend class ın tüm child class'ların tasıdığı ortak özellikleri vurgulamaktır

    Data türü ile constructor farklı olduğunda variable ve metod farklı davranır

    Variable'ların alacağı değeri bulmak için aramaya data türü olan Class'dan başlanır
    O class da yoksa parend'lerine bakarız ve ilk bulduğumuz değeri atarız

     data turu olan class veya parent'larinda bulunamazsa CTE olur

     */

    String marka = "Toyota";
    String model = "Model belirtilmedi";
    String motor = "Motor belirtilmedi";
    String yakıt = "Yakıt belirtilmedi";




}
