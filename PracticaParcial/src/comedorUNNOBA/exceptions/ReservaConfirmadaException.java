package comedorUNNOBA.exceptions;

public class ReservaConfirmadaException extends Exception {

    public ReservaConfirmadaException(){
        super("La reserva ya esta confirmada");

    }
}
