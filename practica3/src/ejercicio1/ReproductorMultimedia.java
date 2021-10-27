package ejercicio1;

public class ReproductorMultimedia implements Reproducible{
    private boolean reproduciendo;
    private boolean enBucle;

    @Override
    /*comienza la reproducción*/
    public void play(){ this.reproduciendo= true; }

    /*inicia o detiene la reproducción en un bucle infinito*/
    @Override
    public void bucle(){ this.enBucle= !enBucle; }

    @Override
    /*detiene la reproducción del contenido*/
    public void stop(){ this.reproduciendo=false; }
}
