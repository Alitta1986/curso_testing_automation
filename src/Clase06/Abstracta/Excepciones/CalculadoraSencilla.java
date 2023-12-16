package Clase06.Abstracta.Excepciones;

public class CalculadoraSencilla {
    public double realizarOperacion(double numero1, double numero2, char operacion) {

        double resultado = 0.0;

        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                break;

            case '*':
                resultado = numero1 * numero2;
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else  {
                    throw  new RuntimeException("La division por cero no esta definida. Ingresa un divisor diferente");

                }
                break;
            default:
                throw new RuntimeException("No ingresaste ninguna operacion valida al sistema. " +
                        "Las operaciones validas son operacion +, -, *, /");


        }
        return resultado;
    }
}
