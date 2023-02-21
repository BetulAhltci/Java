package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/day28_Exceptions/metin.txt");


        /*
        Bazı kodları yazdığımızda Java compile time sırasında
         o kodlarda exceptıon riskını gorur ve bizden bir cözümbekler

         Özellikle dosya okuma ve yazma ile ilgili IO(Inpt/Output) işlemlerinde Java ya okuyamazsam,
         ya yazamazsam diyerek bizden compıle time'da cozum bekler

         bu durumda biz exception le karsılastıgında
         kod dursun diyorsak: method satırına throws keyworld kulanarak beklenilen exceptıon(ları)
         */




    }
}
