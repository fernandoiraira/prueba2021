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
public class ej3 {

    public static void main(String[] args) {
        String original, invertido;

        System.out.println("Ingrese la cadena a invertir: ");
        original = TecladoIn.readLine();
        invertido = invPalabra(original);
        System.out.println(invertido);
    }

    public static String invPalabra(String cad) {
        //Invierte la palabra ingresada y devuelve un nuevo String
        String res = "";
        int c;

        for (c = cad.length() - 1; c >= 0; c--) {
            res = res.concat(Character.toString(cad.charAt(c)));
        }

        return res;
    }

}
