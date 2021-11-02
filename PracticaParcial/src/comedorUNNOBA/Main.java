package comedorUNNOBA;

import comedorUNNOBA.exceptions.MaximoMenuException;
import comedorUNNOBA.exceptions.ReservaConfirmadaException;

public class Main {
    public static void main(String[] args) {
        Comedor comedor = new Comedor();
        Reserva nueva = new Reserva(2);

        try {
            nueva.agregarMenu((new Menu( "Milanesas", 500)));
//            nueva.confirmarReserva(nueva); **Confirmando reserva
//            nueva.agregarMenu((new Menu( "Canelones", 400)));
//            nueva.agregarMenu((new Menu( "Salchichas", 90))); **No agrega esta reserva porque ya está confirmada.
        } catch (ReservaConfirmadaException e) {/*Atrapando excepciones*/
            System.out.println(e.getMessage());
        } catch (MaximoMenuException e) {
            System.out.println(e.getMessage());
        }

        comedor.agregarReservaComedor(nueva);

    }
}
