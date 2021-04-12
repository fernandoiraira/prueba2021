/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPStrings;

import java.util.*;

/**
 *
 * @author Fernando
 */
public class ejOrdEnteros {

    public static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int[] num;
        int cant;

        System.out.println("Cantidad de elementos del arreglo: ");
        cant = teclado.nextInt();
        num = new int[cant];
        cargaArreglo(num);

        ordenaArreglo(num);
        mostrarArreglo(num);

    }

    public static void mostrarArreglo(int[] array) {
        int c;

        for (c = 0; c < array.length; c++) {
            System.out.println(array[c]);
        }
    }

    public static void ordenaArreglo(int[] array) {
        int c, extra;
        boolean sigue = ordenado(array);

        while (!sigue) {
            for (c = 0; c < array.length - 1; c++) {
                if (array[c] > array[c + 1]) {
                    extra = array[c];
                    array[c] = array[c + 1];
                    array[c + 1] = extra;
                }
            }
            sigue = ordenado(array);
        }
    }

    public static boolean ordenado(int[] array) {
        int c = 0;
        boolean res = true;

        while (c < array.length - 1 && res) {
            if (array[c] > array[c + 1]) {
                res = false;
            }
            c++;
        }
        return res;
    }

    public static void cargaArreglo(int[] array) {
        int c;

        for (c = 0; c < array.length; c++) {
            System.out.println("Elemento " + c + ": ");
            array[c] = teclado.nextInt();
        }

    }

}
