package sentenciasultis;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();

        if(num <=10){
            System.out.println("Enter a number: " + num);
            System.out.println("the num is odd = " + num);
        }
        
    }
}
