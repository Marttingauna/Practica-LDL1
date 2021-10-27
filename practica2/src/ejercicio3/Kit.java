package ejercicio3;

import java.util.Vector;

public class Kit extends Pieza{
    //Utilizando patrón COMPOSITE
    private Vector<Pieza> piezasKit = new Vector<>();
    @Override
    public double getPrecio(){
        int total=0;
        for (Pieza a:piezasKit){
            total+= a.getPrecio();
        }
        return total*.9;
    }
}
