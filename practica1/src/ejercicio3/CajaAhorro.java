package ejercicio3;

public class CajaAhorro extends CuentaBancaria {
    private int maximoExtracciones;

    public CajaAhorro(){
        //De esta forma puedo tener un constructor "vacio", es decir que no acepte parámetros, pero que inicialice
        //el objeto con los valores correctos para su estado interno (tener 5 extracciones posibles).
        reinicio();
        //La linea siguiente permite inicializar el atributo limite minimo, en caso de elegir esa forma de representarlo.
        //setLimiteMinimo(0);
    }
    @Override
    public float limiteMinimo() {
        //La caja de ahorro no tiene un limite minimo de saldo
        return 0;
    }

    @Override
    public void extraer(float m) {
        /*
        Si bien declarar el metodo extraer como abstracto en la clase madre es válido, en los dos casos
        hace CASI exactamente lo mismo, con la diferencia de que en una disminuye las extracciones y en otra no.
        Entonces, puedo Sobreescribir el método para agregar comportamiento.
         */
        /*Primero, pregunto si el maximo de extracciones es mayor a 0, es decir si me quedan extracciones permitidas*/
        if (maximoExtracciones > 0) {
            /*Si esto se cumple, invoco al método definido en mi super clase, y este es el que se encarga de
            descontar el saldo y crear la nueva transacción.
             */
            super.extraer(m);
            /*Una vez que eso se hizo, "agrego" el comportamiento particular de esta clase, que es disminuir
            la cantidad de extracciones.
             */
            maximoExtracciones--;
        }
        /*En resumen: cuando un objeto invoque al método extraer() sobre un objeto CuentaCorriente, como este no se
        encuentra definido en esa clase, va a intentar ejecutar el método de la super clase (lo que haciamos en los
        ejercicios de This y Super en LDL0). Al invocarlo en un objeto CajaAhorro, en cambio, SI va a encontrar un método
        asociado, por lo tanto lo ejecuta y luego este dentro de su cuerpo invoca al de la superclase si lo necesita.
         */
    }

    @Override
    public void reinicio() {
        //Si quiero "reiniciar" las extracciones, simplemente llamo a este método.
        this.maximoExtracciones=5;
    }
}
