package ejercicio2;

import java.util.Vector;

public class Sistema {
    private Vector<Partido> partidos = new Vector<>();
    //a) Agrega un partido a la coleccion de partidos que tiene el sistema
    public void agregarPartido(Equipo local, Equipo visita, Estadio estadio, int valorEntrada){
        partidos.add(new Partido(local, visita, valorEntrada, estadio));
    }

    //b)Retorna el estadio con mayor capacidad de espectadores
    public Estadio estadioConMayorCapacidad(){
        Estadio estadio= new Partido().getEstadio();
        for (Partido cadaEstadio:partidos){
            if(cadaEstadio.getEstadio().getCapacidad()>=estadio.getCapacidad()){
                estadio= cadaEstadio.getEstadio();
            }
        }
        return estadio;
    }

    /*c) Retorna la suma de todos los espectadores de todos los partido.
    Es decir, la suma de la capacidad de cada estadio de cada partido.
    */
    public int cantidadTotalDeEspectadores(){
        int totalEspectadores = 0;
        for (Partido partido: partidos){
            totalEspectadores+= partido.getEstadio().getCapacidad();
        }
        return totalEspectadores;
    }

    /*d) Retorna la suma recaudada en el partido que se pasa por parametro*/
    public int montoRecaudado(Partido partido){
        int recaudacion= 0;
        recaudacion= (int) (partido.getValor() * partido.getEstadio().getCapacidad());
        return recaudacion;
    }

    /*e) Retorna la suma total recaudada por todos los partidos del mundial*/
    public int montoTotalRecaudado(){
        int totalRecaudado = 0;
        for (Partido partido: partidos){
            totalRecaudado= (int) (partido.getValor() * partido.getEstadio().getCapacidad());
        }
        return totalRecaudado;
    }

}
