package ejercicio6;

import java.util.Date;

public class EntradaHistorial {
    Sensor sensor;
    private Date fecha;

    public EntradaHistorial(Sensor sensor, Date fecha) {
        this.sensor= sensor;
        this.fecha= fecha;
    }
    public Sensor getSensor() {
        return sensor;
    }
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
