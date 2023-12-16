package Clase06.Abstracta.Excepciones;

public class CuentaBancaria {
    private int fondos;

    public CuentaBancaria(int fondosIniciales) {
        this.fondos = fondosIniciales;
    }

    public void extraer(int CantidadAExtraer) {
        if (fondos - CantidadAExtraer < 0) {

            throw new FondosInuficientesException("Fondos Insuficientes");

        }
        this.fondos = this.fondos - CantidadAExtraer;
    }
}
