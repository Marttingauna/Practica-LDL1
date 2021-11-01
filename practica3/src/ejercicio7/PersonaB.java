package ejercicio7;

public interface PersonaB {
    //Como vemos, el metodo ya tiene una implementacion por defecto, aun asi es posible modificarla en la clase que se implemente
    default public void hablar(){
        System.out.println("La persona b habla");
    }
}
