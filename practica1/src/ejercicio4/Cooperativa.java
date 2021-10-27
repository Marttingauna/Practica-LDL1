package ejercicio4;

import java.util.Vector;

public class Cooperativa {
    private Vector<Chofer> choferes = new Vector();

    public Chofer realizarViaje(int cantPasajeros, int cantKmts) {
         for (Chofer cadaChofer :  choferes){
             /*Podríamos limitar esta cadena de invocaciones definiendo un método en la clase Chofer que devuelva
             si puede o no transportar a X cantidad de gente. ¿Se animan?
             Debería quedar:
             if(cadaChofer.puedeLlevar(cantPasajeros)){//hacerAlgo}
              */
            if(cadaChofer.getColectivo().getCantidadPasajeros()>=cantPasajeros){
                //si el chofer del colectivo en su cantidad de pasajeros es mayor
                // o igual a la cantidad de pasajeros pasada por parametro*/


                /*La misma cuestión aquí. Podríamos definir el método realizarViaje en el chofer,
                ya que en sí es ese chofer el que va a realizarlo utilizando determinado colectivo.
                ¿Se animan?
                 */
                cadaChofer.getColectivo().realizarViaje(cantKmts);
                /*El chofer en su colectivo llama a el metodo "realizarViaje" registrando
                la cantidad de kilometros al colectivo*/

                return cadaChofer;
            }
        }
        return null;
    }
    public Colectivo mayorKilometro() {
        Colectivo mayor = new Colectivo(0);
        for (Chofer cadaChofer : choferes){
            if(cadaChofer.getColectivo().getKilometraje()>mayor.getKilometraje()){
                mayor=cadaChofer.getColectivo();
            }
        }
        return mayor;
    }
    /*Devuelve el colectivo con mayor kilometraje acumulado.*/

}
