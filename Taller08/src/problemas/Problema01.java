/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int operacion;
        String cadena = "";
        for (int i = 30; i >= 10; i--) {
            cadena = String.format("%s%d", cadena,i);
            for (int j = 2; j <= 4; j++) {
                operacion = i * j;
                cadena = String.format("%s-%d", cadena,
                         operacion);
            }
            cadena = String.format("%s\n", cadena);
        }
         System.out.printf("%s\n", cadena);
    }
    
}
