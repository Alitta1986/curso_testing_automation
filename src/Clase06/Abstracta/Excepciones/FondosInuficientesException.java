package Clase06.Abstracta.Excepciones;

public class FondosInuficientesException extends RuntimeException {

    public FondosInuficientesException () {
        super();
    }

    public FondosInuficientesException(String s){
        super(s);

    }
}
