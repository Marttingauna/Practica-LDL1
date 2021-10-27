package ejercicio5;

import java.util.Vector;

public class Cuenta {
    private String nombre;
    private String direccion;
    private Vector<Correo> enviado = new Vector();
    private Vector<Correo> recibido = new Vector();
    private Vector<Contacto> contacto = new Vector();

    public int CantidadCorreos (){
        int contador = 0;
        for(Correo e: enviado){
            contador ++;
        }
        for(Correo r: recibido){
            contador ++;
        }
        return contador;
    }

    public int CantRecibidos(){
        int contador = 0;
        for(Correo r: recibido){
            contador++;
        }
        return contador;
    }

    public int CantEnviados(){
        int contador = 0;
        for(Correo e: enviado){
            contador++;
        }
        return contador;
    }

    public int CantNoLeidos(){
        int contador = 0;
        for(Correo r: recibido){
            if(!r.isLeido()){
                contador++;
            }
        }
        return contador;
    }

    public int CantContactos(){
        int contador = 0;
        for(Contacto c: contacto ){
            contador++;
        }
        return contador;
    }

    public void AgregarCorreoRecibido(Correo unCorreo){
        recibido.add(unCorreo);
    }
}
