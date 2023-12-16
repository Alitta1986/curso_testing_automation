package Clase06.Abstracta;

public class Rectangulo extends Figura {

    private double ancho;
    private double alto;

    //Constructor es el que pongo a continuacion

    public Rectangulo(double ancho, double alto) {
        this.ancho= ancho;
        this.alto= alto;

    }

    @Override
    public double calcularPerimetro() {
        return 2*ancho+2*alto;
    }

    @Override
    public double calcularArea() {
        return ancho*alto;
    }
}
