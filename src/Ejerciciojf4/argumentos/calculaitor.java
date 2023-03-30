package Ejerciciojf4.argumentos;

public class calculaitor {

    public double tax = 0.15;
    public double tip = 0.05;
    public void findtotal(double price ,String name){
        double total = price*(1+0.5+0.15);

        System.out.println(name+" " + "total =  $"  + total);
    }
    public void imprimirNombre(String name, String apellido){
        System.out.println();
    }
}
