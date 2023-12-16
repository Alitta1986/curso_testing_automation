package clase03;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        int[] arreglito;
        arreglito = new int []{1, 2, 3, 4, 5};
        System.out.println(arreglito[0]);
        arreglito[0] = arreglito[0] + 20;
        System.out.println(arreglito[0]);


        ArrayList<Integer> ListaDeEnteros;
        ListaDeEnteros = new ArrayList<>();
        ListaDeEnteros.add(1);
        ListaDeEnteros.add(2);
        ListaDeEnteros.add(3);
        System.out.println(ListaDeEnteros.get(0));
        ListaDeEnteros.remove(0);
        System.out.println(ListaDeEnteros.get(0));

        int num = 10;
        num = num * 3;
        System.out.println(num * 3);


    }
}
