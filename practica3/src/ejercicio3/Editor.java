package ejercicio3;

import java.util.Vector;

public class Editor {
    private Vector<FigurasGeometrica> figuras= new Vector<>();

    public void agregarFigura(FigurasGeometrica figura){
        figuras.add(figura);
    }
    public void eliminarFigura(int indice){
        figuras.removeElementAt(indice);
    }
}
