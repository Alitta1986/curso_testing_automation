package Clase06.Abstracta.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("calculadora sencilla");
        double numero1;
        double numero2;
        char operacion;


        try {


            System.out.println("Ingresa el primer numero: ");
            numero1 = input.nextDouble();

            System.out.println("Ingresa el segundo numero: ");
            numero2 = input.nextDouble();

        } catch (InputMismatchException e){
            throw  new RuntimeException("Numeros ingresados invalidos");

        }

        System.out.println("Selecciona un operacion (+, -, *, /): ");
        operacion = input.next().charAt(0);

        CalculadoraSencilla calculadora = new CalculadoraSencilla();

        double resultado = calculadora.realizarOperacion(numero1, numero2, operacion);

        System.out.println("El resultado es: " + resultado);

    }


}
