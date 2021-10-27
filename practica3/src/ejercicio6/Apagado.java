package ejercicio6;

public class Apagado extends EstadoSensor{
    @Override
    public void alerta(Sensor sensor) {
        System.out.println("Sensor fuera de linea");
    }

    @Override
    public void cancelarAlerta(Sensor sensor) {
        System.out.println("Sensor fuera de linea");
    }
}
