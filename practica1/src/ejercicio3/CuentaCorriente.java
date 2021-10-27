package ejercicio3;

public class CuentaCorriente extends CuentaBancaria {

    /*
    //Constructor que setea el atributo limite minimo para los objetos de clase CuentaCorriente
    public CuentaCorriente(){
        setLimiteMinimo(-150);
    }
    */
    @Override
    public float limiteMinimo() {
        return -150;
    }
    @Override
    public void reinicio() {
        /*No es estrictamente necesario tener este método en CuentaCorriente, ya que la misma no tiene una cantidad
        de extracciones que haya que reiniciar, pero de esta forma otro objeto puede tener una colección de
        Cuentas bancarias (una mezcla de ambas) y enviar el mismo mensaje a todos los elementos de la misma por igual.
        Por ejemplo tener:
            private List<CuentaBancaria> cuentas= new Arraylist();
        De esta forma está diciendo que su colección puede contener cualquiera de los dos tipos de cuenta.
         */
    }
}
