package ejercicio1;

public class Main {
    public static void main(String[] args) {
        RandomSelector<String> selector= new RandomSelector();

        selector.agregar("Rojo");
        selector.agregar("Azul");
        selector.agregar("Amarillo");
        selector.agregar("Naranja");

        for (int i = 0; i < 5; i++) {
            System.out.println(selector.selectNext());
        }

    }
}
