package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ReservaMultiple extends Reserva{
    private Vector<Plato> platos=new Vector<>();

    //la reserva multiple se comporta igual que el constructor de mi padre y tiene una coleccion de platos.
    public ReservaMultiple(Cliente cliente, Vector<Plato> platos){
        super(cliente);
        this.platos=platos;
    }

    @Override
    public double getPrecioPlato() {
        double total=0;
        for(Plato p:platos) {
            total += getCliente().descontar(p.getPrecio());
        }
        return total*.95;
    }
}
