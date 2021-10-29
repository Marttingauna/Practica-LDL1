package ejercicio2.excepciones;

public class DivisionPorNegativoException extends Exception{

    private int a;
    private int b;

    /*Pruebas
     * */
    public DivisionPorNegativoException(int num1, int num2){
        super("Se intento dividir por un valor negativo: " + num1 + "," + num2);

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
