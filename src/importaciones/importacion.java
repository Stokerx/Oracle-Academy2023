package importaciones;
import javax.swing.*;

public class importacion {
    public static void main(String[] args) {
        String name = "7" + 7;
        System.out.println("name = " + name.length());

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('-');

        System.out.println("idx1 = " + idx1);

        int idx2 = phoneNum.indexOf('-',idx1+1);
        System.out.println("idx2 = " + idx2);

        //substring

        String greeting = "Hello, World!";
        String sub = greeting.substring(0, 5);
        System.out.println("sub = " + sub);
        String w = greeting.substring(7,11);
        System.out.println("w = " + w);
        String tail = greeting.substring(7);
        System.out.println("tail = " + tail);

        String str = "Susan";
        System.out.println("str.charAt(0) = " + str.charAt(0));

        str = "Usinf String replace to replate character";
        String nrwString = str.replace("ri","RI");

        System.out.println("nrwString = " + nrwString);

        //replaceFIrst()

        String replace = "String replace with replaceFist";
        String newString = replace.replaceFirst("re", "RE");
        System.out.println("newString = " + newString);

        // concat

        String muSring = "hello";

        muSring = muSring.concat(" World");
        muSring+= "!";
        System.out.println("muSring = " + muSring);

    }
}
