package ejercicio6;

import java.util.Observable;

public class Sensor extends Observable {
    private int numeroDeSerie;
    private EstadoSensor estado;
    /*Cuando se hace un new Sensor() el estado actual es Apagado*/
    public Sensor (int numero){
        this.numeroDeSerie= numero;
        this.estado= new Apagado();
    }
    public void activar(){
        /*Cada vez que se llama al método activar el estado es Esperando*/
         estado = new Esperando();
    }
    public void desactivar(){
        /*Cada vez que se llama al método desactivar el estado es Apagado*/
        estado = new Apagado();
    }

    public void alerta(){
        /*Para que mi estado pueda cambiar mantengo una referencia a mi mismo, se logra mandandome
        por parametro 'a mi mismo'*/
        estado.alerta(this);
    }

    public EstadoSensor getEstado() {
        return estado;
    }

    public void setEstado(EstadoSensor estado) {
        this.estado = estado;
    }

    public void notificar(){
        setChanged();
        notifyObservers();
    }

    public void cancelarAlerta(){
        estado.cancelarAlerta(this);
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }
}

