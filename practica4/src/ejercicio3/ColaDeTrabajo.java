package ejercicio3;

import ejercicio3.excepciones.NoListaException;
import ejercicio3.excepciones.SinTrabajoEnColaException;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo {
    private Queue<Trabajo> cola = new LinkedList<Trabajo>();
    private String nombre;
    private boolean lista;

    public ColaDeTrabajo(String nombre, boolean lista) {
        this.nombre=nombre;
        this.lista=lista;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isLista() {
        return lista;
    }
    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public void agregar(Trabajo trabajo){
        cola.add(trabajo);
    }
    public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException{
        if(!lista){
            throw new NoListaException(getNombre(),cola.size());
        }else if (cola.isEmpty()){
            throw new SinTrabajoEnColaException(getNombre());
        }
        return cola.poll();
    }

    public static void main(String[] args) {
        ColaDeTrabajo ct = new ColaDeTrabajo("Cola1", false);
        /*ct.agregar(new Trabajo() {
            @Override
            public void imprimir() {
                System.out.println("Me estoy imprimiendo!");
            }
        });*/
        try {
            ct.sacar().imprimir();
        }catch (SinTrabajoEnColaException stce){
            System.out.println(stce.getMessage());
        }catch (NoListaException nle){
            System.out.println(nle.getMessage());
        }finally {
            System.out.println("finally");
        }
        System.out.println("Terminaron las excepciones");
    }
}
