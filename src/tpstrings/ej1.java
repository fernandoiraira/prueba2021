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
public class ej1 {

    public static void main(String[] args) {
        String cad;
        char vocal;
        int cant;
        boolean sigue;

        System.out.println("Ingrese la cadena de texto a examinar: ");
        cad = TecladoIn.readLine();
        System.out.println("Ingrese la vocal a buscar: ");
        vocal = TecladoIn.readLineNonwhiteChar();

        sigue = esVocal(vocal);
        while (!sigue) {
            System.out.println("El caracter ingresado debe ser una vocal. ");
            System.out.println("Ingreselo nuevamente: ");
            vocal = TecladoIn.readLineNonwhiteChar();
            sigue = esVocal(vocal);
        }
        cant = cuentaVocal(cad, vocal);
        System.out.println("La vocal " + vocal + " aparece " + cant + " veces en la cadena.");
    }

    public static boolean esVocal(char vocal) {
        //Devuelve true si el caracter es vocal, sino devuelve false
        boolean res = false;

        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
            res = true;
        }

        return res;
    }

    public static int cuentaVocal(String cad, char vocal) {
        //Cuenta la cantidad de veces que aparece una letra en una cadena
        int c, res = 0;

        for (c = 0; c < cad.length(); c++) {
            if (cad.charAt(c) == vocal) {
                res++;
            }
        }

        return res;
    }
}
