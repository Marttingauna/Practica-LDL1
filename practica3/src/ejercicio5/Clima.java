package ejercicio5;

import java.util.Date;

public class Clima implements Comparable<Clima>{
    private String ciudad;
    private String provincia;
    private String pais;
    private Temperatura actual;
    private Temperatura minima;
    private Temperatura maxima;
    private float veloViento;
    private Direccion dirViento;
    private float humedad;
    private float visibilidad;
    private Date ultimaActualizacion;

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public Temperatura getActual() {
        return actual;
    }
    public void setActual(Temperatura actual) {
        this.actual = actual;
    }

    public Temperatura getMinima() {
        return minima;
    }
    public void setMinima(Temperatura minima) {
        this.minima = minima;
    }
    public Temperatura getMaxima() {
        return maxima;
    }
    public void setMaxima(Temperatura maxima) {
        this.maxima = maxima;
    }

    public float getVeloViento() {
        return veloViento;
    }
    public void setVeloViento(float veloViento) {
        this.veloViento = veloViento;
    }

    public Direccion getDirViento() {
        return dirViento;
    }
    public void setDirViento(Direccion dirViento) {
        this.dirViento = dirViento;
    }

    public float getHumedad() {
        return humedad;
    }
    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public float getVisibilidad() {
        return visibilidad;
    }
    public void setVisibilidad(float visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }
    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    /*Método de prueba para setear un clima de prueba*/
    public void setClima(String ciudad, String provincia, String pais, Temperatura actual, Temperatura minima,
                      Temperatura maxima, float veloViento, Direccion dirViento, float humedad, float visibilidad ){
        this.ciudad= ciudad;
        this.provincia= provincia;
        this.pais= pais;
        this.actual = actual;
        this.minima= minima;
        this.maxima = maxima;
        this.veloViento = veloViento;
        this.dirViento = dirViento;
        this.humedad= humedad;
        this.visibilidad= visibilidad;
        this.ultimaActualizacion = new Date();
    }

    @Override
    /* compareTo:
    * Si devuelve un valor menor a 0 hay una diferencia menor.
    * Si devuelve 0 son iguales.
    * si devuelve un valor mayor a 0 hay una diferencia mayor.
    *  */
    public int compareTo(Clima o) {
        /*Calculando diferencia:
        El valor de la temperatura actual - el valor de la temperatura actual del clima pasado por parámetro.
        El valor resultante se hace un casteo dado que la temperatura es double.
        */
        return (int) (this.actual.getValor() - o.getActual().getValor());
    }

    @Override
    public String toString() {
        /*return "Clima [ciudad=" + ciudad + " provincia=" + provincia + " pais=" + " actual=" + actual
                + ", minima=" + minima + ", maxima=" + maxima + ", velocidad viento=" + veloViento + ", direccion viento="
                + dirViento + ", humedad=" + humedad + ", visibilidad=" + visibilidad + ", ultima actualizacion="
                + ultimaActualizacion + " ]";
        */
        return "Clima [ Temperatura actual = " + actual.getValor() + "]";
    }
}
