package ejercicio6;

public class Esperando extends EstadoSensor{
    @Override
    public void alerta(Sensor sensor) {
        /*Recibo un sensor, al sensor recibido por parámetro le cambio el estado a un estado de alerta.
        * (El sensor que disparo la alerta lo paso por parámetro al estado alerta)*/
        sensor.setEstado(new Alerta(sensor));
    }

    @Override
    public void cancelarAlerta(Sensor sensor) {
        /*Si el estado esta en esperando logicamente no esta alertado y no se cancela*/
        System.out.println("Sensor no alertado");
    }
}
