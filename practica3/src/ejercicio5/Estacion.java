package ejercicio5;
import java.util.*;
public class Estacion {
    private List<Clima> historial = new ArrayList<Clima>();
    private Clima climaActual;
    private String ciudad;

    private Random random = new Random();

    /*Rotorno el clima actual*/
    public Clima getClimaActual() {
        return climaActual;
    }
    /*Asigna el clima actual*/
    public void setClimaActual(Clima climaActual) {
        this.climaActual = climaActual;
    }

    public Estacion (String ciudad){
        this.ciudad= ciudad;
    }

    /*Actualiza el clima */
    public void actualizarClima(){
        Clima c = new Clima();

        Temperatura temperat = new Temperatura();
        /*Asigno el valor de la temperatura con random, el valor va a estar entre 0 y 25*/
        temperat.setValor(random.nextInt( 25));
        temperat.setEscala(Escala.CELCIUS);

        /*Asigno datos del Clima*/
        c.setUltimaActualizacion(GregorianCalendar.getInstance().getTime());
        c.setCiudad(this.ciudad);
        c.setActual(temperat);

        System.out.println(c);

        setClimaActual(c);
        agregarClima(c);
    }

    /*Agrega un clima al historial*/
    public void agregarClima(Clima c) { historial.add(c); }

    /*Elimina unClima del historial*/
    public void eliminarClima(Clima unClima){
        historial.remove(unClima);
        System.out.println("Clima eliminado con exito!");
    }

    /*Retorna todos los climas del historial*/
    public List<Clima> getClimas(){
        return historial;
    }

    /*Ordena el clima dependiendo su temperatura, pero no modifica el historial*/
    public List<Clima> ordenaClimaTemperatura(){
        ArrayList<Clima> nueva = new ArrayList<>(historial);
        /*Como la clase "Clima" implementa la interface "Comparable" (Sabiendo cual es menor y mayor) 'sabe' como
        ordenar el clima dependiendo su temperatura.   */
        Collections.sort(nueva);
        return nueva;
    }

    /*Ordena el historial por temperatura.Sin tener en cuenta la escala. Solo se ordena por el valor de la temperatura.*/
    public void ordenarClimaTemperatura(){
        Collections.sort(historial);

    }


}
