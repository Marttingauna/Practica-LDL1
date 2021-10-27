package ejercicio2;

import java.util.Vector;

public  class Partido {

    private double valor;
    private Equipo equipo1;
    private Equipo equipo2;
    private Estadio estadio;

    public Partido() {
    }

    public Partido(Equipo equipos1, Equipo equipos2, int valor, Estadio estadio) {
        this.valor = valor;
        this.estadio = estadio;
        this.equipo1 = equipos1;
        this.equipo2 = equipos2;
    }




    public double getValor() {
        return valor;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
