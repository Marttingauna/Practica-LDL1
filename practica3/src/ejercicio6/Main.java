package ejercicio6;

public class Main {
    public static void main(String[] args) {
        /*Creando la central y los sensores, luego los agrego a la central */
        Central central= new Central();
        System.out.println("\nSe creo una nueva central");

        Sensor s1= new Sensor(1);
        Sensor s2= new Sensor(2);
        System.out.println("\nSe crearon los sensores!\n");

        central.addSensor(s1);
        central.addSensor(s2);

        /*Activo la central y muestro el historial, no muestra nada porque no se registro ninguna alerta*/
        System.out.println("Activando central..");
        central.activar();
        System.out.println("\nMostrando historial de los estados de la alarma..");
        central.mostrarHistorial();

        System.out.println("\nDisparando alertas..");
        s1.alerta();
        s1.alerta();

        System.out.println("\n");

        s2.alerta();
        s2.alerta();

        /*Muestro el historial nuevamente, en este caso si muestran las alertas registradas y luego desactivo la central*/
        System.out.println("\nMostrando las alertas del historial: \n");
        central.mostrarHistorial();
        System.out.println("\n");
        central.desactivar();

        /*Disparo dos alertas en ambos sensores, como la central esta desactivada no dispara alertas*/
        s1.alerta();
        s2.alerta();
    }
}
