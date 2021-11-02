package comedorUNNOBA.exceptions;

public class MaximoMenuException extends Exception{

    public MaximoMenuException(){
        super("Se alcanzo el maximo posible de menús para esa reserva.");
    }
}
