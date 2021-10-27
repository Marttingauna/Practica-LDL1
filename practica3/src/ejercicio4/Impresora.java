package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/*La clase Impresora es el sujeto que tiene un estado Interno que puede cambiar (puede pasar de apagada a prendida, de
libre a imprimiendo, puede cambiar su nombre o la cantidad de trabajos que tiene pendientes).
Entonces, esta clase extiende de la clase Observable predefinida en Java, que contiene los métodos necesarios para
implementar el patrón del lado del Sujeto observado. Es responsabilidad de este sujeto (la Impresora) mantener referencias
a los objetos que estan interesados de sus cambios y notificarlos cuando estos sucedan.
Su responsabilidad debería terminar allí, en comunicar sus cambios de la forma que lo crea conveniente.
Luego es cuestión de cada Observador qué hace con esa información. Esto se resuelve en el método update() de cada
observador
 */
public class Impresora extends Observable {

    /*La impresora puede encolar para imprimir cualquier tipo de objeto que sepa responder al mensaje imprimir()
    Como este lo definimos en la Interfaz Documento, cualquier objeto cuya clase implemente esa Interfaz puede ser
    agregado a la colección.
     */
    private List<Documento> trabajosEnCola = new ArrayList<>();

    private String nombre;
    private boolean encendida;
    private boolean imprimiendo;

    public Impresora(String nombre, boolean encendida) {
        this.nombre = nombre;
        this.encendida = encendida;
    }

    //Los métodos que no modifiquen el estado interno no requieren normalmente disparar la notificación a los observadores.
    public String getNombre() {
        return nombre;
    }
    public boolean getEncendida() {
        return encendida;
    }
    public boolean getImprimiendo() {
        return imprimiendo;
    }
    public int getCantidadTrabajosEnCola() {
        return trabajosEnCola.size();
    }
    public List<Documento> getTrabajosEnCola() {
        return trabajosEnCola;
    }

    /*Los sets y los métodos que me permiten agregar y quitar trabajos a la cola de impresión
    si cambian el estado interno, por lo tanto es necesario disparar el proceso de notificación a los observadores
    interesados.
     */
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
        notificar();
    }
    public void addTrabajoEnCola(Documento trabajo) {
        this.trabajosEnCola.add(trabajo);
        notificar();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        notificar();
    }
    public void setImprimiendo(boolean imprimiendo) {
        this.imprimiendo = imprimiendo;
        notificar();
    }
    /*Es completamente válido llamar a setChanged() y notifyObservers() en cada luegar donde realizo un cambio, pero
    de esta forma solo tengo que recordar llamar a un método y no a dos.
     */
    private void notificar(){
        //Si mantienen apretado Ctrl izquierdo y hacen click en los métodos pueden ver su implementación
        setChanged();
        notifyObservers();
    }
    public void imprimirTodo(){
        for(Documento d:getTrabajosEnCola()) {
            imprimir(d);
        }
    }

    public void imprimir(Documento documento){
        setImprimiendo(true);
        documento.imprimir();
        setImprimiendo(false);
    }

    @Override
    public synchronized void deleteObserver(Observer arg0) {
        super.deleteObserver(arg0);
    }

    @Override
    /*"toString": INDICO AL OBJETO COMO COMPORTARSE CUANDO LO QUIERO IMPRIMIR*/
    public String toString() {
        return "Impresona : " + getNombre() + " / Encendida : " + getEncendida() +
                " / Imprimiendo : " + getImprimiendo() + " / Cant. Trabajos :" + getTrabajosEnCola();
    }

    /*Los dos métodos siguientes no es necesario redefinirlos en esta clase si no vamos a agregar comportamiento nuevo
    (por ejemplo alguna verificación sobre los observadores antes de agregarlos). Si miran el cuerpo de la clase
    Observable, addObserver y deleteObserver ya se encuentran implementados en su forma mas simple: agregan y quitan
    un objeto de una colección de observadores.
     */
    /*
    @Override
    public synchronized void addObserver(Observer arg0) {
        super.addObserver(arg0);
    }
    */




}
