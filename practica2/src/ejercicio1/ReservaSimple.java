package ejercicio1;

public class ReservaSimple extends Reserva{

    private Plato plato;

    //ReservaSimple se comporta como una reserva, solo que tiene un solo plato.
    public ReservaSimple(Cliente cliente,Plato plato){
        super(cliente);//constructor del padre.
        this.plato=plato;//comportamiento particular.
    }

    @Override
    public double getPrecioPlato() {
        return getCliente().descontar(plato.getPrecio());
    }
}
