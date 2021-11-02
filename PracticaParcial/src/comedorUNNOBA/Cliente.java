package comedorUNNOBA;

public abstract class Cliente {
    String nombre;
    String apellido;
    int dni;
    Reserva reserva;

    public abstract int valorMenu();

    public Reserva getReserva(){
        return reserva;
    }
}
