
package calculadora;

/**
 *
 * @author Cristhian
 */
public class CALCULADORA {


    public static void main(String[] args) {
        
     CALCULADORA1 miCalculadora = new CALCULADORA1(10,2);
     
     int suma = miCalculadora.sumar();
     System.out.println("La suma es de " +suma);
          System.out.println("La RESTA es de " +miCalculadora.restar());
          System.out.println("La multiplicacion es " +miCalculadora.multiplicar());
          System.out.println("La division es " +miCalculadora.dividir());

     
    }
}