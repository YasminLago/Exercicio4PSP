/**
 * Realiza un programa en java que ejecute tres hilos de forma concurrente. 
 * Uno de ellos debe sumar los números pares del 1 al 1000, otro los impares, y otro, 
 * los que terminan en dos o en tres.
 */

package exercicio4psp;

/**
 *
 * @author Yasmin
 */
public class Exercicio4PSP {
    
    public static void main(String[] args) {
        
      new Pares("Suma de números pares: ").start();
      new Impares("Suma de números impares: ").start();
      new DosYTres("Suma de números acabados en dos y tres: ").start();
    }
    
}
