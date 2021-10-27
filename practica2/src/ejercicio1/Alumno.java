package ejercicio1;

public class Alumno extends Cliente{
    @Override
    public double descontar(double precioBase) {
        return precioBase*.8;
    }
}
