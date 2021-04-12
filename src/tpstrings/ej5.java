/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPStrings;

/**
 *
 * @author Fernando
 */
public class ej5 {

    public static void main(String[] args) {
        String[] palabra;
        int l;

        System.out.println("Longitud del arreglo: ");
        l = TecladoIn.readLineInt();
        palabra = new String[l];
        cargaArray(palabra);
        ordenaArreglo(palabra);
        muestraArray(palabra);
    }

    public static void ordenaArreglo(String[] array) {
        int c;
        String extra;
        boolean sigue = ordenado(array);

        while (!sigue) {
            for (c = 0; c < array.length - 1; c++) {
                if (array[c].compareToIgnoreCase(array[c + 1]) > 0) {
                    extra = array[c];
                    array[c] = array[c + 1];
                    array[c + 1] = extra;
                }
            }
            sigue = ordenado(array);
        }
    }

    public static boolean ordenado(String[] array) {
        int c = 0;
        boolean res = true;

        while (c < array.length - 1 && res) {
            if (array[c].compareToIgnoreCase(array[c + 1]) > 0) {
                res = false;
            }
            c++;
        }
        return res;
    }

    public static void muestraArray(String[] array) {
        //Muestra los elementos de un arreglo
        int c;

        for (c = 0; c < array.length; c++) {
            System.out.println(array[c]);
        }

    }

    public static void cargaArray(String[] cad) {
        //Carga un arreglo de cadena de caracteres
        int c;
        String palabra;

        for (c = 0; c < cad.length; c++) {
            System.out.println("Elemento " + c + ": ");
            palabra = TecladoIn.readLine();
            cad[c] = palabra;
        }
    }

}
