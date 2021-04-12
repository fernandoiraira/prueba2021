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
public class ej2 {

    public static void main(String[] args) {
        int cant;
        String cad, palabra;

        System.out.println("Ingrese la cadena de texto a examinar: ");
        cad = TecladoIn.readLine();
        System.out.println("Ingrese la palabra a buscar: ");
        palabra = TecladoIn.readLine();
        cant = cuentaPalabra(cad, palabra);

        System.out.println("La palabra " + palabra + " aparece " + cant + " veces en la cadena.");
    }

    public static int cuentaPalabra(String cad, String palabra) {
        //Cuenta la cantidad de veces que aparece una palabra en una cadena
        int res = 0, c;

        cad = cad.toLowerCase();
        palabra = palabra.toLowerCase();

        for (c = 0; c < cad.length() - palabra.length() + 1; c++) {
            if (cad.substring(c, c + palabra.length()).equalsIgnoreCase(palabra)) {
                res++;
                c = c + palabra.length() - 1;
            }
        }

        return res;
    }
}
