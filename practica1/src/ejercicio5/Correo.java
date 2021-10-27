package ejercicio5;

import java.util.Vector;

public class Correo {

    private String asunto;
    private String texto;
    private boolean leido;

    private Contacto origen;

    private Vector<Contacto> destino = new Vector();
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isLeido() {
        return leido;
    }





}
