package ejercicio2;

import ejercicio2.excepciones.DivisionPorCeroException;
import ejercicio2.excepciones.DivisionPorNegativoException;

public class Divisor {
    public int dividir (int primerNumero, int segundoNumero){
        return primerNumero/segundoNumero;
    }

    public int dividir1 (int primerNumero, int segundoNumero){
        if(segundoNumero == 0){
            return 0;
        }
        return primerNumero/segundoNumero;
    }


    /*con throws "avisa" que puede disparar una excepción (PUEDE SER MAS DE UNA)
    en este caso está declarado pero puede que no pase necesariamente*/
    public int dividirPorCeroException(int num1, int num2) throws DivisionPorCeroException, DivisionPorNegativoException {
        /*Si el segundo numero es 0 disparo la excepción*/
        if(num2 == 0){
            throw new DivisionPorCeroException(num1, num2);
        }
        if(num1 < 0 || num2 < 0){
            throw new DivisionPorNegativoException(num1, num2);
        }
        return num1/num2;
    }

}
