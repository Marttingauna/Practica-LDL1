package ejercicio3;

public abstract class FigurasGeometrica implements Desplazable{
    private Punto punto;
    private Direccion dir;

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }
}
