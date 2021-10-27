package ejercicio1;

public interface Reproducible {
    //En una interface nos abstraemos de la implementacion de los metodos

    /*comienza la reproducción*/
    public void play();
    /*inicia o detiene la reproducción en un bucle infinito*/
    public void bucle();
    /*detiene la reproducción del contenido*/
    public void stop();
}
