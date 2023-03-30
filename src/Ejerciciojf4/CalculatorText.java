package Ejerciciojf4;

public class CalculatorText {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        calc.originalPrice = 10;
        calc.findTotal();
        calc.originalPrice = 12;
        calc.findTotal();

        calc.findTotal();
    }
}
