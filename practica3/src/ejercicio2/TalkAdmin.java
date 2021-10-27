package ejercicio2;

public class TalkAdmin {
    /*hacerHablar espera recibir un objeto que sepa hacer en este caso habla()
    *       Mientras el objeto que reciba por parámetro sepa implementar habla() (porque la interface hablador lo requiere)
    *        va a saber responder al mensaje*/
    public static void hacerHablar(Hablador sujeto){
        sujeto.habla();
    }
}
