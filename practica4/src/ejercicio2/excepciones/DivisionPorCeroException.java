package ejercicio2.excepciones;

/* La clase DivisionPorCeroException extiende de Exception*/
public class DivisionPorCeroException extends Exception {
    private int a;
    private int b;

    public DivisionPorCeroException(int num1, int num2){
        super("Se intento dividir por un valor cero: " + num1 + " con " + num2);

        this.a = num1;
        this.b = num2;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}
