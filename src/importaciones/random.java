package importaciones;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rndNUber = new Random();
        long ramdonnumero = rndNUber.nextInt(9)+2;
        System.out.println("ramdonnumero = " + ramdonnumero);
    }
}
