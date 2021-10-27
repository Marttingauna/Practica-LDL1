package ejercicio1;

import java.util.Date;

public abstract class Reserva {
    private Cliente cliente;
    private Date fecha;
    public Reserva(Cliente cliente){//le paso el cliente del cual quiero hacer esa reserva.
        this.cliente=cliente;
        fecha=new Date();//toma la fecha actual.
    }

    public abstract double getPrecioPlato();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
