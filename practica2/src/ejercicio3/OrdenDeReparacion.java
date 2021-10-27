package ejercicio3;

import java.util.Vector;

public class OrdenDeReparacion {
    private Vector<Pieza> piezas = new Vector<>();
    public double costo(){
        int total=0;
        for (Pieza a:piezas){
            total+= a.getPrecio();
        }
        return total;
    }
}
