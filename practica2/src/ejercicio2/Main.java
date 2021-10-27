package ejercicio2;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.agregarPartido(new Equipo("Boca"), new Equipo("River"),new Estadio(1000),100);

        sistema.agregarPartido(new Equipo("Barcelona"), new Equipo("Real madrid"),new Estadio(500),200);
        System.out.println("El partido fue cargado!");

        sistema.estadioConMayorCapacidad();

//        Vector<Partido> partidos = new Vector<>();
//        partidos.add(new Partido(new Equipo("Boca"), new Equipo("River"),100, new Estadio(1000)));
//        partidos.add(new Partido(new Equipo("Velez"), new Equipo("Racing"),200, new Estadio(500)));
//        partidos.add(new Partido(new Equipo("Boca"), new Equipo("River"),200, new Estadio(600)));



    }
}
