package ejercicio4;

public class Colectivo {
    private int cantidadPasajeros;
    private String patente;
    private String modelo;
    private int kilometraje;

    public Colectivo(int kilometraje){
        this.kilometraje=kilometraje;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }


    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }


    public void realizarViaje(int kilometros){
        this.kilometraje+=kilometros;
    }
}
