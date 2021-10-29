package ejercicio2;

import ejercicio2.excepciones.DivisionPorCeroException;
import ejercicio2.excepciones.DivisionPorNegativoException;

public class Main {
    public static void main(String[] args) {
        Divisor divisor = new Divisor();

        /* a)*/
        System.out.println("Resultado: " + divisor.dividir(100, 4 ));
        System.out.println("Resultado: " + divisor.dividir(12, 3 ));
        System.out.println("Resultado: " + divisor.dividir(20, 4 ));

        /* b)*/
//        System.out.println("Resultado: " + divisor.dividir(5, 0 ));
        /*Retorna una ArithmeticException que extiende de RuntimeException (PUEDE PASAR EN TIEMPO DE EJECUCION) */

        /* c)
        * Retorna 0 si se intenta dividir por 0*/
        //System.out.println("Resultado: " + divisor.dividir1(5, 0 ));

        /* Excepcion chequeada */
        /* Si lo dejo sin el try catch, me dice que el metodo puede retornar la excepcion
        * pero no estoy implementando el "manejo"
        System.out.println("Resultado: " + divisor.dividirPorCeroException(10, 0)); */

        /*Como deberia ser:*/
        try{
            /*Para arrojar excepción: Division por cero*/
            System.out.println("Resultado: " + divisor.dividirPorCeroException(10, 0));
            /*Para arrojar excepción: Division por negativo*/
            System.out.println("Resultado: " + divisor.dividirPorCeroException(10, 0));
        } catch (DivisionPorCeroException ceroException){/*Puedo tener la cantidad de catch que quiera, puede ser la cantidad
                                             de errores que arroje el método.
                                             */
            System.out.println("ERROR! \n" + ceroException.getMessage());
        }catch(DivisionPorNegativoException negativoException){/*Para negativoException*/
            System.out.println("ERROR! \n" + negativoException.getMessage());
        }

        /* Excepcion no chequeada */


    }
}
