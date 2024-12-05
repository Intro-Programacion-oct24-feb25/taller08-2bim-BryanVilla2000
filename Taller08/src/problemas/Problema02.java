/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenhei= 20;
        double celcius;
        String cadena="";
        for (int i = 0; i <= 20; i++) {
            
            celcius= (5.0/9)*(fahrenhei-32);
            
            cadena= String.format("%sOperacion(%d) Fahrenheit: %.2f ===> Calecius;"
                    + " %.2f\n",
                    cadena,
                    i,
                    fahrenhei,
                    celcius);
            fahrenhei=fahrenhei+4;
        }
        System.out.printf("%s\n", cadena);
    }
    
}
