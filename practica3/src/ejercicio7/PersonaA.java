package ejercicio7;

public interface PersonaA {
    public void caminar();
    default public void hablar(){
        System.out.println("La persona A habla");
    }
}
