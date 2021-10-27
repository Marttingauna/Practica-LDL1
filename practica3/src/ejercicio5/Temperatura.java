package ejercicio5;


public class Temperatura {
    private float valor;
    private Escala escala;

    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }

    public Escala getEscala() { return escala; }
    public void setEscala(Escala escala) { this.escala = escala; }

    @Override
    public String toString() { return "Temperatura [valor=" + valor + ", escala= "+ escala + "]"; }
}