package clase03;

import javax.swing.*;

public class IfElseSwitch {

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        /*
        if (a > b) {
            System.out.println("a es mayor a b");
        } else if (a==b){
            System.out.println("a es igual a b");
        } else {
            System.out.println("a es menor a b");
        }
        */

        switch (a) {
            case 1:
                System.out.println("a es 1");
                break;
            case 2:
                System.out.println("a es 2");
                break;
            default:
                System.out.println("a no es ni 1 ni 2");

        }
        if (a == 1) {
            //System.out.println("a es 1");
        } else if (a == 2) {
            //System.out.println("a es 2");
        } else {
            //System.out.println("a no es ni 1 ni 2");







        }
    }
}
