package ejercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class CuentaBancaria {

    /*Otra opción para resolver el problema del límite mínimo. Declara un atributo general, y luego
    asignarle un valor en el constructor de las hijas (ver las clases en particular).
     */
/*
    private int limiteMinimo;

    public void setLimiteMinimo(int limite){
        this.limiteMinimo=limite;
    }
  */

    //Todas las transacciones que involucran a esta cuenta bancaria
    private List<Transaccion> transacciones= new ArrayList();

    /*Normalizo los dos grandes tipos de transacciones posibles. De esta forma
     al usar DEPOSITO o EXTRACCION, siempre hago referencia a la misma cadena exacta
    * */
    /*
    Esta cadena no debería utilizarze luego para "decidir" un comportamiento, por ejemplo
    if (xx=="Deposito")
    Si los objetos de esas clases deben realizar un comportamiento diferente, debería usarse el
    concepto de polimorfismo y herencia.
    En nuestro caso, la transacción cumple el rol de un "historial" o "registro" de lo que sucedió
    sobre esa cuenta, no es en si una transacción responsable de modificar el saldo de la misma.
     */
    private static final String DEPOSITO = "Deposito";
    private static final String EXTRACCION = "Extracción";

    private Titular titular;

    //El saldo actual de la cuenta
    private float saldo;
    //La fecha en que se creo la cuenta
    private Date fechaDeCreacion;

    /*Una forma posible de resolver el problema del límite es crear un método
      que devuelva el límite mínimo correspondiente a cada cuenta, implementandolo
      en cada hija de CuentaBancaria
     */
    public abstract float limiteMinimo();
    public abstract void reinicio();

    public void extraer(float monto) {
        /*Primero me aseguro que es posible extraer esa cantidad de dinero.
        La diferencia entre el saldo actual y lo que quiero extraer debe ser
        mayor o igual al limite minimo permitido por la cuenta. Básicamente,
        lo que quede en la cuenta una vez que hice la extracción debe ser mayor
        que el minimo permitido.
         */
        if(saldo-monto>= limiteMinimo()) {
            //disminuyo el saldo actual en la cantidad indicada
            saldo-=monto;
            /*
            Agrego a la colección de transacciones una nueva transaccion
            con el monto indicado y la constante EXTRACCION como el tipo
             */
            transacciones.add(new Transaccion(monto, EXTRACCION));
            /*Pero la Caja de ahorro debería descontar tambien de la cantidad de extracciones. Entonces, tendría
            sentido implementar este comportamiento en las hijas y declarar este método abstracto, pero hay otra forma.
            Revisar la clase CajaAhorro para ver cual.
             */
        }
    }

    public void depositar(float m) {
        /*Al depositar no tengo que contemplar ningun caso en particular, ya que
        no existe un límite máximo que puede ser depositado o una cantidad máxima
        de veces que puede realizarse esta operación.
         */
        saldo+=m;
        /*Al igual que en extraer, creo una transacción y la agrego a mi
        colección de transacciones.
         */
        transacciones.add(new Transaccion(m, DEPOSITO));
    }

    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    //La fecha solo debería setearse al momento de crear la cuenta

    /*public void setFechaDeCreacion(Date fecha) {
        this.fechaDeCreacion = fecha;
    }

    //El saldo solo debería modificarse mediante operaciones que generen transacciones
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }*/


}
