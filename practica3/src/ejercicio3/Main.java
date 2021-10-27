package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Circulo circle= new Circulo();
        Editor nuevoEdit= new Editor();

        nuevoEdit.agregarFigura(circle);
        System.out.println("Se agrego el circulo");
        circle.mover(12,"Norte");
    }
}
