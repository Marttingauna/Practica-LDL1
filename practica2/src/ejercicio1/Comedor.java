package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Comedor {
    private List<Reserva> reservas = new ArrayList();
    /* a)Agrega una reserva a las reservas del comedor*/
    public void agregarReserva(Cliente cliente, Plato plato){
        reservas.add(new ReservaSimple(cliente,plato));
    }

    /* b)Agrega varias reservas a las reservas del comedor*/
    public void agregarReservas(Cliente cliente, Vector<Plato> platos){
        reservas.add(new ReservaMultiple(cliente, platos));
    }

    /* c)Retorna el valor de la reserva teniendo en cuenta los descuentos*/
    public double valorReserva(Reserva reserva){
        return reserva.getPrecioPlato();
    }

    /* d)Retorna la cantidad total de todos los platos reservados */
    public int totalPlatosReservados(){
        int total=0;
        for (Reserva r: reservas){
            total= total+1;
        }
        return total;
    }

    /* e)Retorna la suma total de todos los valores platos reservados */
    public float totalValorReservas(){
        int suma=0;
        for (Reserva r: reservas){
            suma+= r.getPrecioPlato();
        }
        return suma;
    }

    /* f)Retorna la reserva que tenga más platos reservados */
//    public Reserva reservaMasPlatos(){
//        Reserva mayor= new ReservaMultiple(null, new Vector<>());
//        for (Reserva r: reservas){
//            if(totalPlatosReservados()>)
//        }
//    }
}
