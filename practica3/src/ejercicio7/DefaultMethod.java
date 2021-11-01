package ejercicio7;

public class DefaultMethod implements PersonaA, PersonaB{

    @Override
    public void caminar() {
        System.out.println("La persona camina");
    }
    //Las dos interfaces poseen el mismo metodo hablar
    @Override
    public void hablar() {
        //Aca distingo cual interfaces estoy utilizando
        PersonaB.super.hablar();
    }
    //Lo ideal de los metodos por defecto es que puedo sobreescribir el metodo de la interfaces original
    //Ejemplo
    {/*

    public void hablar() {
        System.out.println("Sobreescribiendo metodo por defecto")
        //Tambien si retorno un string, pudiera hacer lo siguiente
        return PersonaA.super.hablar() + "y también " + PersonaB.super.hablar();
    }

    */}

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.caminar();
        app.hablar();
    }


}
