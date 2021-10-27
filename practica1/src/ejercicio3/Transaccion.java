package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {

    private float monto;
    private String tipo;

    public Transaccion(float monto, String tipo) {
        this.monto = monto;
        this.tipo = tipo;
    }

    public float getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }

    /*public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }*/
}
