package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Estacion rojas = new Estacion("Rojas");

        System.out.println("\nClimas en Rojas:");
        rojas.actualizarClima();
        rojas.actualizarClima();
        rojas.actualizarClima();

        System.out.println("\nRetornando todos los climas del historial con getClimas():\n" + rojas.getClimas());
        System.out.println("\nClima de rojas ordenado por temperatura(Sin modificar el historial): \n" + rojas.ordenaClimaTemperatura());

        rojas.ordenarClimaTemperatura();
        System.out.println("\nRetornando todos los climas del historial con getClimas() despues de ordenarlos:\n" + rojas.getClimas());

        System.out.println("\nEliminando un clima del historial..");
        rojas.eliminarClima(rojas.getClimaActual());
        System.out.println("Mostrando climas actuales:\n"+ rojas.getClimas());

        /*Pruebas..*/
        Clima c= new Clima();
        Temperatura tActual = new Temperatura();
        tActual.setEscala(Escala.CELCIUS);tActual.setValor(25);

        Temperatura tMinima = new Temperatura();
        tMinima.setValor(17);tMinima.setEscala(Escala.CELCIUS);

        Temperatura tMaxima = new Temperatura();
        tMaxima.setValor(30);tMaxima.setEscala(Escala.CELCIUS);

        c.setClima("Rojas","Buenos Aires","Argentina",tActual,tMinima,tMaxima,
                15,Direccion.NORTE,15, 14);

        System.out.println("\nAgregando Clima al historial..");
        rojas.agregarClima(c);
        System.out.println("\nMostrando climas actualizados: \n" + rojas.getClimas());



    }
}
