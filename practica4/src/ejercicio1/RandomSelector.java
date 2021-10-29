package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector<T> {
    private List<T> lista = new ArrayList<T>();
    private Random random = new Random();

    /* Retorna un objeto seleccionado de manera aleatoria. */
    T selectNext(){
        int tamanio = lista.size();
        int posicion = random.nextInt(tamanio);/*Genera números random dependiendo la cantidad de elementos de lista*/
        return lista.get(posicion);
    }

    void agregar( T elemento){
        lista.add(elemento);
    }
}
