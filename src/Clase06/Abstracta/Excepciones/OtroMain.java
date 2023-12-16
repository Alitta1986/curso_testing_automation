package Clase06.Abstracta.Excepciones;

public class OtroMain {

    public static void  main (String[] args){
        CuentaBancaria c = new CuentaBancaria(1000);
        c.extraer(1001);
    }
}
