package comedorUNNOBA;

import java.util.Vector;

public class Comedor {
    private Vector<Reserva> reservas = new Vector();
    private Vector<Menu> menus = new Vector();

    /* e)
     * Retorna una colección con todas las reservas pendientes de confirmación*/
    public Vector<Reserva> reservasNoConfirmadas(){
        Vector<Reserva> reservasNoconfirmadas = new Vector();
        for(Reserva r: reservas){
            if(!r.isConfirmación()){
                reservasNoconfirmadas.add(r);
            }
        }
        return reservasNoconfirmadas;
    }

    /*Método de prueba/ Agrega una reserva al Comedor */
    public void agregarReservaComedor(Reserva reserva){
        this.reservas.add(reserva);
        System.out.println("Se agrego la reserva al comedor");
    }
}
