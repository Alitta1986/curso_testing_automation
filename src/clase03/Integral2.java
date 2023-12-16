package clase03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Integral2 {

    public static void main(String[] args) {
        //Inicializo un scanner
        Scanner sc = new Scanner(System.in);

        //Recbir un numero mediante consola
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        //Recbir un numero mediante consola
        System.out.println("Ingrese un palabra: ");
        String palabra = sc.next();


        HashMap<String,Integer> mapPalabraNumero = new HashMap<>();



        //Mientras la palabra sea distinta de "Parar"
        while (!palabra.equals("Parar")) {
            //Definir a la clave palabra el valor numero
            mapPalabraNumero.put(palabra, num);


            //Recibir un nuevo numero
            System.out.println("Ingrese un nuevo numero: ");
            num = sc.nextInt();

            //Recibir una nueva palabra
            System.out.println("Ingrese una nueva palabra: ");
            palabra = sc.next();
        }


        //Mostrar los valores


        for (String clave:mapPalabraNumero.keySet()) {
            System.out.println("La clave es: " + clave + " y el valor es: " + mapPalabraNumero.get(clave));



        }



        }

    }

