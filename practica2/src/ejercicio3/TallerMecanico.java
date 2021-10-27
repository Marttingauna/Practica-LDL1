package ejercicio3;

import java.util.Vector;

public class TallerMecanico {
    private String direccion;
    private String nombre;
    private Vector<OrdenDeReparacion> reparaciones = new Vector<>();
    public double costoTotalReparacion(){
        int total=0;
        for (OrdenDeReparacion r:reparaciones){
            total+= r.costo();
        }
        return total;
    }
}
