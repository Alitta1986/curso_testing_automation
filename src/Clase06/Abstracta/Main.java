package Clase06.Abstracta;

public class Main   {

    public static void main(String[] args){
        Figura circ= new Circulo(5.11);
        Figura rect= new Rectangulo(5, 3);

        System.out.println("El area del circulo es: " + circ.calcularArea());
        System.out.println("El perimetro del circulo es: " + circ.calcularPerimetro());

        System.out.println("El area del rectangulo es: " + circ.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + circ.calcularPerimetro());
    }
}
