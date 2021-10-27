package ejercicio3;

public class Simple extends Pieza {
    private double precio;
    @Override //SOBREESCRIBE AL MÉTODO DECLARADO EN PIEZA
    public double getPrecio(){
        return precio;
    }
}
