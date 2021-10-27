package ejercicio4;
import java.util.Observable;
import java.util.Observer;

/*El sistema de información actúa como el Observador en el patrón. Cada instancia  de un Sistema de información puede
estar interesado en diferentes impresoras. Es importante notar que el Observador no guarda una referencia al sujeto
Observado, simplemente recibe una actualización de parte de algún objeto.
 */
public class SistemaDeInformacion implements Observer {

    @Override
    public void update(Observable arg0, Object arg1) {
        /*El método update recibe dos parámetros: uno obligatorio, arg0, que es una referencia al
        objeto que envió el mensaje.
        Si vemos la definición del método notifyObservers de la clase Observable, en un punto ejecuta:
            ((Observer)arrLocal[i]).update(this, arg);
        Vemos entonces que el parámetro arg0 hace referencia a this, es decir el objeto que envía el mensaje,
        y arg es un parámetro opcional que puede usarse para enviar información.
        Por ejemplo, el objeto observado (la impresora) puede enviar un código que indique una operación,
        o una referencia al Documento que va a imprimir.
         */
        System.out.println("Algo cambio en la impresora "+ ((Impresora) arg0).getNombre());
        /*Es necesario castear explicitamente el parámetro al objeto que esperamos recibir, porque de otra forma
        Java no va a entender que estamos haciendo referencia a un objeto de determinado tipo, y por lo tanto no
        va a permitir invocar métodos que no puede asegurar ese objeto sepa entender.
        Además, el metodo update() está definido de cierta forma en la interfaz, y para implementarlo la clase
        SistemaDeInformación debe declararlo con la misma firma exacta que en la interfaz.
         */
        imprimir ((Impresora) arg0);/*CUANDO HUBO UN CAMBIO ESTA ES LA ACCIÓN QUE SE DISPARA*/
    }
    public void imprimir(Impresora arg0) {
        System.out.println(arg0);
    }

    public static void main(String[] args) {
        SistemaDeInformacion si = new SistemaDeInformacion(); /*CREO UN SISTEMA DE INFORMACION NUEVO*/
        Impresora i1 = new Impresora("Uno", true);
        //Agrego al sistema de información a la lista de objetos interesados en recibir notificaciones cuando el estado
        //de la impresora cambie.
        i1.addObserver(si);/*---EL SISTEMA DE INFORMACION VA A ESTAR INTERESADO DE LO QUE PASE EN IMPRESORA 1*/
        Impresora i2 = new Impresora("Dos", false);
        //Idem para la impresora dos
        i2.addObserver(si);

        //Cambio el estado interno y agrego documentos para verificar que se dispare el mensaje update()
        i1.setImprimiendo(true);
        i2.setEncendida(true);
        i1.addTrabajoEnCola(new DocumentoDeTexto("Hola!"));
        i1.addTrabajoEnCola(new DocumentoDeTexto("LDL1!"));
    }

}