package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Gato gato=new Gato();
        Perro perro=new Perro();
        Alarma alarma= new Alarma();
        Persona Martin= new Persona();
        RelojCucu reloj= new RelojCucu();

        /*LOS METODOS ESTATICOS PUEDO ACCEDER A ELLOS SIN INSTANCIAR LA CLASE*/
        TalkAdmin.hacerHablar(gato);
        TalkAdmin.hacerHablar(perro);
        TalkAdmin.hacerHablar(alarma);
        TalkAdmin.hacerHablar(Martin);
        TalkAdmin.hacerHablar(reloj);
    }
}
