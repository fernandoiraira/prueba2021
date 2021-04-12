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
public class ej4 {

    public static void main(String[] args) {
        String cad;
        char vocal;

        System.out.println("Ingrese la cadena a examinar: ");
        cad = TecladoIn.readLine();
        System.out.println("Ingrese la vocal a buscar en las palabras: ");
        vocal = TecladoIn.readLineNonwhiteChar();

    }

}
