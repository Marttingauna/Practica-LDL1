package ejercicio6;



import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Central implements Observer {
    private ArrayList<Sensor> sensores= new ArrayList();
    private ArrayList<EntradaHistorial> historial= new ArrayList();

    public void addSensor(Sensor s) {
        /*Agrego a la coleccion de sensores el sensor pasado por parametro */
        sensores.add(s);
        /*La central está observando el nuevo sensor pasado por parametro*/
        s.addObserver(this);
    }

    public void activar() {
        System.out.println("Central operativa");
        /*Activo cada sensor en la coleccion de sensores*/
        for (Sensor s:sensores){
            s.activar();
        }
    }

    public void desactivar() {
        System.out.println("Central Fuera de servicio");
        /*Desactivo cada sensor en la coleccion de sensores*/
        for (Sensor s: sensores){
            s.desactivar();
        }
    }
    public void cancelarAlerta(Sensor sensor){
        sensor.cancelarAlerta();
    }

    public void cancelarAlerta(ArrayList<Sensor> sensores){
        for (Sensor s:sensores) {
            s.cancelarAlerta();
        }
    }

    public void mostrarHistorial() {
        /*Si el historial tiene elementos*/
        if (!historial.isEmpty()){
            for (EntradaHistorial en: historial){
                System.out.println("El sensor con el número de serie: " + en.sensor.getNumeroDeSerie() + " || " + en.getFecha());
            }
        }else{
            System.out.println("No hay registros de alertas");
        }
    }

    @Override
    /*El observable, (en este caso el Sensor) con el numero de serie + emitio una alerta   */
    public void update(Observable o, Object arg) {
        System.out.println("El sensor con el número de serie: " + ((Sensor) o).getNumeroDeSerie() + " emitio una alerta");
        /*Agrego al historial */
        historial.add(new EntradaHistorial((Sensor) o, new Date()));
    }
}
