package ejercicio6;

public class Alerta  extends EstadoSensor{

    /*Cuando se llama a "new Alerta(sensor)" llamo al metodo alerta() de la clase*/
    public Alerta(Sensor sensor){
        this.alerta(sensor);
    }

    @Override
    public void alerta(Sensor sensor) {
        System.out.println("¡INTRUSO DETECTADO!");
        /*Cuando se llama al método notificar() dispara los mensajes para todos los
         observadores (EL OBSERVADOR EN ESTE CASO ES LA CENTRAL)
         Notifica a la clase que está observando que algo cambió llamando al método update() de la clase observadora(CENTRAL). */
        sensor.notificar();
    }

    @Override
    public void cancelarAlerta(Sensor sensor) {
        /*El sensor que recibo por parametro le cambio el estado a Esperando*/
        sensor.setEstado(new Esperando());
    }
}
