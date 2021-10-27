package ejercicio2;

public class Persona implements Hablador{
    /*La persona no está en la cadena de herencia de Animal, pero sabe hacer las mismas cosas (metodos), solo que lo
    * implementa a su manera (IMPLEMENTANDO LA INTERFACE)*/
    @Override
    public void habla() {
        System.out.println("Hola soy una persona");
    }
}
